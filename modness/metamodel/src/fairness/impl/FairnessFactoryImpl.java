/**
 */
package fairness.impl;

import fairness.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FairnessFactoryImpl extends EFactoryImpl implements FairnessFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FairnessFactory init() {
		try {
			FairnessFactory theFairnessFactory = (FairnessFactory)EPackage.Registry.INSTANCE.getEFactory(FairnessPackage.eNS_URI);
			if (theFairnessFactory != null) {
				return theFairnessFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FairnessFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FairnessFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FairnessPackage.OPERATION: return createOperation();
			case FairnessPackage.OPERATOR_COMPONENT: return createOperatorComponent();
			case FairnessPackage.GROUP_ANALYSIS: return createGroupAnalysis();
			case FairnessPackage.INDIVIDUAL_ANALYSIS: return createIndividualAnalysis();
			case FairnessPackage.SENSITIVE_VARIABLE: return createSensitiveVariable();
			case FairnessPackage.PROBABILITY: return createProbability();
			case FairnessPackage.EXPECTED_VALUE: return createExpectedValue();
			case FairnessPackage.GROUP_SIZE: return createGroupSize();
			case FairnessPackage.LOGICAL_CONDITION: return createLogicalCondition();
			case FairnessPackage.OPERATION_VALUE: return createOperationValue();
			case FairnessPackage.SUB_LOGICAL_CONDITION: return createSubLogicalCondition();
			case FairnessPackage.POSITIVE_OUTCOME: return createPositiveOutcome();
			case FairnessPackage.GROUP_BIAS: return createGroupBias();
			case FairnessPackage.INDIVIDUAL_BIAS: return createIndividualBias();
			case FairnessPackage.SENSITIVE_GROUP: return createSensitiveGroup();
			case FairnessPackage.VARIABLE_VALUE: return createVariableValue();
			case FairnessPackage.SENSITIVE_VARIABLE_VALUE: return createSensitiveVariableValue();
			case FairnessPackage.DATASET_SIZE: return createDatasetSize();
			case FairnessPackage.LOGARITM: return createLogaritm();
			case FairnessPackage.SUMMATION: return createSummation();
			case FairnessPackage.OTHER_VARIABLE: return createOtherVariable();
			case FairnessPackage.EXISTING_GROUP_FAIRNESS_METRIC: return createExistingGroupFairnessMetric();
			case FairnessPackage.EXISTING_INDIVIDUAL_FAIRNESS_METRIC: return createExistingIndividualFairnessMetric();
			case FairnessPackage.METRIC: return createMetric();
			case FairnessPackage.DATASET: return createDataset();
			case FairnessPackage.DATASET_SENSITIVE_VARIABLE: return createDatasetSensitiveVariable();
			case FairnessPackage.DATASET_POSITIVE_OUTCOME: return createDatasetPositiveOutcome();
			case FairnessPackage.DATASET_SENSITIVE_GROUP: return createDatasetSensitiveGroup();
			case FairnessPackage.DATASET_SENSITIVE_VARIABLE_VALUE: return createDatasetSensitiveVariableValue();
			case FairnessPackage.SINGLE_OPERATOR: return createSingleOperator();
			case FairnessPackage.RANGE_OPERATOR: return createRangeOperator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FairnessPackage.LOGICAL_OPERATOR:
				return createLogicalOperatorFromString(eDataType, initialValue);
			case FairnessPackage.SINGLE_OPERATOR_PARAMETER:
				return createSingleOperatorParameterFromString(eDataType, initialValue);
			case FairnessPackage.RANGE_OPERATOR_PARAMETER:
				return createRangeOperatorParameterFromString(eDataType, initialValue);
			case FairnessPackage.LABEL_VALUE_TYPE:
				return createLabelValueTypeFromString(eDataType, initialValue);
			case FairnessPackage.ARITHMETIC_OPERATOR:
				return createArithmeticOperatorFromString(eDataType, initialValue);
			case FairnessPackage.BIAS_SOURCE:
				return createBiasSourceFromString(eDataType, initialValue);
			case FairnessPackage.GROUP_FAIRNESS_METRIC:
				return createGroupFairnessMetricFromString(eDataType, initialValue);
			case FairnessPackage.INDIVIDUAL_FAIRNESS_METRIC:
				return createIndividualFairnessMetricFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FairnessPackage.LOGICAL_OPERATOR:
				return convertLogicalOperatorToString(eDataType, instanceValue);
			case FairnessPackage.SINGLE_OPERATOR_PARAMETER:
				return convertSingleOperatorParameterToString(eDataType, instanceValue);
			case FairnessPackage.RANGE_OPERATOR_PARAMETER:
				return convertRangeOperatorParameterToString(eDataType, instanceValue);
			case FairnessPackage.LABEL_VALUE_TYPE:
				return convertLabelValueTypeToString(eDataType, instanceValue);
			case FairnessPackage.ARITHMETIC_OPERATOR:
				return convertArithmeticOperatorToString(eDataType, instanceValue);
			case FairnessPackage.BIAS_SOURCE:
				return convertBiasSourceToString(eDataType, instanceValue);
			case FairnessPackage.GROUP_FAIRNESS_METRIC:
				return convertGroupFairnessMetricToString(eDataType, instanceValue);
			case FairnessPackage.INDIVIDUAL_FAIRNESS_METRIC:
				return convertIndividualFairnessMetricToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorComponent createOperatorComponent() {
		OperatorComponentImpl operatorComponent = new OperatorComponentImpl();
		return operatorComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupAnalysis createGroupAnalysis() {
		GroupAnalysisImpl groupAnalysis = new GroupAnalysisImpl();
		return groupAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndividualAnalysis createIndividualAnalysis() {
		IndividualAnalysisImpl individualAnalysis = new IndividualAnalysisImpl();
		return individualAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensitiveVariable createSensitiveVariable() {
		SensitiveVariableImpl sensitiveVariable = new SensitiveVariableImpl();
		return sensitiveVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Probability createProbability() {
		ProbabilityImpl probability = new ProbabilityImpl();
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpectedValue createExpectedValue() {
		ExpectedValueImpl expectedValue = new ExpectedValueImpl();
		return expectedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupSize createGroupSize() {
		GroupSizeImpl groupSize = new GroupSizeImpl();
		return groupSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalCondition createLogicalCondition() {
		LogicalConditionImpl logicalCondition = new LogicalConditionImpl();
		return logicalCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationValue createOperationValue() {
		OperationValueImpl operationValue = new OperationValueImpl();
		return operationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubLogicalCondition createSubLogicalCondition() {
		SubLogicalConditionImpl subLogicalCondition = new SubLogicalConditionImpl();
		return subLogicalCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveOutcome createPositiveOutcome() {
		PositiveOutcomeImpl positiveOutcome = new PositiveOutcomeImpl();
		return positiveOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupBias createGroupBias() {
		GroupBiasImpl groupBias = new GroupBiasImpl();
		return groupBias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndividualBias createIndividualBias() {
		IndividualBiasImpl individualBias = new IndividualBiasImpl();
		return individualBias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensitiveGroup createSensitiveGroup() {
		SensitiveGroupImpl sensitiveGroup = new SensitiveGroupImpl();
		return sensitiveGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableValue createVariableValue() {
		VariableValueImpl variableValue = new VariableValueImpl();
		return variableValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensitiveVariableValue createSensitiveVariableValue() {
		SensitiveVariableValueImpl sensitiveVariableValue = new SensitiveVariableValueImpl();
		return sensitiveVariableValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetSize createDatasetSize() {
		DatasetSizeImpl datasetSize = new DatasetSizeImpl();
		return datasetSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Logaritm createLogaritm() {
		LogaritmImpl logaritm = new LogaritmImpl();
		return logaritm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Summation createSummation() {
		SummationImpl summation = new SummationImpl();
		return summation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherVariable createOtherVariable() {
		OtherVariableImpl otherVariable = new OtherVariableImpl();
		return otherVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistingGroupFairnessMetric createExistingGroupFairnessMetric() {
		ExistingGroupFairnessMetricImpl existingGroupFairnessMetric = new ExistingGroupFairnessMetricImpl();
		return existingGroupFairnessMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistingIndividualFairnessMetric createExistingIndividualFairnessMetric() {
		ExistingIndividualFairnessMetricImpl existingIndividualFairnessMetric = new ExistingIndividualFairnessMetricImpl();
		return existingIndividualFairnessMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metric createMetric() {
		MetricImpl metric = new MetricImpl();
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dataset createDataset() {
		DatasetImpl dataset = new DatasetImpl();
		return dataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetSensitiveVariable createDatasetSensitiveVariable() {
		DatasetSensitiveVariableImpl datasetSensitiveVariable = new DatasetSensitiveVariableImpl();
		return datasetSensitiveVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetPositiveOutcome createDatasetPositiveOutcome() {
		DatasetPositiveOutcomeImpl datasetPositiveOutcome = new DatasetPositiveOutcomeImpl();
		return datasetPositiveOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetSensitiveGroup createDatasetSensitiveGroup() {
		DatasetSensitiveGroupImpl datasetSensitiveGroup = new DatasetSensitiveGroupImpl();
		return datasetSensitiveGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetSensitiveVariableValue createDatasetSensitiveVariableValue() {
		DatasetSensitiveVariableValueImpl datasetSensitiveVariableValue = new DatasetSensitiveVariableValueImpl();
		return datasetSensitiveVariableValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleOperator createSingleOperator() {
		SingleOperatorImpl singleOperator = new SingleOperatorImpl();
		return singleOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeOperator createRangeOperator() {
		RangeOperatorImpl rangeOperator = new RangeOperatorImpl();
		return rangeOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalOperator createLogicalOperatorFromString(EDataType eDataType, String initialValue) {
		LogicalOperator result = LogicalOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogicalOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleOperatorParameter createSingleOperatorParameterFromString(EDataType eDataType, String initialValue) {
		SingleOperatorParameter result = SingleOperatorParameter.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSingleOperatorParameterToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeOperatorParameter createRangeOperatorParameterFromString(EDataType eDataType, String initialValue) {
		RangeOperatorParameter result = RangeOperatorParameter.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRangeOperatorParameterToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelValueType createLabelValueTypeFromString(EDataType eDataType, String initialValue) {
		LabelValueType result = LabelValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLabelValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticOperator createArithmeticOperatorFromString(EDataType eDataType, String initialValue) {
		ArithmeticOperator result = ArithmeticOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArithmeticOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiasSource createBiasSourceFromString(EDataType eDataType, String initialValue) {
		BiasSource result = BiasSource.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBiasSourceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupFairnessMetric createGroupFairnessMetricFromString(EDataType eDataType, String initialValue) {
		GroupFairnessMetric result = GroupFairnessMetric.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupFairnessMetricToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndividualFairnessMetric createIndividualFairnessMetricFromString(EDataType eDataType, String initialValue) {
		IndividualFairnessMetric result = IndividualFairnessMetric.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndividualFairnessMetricToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FairnessPackage getFairnessPackage() {
		return (FairnessPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FairnessPackage getPackage() {
		return FairnessPackage.eINSTANCE;
	}

} //FairnessFactoryImpl
