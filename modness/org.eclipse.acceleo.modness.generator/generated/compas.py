from FairnessMetric import FairnessMetric, binarize

import pandas as pd
from operators import SingleOperator



file_path = 'compas.csv'
predicted_label_name = 'prediction'
ground_truth_label_name = 'two_year_recid'
data = pd.read_csv(file_path)





operator_value = 0.0
binarize(data, 'sex', operator, operator_value, FalseFalse)

operator_value = 1.0
binarize(data, 'sex', operator, operator_value, FalseFalse)


operator_value = 0.0
binarize(data, 'race', operator, operator_value, FalseFalse)

operator_value = 1.0
binarize(data, 'race', operator, operator_value, FalseFalse)





operator_value = 1.0
binarize(data, 'non-recidiv', operator, operator_value, False)




indexes = [
'sex',
'race',
]
dataset_unprivileged_group = {'indexes[0]': 0, 'indexes[1]' : 0}
dataset_privileged_group = {'indexes[0]' : 1, 'indexes[1]' : 1}
dataset_positive_outcome = 1


threshold = 0.0

tolerance_value = 0.2


metrics = FairnessMetric(data, dataset_unprivileged_group, dataset_privileged_group,
                         ground_truth_label_name, predicted_label_name, dataset_positive_outcome)




print(metrics.statistical_parity_difference())
if abs((metrics.statistical_parity_difference()) > threshold + tolerance_value):
    print("Biased")
else:
    print("Fair")

