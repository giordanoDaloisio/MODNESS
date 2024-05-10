from FairnessMetric import FairnessMetric, binarize

import pandas as pd
from operators import SingleOperator


file_path = "data/admissions.csv"
predicted_label_name = "admission"
ground_truth_label_name = ""
data = pd.read_csv(file_path)


indexes = ["sex"]
dataset_unprivileged_group = {"sex": 0}
dataset_privileged_group = {"sex": 1}
dataset_positive_outcome = 1
threshold = 0.0

tolerance_value = 0.2


metrics = FairnessMetric(
    data,
    dataset_unprivileged_group,
    dataset_privileged_group,
    ground_truth_label_name,
    predicted_label_name,
    dataset_positive_outcome,
)


print(metrics.statistical_parity_difference())
if abs(metrics.statistical_parity_difference()) > (threshold + tolerance_value):
    print("Biased")
else:
    print("Fair")
