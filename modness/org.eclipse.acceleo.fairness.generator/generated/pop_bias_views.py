from FairnessMetric import FairnessMetric, binarize

import pandas as pd
from operators import SingleOperator



file_path = 'data/resyduo.csv'
predicted_label_name = 'tot_recommendations'
ground_truth_label_name = ''
data = pd.read_csv(file_path)





operator_value = 0.8
operator = SingleOperator.GREATER
binarize(data, 'views', operator, operator_value, TrueTrue)

operator_value = 0.8
binarize(data, 'views', operator, operator_value, TrueTrue)





operator_value = 0.8
binarize(data, 'high recommented items', operator, operator_value, True)




dataset_unprivileged_group = {'views': 0}
dataset_privileged_group = {'views' : 1}
dataset_positive_outcome = 1


threshold = 0.8

tolerance_value = 0.0


metrics = FairnessMetric(data, dataset_unprivileged_group, dataset_privileged_group,
                         ground_truth_label_name, predicted_label_name, dataset_positive_outcome)








GEI= (1 / (alpha * (1 - alpha))) * (
    metrics.probability("views == 1 and tot_recommendations == 1")
    * metrics.probability("views == 0", "tot_recommendations == 1"))









