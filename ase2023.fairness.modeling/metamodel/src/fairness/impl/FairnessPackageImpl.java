/**
 */
package fairness.impl;

import fairness.Analysis;
import fairness.ArithmeticOperator;
import fairness.Bias;
import fairness.BiasSource;
import fairness.Dataset;
import fairness.DatasetPositiveOutcome;
import fairness.DatasetSensitiveGroup;
import fairness.DatasetSensitiveVariable;
import fairness.DatasetSensitiveVariableValue;
import fairness.DatasetSize;
import fairness.EqualityOperator;
import fairness.ExistingFairnessMetric;
import fairness.ExpectedValue;
import fairness.FairnessFactory;
import fairness.FairnessMetric;
import fairness.FairnessPackage;
import fairness.Function;
import fairness.GroupAnalysis;
import fairness.GroupBias;
import fairness.GroupSize;
import fairness.IndividualAnalysis;
import fairness.IndividualBias;
import fairness.LabelValueType;
import fairness.Logaritm;
import fairness.LogicalCondition;
import fairness.LogicalOperator;
import fairness.Metric;
import fairness.NamedElement;
import fairness.Operation;
import fairness.OperationValue;
import fairness.OperatorComponent;
import fairness.OtherVariable;
import fairness.PositiveOutcome;
import fairness.Probability;
import fairness.RangeOperator;
import fairness.RangeOperatorParameter;
import fairness.SensitiveGroup;
import fairness.SensitiveVariable;
import fairness.SensitiveVariableValue;
import fairness.SingleOperator;
import fairness.SingleOperatorParameter;
import fairness.SubLogicalCondition;
import fairness.Summation;
import fairness.Variable;
import fairness.VariableValue;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FairnessPackageImpl extends EPackageImpl implements FairnessPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupAnalysisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualAnalysisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensitiveVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass probabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expectedValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupSizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subLogicalConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass biasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positiveOutcomeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupBiasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualBiasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensitiveGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensitiveVariableValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datasetSizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logaritmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass summationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass otherVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass existingFairnessMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datasetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datasetSensitiveVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datasetPositiveOutcomeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datasetSensitiveGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datasetSensitiveVariableValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalityOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum logicalOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum singleOperatorParameterEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rangeOperatorParameterEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum labelValueTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arithmeticOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum biasSourceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fairnessMetricEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fairness.FairnessPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FairnessPackageImpl() {
		super(eNS_URI, FairnessFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link FairnessPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FairnessPackage init() {
		if (isInited) return (FairnessPackage)EPackage.Registry.INSTANCE.getEPackage(FairnessPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFairnessPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FairnessPackageImpl theFairnessPackage = registeredFairnessPackage instanceof FairnessPackageImpl ? (FairnessPackageImpl)registeredFairnessPackage : new FairnessPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theFairnessPackage.createPackageContents();

		// Initialize created meta-data
		theFairnessPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFairnessPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FairnessPackage.eNS_URI, theFairnessPackage);
		return theFairnessPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_EqualityOperator() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_LeftSide() {
		return (EReference)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_RightSide() {
		return (EReference)operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperatorComponent() {
		return operatorComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperatorComponent_Function() {
		return (EReference)operatorComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperatorComponent_Operationvalue() {
		return (EReference)operatorComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalysis() {
		return analysisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysis_Metric() {
		return (EReference)analysisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysis_Dataset() {
		return (EReference)analysisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysis_Scope() {
		return (EAttribute)analysisEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupAnalysis() {
		return groupAnalysisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupAnalysis_DatasetUnprivilegedGroup() {
		return (EReference)groupAnalysisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupAnalysis_DatasetPrivilegedGroup() {
		return (EReference)groupAnalysisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndividualAnalysis() {
		return individualAnalysisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensitiveVariable() {
		return sensitiveVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensitiveVariable_SensitiveVariableValue() {
		return (EReference)sensitiveVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProbability() {
		return probabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProbability_Object() {
		return (EReference)probabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProbability_Condition() {
		return (EReference)probabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpectedValue() {
		return expectedValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpectedValue_Condition() {
		return (EReference)expectedValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpectedValue_ColumnName() {
		return (EAttribute)expectedValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupSize() {
		return groupSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupSize_GroupCondition() {
		return (EReference)groupSizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupSize_Variable() {
		return (EReference)groupSizeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalCondition() {
		return logicalConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalCondition_Sublogicalcondition() {
		return (EReference)logicalConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalCondition_Value() {
		return (EReference)logicalConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalCondition_Sensitivegroup() {
		return (EReference)logicalConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationValue() {
		return operationValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationValue_Value() {
		return (EAttribute)operationValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubLogicalCondition() {
		return subLogicalConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubLogicalCondition_LogicalOperator() {
		return (EAttribute)subLogicalConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubLogicalCondition_Logicalcondition() {
		return (EReference)subLogicalConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBias() {
		return biasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBias_Domain() {
		return (EAttribute)biasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBias_Source() {
		return (EAttribute)biasEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBias_SensitiveVariables() {
		return (EReference)biasEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBias_PositiveOutcome() {
		return (EReference)biasEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositiveOutcome() {
		return positiveOutcomeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositiveOutcome_Value() {
		return (EAttribute)positiveOutcomeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupBias() {
		return groupBiasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupBias_UnprivilegedGroup() {
		return (EReference)groupBiasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupBias_PrivilegedGroup() {
		return (EReference)groupBiasEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupBias_Analysis() {
		return (EReference)groupBiasEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndividualBias() {
		return individualBiasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividualBias_IndividualAnalysis() {
		return (EReference)individualBiasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensitiveGroup() {
		return sensitiveGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensitiveGroup_SensitiveValue() {
		return (EReference)sensitiveGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableValue() {
		return variableValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableValue_RelativeToDatasetSize() {
		return (EAttribute)variableValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableValue_Operator() {
		return (EReference)variableValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensitiveVariableValue() {
		return sensitiveVariableValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensitiveVariableValue_Value() {
		return (EAttribute)sensitiveVariableValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatasetSize() {
		return datasetSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogaritm() {
		return logaritmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogaritm_Operatorcomponent() {
		return (EReference)logaritmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSummation() {
		return summationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSummation_StartRange() {
		return (EReference)summationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSummation_EndRange() {
		return (EReference)summationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSummation_Body() {
		return (EReference)summationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOtherVariable() {
		return otherVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOtherVariable_Othervariablevalue() {
		return (EReference)otherVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExistingFairnessMetric() {
		return existingFairnessMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExistingFairnessMetric_Metric() {
		return (EAttribute)existingFairnessMetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetric() {
		return metricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetric_Function() {
		return (EReference)metricEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetric_Operator() {
		return (EReference)metricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetric_ToleranceValue() {
		return (EAttribute)metricEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataset() {
		return datasetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataset_OtherVariable() {
		return (EReference)datasetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataset_GroundTruthLabelName() {
		return (EAttribute)datasetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataset_PredictedLabelName() {
		return (EAttribute)datasetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataset_PositiveOutcome() {
		return (EReference)datasetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataset_DatasetSentiveVariable() {
		return (EReference)datasetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataset_FilePath() {
		return (EAttribute)datasetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatasetSensitiveVariable() {
		return datasetSensitiveVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatasetSensitiveVariable_MappingSensitiveVariable() {
		return (EReference)datasetSensitiveVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatasetSensitiveVariable_Datasetsensitivevariablevalue() {
		return (EReference)datasetSensitiveVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatasetPositiveOutcome() {
		return datasetPositiveOutcomeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatasetPositiveOutcome_MappingPositiveOutcome() {
		return (EReference)datasetPositiveOutcomeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatasetSensitiveGroup() {
		return datasetSensitiveGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatasetSensitiveGroup_SensitiveVariables() {
		return (EReference)datasetSensitiveGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatasetSensitiveGroup_MappingGroup() {
		return (EReference)datasetSensitiveGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatasetSensitiveVariableValue() {
		return datasetSensitiveVariableValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatasetSensitiveVariableValue_MappingValue() {
		return (EReference)datasetSensitiveVariableValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLogicalOperator() {
		return logicalOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSingleOperatorParameter() {
		return singleOperatorParameterEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRangeOperatorParameter() {
		return rangeOperatorParameterEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqualityOperator() {
		return equalityOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleOperator() {
		return singleOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleOperator_Operator() {
		return (EAttribute)singleOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleOperator_Value() {
		return (EAttribute)singleOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeOperator() {
		return rangeOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangeOperator_Operator() {
		return (EAttribute)rangeOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangeOperator_LowerValue() {
		return (EAttribute)rangeOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangeOperator_GreaterValue() {
		return (EAttribute)rangeOperatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLabelValueType() {
		return labelValueTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArithmeticOperator() {
		return arithmeticOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBiasSource() {
		return biasSourceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFairnessMetric() {
		return fairnessMetricEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FairnessFactory getFairnessFactory() {
		return (FairnessFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__EQUALITY_OPERATOR);
		createEReference(operationEClass, OPERATION__LEFT_SIDE);
		createEReference(operationEClass, OPERATION__RIGHT_SIDE);

		operatorComponentEClass = createEClass(OPERATOR_COMPONENT);
		createEReference(operatorComponentEClass, OPERATOR_COMPONENT__FUNCTION);
		createEReference(operatorComponentEClass, OPERATOR_COMPONENT__OPERATIONVALUE);

		analysisEClass = createEClass(ANALYSIS);
		createEReference(analysisEClass, ANALYSIS__METRIC);
		createEReference(analysisEClass, ANALYSIS__DATASET);
		createEAttribute(analysisEClass, ANALYSIS__SCOPE);

		groupAnalysisEClass = createEClass(GROUP_ANALYSIS);
		createEReference(groupAnalysisEClass, GROUP_ANALYSIS__DATASET_UNPRIVILEGED_GROUP);
		createEReference(groupAnalysisEClass, GROUP_ANALYSIS__DATASET_PRIVILEGED_GROUP);

		individualAnalysisEClass = createEClass(INDIVIDUAL_ANALYSIS);

		functionEClass = createEClass(FUNCTION);

		sensitiveVariableEClass = createEClass(SENSITIVE_VARIABLE);
		createEReference(sensitiveVariableEClass, SENSITIVE_VARIABLE__SENSITIVE_VARIABLE_VALUE);

		variableEClass = createEClass(VARIABLE);

		probabilityEClass = createEClass(PROBABILITY);
		createEReference(probabilityEClass, PROBABILITY__OBJECT);
		createEReference(probabilityEClass, PROBABILITY__CONDITION);

		expectedValueEClass = createEClass(EXPECTED_VALUE);
		createEReference(expectedValueEClass, EXPECTED_VALUE__CONDITION);
		createEAttribute(expectedValueEClass, EXPECTED_VALUE__COLUMN_NAME);

		groupSizeEClass = createEClass(GROUP_SIZE);
		createEReference(groupSizeEClass, GROUP_SIZE__GROUP_CONDITION);
		createEReference(groupSizeEClass, GROUP_SIZE__VARIABLE);

		logicalConditionEClass = createEClass(LOGICAL_CONDITION);
		createEReference(logicalConditionEClass, LOGICAL_CONDITION__SUBLOGICALCONDITION);
		createEReference(logicalConditionEClass, LOGICAL_CONDITION__VALUE);
		createEReference(logicalConditionEClass, LOGICAL_CONDITION__SENSITIVEGROUP);

		operationValueEClass = createEClass(OPERATION_VALUE);
		createEAttribute(operationValueEClass, OPERATION_VALUE__VALUE);

		subLogicalConditionEClass = createEClass(SUB_LOGICAL_CONDITION);
		createEAttribute(subLogicalConditionEClass, SUB_LOGICAL_CONDITION__LOGICAL_OPERATOR);
		createEReference(subLogicalConditionEClass, SUB_LOGICAL_CONDITION__LOGICALCONDITION);

		biasEClass = createEClass(BIAS);
		createEAttribute(biasEClass, BIAS__DOMAIN);
		createEAttribute(biasEClass, BIAS__SOURCE);
		createEReference(biasEClass, BIAS__SENSITIVE_VARIABLES);
		createEReference(biasEClass, BIAS__POSITIVE_OUTCOME);

		positiveOutcomeEClass = createEClass(POSITIVE_OUTCOME);
		createEAttribute(positiveOutcomeEClass, POSITIVE_OUTCOME__VALUE);

		groupBiasEClass = createEClass(GROUP_BIAS);
		createEReference(groupBiasEClass, GROUP_BIAS__UNPRIVILEGED_GROUP);
		createEReference(groupBiasEClass, GROUP_BIAS__PRIVILEGED_GROUP);
		createEReference(groupBiasEClass, GROUP_BIAS__ANALYSIS);

		individualBiasEClass = createEClass(INDIVIDUAL_BIAS);
		createEReference(individualBiasEClass, INDIVIDUAL_BIAS__INDIVIDUAL_ANALYSIS);

		sensitiveGroupEClass = createEClass(SENSITIVE_GROUP);
		createEReference(sensitiveGroupEClass, SENSITIVE_GROUP__SENSITIVE_VALUE);

		variableValueEClass = createEClass(VARIABLE_VALUE);
		createEAttribute(variableValueEClass, VARIABLE_VALUE__RELATIVE_TO_DATASET_SIZE);
		createEReference(variableValueEClass, VARIABLE_VALUE__OPERATOR);

		sensitiveVariableValueEClass = createEClass(SENSITIVE_VARIABLE_VALUE);
		createEAttribute(sensitiveVariableValueEClass, SENSITIVE_VARIABLE_VALUE__VALUE);

		datasetSizeEClass = createEClass(DATASET_SIZE);

		logaritmEClass = createEClass(LOGARITM);
		createEReference(logaritmEClass, LOGARITM__OPERATORCOMPONENT);

		summationEClass = createEClass(SUMMATION);
		createEReference(summationEClass, SUMMATION__START_RANGE);
		createEReference(summationEClass, SUMMATION__END_RANGE);
		createEReference(summationEClass, SUMMATION__BODY);

		otherVariableEClass = createEClass(OTHER_VARIABLE);
		createEReference(otherVariableEClass, OTHER_VARIABLE__OTHERVARIABLEVALUE);

		existingFairnessMetricEClass = createEClass(EXISTING_FAIRNESS_METRIC);
		createEAttribute(existingFairnessMetricEClass, EXISTING_FAIRNESS_METRIC__METRIC);

		metricEClass = createEClass(METRIC);
		createEReference(metricEClass, METRIC__OPERATOR);
		createEReference(metricEClass, METRIC__FUNCTION);
		createEAttribute(metricEClass, METRIC__TOLERANCE_VALUE);

		datasetEClass = createEClass(DATASET);
		createEReference(datasetEClass, DATASET__OTHER_VARIABLE);
		createEAttribute(datasetEClass, DATASET__GROUND_TRUTH_LABEL_NAME);
		createEAttribute(datasetEClass, DATASET__PREDICTED_LABEL_NAME);
		createEReference(datasetEClass, DATASET__POSITIVE_OUTCOME);
		createEReference(datasetEClass, DATASET__DATASET_SENTIVE_VARIABLE);
		createEAttribute(datasetEClass, DATASET__FILE_PATH);

		datasetSensitiveVariableEClass = createEClass(DATASET_SENSITIVE_VARIABLE);
		createEReference(datasetSensitiveVariableEClass, DATASET_SENSITIVE_VARIABLE__MAPPING_SENSITIVE_VARIABLE);
		createEReference(datasetSensitiveVariableEClass, DATASET_SENSITIVE_VARIABLE__DATASETSENSITIVEVARIABLEVALUE);

		datasetPositiveOutcomeEClass = createEClass(DATASET_POSITIVE_OUTCOME);
		createEReference(datasetPositiveOutcomeEClass, DATASET_POSITIVE_OUTCOME__MAPPING_POSITIVE_OUTCOME);

		datasetSensitiveGroupEClass = createEClass(DATASET_SENSITIVE_GROUP);
		createEReference(datasetSensitiveGroupEClass, DATASET_SENSITIVE_GROUP__SENSITIVE_VARIABLES);
		createEReference(datasetSensitiveGroupEClass, DATASET_SENSITIVE_GROUP__MAPPING_GROUP);

		datasetSensitiveVariableValueEClass = createEClass(DATASET_SENSITIVE_VARIABLE_VALUE);
		createEReference(datasetSensitiveVariableValueEClass, DATASET_SENSITIVE_VARIABLE_VALUE__MAPPING_VALUE);

		equalityOperatorEClass = createEClass(EQUALITY_OPERATOR);

		singleOperatorEClass = createEClass(SINGLE_OPERATOR);
		createEAttribute(singleOperatorEClass, SINGLE_OPERATOR__OPERATOR);
		createEAttribute(singleOperatorEClass, SINGLE_OPERATOR__VALUE);

		rangeOperatorEClass = createEClass(RANGE_OPERATOR);
		createEAttribute(rangeOperatorEClass, RANGE_OPERATOR__OPERATOR);
		createEAttribute(rangeOperatorEClass, RANGE_OPERATOR__LOWER_VALUE);
		createEAttribute(rangeOperatorEClass, RANGE_OPERATOR__GREATER_VALUE);

		// Create enums
		logicalOperatorEEnum = createEEnum(LOGICAL_OPERATOR);
		singleOperatorParameterEEnum = createEEnum(SINGLE_OPERATOR_PARAMETER);
		rangeOperatorParameterEEnum = createEEnum(RANGE_OPERATOR_PARAMETER);
		labelValueTypeEEnum = createEEnum(LABEL_VALUE_TYPE);
		arithmeticOperatorEEnum = createEEnum(ARITHMETIC_OPERATOR);
		biasSourceEEnum = createEEnum(BIAS_SOURCE);
		fairnessMetricEEnum = createEEnum(FAIRNESS_METRIC);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		operationEClass.getESuperTypes().add(this.getFunction());
		operatorComponentEClass.getESuperTypes().add(this.getNamedElement());
		analysisEClass.getESuperTypes().add(this.getNamedElement());
		groupAnalysisEClass.getESuperTypes().add(this.getAnalysis());
		individualAnalysisEClass.getESuperTypes().add(this.getAnalysis());
		functionEClass.getESuperTypes().add(this.getNamedElement());
		sensitiveVariableEClass.getESuperTypes().add(this.getVariable());
		variableEClass.getESuperTypes().add(this.getNamedElement());
		probabilityEClass.getESuperTypes().add(this.getFunction());
		expectedValueEClass.getESuperTypes().add(this.getFunction());
		groupSizeEClass.getESuperTypes().add(this.getFunction());
		logicalConditionEClass.getESuperTypes().add(this.getNamedElement());
		subLogicalConditionEClass.getESuperTypes().add(this.getNamedElement());
		biasEClass.getESuperTypes().add(this.getNamedElement());
		groupBiasEClass.getESuperTypes().add(this.getBias());
		individualBiasEClass.getESuperTypes().add(this.getBias());
		sensitiveGroupEClass.getESuperTypes().add(this.getNamedElement());
		variableValueEClass.getESuperTypes().add(this.getNamedElement());
		datasetSizeEClass.getESuperTypes().add(this.getFunction());
		logaritmEClass.getESuperTypes().add(this.getFunction());
		summationEClass.getESuperTypes().add(this.getFunction());
		otherVariableEClass.getESuperTypes().add(this.getVariable());
		existingFairnessMetricEClass.getESuperTypes().add(this.getFunction());
		metricEClass.getESuperTypes().add(this.getNamedElement());
		datasetEClass.getESuperTypes().add(this.getNamedElement());
		datasetSensitiveVariableEClass.getESuperTypes().add(this.getNamedElement());
		datasetPositiveOutcomeEClass.getESuperTypes().add(this.getVariableValue());
		datasetSensitiveGroupEClass.getESuperTypes().add(this.getNamedElement());
		datasetSensitiveVariableValueEClass.getESuperTypes().add(this.getVariableValue());
		singleOperatorEClass.getESuperTypes().add(this.getEqualityOperator());
		rangeOperatorEClass.getESuperTypes().add(this.getEqualityOperator());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_EqualityOperator(), this.getArithmeticOperator(), "equalityOperator", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_LeftSide(), this.getOperatorComponent(), null, "leftSide", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_RightSide(), this.getOperatorComponent(), null, "rightSide", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operatorComponentEClass, OperatorComponent.class, "OperatorComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperatorComponent_Function(), this.getFunction(), null, "function", null, 0, 1, OperatorComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperatorComponent_Operationvalue(), this.getOperationValue(), null, "operationvalue", null, 0, 1, OperatorComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analysisEClass, Analysis.class, "Analysis", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalysis_Metric(), this.getMetric(), null, "metric", null, 1, -1, Analysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysis_Dataset(), this.getDataset(), null, "dataset", null, 1, -1, Analysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalysis_Scope(), ecorePackage.getEString(), "scope", null, 0, 1, Analysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupAnalysisEClass, GroupAnalysis.class, "GroupAnalysis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroupAnalysis_DatasetUnprivilegedGroup(), this.getDatasetSensitiveGroup(), null, "datasetUnprivilegedGroup", null, 1, -1, GroupAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroupAnalysis_DatasetPrivilegedGroup(), this.getDatasetSensitiveGroup(), null, "datasetPrivilegedGroup", null, 1, -1, GroupAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(individualAnalysisEClass, IndividualAnalysis.class, "IndividualAnalysis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionEClass, Function.class, "Function", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sensitiveVariableEClass, SensitiveVariable.class, "SensitiveVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSensitiveVariable_SensitiveVariableValue(), this.getSensitiveVariableValue(), null, "sensitiveVariableValue", null, 1, -1, SensitiveVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(probabilityEClass, Probability.class, "Probability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProbability_Object(), this.getLogicalCondition(), null, "object", null, 1, 1, Probability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProbability_Condition(), this.getLogicalCondition(), null, "condition", null, 0, 1, Probability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expectedValueEClass, ExpectedValue.class, "ExpectedValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpectedValue_Condition(), this.getLogicalCondition(), null, "condition", null, 0, 1, ExpectedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpectedValue_ColumnName(), ecorePackage.getEString(), "columnName", null, 1, 1, ExpectedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupSizeEClass, GroupSize.class, "GroupSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroupSize_GroupCondition(), this.getLogicalCondition(), null, "groupCondition", null, 0, 1, GroupSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGroupSize_Variable(), this.getVariable(), null, "variable", null, 0, 1, GroupSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalConditionEClass, LogicalCondition.class, "LogicalCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicalCondition_Sublogicalcondition(), this.getSubLogicalCondition(), null, "sublogicalcondition", null, 0, 1, LogicalCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalCondition_Value(), this.getVariableValue(), null, "value", null, 0, 1, LogicalCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalCondition_Sensitivegroup(), this.getDatasetSensitiveGroup(), null, "sensitivegroup", null, 0, 1, LogicalCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationValueEClass, OperationValue.class, "OperationValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperationValue_Value(), ecorePackage.getEFloat(), "value", null, 1, 1, OperationValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subLogicalConditionEClass, SubLogicalCondition.class, "SubLogicalCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubLogicalCondition_LogicalOperator(), this.getLogicalOperator(), "logicalOperator", null, 1, 1, SubLogicalCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubLogicalCondition_Logicalcondition(), this.getLogicalCondition(), null, "logicalcondition", null, 1, 1, SubLogicalCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(biasEClass, Bias.class, "Bias", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBias_Domain(), ecorePackage.getEString(), "domain", null, 1, 1, Bias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBias_Source(), this.getBiasSource(), "source", null, 1, -1, Bias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBias_SensitiveVariables(), this.getSensitiveVariable(), null, "sensitiveVariables", null, 1, -1, Bias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBias_PositiveOutcome(), this.getPositiveOutcome(), null, "positiveOutcome", null, 1, 1, Bias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positiveOutcomeEClass, PositiveOutcome.class, "PositiveOutcome", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPositiveOutcome_Value(), ecorePackage.getEString(), "value", null, 1, 1, PositiveOutcome.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupBiasEClass, GroupBias.class, "GroupBias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroupBias_UnprivilegedGroup(), this.getSensitiveGroup(), null, "unprivilegedGroup", null, 1, -1, GroupBias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroupBias_PrivilegedGroup(), this.getSensitiveGroup(), null, "privilegedGroup", null, 1, -1, GroupBias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroupBias_Analysis(), this.getGroupAnalysis(), null, "analysis", null, 1, -1, GroupBias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(individualBiasEClass, IndividualBias.class, "IndividualBias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIndividualBias_IndividualAnalysis(), this.getIndividualAnalysis(), null, "individualAnalysis", null, 1, -1, IndividualBias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensitiveGroupEClass, SensitiveGroup.class, "SensitiveGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSensitiveGroup_SensitiveValue(), this.getSensitiveVariableValue(), null, "sensitiveValue", null, 1, -1, SensitiveGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableValueEClass, VariableValue.class, "VariableValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableValue_RelativeToDatasetSize(), ecorePackage.getEBoolean(), "relativeToDatasetSize", null, 0, 1, VariableValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableValue_Operator(), this.getEqualityOperator(), null, "operator", null, 1, 1, VariableValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensitiveVariableValueEClass, SensitiveVariableValue.class, "SensitiveVariableValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensitiveVariableValue_Value(), ecorePackage.getEString(), "value", null, 1, 1, SensitiveVariableValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datasetSizeEClass, DatasetSize.class, "DatasetSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(logaritmEClass, Logaritm.class, "Logaritm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogaritm_Operatorcomponent(), this.getOperatorComponent(), null, "operatorcomponent", null, 1, 1, Logaritm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(summationEClass, Summation.class, "Summation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSummation_StartRange(), this.getOperatorComponent(), null, "startRange", null, 1, 1, Summation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSummation_EndRange(), this.getOperatorComponent(), null, "endRange", null, 1, 1, Summation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSummation_Body(), this.getOperatorComponent(), null, "body", null, 1, 1, Summation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(otherVariableEClass, OtherVariable.class, "OtherVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOtherVariable_Othervariablevalue(), this.getVariableValue(), null, "othervariablevalue", null, 0, -1, OtherVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(existingFairnessMetricEClass, ExistingFairnessMetric.class, "ExistingFairnessMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExistingFairnessMetric_Metric(), this.getFairnessMetric(), "metric", null, 1, 1, ExistingFairnessMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metricEClass, Metric.class, "Metric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetric_Operator(), this.getEqualityOperator(), null, "operator", null, 1, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetric_Function(), this.getFunction(), null, "function", null, 1, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetric_ToleranceValue(), ecorePackage.getEFloat(), "toleranceValue", null, 1, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datasetEClass, Dataset.class, "Dataset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataset_OtherVariable(), this.getOtherVariable(), null, "otherVariable", null, 0, -1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataset_GroundTruthLabelName(), ecorePackage.getEString(), "groundTruthLabelName", null, 0, 1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataset_PredictedLabelName(), ecorePackage.getEString(), "predictedLabelName", null, 0, 1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataset_PositiveOutcome(), this.getDatasetPositiveOutcome(), null, "positiveOutcome", null, 1, 1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataset_DatasetSentiveVariable(), this.getDatasetSensitiveVariable(), null, "datasetSentiveVariable", null, 1, -1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataset_FilePath(), ecorePackage.getEString(), "filePath", null, 1, 1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datasetSensitiveVariableEClass, DatasetSensitiveVariable.class, "DatasetSensitiveVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatasetSensitiveVariable_MappingSensitiveVariable(), this.getSensitiveVariable(), null, "mappingSensitiveVariable", null, 1, 1, DatasetSensitiveVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatasetSensitiveVariable_Datasetsensitivevariablevalue(), this.getDatasetSensitiveVariableValue(), null, "datasetsensitivevariablevalue", null, 1, -1, DatasetSensitiveVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datasetPositiveOutcomeEClass, DatasetPositiveOutcome.class, "DatasetPositiveOutcome", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatasetPositiveOutcome_MappingPositiveOutcome(), this.getPositiveOutcome(), null, "mappingPositiveOutcome", null, 1, 1, DatasetPositiveOutcome.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datasetSensitiveGroupEClass, DatasetSensitiveGroup.class, "DatasetSensitiveGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatasetSensitiveGroup_SensitiveVariables(), this.getDatasetSensitiveVariableValue(), null, "sensitiveVariables", null, 1, -1, DatasetSensitiveGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatasetSensitiveGroup_MappingGroup(), this.getSensitiveGroup(), null, "mappingGroup", null, 1, 1, DatasetSensitiveGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datasetSensitiveVariableValueEClass, DatasetSensitiveVariableValue.class, "DatasetSensitiveVariableValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatasetSensitiveVariableValue_MappingValue(), this.getSensitiveVariableValue(), null, "mappingValue", null, 1, 1, DatasetSensitiveVariableValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equalityOperatorEClass, EqualityOperator.class, "EqualityOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(singleOperatorEClass, SingleOperator.class, "SingleOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSingleOperator_Operator(), this.getSingleOperatorParameter(), "operator", null, 1, 1, SingleOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingleOperator_Value(), ecorePackage.getEFloat(), "value", null, 1, 1, SingleOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rangeOperatorEClass, RangeOperator.class, "RangeOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRangeOperator_Operator(), this.getRangeOperatorParameter(), "operator", null, 1, 1, RangeOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRangeOperator_LowerValue(), ecorePackage.getEFloat(), "lowerValue", null, 1, 1, RangeOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRangeOperator_GreaterValue(), ecorePackage.getEFloat(), "greaterValue", null, 1, 1, RangeOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(logicalOperatorEEnum, LogicalOperator.class, "LogicalOperator");
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.AND);
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.OR);

		initEEnum(singleOperatorParameterEEnum, SingleOperatorParameter.class, "SingleOperatorParameter");
		addEEnumLiteral(singleOperatorParameterEEnum, SingleOperatorParameter.EQUAL);
		addEEnumLiteral(singleOperatorParameterEEnum, SingleOperatorParameter.GREATER);
		addEEnumLiteral(singleOperatorParameterEEnum, SingleOperatorParameter.MINOR);
		addEEnumLiteral(singleOperatorParameterEEnum, SingleOperatorParameter.GREATER_EQUAL);
		addEEnumLiteral(singleOperatorParameterEEnum, SingleOperatorParameter.MINOR_EQUAL);
		addEEnumLiteral(singleOperatorParameterEEnum, SingleOperatorParameter.NOT_EQUAL);

		initEEnum(rangeOperatorParameterEEnum, RangeOperatorParameter.class, "RangeOperatorParameter");
		addEEnumLiteral(rangeOperatorParameterEEnum, RangeOperatorParameter.IN_INCLUDED);
		addEEnumLiteral(rangeOperatorParameterEEnum, RangeOperatorParameter.IN_EXCLUDED);
		addEEnumLiteral(rangeOperatorParameterEEnum, RangeOperatorParameter.IN_LOWER_INCLUDED);
		addEEnumLiteral(rangeOperatorParameterEEnum, RangeOperatorParameter.IN_GREATER_INCLUDED);

		initEEnum(labelValueTypeEEnum, LabelValueType.class, "LabelValueType");
		addEEnumLiteral(labelValueTypeEEnum, LabelValueType.GROUND_TRUTH);
		addEEnumLiteral(labelValueTypeEEnum, LabelValueType.PREDICTED_VALUE);

		initEEnum(arithmeticOperatorEEnum, ArithmeticOperator.class, "ArithmeticOperator");
		addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.SUM);
		addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.DIFFERENCE);
		addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.MULTIPLICATION);
		addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.RATIO);

		initEEnum(biasSourceEEnum, BiasSource.class, "BiasSource");
		addEEnumLiteral(biasSourceEEnum, BiasSource.WRONG_ALGORITHM_BEHAVIOUR);
		addEEnumLiteral(biasSourceEEnum, BiasSource.HUMAN_DISCRIMINATION);
		addEEnumLiteral(biasSourceEEnum, BiasSource.WRONG_MEASUREMENT);
		addEEnumLiteral(biasSourceEEnum, BiasSource.OMITTED_VARIABLE);
		addEEnumLiteral(biasSourceEEnum, BiasSource.WRONG_SAMPLING);
		addEEnumLiteral(biasSourceEEnum, BiasSource.WRONG_AGGREGATION);
		addEEnumLiteral(biasSourceEEnum, BiasSource.WRONG_LINKING);
		addEEnumLiteral(biasSourceEEnum, BiasSource.WRONG_PRESENTATION);
		addEEnumLiteral(biasSourceEEnum, BiasSource.RESULT_RANKING);
		addEEnumLiteral(biasSourceEEnum, BiasSource.WRONG_SYSTEM_EVALUATION);
		addEEnumLiteral(biasSourceEEnum, BiasSource.WRONG_SYSTEM_TARGET_POPULATION);
		addEEnumLiteral(biasSourceEEnum, BiasSource.CHANGE_IN_TARGET_POPULATION);

		initEEnum(fairnessMetricEEnum, FairnessMetric.class, "FairnessMetric");
		addEEnumLiteral(fairnessMetricEEnum, FairnessMetric.STATISTICAL_PARITY);
		addEEnumLiteral(fairnessMetricEEnum, FairnessMetric.DISPARATE_IMPACT);
		addEEnumLiteral(fairnessMetricEEnum, FairnessMetric.EQUALIZED_ODDS);
		addEEnumLiteral(fairnessMetricEEnum, FairnessMetric.EQUAL_ACCURACY);
		addEEnumLiteral(fairnessMetricEEnum, FairnessMetric.FALSE_POSITIVE_DIFFERENCE);
		addEEnumLiteral(fairnessMetricEEnum, FairnessMetric.TRUE_POSITIVE_DIFFERENCE);

		// Create resource
		createResource(eNS_URI);
	}

} //FairnessPackageImpl
