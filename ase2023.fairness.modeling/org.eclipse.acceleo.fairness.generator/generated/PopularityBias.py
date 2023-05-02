from FairnessMetric import FairnessMetric, binarize

import pandas as pd
from operators import SingleOperator


file_path = "data/popbias.csv"
predicted_label_name = "ranking"
ground_truth_label_name = ""
data = pd.read_csv(file_path)


operator_value = 0.8
operator = SingleOperator.GREATER_EQUAL
binarize(data, "frequency", operator, operator_value, True)


operator_value = 0.8
operator = SingleOperator.GREATER_EQUAL
binarize(data, "ranking", operator, operator_value, True)


dataset_unprivileged_group = {"frequency": 0}
dataset_privileged_group = {"frequency": 1}
dataset_positive_outcome = 1


threshold = 1.0

tolerance_value = 0.2


metrics = FairnessMetric(
    data,
    dataset_unprivileged_group,
    dataset_privileged_group,
    ground_truth_label_name,
    predicted_label_name,
    dataset_positive_outcome,
)


coverage = metrics.group_size("frequency == 0 and ranking == 1") / metrics.group_size(
    "ranking == 1"
)

print(coverage)
if abs(coverage) < threshold + tolerance_value:
    print("The dataset is biased")
else:
    print("The dataset is fair")
