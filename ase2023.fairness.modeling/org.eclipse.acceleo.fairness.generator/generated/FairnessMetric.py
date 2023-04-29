from aif360.metrics import ClassificationMetric
from aif360.datasets import BinaryLabelDataset
import pandas as pd
import math
from operators import SingleOperator, Operator


def summation(startRange, endRange, body):
    ris = 0
    for i in range(startRange, endRange):
        ris += body(i)
    return ris


def logaritm(x):
    return math.log(x)


def binarize(
    df: pd.DataFrame,
    column: str,
    operator: Operator,
    value: float,
    relative_to_df=False,
):
    if relative_to_df:
        df.sort_values(by=[column], inplace=True, ascending=False)
        position = len(df) - int(len(df) * value)
        if operator == SingleOperator.GREATER:
            df.iloc[:position, df.columns.get_loc(column)] = 1
            df.iloc[position:, df.columns.get_loc(column)] = 0
        elif operator == SingleOperator.MINOR:
            df.iloc[:position, df.columns.get_loc(column)] = 0
            df.iloc[position:, df.columns.get_loc(column)] = 1
        elif operator == SingleOperator.GREATER_EQUAL:
            df.iloc[: position + 1, df.columns.get_loc(column)] = 1
            df.iloc[position + 1 :, df.columns.get_loc(column)] = 0
        elif operator == SingleOperator.MINOR_EQUAL:
            df.iloc[: position + 1, df.columns.get_loc(column)] = 0
            df.iloc[position + 1 :, df.columns.get_loc(column)] = 1
    else:
        if operator == SingleOperator.GREATER:
            df.loc[df[column] > value, column] = "t"
            df.loc[df[column] != "t", column] = 0
            df.loc[df[column] == "t", column] = 1
        elif operator == SingleOperator.MINOR:
            df.loc[df[column] < value, column] = "t"
            df.loc[df[column] != "t", column] = 0
            df.loc[df[column] == "t", column] = 1
        elif operator == SingleOperator.GREATER_EQUAL:
            df.loc[df[column] >= value, column] = "t"
            df.loc[df[column] != "t", column] = 0
            df.loc[df[column] == "t", column] = 1
        elif operator == SingleOperator.MINOR_EQUAL:
            df.loc[df[column] <= value, column] = "t"
            df.loc[df[column] != "t", column] = 0
            df.loc[df[column] == "t", column] = 1
        df[column] = df[column].astype(np.float64)


class FairnessMetric(ClassificationMetric):
    def __init__(
        self,
        df: pd.DataFrame,
        unprivileged_groups: dict,
        privileged_group: dict,
        true_label_name: str,
        predicted_label_name: str,
        positive_value: int,
    ):
        self.df = df
        self.dataset_true = BinaryLabelDataset(
            df=self.df.drop(columns=[predicted_label_name]),
            label_names=[true_label_name],
            protected_attribute_names=list(unprivileged_groups.keys()),
            favorable_label=positive_value,
            unfavorable_label=1 - positive_value,
        )
        self.dataset_pred = self.dataset_true.copy(deepcopy=True)
        self.dataset_pred.labels = self.df[predicted_label_name].values.reshape(-1, 1)
        super().__init__(
            self.dataset_true,
            self.dataset_pred,
            unprivileged_groups=[unprivileged_groups],
            privileged_groups=[privileged_group],
        )

    def probability(self, object: str, condition: str = "") -> float:
        probability = self.df.query(object).shape[0] / self.df.shape[0]
        if condition == "":
            return probability
        else:
            return (
                self.df.query(condition + " and " + object).shape[0] / self.df.shape[0]
            ) / probability

    def expected_value(self, column_name: str, condition: str = "") -> float:
        subdata = self.df[column_name]
        if condition == "":
            expected_value = 0
            for val in subdata.unique().tolist():
                expected_value += val * self.probability(
                    column_name + " == " + str(val)
                )
            return expected_value
        else:
            expected_value = 0
            for val in subdata.unique().tolist():
                expected_value += val * self.probability(
                    column_name + " == " + str(val), condition
                )
            return expected_value

    def group_size(self, groupCondition: str = "", variable: str = ""):
        if groupCondition != "":
            return self.df.query(groupCondition).shape[0]
        elif variable != "":
            return len(self.df[variable].unique())
        return 0

    def dataset_size(self):
        return self.df.shape[0]
