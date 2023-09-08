/**
 */
package fairness;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fairness.FairnessPackage
 * @generated
 */
public interface FairnessFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FairnessFactory eINSTANCE = fairness.impl.FairnessFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
	Operation createOperation();

	/**
	 * Returns a new object of class '<em>Operator Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operator Component</em>'.
	 * @generated
	 */
	OperatorComponent createOperatorComponent();

	/**
	 * Returns a new object of class '<em>Group Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group Analysis</em>'.
	 * @generated
	 */
	GroupAnalysis createGroupAnalysis();

	/**
	 * Returns a new object of class '<em>Individual Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Individual Analysis</em>'.
	 * @generated
	 */
	IndividualAnalysis createIndividualAnalysis();

	/**
	 * Returns a new object of class '<em>Sensitive Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensitive Variable</em>'.
	 * @generated
	 */
	SensitiveVariable createSensitiveVariable();

	/**
	 * Returns a new object of class '<em>Probability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Probability</em>'.
	 * @generated
	 */
	Probability createProbability();

	/**
	 * Returns a new object of class '<em>Expected Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expected Value</em>'.
	 * @generated
	 */
	ExpectedValue createExpectedValue();

	/**
	 * Returns a new object of class '<em>Group Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group Size</em>'.
	 * @generated
	 */
	GroupSize createGroupSize();

	/**
	 * Returns a new object of class '<em>Logical Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Condition</em>'.
	 * @generated
	 */
	LogicalCondition createLogicalCondition();

	/**
	 * Returns a new object of class '<em>Operation Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Value</em>'.
	 * @generated
	 */
	OperationValue createOperationValue();

	/**
	 * Returns a new object of class '<em>Sub Logical Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Logical Condition</em>'.
	 * @generated
	 */
	SubLogicalCondition createSubLogicalCondition();

	/**
	 * Returns a new object of class '<em>Positive Outcome</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Positive Outcome</em>'.
	 * @generated
	 */
	PositiveOutcome createPositiveOutcome();

	/**
	 * Returns a new object of class '<em>Group Bias</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group Bias</em>'.
	 * @generated
	 */
	GroupBias createGroupBias();

	/**
	 * Returns a new object of class '<em>Individual Bias</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Individual Bias</em>'.
	 * @generated
	 */
	IndividualBias createIndividualBias();

	/**
	 * Returns a new object of class '<em>Sensitive Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensitive Group</em>'.
	 * @generated
	 */
	SensitiveGroup createSensitiveGroup();

	/**
	 * Returns a new object of class '<em>Variable Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Value</em>'.
	 * @generated
	 */
	VariableValue createVariableValue();

	/**
	 * Returns a new object of class '<em>Sensitive Variable Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensitive Variable Value</em>'.
	 * @generated
	 */
	SensitiveVariableValue createSensitiveVariableValue();

	/**
	 * Returns a new object of class '<em>Dataset Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dataset Size</em>'.
	 * @generated
	 */
	DatasetSize createDatasetSize();

	/**
	 * Returns a new object of class '<em>Logaritm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logaritm</em>'.
	 * @generated
	 */
	Logaritm createLogaritm();

	/**
	 * Returns a new object of class '<em>Summation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Summation</em>'.
	 * @generated
	 */
	Summation createSummation();

	/**
	 * Returns a new object of class '<em>Other Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Other Variable</em>'.
	 * @generated
	 */
	OtherVariable createOtherVariable();

	/**
	 * Returns a new object of class '<em>Existing Group Fairness Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Existing Group Fairness Metric</em>'.
	 * @generated
	 */
	ExistingGroupFairnessMetric createExistingGroupFairnessMetric();

	/**
	 * Returns a new object of class '<em>Existing Individual Fairness Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Existing Individual Fairness Metric</em>'.
	 * @generated
	 */
	ExistingIndividualFairnessMetric createExistingIndividualFairnessMetric();

	/**
	 * Returns a new object of class '<em>Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metric</em>'.
	 * @generated
	 */
	Metric createMetric();

	/**
	 * Returns a new object of class '<em>Dataset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dataset</em>'.
	 * @generated
	 */
	Dataset createDataset();

	/**
	 * Returns a new object of class '<em>Dataset Sensitive Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dataset Sensitive Variable</em>'.
	 * @generated
	 */
	DatasetSensitiveVariable createDatasetSensitiveVariable();

	/**
	 * Returns a new object of class '<em>Dataset Positive Outcome</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dataset Positive Outcome</em>'.
	 * @generated
	 */
	DatasetPositiveOutcome createDatasetPositiveOutcome();

	/**
	 * Returns a new object of class '<em>Dataset Sensitive Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dataset Sensitive Group</em>'.
	 * @generated
	 */
	DatasetSensitiveGroup createDatasetSensitiveGroup();

	/**
	 * Returns a new object of class '<em>Dataset Sensitive Variable Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dataset Sensitive Variable Value</em>'.
	 * @generated
	 */
	DatasetSensitiveVariableValue createDatasetSensitiveVariableValue();

	/**
	 * Returns a new object of class '<em>Single Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Operator</em>'.
	 * @generated
	 */
	SingleOperator createSingleOperator();

	/**
	 * Returns a new object of class '<em>Range Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Range Operator</em>'.
	 * @generated
	 */
	RangeOperator createRangeOperator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FairnessPackage getFairnessPackage();

} //FairnessFactory
