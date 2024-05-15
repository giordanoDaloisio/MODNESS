/**
 */
package fairness;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fairness.FairnessFactory
 * @model kind="package"
 * @generated
 */
public interface FairnessPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fairness";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/fairness";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fairness";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FairnessPackage eINSTANCE = fairness.impl.FairnessPackageImpl.init();

	/**
	 * The meta object id for the '{@link fairness.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.impl.NamedElementImpl
	 * @see fairness.impl.FairnessPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fairness.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.impl.FunctionImpl
	 * @see fairness.impl.FairnessPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fairness.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.impl.OperationImpl
	 * @see fairness.impl.FairnessPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Equality Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__EQUALITY_OPERATOR = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__LEFT_SIDE = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RIGHT_SIDE = FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fairness.impl.OperatorComponentImpl <em>Operator Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.impl.OperatorComponentImpl
	 * @see fairness.impl.FairnessPackageImpl#getOperatorComponent()
	 * @generated
	 */
	int OPERATOR_COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_COMPONENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_COMPONENT__FUNCTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operationvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_COMPONENT__OPERATIONVALUE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operator Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_COMPONENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Operator Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_COMPONENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fairness.impl.AnalysisImpl <em>Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.impl.AnalysisImpl
	 * @see fairness.impl.FairnessPackageImpl#getAnalysis()
	 * @generated
	 */
	int ANALYSIS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__METRIC = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__DATASET = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__SCOPE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dataset Unprivileged Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__DATASET_UNPRIVILEGED_GROUP = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Dataset Privileged Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__DATASET_PRIVILEGED_GROUP = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fairness.impl.GroupAnalysisImpl <em>Group Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.impl.GroupAnalysisImpl
	 * @see fairness.impl.FairnessPackageImpl#getGroupAnalysis()
	 * @generated
	 */
	int GROUP_ANALYSIS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_ANALYSIS__NAME = ANALYSIS__NAME;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_ANALYSIS__METRIC = ANALYSIS__METRIC;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_ANALYSIS__DATASET = ANALYSIS__DATASET;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_ANALYSIS__SCOPE = ANALYSIS__SCOPE;

	/**
	 * The feature id for the '<em><b>Dataset Unprivileged Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_ANALYSIS__DATASET_UNPRIVILEGED_GROUP = ANALYSIS__DATASET_UNPRIVILEGED_GROUP;

	/**
	 * The feature id for the '<em><b>Dataset Privileged Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_ANALYSIS__DATASET_PRIVILEGED_GROUP = ANALYSIS__DATASET_PRIVILEGED_GROUP;

	/**
	 * The number of structural features of the '<em>Group Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_ANALYSIS_FEATURE_COUNT = ANALYSIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Group Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_ANALYSIS_OPERATION_COUNT = ANALYSIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fairness.impl.IndividualAnalysisImpl <em>Individual Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.impl.IndividualAnalysisImpl
	 * @see fairness.impl.FairnessPackageImpl#getIndividualAnalysis()
	 * @generated
	 */
	int INDIVIDUAL_ANALYSIS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_ANALYSIS__NAME = ANALYSIS__NAME;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_ANALYSIS__METRIC = ANALYSIS__METRIC;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_ANALYSIS__DATASET = ANALYSIS__DATASET;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_ANALYSIS__SCOPE = ANALYSIS__SCOPE;

	/**
	 * The feature id for the '<em><b>Dataset Unprivileged Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_ANALYSIS__DATASET_UNPRIVILEGED_GROUP = ANALYSIS__DATASET_UNPRIVILEGED_GROUP;

	/**
	 * The feature id for the '<em><b>Dataset Privileged Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_ANALYSIS__DATASET_PRIVILEGED_GROUP = ANALYSIS__DATASET_PRIVILEGED_GROUP;

	/**
	 * The number of structural features of the '<em>Individual Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_ANALYSIS_FEATURE_COUNT = ANALYSIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Individual Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_ANALYSIS_OPERATION_COUNT = ANALYSIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fairness.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.impl.VariableImpl
	 * @see fairness.impl.FairnessPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fairness.impl.SensitiveVariableImpl <em>Sensitive Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.impl.SensitiveVariableImpl
	 * @see fairness.impl.FairnessPackageImpl#getSensitiveVariable()
	 * @generated
	 */
	int SENSITIVE_VARIABLE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVE_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Sensitive Variable Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVE_VARIABLE__SENSITIVE_VARIABLE_VALUE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sensitive Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVE_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sensitive Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVE_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fairness.impl.ProbabilityImpl <em>Probability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.impl.ProbabilityImpl
	 * @see fairness.impl.FairnessPackageImpl#getProbability()
	 * @generated
	 */
	int PROBABILITY = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILITY__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILITY__OBJECT = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILITY__CONDITION = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Probability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILITY_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Probability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILITY_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fairness.impl.ExpectedValueImpl <em>Expected Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.impl.ExpectedValueImpl
	 * @see fairness.impl.FairnessPackageImpl#getExpectedValue()
	 * @generated
	 */
	int EXPECTED_VALUE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_VALUE__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_VALUE__CONDITION = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_VALUE__COLUMN_NAME = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expected Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_VALUE_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Expected Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_VALUE_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fairness.impl.GroupSizeImpl <em>Group Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.impl.GroupSizeImpl
	 * @see fairness.impl.FairnessPackageImpl#getGroupSize()
	 * @generated
	 */
	int GROUP_SIZE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SIZE__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Group Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SIZE__GROUP_CONDITION = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SIZE__VARIABLE = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Group Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SIZE_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Group Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SIZE_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fairness.impl.LogicalConditionImpl <em>Logical Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.impl.LogicalConditionImpl
	 * @see fairness.impl.FairnessPackageImpl#getLogicalCondition()
	 * @generated
	 */
	int LOGICAL_CONDITION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONDITION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sublogicalcondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONDITION__SUBLOGICALCONDITION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONDITION__VALUE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sensitivegroup</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONDITION__SENSITIVEGROUP = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Logical Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONDITION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Logical Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONDITION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fairness.impl.OperationValueImpl <em>Operation Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.impl.OperationValueImpl
	 * @see fairness.impl.FairnessPackageImpl#getOperationValue()
	 * @generated
	 */
	int OPERATION_VALUE = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_VALUE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Operation Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Operation Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fairness.impl.SubLogicalConditionImpl <em>Sub Logical Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.impl.SubLogicalConditionImpl
	 * @see fairness.impl.FairnessPackageImpl#getSubLogicalCondition()
	 * @generated
	 */
	int SUB_LOGICAL_CONDITION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOGICAL_CONDITION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Logical Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOGICAL_CONDITION__LOGICAL_OPERATOR = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Logicalcondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOGICAL_CONDITION__LOGICALCONDITION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sub Logical Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOGICAL_CONDITION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sub Logical Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOGICAL_CONDITION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fairness.impl.BiasImpl <em>Bias</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.impl.BiasImpl
	 * @see fairness.impl.FairnessPackageImpl#getBias()
	 * @generated
	 */
	int BIAS = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIAS__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIAS__DOMAIN = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIAS__SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sensitive Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIAS__SENSITIVE_VARIABLES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Positive Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIAS__POSITIVE_OUTCOME = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Unprivileged Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIAS__UNPRIVILEGED_GROUP = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Privileged Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIAS__PRIVILEGED_GROUP = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Bias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIAS_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Bias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIAS_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fairness.impl.GroupBiasImpl <em>Group Bias</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.impl.GroupBiasImpl
	 * @see fairness.impl.FairnessPackageImpl#getGroupBias()
	 * @generated
	 */
	int GROUP_BIAS = 17;

	/**
	 * The meta object id for the '{@link fairness.impl.IndividualBiasImpl <em>Individual Bias</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.impl.IndividualBiasImpl
	 * @see fairness.impl.FairnessPackageImpl#getIndividualBias()
	 * @generated
	 */
	int INDIVIDUAL_BIAS = 18;

	/**
	 * The meta object id for the '{@link fairness.impl.SensitiveGroupImpl <em>Sensitive Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.impl.SensitiveGroupImpl
	 * @see fairness.impl.FairnessPackageImpl#getSensitiveGroup()
	 * @generated
	 */
	int SENSITIVE_GROUP = 19;

	/**
	 * The meta object id for the '{@link fairness.impl.VariableValueImpl <em>Variable Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.impl.VariableValueImpl
	 * @see fairness.impl.FairnessPackageImpl#getVariableValue()
	 * @generated
	 */
	int VARIABLE_VALUE = 20;

	/**
	 * The meta object id for the '{@link fairness.impl.PositiveOutcomeImpl <em>Positive Outcome</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.impl.PositiveOutcomeImpl
	 * @see fairness.impl.FairnessPackageImpl#getPositiveOutcome()
	 * @generated
	 */
	int POSITIVE_OUTCOME = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_OUTCOME__NAME = 0;

	/**
	 * The number of structural features of the '<em>Positive Outcome</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_OUTCOME_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Positive Outcome</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_OUTCOME_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BIAS__NAME = BIAS__NAME;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BIAS__DOMAIN = BIAS__DOMAIN;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BIAS__SOURCE = BIAS__SOURCE;

	/**
	 * The feature id for the '<em><b>Sensitive Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BIAS__SENSITIVE_VARIABLES = BIAS__SENSITIVE_VARIABLES;

	/**
	 * The feature id for the '<em><b>Positive Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BIAS__POSITIVE_OUTCOME = BIAS__POSITIVE_OUTCOME;

	/**
	 * The feature id for the '<em><b>Unprivileged Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BIAS__UNPRIVILEGED_GROUP = BIAS__UNPRIVILEGED_GROUP;

	/**
	 * The feature id for the '<em><b>Privileged Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BIAS__PRIVILEGED_GROUP = BIAS__PRIVILEGED_GROUP;

	/**
	 * The feature id for the '<em><b>Analysis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BIAS__ANALYSIS = BIAS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group Bias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BIAS_FEATURE_COUNT = BIAS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Group Bias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BIAS_OPERATION_COUNT = BIAS_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_BIAS__NAME = BIAS__NAME;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_BIAS__DOMAIN = BIAS__DOMAIN;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_BIAS__SOURCE = BIAS__SOURCE;

	/**
	 * The feature id for the '<em><b>Sensitive Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_BIAS__SENSITIVE_VARIABLES = BIAS__SENSITIVE_VARIABLES;

	/**
	 * The feature id for the '<em><b>Positive Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_BIAS__POSITIVE_OUTCOME = BIAS__POSITIVE_OUTCOME;

	/**
	 * The feature id for the '<em><b>Unprivileged Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_BIAS__UNPRIVILEGED_GROUP = BIAS__UNPRIVILEGED_GROUP;

	/**
	 * The feature id for the '<em><b>Privileged Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_BIAS__PRIVILEGED_GROUP = BIAS__PRIVILEGED_GROUP;

	/**
	 * The feature id for the '<em><b>Individual Analysis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_BIAS__INDIVIDUAL_ANALYSIS = BIAS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Individual Bias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_BIAS_FEATURE_COUNT = BIAS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Individual Bias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_BIAS_OPERATION_COUNT = BIAS_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVE_GROUP__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sensitive Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVE_GROUP__SENSITIVE_VALUE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sensitive Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVE_GROUP_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sensitive Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVE_GROUP_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_VALUE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Relative To Dataset Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_VALUE__RELATIVE_TO_DATASET_SIZE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_VALUE__OPERATOR = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_VALUE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Variable Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_VALUE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fairness.impl.SensitiveVariableValueImpl <em>Sensitive Variable Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.impl.SensitiveVariableValueImpl
	 * @see fairness.impl.FairnessPackageImpl#getSensitiveVariableValue()
	 * @generated
	 */
	int SENSITIVE_VARIABLE_VALUE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVE_VARIABLE_VALUE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Sensitive Variable Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVE_VARIABLE_VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sensitive Variable Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVE_VARIABLE_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fairness.impl.DatasetSizeImpl <em>Dataset Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.impl.DatasetSizeImpl
	 * @see fairness.impl.FairnessPackageImpl#getDatasetSize()
	 * @generated
	 */
	int DATASET_SIZE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_SIZE__NAME = FUNCTION__NAME;

	/**
	 * The number of structural features of the '<em>Dataset Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_SIZE_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dataset Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_SIZE_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fairness.impl.LogaritmImpl <em>Logaritm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.impl.LogaritmImpl
	 * @see fairness.impl.FairnessPackageImpl#getLogaritm()
	 * @generated
	 */
	int LOGARITM = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITM__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Operatorcomponent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITM__OPERATORCOMPONENT = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Logaritm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITM_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Logaritm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITM_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fairness.impl.SummationImpl <em>Summation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.impl.SummationImpl
	 * @see fairness.impl.FairnessPackageImpl#getSummation()
	 * @generated
	 */
	int SUMMATION = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMATION__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Start Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMATION__START_RANGE = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMATION__END_RANGE = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMATION__BODY = FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Summation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMATION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Summation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMATION_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fairness.impl.OtherVariableImpl <em>Other Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.impl.OtherVariableImpl
	 * @see fairness.impl.FairnessPackageImpl#getOtherVariable()
	 * @generated
	 */
	int OTHER_VARIABLE = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Othervariablevalue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_VARIABLE__OTHERVARIABLEVALUE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Other Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Other Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fairness.impl.ExistingGroupFairnessMetricImpl <em>Existing Group Fairness Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.impl.ExistingGroupFairnessMetricImpl
	 * @see fairness.impl.FairnessPackageImpl#getExistingGroupFairnessMetric()
	 * @generated
	 */
	int EXISTING_GROUP_FAIRNESS_METRIC = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTING_GROUP_FAIRNESS_METRIC__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTING_GROUP_FAIRNESS_METRIC__METRIC = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Existing Group Fairness Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTING_GROUP_FAIRNESS_METRIC_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Existing Group Fairness Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTING_GROUP_FAIRNESS_METRIC_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fairness.impl.ExistingIndividualFairnessMetricImpl <em>Existing Individual Fairness Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.impl.ExistingIndividualFairnessMetricImpl
	 * @see fairness.impl.FairnessPackageImpl#getExistingIndividualFairnessMetric()
	 * @generated
	 */
	int EXISTING_INDIVIDUAL_FAIRNESS_METRIC = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTING_INDIVIDUAL_FAIRNESS_METRIC__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTING_INDIVIDUAL_FAIRNESS_METRIC__METRIC = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Existing Individual Fairness Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTING_INDIVIDUAL_FAIRNESS_METRIC_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Existing Individual Fairness Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTING_INDIVIDUAL_FAIRNESS_METRIC_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fairness.impl.MetricImpl <em>Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.impl.MetricImpl
	 * @see fairness.impl.FairnessPackageImpl#getMetric()
	 * @generated
	 */
	int METRIC = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__OPERATOR = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__FUNCTION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tolerance Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__TOLERANCE_VALUE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fairness.impl.DatasetImpl <em>Dataset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.impl.DatasetImpl
	 * @see fairness.impl.FairnessPackageImpl#getDataset()
	 * @generated
	 */
	int DATASET = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Other Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__OTHER_VARIABLE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ground Truth Label Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__GROUND_TRUTH_LABEL_NAME = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Predicted Label Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__PREDICTED_LABEL_NAME = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Positive Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__POSITIVE_OUTCOME = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Dataset Sentive Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__DATASET_SENTIVE_VARIABLE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__FILE_PATH = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fairness.impl.DatasetSensitiveVariableImpl <em>Dataset Sensitive Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.impl.DatasetSensitiveVariableImpl
	 * @see fairness.impl.FairnessPackageImpl#getDatasetSensitiveVariable()
	 * @generated
	 */
	int DATASET_SENSITIVE_VARIABLE = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_SENSITIVE_VARIABLE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Mapping Sensitive Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_SENSITIVE_VARIABLE__MAPPING_SENSITIVE_VARIABLE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datasetsensitivevariablevalue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_SENSITIVE_VARIABLE__DATASETSENSITIVEVARIABLEVALUE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dataset Sensitive Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_SENSITIVE_VARIABLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dataset Sensitive Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_SENSITIVE_VARIABLE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fairness.impl.DatasetPositiveOutcomeImpl <em>Dataset Positive Outcome</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.impl.DatasetPositiveOutcomeImpl
	 * @see fairness.impl.FairnessPackageImpl#getDatasetPositiveOutcome()
	 * @generated
	 */
	int DATASET_POSITIVE_OUTCOME = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_POSITIVE_OUTCOME__NAME = VARIABLE_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Relative To Dataset Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_POSITIVE_OUTCOME__RELATIVE_TO_DATASET_SIZE = VARIABLE_VALUE__RELATIVE_TO_DATASET_SIZE;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_POSITIVE_OUTCOME__OPERATOR = VARIABLE_VALUE__OPERATOR;

	/**
	 * The feature id for the '<em><b>Mapping Positive Outcome</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_POSITIVE_OUTCOME__MAPPING_POSITIVE_OUTCOME = VARIABLE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dataset Positive Outcome</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_POSITIVE_OUTCOME_FEATURE_COUNT = VARIABLE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dataset Positive Outcome</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_POSITIVE_OUTCOME_OPERATION_COUNT = VARIABLE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fairness.impl.DatasetSensitiveGroupImpl <em>Dataset Sensitive Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.impl.DatasetSensitiveGroupImpl
	 * @see fairness.impl.FairnessPackageImpl#getDatasetSensitiveGroup()
	 * @generated
	 */
	int DATASET_SENSITIVE_GROUP = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_SENSITIVE_GROUP__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sensitive Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_SENSITIVE_GROUP__SENSITIVE_VARIABLES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mapping Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_SENSITIVE_GROUP__MAPPING_GROUP = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dataset Sensitive Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_SENSITIVE_GROUP_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dataset Sensitive Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_SENSITIVE_GROUP_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fairness.impl.DatasetSensitiveVariableValueImpl <em>Dataset Sensitive Variable Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.impl.DatasetSensitiveVariableValueImpl
	 * @see fairness.impl.FairnessPackageImpl#getDatasetSensitiveVariableValue()
	 * @generated
	 */
	int DATASET_SENSITIVE_VARIABLE_VALUE = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_SENSITIVE_VARIABLE_VALUE__NAME = VARIABLE_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Relative To Dataset Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_SENSITIVE_VARIABLE_VALUE__RELATIVE_TO_DATASET_SIZE = VARIABLE_VALUE__RELATIVE_TO_DATASET_SIZE;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_SENSITIVE_VARIABLE_VALUE__OPERATOR = VARIABLE_VALUE__OPERATOR;

	/**
	 * The feature id for the '<em><b>Mapping Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_SENSITIVE_VARIABLE_VALUE__MAPPING_VALUE = VARIABLE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dataset Sensitive Variable Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_SENSITIVE_VARIABLE_VALUE_FEATURE_COUNT = VARIABLE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dataset Sensitive Variable Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_SENSITIVE_VARIABLE_VALUE_OPERATION_COUNT = VARIABLE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fairness.LogicalOperator <em>Logical Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.LogicalOperator
	 * @see fairness.impl.FairnessPackageImpl#getLogicalOperator()
	 * @generated
	 */
	int LOGICAL_OPERATOR = 37;

	/**
	 * The meta object id for the '{@link fairness.SingleOperatorParameter <em>Single Operator Parameter</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.SingleOperatorParameter
	 * @see fairness.impl.FairnessPackageImpl#getSingleOperatorParameter()
	 * @generated
	 */
	int SINGLE_OPERATOR_PARAMETER = 38;

	/**
	 * The meta object id for the '{@link fairness.RangeOperatorParameter <em>Range Operator Parameter</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.RangeOperatorParameter
	 * @see fairness.impl.FairnessPackageImpl#getRangeOperatorParameter()
	 * @generated
	 */
	int RANGE_OPERATOR_PARAMETER = 39;

	/**
	 * The meta object id for the '{@link fairness.impl.EqualityOperatorImpl <em>Equality Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.impl.EqualityOperatorImpl
	 * @see fairness.impl.FairnessPackageImpl#getEqualityOperator()
	 * @generated
	 */
	int EQUALITY_OPERATOR = 34;

	/**
	 * The number of structural features of the '<em>Equality Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OPERATOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Equality Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OPERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fairness.impl.SingleOperatorImpl <em>Single Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.impl.SingleOperatorImpl
	 * @see fairness.impl.FairnessPackageImpl#getSingleOperator()
	 * @generated
	 */
	int SINGLE_OPERATOR = 35;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_OPERATOR__OPERATOR = EQUALITY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_OPERATOR__VALUE = EQUALITY_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Single Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_OPERATOR_FEATURE_COUNT = EQUALITY_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Single Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_OPERATOR_OPERATION_COUNT = EQUALITY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fairness.impl.RangeOperatorImpl <em>Range Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.impl.RangeOperatorImpl
	 * @see fairness.impl.FairnessPackageImpl#getRangeOperator()
	 * @generated
	 */
	int RANGE_OPERATOR = 36;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_OPERATOR__OPERATOR = EQUALITY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lower Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_OPERATOR__LOWER_VALUE = EQUALITY_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Greater Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_OPERATOR__GREATER_VALUE = EQUALITY_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Range Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_OPERATOR_FEATURE_COUNT = EQUALITY_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Range Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_OPERATOR_OPERATION_COUNT = EQUALITY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fairness.LabelValueType <em>Label Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.LabelValueType
	 * @see fairness.impl.FairnessPackageImpl#getLabelValueType()
	 * @generated
	 */
	int LABEL_VALUE_TYPE = 40;

	/**
	 * The meta object id for the '{@link fairness.ArithmeticOperator <em>Arithmetic Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.ArithmeticOperator
	 * @see fairness.impl.FairnessPackageImpl#getArithmeticOperator()
	 * @generated
	 */
	int ARITHMETIC_OPERATOR = 41;

	/**
	 * The meta object id for the '{@link fairness.BiasSource <em>Bias Source</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.BiasSource
	 * @see fairness.impl.FairnessPackageImpl#getBiasSource()
	 * @generated
	 */
	int BIAS_SOURCE = 42;


	/**
	 * The meta object id for the '{@link fairness.GroupFairnessMetric <em>Group Fairness Metric</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.GroupFairnessMetric
	 * @see fairness.impl.FairnessPackageImpl#getGroupFairnessMetric()
	 * @generated
	 */
	int GROUP_FAIRNESS_METRIC = 43;

	/**
	 * The meta object id for the '{@link fairness.IndividualFairnessMetric <em>Individual Fairness Metric</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fairness.IndividualFairnessMetric
	 * @see fairness.impl.FairnessPackageImpl#getIndividualFairnessMetric()
	 * @generated
	 */
	int INDIVIDUAL_FAIRNESS_METRIC = 44;

	/**
	 * Returns the meta object for class '{@link fairness.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see fairness.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link fairness.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fairness.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link fairness.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see fairness.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link fairness.Operation#getEqualityOperator <em>Equality Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Equality Operator</em>'.
	 * @see fairness.Operation#getEqualityOperator()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_EqualityOperator();

	/**
	 * Returns the meta object for the containment reference '{@link fairness.Operation#getLeftSide <em>Left Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Side</em>'.
	 * @see fairness.Operation#getLeftSide()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_LeftSide();

	/**
	 * Returns the meta object for the containment reference '{@link fairness.Operation#getRightSide <em>Right Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Side</em>'.
	 * @see fairness.Operation#getRightSide()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_RightSide();

	/**
	 * Returns the meta object for class '{@link fairness.OperatorComponent <em>Operator Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator Component</em>'.
	 * @see fairness.OperatorComponent
	 * @generated
	 */
	EClass getOperatorComponent();

	/**
	 * Returns the meta object for the containment reference '{@link fairness.OperatorComponent#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see fairness.OperatorComponent#getFunction()
	 * @see #getOperatorComponent()
	 * @generated
	 */
	EReference getOperatorComponent_Function();

	/**
	 * Returns the meta object for the containment reference '{@link fairness.OperatorComponent#getOperationvalue <em>Operationvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operationvalue</em>'.
	 * @see fairness.OperatorComponent#getOperationvalue()
	 * @see #getOperatorComponent()
	 * @generated
	 */
	EReference getOperatorComponent_Operationvalue();

	/**
	 * Returns the meta object for class '{@link fairness.Analysis <em>Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis</em>'.
	 * @see fairness.Analysis
	 * @generated
	 */
	EClass getAnalysis();

	/**
	 * Returns the meta object for the containment reference list '{@link fairness.Analysis#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metric</em>'.
	 * @see fairness.Analysis#getMetric()
	 * @see #getAnalysis()
	 * @generated
	 */
	EReference getAnalysis_Metric();

	/**
	 * Returns the meta object for the containment reference list '{@link fairness.Analysis#getDataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dataset</em>'.
	 * @see fairness.Analysis#getDataset()
	 * @see #getAnalysis()
	 * @generated
	 */
	EReference getAnalysis_Dataset();

	/**
	 * Returns the meta object for the attribute '{@link fairness.Analysis#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see fairness.Analysis#getScope()
	 * @see #getAnalysis()
	 * @generated
	 */
	EAttribute getAnalysis_Scope();

	/**
	 * Returns the meta object for the containment reference list '{@link fairness.Analysis#getDatasetUnprivilegedGroup <em>Dataset Unprivileged Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dataset Unprivileged Group</em>'.
	 * @see fairness.Analysis#getDatasetUnprivilegedGroup()
	 * @see #getAnalysis()
	 * @generated
	 */
	EReference getAnalysis_DatasetUnprivilegedGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link fairness.Analysis#getDatasetPrivilegedGroup <em>Dataset Privileged Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dataset Privileged Group</em>'.
	 * @see fairness.Analysis#getDatasetPrivilegedGroup()
	 * @see #getAnalysis()
	 * @generated
	 */
	EReference getAnalysis_DatasetPrivilegedGroup();

	/**
	 * Returns the meta object for class '{@link fairness.GroupAnalysis <em>Group Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Analysis</em>'.
	 * @see fairness.GroupAnalysis
	 * @generated
	 */
	EClass getGroupAnalysis();

	/**
	 * Returns the meta object for class '{@link fairness.IndividualAnalysis <em>Individual Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual Analysis</em>'.
	 * @see fairness.IndividualAnalysis
	 * @generated
	 */
	EClass getIndividualAnalysis();

	/**
	 * Returns the meta object for class '{@link fairness.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see fairness.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for class '{@link fairness.SensitiveVariable <em>Sensitive Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensitive Variable</em>'.
	 * @see fairness.SensitiveVariable
	 * @generated
	 */
	EClass getSensitiveVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link fairness.SensitiveVariable#getSensitiveVariableValue <em>Sensitive Variable Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensitive Variable Value</em>'.
	 * @see fairness.SensitiveVariable#getSensitiveVariableValue()
	 * @see #getSensitiveVariable()
	 * @generated
	 */
	EReference getSensitiveVariable_SensitiveVariableValue();

	/**
	 * Returns the meta object for class '{@link fairness.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see fairness.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for class '{@link fairness.Probability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Probability</em>'.
	 * @see fairness.Probability
	 * @generated
	 */
	EClass getProbability();

	/**
	 * Returns the meta object for the containment reference '{@link fairness.Probability#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see fairness.Probability#getObject()
	 * @see #getProbability()
	 * @generated
	 */
	EReference getProbability_Object();

	/**
	 * Returns the meta object for the containment reference '{@link fairness.Probability#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see fairness.Probability#getCondition()
	 * @see #getProbability()
	 * @generated
	 */
	EReference getProbability_Condition();

	/**
	 * Returns the meta object for class '{@link fairness.ExpectedValue <em>Expected Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expected Value</em>'.
	 * @see fairness.ExpectedValue
	 * @generated
	 */
	EClass getExpectedValue();

	/**
	 * Returns the meta object for the containment reference '{@link fairness.ExpectedValue#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see fairness.ExpectedValue#getCondition()
	 * @see #getExpectedValue()
	 * @generated
	 */
	EReference getExpectedValue_Condition();

	/**
	 * Returns the meta object for the attribute '{@link fairness.ExpectedValue#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see fairness.ExpectedValue#getColumnName()
	 * @see #getExpectedValue()
	 * @generated
	 */
	EAttribute getExpectedValue_ColumnName();

	/**
	 * Returns the meta object for class '{@link fairness.GroupSize <em>Group Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Size</em>'.
	 * @see fairness.GroupSize
	 * @generated
	 */
	EClass getGroupSize();

	/**
	 * Returns the meta object for the containment reference '{@link fairness.GroupSize#getGroupCondition <em>Group Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group Condition</em>'.
	 * @see fairness.GroupSize#getGroupCondition()
	 * @see #getGroupSize()
	 * @generated
	 */
	EReference getGroupSize_GroupCondition();

	/**
	 * Returns the meta object for the reference '{@link fairness.GroupSize#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see fairness.GroupSize#getVariable()
	 * @see #getGroupSize()
	 * @generated
	 */
	EReference getGroupSize_Variable();

	/**
	 * Returns the meta object for class '{@link fairness.LogicalCondition <em>Logical Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Condition</em>'.
	 * @see fairness.LogicalCondition
	 * @generated
	 */
	EClass getLogicalCondition();

	/**
	 * Returns the meta object for the containment reference '{@link fairness.LogicalCondition#getSublogicalcondition <em>Sublogicalcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sublogicalcondition</em>'.
	 * @see fairness.LogicalCondition#getSublogicalcondition()
	 * @see #getLogicalCondition()
	 * @generated
	 */
	EReference getLogicalCondition_Sublogicalcondition();

	/**
	 * Returns the meta object for the reference '{@link fairness.LogicalCondition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see fairness.LogicalCondition#getValue()
	 * @see #getLogicalCondition()
	 * @generated
	 */
	EReference getLogicalCondition_Value();

	/**
	 * Returns the meta object for the reference '{@link fairness.LogicalCondition#getSensitivegroup <em>Sensitivegroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensitivegroup</em>'.
	 * @see fairness.LogicalCondition#getSensitivegroup()
	 * @see #getLogicalCondition()
	 * @generated
	 */
	EReference getLogicalCondition_Sensitivegroup();

	/**
	 * Returns the meta object for class '{@link fairness.OperationValue <em>Operation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Value</em>'.
	 * @see fairness.OperationValue
	 * @generated
	 */
	EClass getOperationValue();

	/**
	 * Returns the meta object for the attribute '{@link fairness.OperationValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fairness.OperationValue#getValue()
	 * @see #getOperationValue()
	 * @generated
	 */
	EAttribute getOperationValue_Value();

	/**
	 * Returns the meta object for class '{@link fairness.SubLogicalCondition <em>Sub Logical Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Logical Condition</em>'.
	 * @see fairness.SubLogicalCondition
	 * @generated
	 */
	EClass getSubLogicalCondition();

	/**
	 * Returns the meta object for the attribute '{@link fairness.SubLogicalCondition#getLogicalOperator <em>Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logical Operator</em>'.
	 * @see fairness.SubLogicalCondition#getLogicalOperator()
	 * @see #getSubLogicalCondition()
	 * @generated
	 */
	EAttribute getSubLogicalCondition_LogicalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link fairness.SubLogicalCondition#getLogicalcondition <em>Logicalcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Logicalcondition</em>'.
	 * @see fairness.SubLogicalCondition#getLogicalcondition()
	 * @see #getSubLogicalCondition()
	 * @generated
	 */
	EReference getSubLogicalCondition_Logicalcondition();

	/**
	 * Returns the meta object for class '{@link fairness.Bias <em>Bias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bias</em>'.
	 * @see fairness.Bias
	 * @generated
	 */
	EClass getBias();

	/**
	 * Returns the meta object for the attribute '{@link fairness.Bias#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain</em>'.
	 * @see fairness.Bias#getDomain()
	 * @see #getBias()
	 * @generated
	 */
	EAttribute getBias_Domain();

	/**
	 * Returns the meta object for the attribute list '{@link fairness.Bias#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Source</em>'.
	 * @see fairness.Bias#getSource()
	 * @see #getBias()
	 * @generated
	 */
	EAttribute getBias_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link fairness.Bias#getSensitiveVariables <em>Sensitive Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensitive Variables</em>'.
	 * @see fairness.Bias#getSensitiveVariables()
	 * @see #getBias()
	 * @generated
	 */
	EReference getBias_SensitiveVariables();

	/**
	 * Returns the meta object for the containment reference '{@link fairness.Bias#getPositiveOutcome <em>Positive Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Positive Outcome</em>'.
	 * @see fairness.Bias#getPositiveOutcome()
	 * @see #getBias()
	 * @generated
	 */
	EReference getBias_PositiveOutcome();

	/**
	 * Returns the meta object for the containment reference list '{@link fairness.Bias#getUnprivilegedGroup <em>Unprivileged Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unprivileged Group</em>'.
	 * @see fairness.Bias#getUnprivilegedGroup()
	 * @see #getBias()
	 * @generated
	 */
	EReference getBias_UnprivilegedGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link fairness.Bias#getPrivilegedGroup <em>Privileged Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Privileged Group</em>'.
	 * @see fairness.Bias#getPrivilegedGroup()
	 * @see #getBias()
	 * @generated
	 */
	EReference getBias_PrivilegedGroup();

	/**
	 * Returns the meta object for class '{@link fairness.PositiveOutcome <em>Positive Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positive Outcome</em>'.
	 * @see fairness.PositiveOutcome
	 * @generated
	 */
	EClass getPositiveOutcome();

	/**
	 * Returns the meta object for the attribute '{@link fairness.PositiveOutcome#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fairness.PositiveOutcome#getName()
	 * @see #getPositiveOutcome()
	 * @generated
	 */
	EAttribute getPositiveOutcome_Name();

	/**
	 * Returns the meta object for class '{@link fairness.GroupBias <em>Group Bias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Bias</em>'.
	 * @see fairness.GroupBias
	 * @generated
	 */
	EClass getGroupBias();

	/**
	 * Returns the meta object for the containment reference list '{@link fairness.GroupBias#getAnalysis <em>Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Analysis</em>'.
	 * @see fairness.GroupBias#getAnalysis()
	 * @see #getGroupBias()
	 * @generated
	 */
	EReference getGroupBias_Analysis();

	/**
	 * Returns the meta object for class '{@link fairness.IndividualBias <em>Individual Bias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual Bias</em>'.
	 * @see fairness.IndividualBias
	 * @generated
	 */
	EClass getIndividualBias();

	/**
	 * Returns the meta object for the containment reference list '{@link fairness.IndividualBias#getIndividualAnalysis <em>Individual Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Individual Analysis</em>'.
	 * @see fairness.IndividualBias#getIndividualAnalysis()
	 * @see #getIndividualBias()
	 * @generated
	 */
	EReference getIndividualBias_IndividualAnalysis();

	/**
	 * Returns the meta object for class '{@link fairness.SensitiveGroup <em>Sensitive Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensitive Group</em>'.
	 * @see fairness.SensitiveGroup
	 * @generated
	 */
	EClass getSensitiveGroup();

	/**
	 * Returns the meta object for the reference list '{@link fairness.SensitiveGroup#getSensitiveValue <em>Sensitive Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sensitive Value</em>'.
	 * @see fairness.SensitiveGroup#getSensitiveValue()
	 * @see #getSensitiveGroup()
	 * @generated
	 */
	EReference getSensitiveGroup_SensitiveValue();

	/**
	 * Returns the meta object for class '{@link fairness.VariableValue <em>Variable Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Value</em>'.
	 * @see fairness.VariableValue
	 * @generated
	 */
	EClass getVariableValue();

	/**
	 * Returns the meta object for the attribute '{@link fairness.VariableValue#isRelativeToDatasetSize <em>Relative To Dataset Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative To Dataset Size</em>'.
	 * @see fairness.VariableValue#isRelativeToDatasetSize()
	 * @see #getVariableValue()
	 * @generated
	 */
	EAttribute getVariableValue_RelativeToDatasetSize();

	/**
	 * Returns the meta object for the containment reference '{@link fairness.VariableValue#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see fairness.VariableValue#getOperator()
	 * @see #getVariableValue()
	 * @generated
	 */
	EReference getVariableValue_Operator();

	/**
	 * Returns the meta object for class '{@link fairness.SensitiveVariableValue <em>Sensitive Variable Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensitive Variable Value</em>'.
	 * @see fairness.SensitiveVariableValue
	 * @generated
	 */
	EClass getSensitiveVariableValue();

	/**
	 * Returns the meta object for the attribute '{@link fairness.SensitiveVariableValue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fairness.SensitiveVariableValue#getName()
	 * @see #getSensitiveVariableValue()
	 * @generated
	 */
	EAttribute getSensitiveVariableValue_Name();

	/**
	 * Returns the meta object for class '{@link fairness.DatasetSize <em>Dataset Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataset Size</em>'.
	 * @see fairness.DatasetSize
	 * @generated
	 */
	EClass getDatasetSize();

	/**
	 * Returns the meta object for class '{@link fairness.Logaritm <em>Logaritm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logaritm</em>'.
	 * @see fairness.Logaritm
	 * @generated
	 */
	EClass getLogaritm();

	/**
	 * Returns the meta object for the containment reference '{@link fairness.Logaritm#getOperatorcomponent <em>Operatorcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operatorcomponent</em>'.
	 * @see fairness.Logaritm#getOperatorcomponent()
	 * @see #getLogaritm()
	 * @generated
	 */
	EReference getLogaritm_Operatorcomponent();

	/**
	 * Returns the meta object for class '{@link fairness.Summation <em>Summation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Summation</em>'.
	 * @see fairness.Summation
	 * @generated
	 */
	EClass getSummation();

	/**
	 * Returns the meta object for the containment reference '{@link fairness.Summation#getStartRange <em>Start Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Range</em>'.
	 * @see fairness.Summation#getStartRange()
	 * @see #getSummation()
	 * @generated
	 */
	EReference getSummation_StartRange();

	/**
	 * Returns the meta object for the containment reference '{@link fairness.Summation#getEndRange <em>End Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End Range</em>'.
	 * @see fairness.Summation#getEndRange()
	 * @see #getSummation()
	 * @generated
	 */
	EReference getSummation_EndRange();

	/**
	 * Returns the meta object for the containment reference '{@link fairness.Summation#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see fairness.Summation#getBody()
	 * @see #getSummation()
	 * @generated
	 */
	EReference getSummation_Body();

	/**
	 * Returns the meta object for class '{@link fairness.OtherVariable <em>Other Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Other Variable</em>'.
	 * @see fairness.OtherVariable
	 * @generated
	 */
	EClass getOtherVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link fairness.OtherVariable#getOthervariablevalue <em>Othervariablevalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Othervariablevalue</em>'.
	 * @see fairness.OtherVariable#getOthervariablevalue()
	 * @see #getOtherVariable()
	 * @generated
	 */
	EReference getOtherVariable_Othervariablevalue();

	/**
	 * Returns the meta object for class '{@link fairness.ExistingGroupFairnessMetric <em>Existing Group Fairness Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Existing Group Fairness Metric</em>'.
	 * @see fairness.ExistingGroupFairnessMetric
	 * @generated
	 */
	EClass getExistingGroupFairnessMetric();

	/**
	 * Returns the meta object for the attribute '{@link fairness.ExistingGroupFairnessMetric#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric</em>'.
	 * @see fairness.ExistingGroupFairnessMetric#getMetric()
	 * @see #getExistingGroupFairnessMetric()
	 * @generated
	 */
	EAttribute getExistingGroupFairnessMetric_Metric();

	/**
	 * Returns the meta object for class '{@link fairness.ExistingIndividualFairnessMetric <em>Existing Individual Fairness Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Existing Individual Fairness Metric</em>'.
	 * @see fairness.ExistingIndividualFairnessMetric
	 * @generated
	 */
	EClass getExistingIndividualFairnessMetric();

	/**
	 * Returns the meta object for the attribute '{@link fairness.ExistingIndividualFairnessMetric#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric</em>'.
	 * @see fairness.ExistingIndividualFairnessMetric#getMetric()
	 * @see #getExistingIndividualFairnessMetric()
	 * @generated
	 */
	EAttribute getExistingIndividualFairnessMetric_Metric();

	/**
	 * Returns the meta object for class '{@link fairness.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric</em>'.
	 * @see fairness.Metric
	 * @generated
	 */
	EClass getMetric();

	/**
	 * Returns the meta object for the containment reference '{@link fairness.Metric#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see fairness.Metric#getFunction()
	 * @see #getMetric()
	 * @generated
	 */
	EReference getMetric_Function();

	/**
	 * Returns the meta object for the containment reference '{@link fairness.Metric#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see fairness.Metric#getOperator()
	 * @see #getMetric()
	 * @generated
	 */
	EReference getMetric_Operator();

	/**
	 * Returns the meta object for the attribute '{@link fairness.Metric#getToleranceValue <em>Tolerance Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tolerance Value</em>'.
	 * @see fairness.Metric#getToleranceValue()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_ToleranceValue();

	/**
	 * Returns the meta object for class '{@link fairness.Dataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataset</em>'.
	 * @see fairness.Dataset
	 * @generated
	 */
	EClass getDataset();

	/**
	 * Returns the meta object for the containment reference list '{@link fairness.Dataset#getOtherVariable <em>Other Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other Variable</em>'.
	 * @see fairness.Dataset#getOtherVariable()
	 * @see #getDataset()
	 * @generated
	 */
	EReference getDataset_OtherVariable();

	/**
	 * Returns the meta object for the attribute '{@link fairness.Dataset#getGroundTruthLabelName <em>Ground Truth Label Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ground Truth Label Name</em>'.
	 * @see fairness.Dataset#getGroundTruthLabelName()
	 * @see #getDataset()
	 * @generated
	 */
	EAttribute getDataset_GroundTruthLabelName();

	/**
	 * Returns the meta object for the attribute '{@link fairness.Dataset#getPredictedLabelName <em>Predicted Label Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Predicted Label Name</em>'.
	 * @see fairness.Dataset#getPredictedLabelName()
	 * @see #getDataset()
	 * @generated
	 */
	EAttribute getDataset_PredictedLabelName();

	/**
	 * Returns the meta object for the containment reference '{@link fairness.Dataset#getPositiveOutcome <em>Positive Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Positive Outcome</em>'.
	 * @see fairness.Dataset#getPositiveOutcome()
	 * @see #getDataset()
	 * @generated
	 */
	EReference getDataset_PositiveOutcome();

	/**
	 * Returns the meta object for the containment reference list '{@link fairness.Dataset#getDatasetSentiveVariable <em>Dataset Sentive Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dataset Sentive Variable</em>'.
	 * @see fairness.Dataset#getDatasetSentiveVariable()
	 * @see #getDataset()
	 * @generated
	 */
	EReference getDataset_DatasetSentiveVariable();

	/**
	 * Returns the meta object for the attribute '{@link fairness.Dataset#getFilePath <em>File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Path</em>'.
	 * @see fairness.Dataset#getFilePath()
	 * @see #getDataset()
	 * @generated
	 */
	EAttribute getDataset_FilePath();

	/**
	 * Returns the meta object for class '{@link fairness.DatasetSensitiveVariable <em>Dataset Sensitive Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataset Sensitive Variable</em>'.
	 * @see fairness.DatasetSensitiveVariable
	 * @generated
	 */
	EClass getDatasetSensitiveVariable();

	/**
	 * Returns the meta object for the reference '{@link fairness.DatasetSensitiveVariable#getMappingSensitiveVariable <em>Mapping Sensitive Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mapping Sensitive Variable</em>'.
	 * @see fairness.DatasetSensitiveVariable#getMappingSensitiveVariable()
	 * @see #getDatasetSensitiveVariable()
	 * @generated
	 */
	EReference getDatasetSensitiveVariable_MappingSensitiveVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link fairness.DatasetSensitiveVariable#getDatasetsensitivevariablevalue <em>Datasetsensitivevariablevalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datasetsensitivevariablevalue</em>'.
	 * @see fairness.DatasetSensitiveVariable#getDatasetsensitivevariablevalue()
	 * @see #getDatasetSensitiveVariable()
	 * @generated
	 */
	EReference getDatasetSensitiveVariable_Datasetsensitivevariablevalue();

	/**
	 * Returns the meta object for class '{@link fairness.DatasetPositiveOutcome <em>Dataset Positive Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataset Positive Outcome</em>'.
	 * @see fairness.DatasetPositiveOutcome
	 * @generated
	 */
	EClass getDatasetPositiveOutcome();

	/**
	 * Returns the meta object for the reference '{@link fairness.DatasetPositiveOutcome#getMappingPositiveOutcome <em>Mapping Positive Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mapping Positive Outcome</em>'.
	 * @see fairness.DatasetPositiveOutcome#getMappingPositiveOutcome()
	 * @see #getDatasetPositiveOutcome()
	 * @generated
	 */
	EReference getDatasetPositiveOutcome_MappingPositiveOutcome();

	/**
	 * Returns the meta object for class '{@link fairness.DatasetSensitiveGroup <em>Dataset Sensitive Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataset Sensitive Group</em>'.
	 * @see fairness.DatasetSensitiveGroup
	 * @generated
	 */
	EClass getDatasetSensitiveGroup();

	/**
	 * Returns the meta object for the reference list '{@link fairness.DatasetSensitiveGroup#getSensitiveVariables <em>Sensitive Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sensitive Variables</em>'.
	 * @see fairness.DatasetSensitiveGroup#getSensitiveVariables()
	 * @see #getDatasetSensitiveGroup()
	 * @generated
	 */
	EReference getDatasetSensitiveGroup_SensitiveVariables();

	/**
	 * Returns the meta object for the reference '{@link fairness.DatasetSensitiveGroup#getMappingGroup <em>Mapping Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mapping Group</em>'.
	 * @see fairness.DatasetSensitiveGroup#getMappingGroup()
	 * @see #getDatasetSensitiveGroup()
	 * @generated
	 */
	EReference getDatasetSensitiveGroup_MappingGroup();

	/**
	 * Returns the meta object for class '{@link fairness.DatasetSensitiveVariableValue <em>Dataset Sensitive Variable Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataset Sensitive Variable Value</em>'.
	 * @see fairness.DatasetSensitiveVariableValue
	 * @generated
	 */
	EClass getDatasetSensitiveVariableValue();

	/**
	 * Returns the meta object for the reference '{@link fairness.DatasetSensitiveVariableValue#getMappingValue <em>Mapping Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mapping Value</em>'.
	 * @see fairness.DatasetSensitiveVariableValue#getMappingValue()
	 * @see #getDatasetSensitiveVariableValue()
	 * @generated
	 */
	EReference getDatasetSensitiveVariableValue_MappingValue();

	/**
	 * Returns the meta object for enum '{@link fairness.LogicalOperator <em>Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logical Operator</em>'.
	 * @see fairness.LogicalOperator
	 * @generated
	 */
	EEnum getLogicalOperator();

	/**
	 * Returns the meta object for enum '{@link fairness.SingleOperatorParameter <em>Single Operator Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Single Operator Parameter</em>'.
	 * @see fairness.SingleOperatorParameter
	 * @generated
	 */
	EEnum getSingleOperatorParameter();

	/**
	 * Returns the meta object for enum '{@link fairness.RangeOperatorParameter <em>Range Operator Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Range Operator Parameter</em>'.
	 * @see fairness.RangeOperatorParameter
	 * @generated
	 */
	EEnum getRangeOperatorParameter();

	/**
	 * Returns the meta object for class '{@link fairness.EqualityOperator <em>Equality Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equality Operator</em>'.
	 * @see fairness.EqualityOperator
	 * @generated
	 */
	EClass getEqualityOperator();

	/**
	 * Returns the meta object for class '{@link fairness.SingleOperator <em>Single Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Operator</em>'.
	 * @see fairness.SingleOperator
	 * @generated
	 */
	EClass getSingleOperator();

	/**
	 * Returns the meta object for the attribute '{@link fairness.SingleOperator#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see fairness.SingleOperator#getOperator()
	 * @see #getSingleOperator()
	 * @generated
	 */
	EAttribute getSingleOperator_Operator();

	/**
	 * Returns the meta object for the attribute '{@link fairness.SingleOperator#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fairness.SingleOperator#getValue()
	 * @see #getSingleOperator()
	 * @generated
	 */
	EAttribute getSingleOperator_Value();

	/**
	 * Returns the meta object for class '{@link fairness.RangeOperator <em>Range Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Operator</em>'.
	 * @see fairness.RangeOperator
	 * @generated
	 */
	EClass getRangeOperator();

	/**
	 * Returns the meta object for the attribute '{@link fairness.RangeOperator#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see fairness.RangeOperator#getOperator()
	 * @see #getRangeOperator()
	 * @generated
	 */
	EAttribute getRangeOperator_Operator();

	/**
	 * Returns the meta object for the attribute '{@link fairness.RangeOperator#getLowerValue <em>Lower Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Value</em>'.
	 * @see fairness.RangeOperator#getLowerValue()
	 * @see #getRangeOperator()
	 * @generated
	 */
	EAttribute getRangeOperator_LowerValue();

	/**
	 * Returns the meta object for the attribute '{@link fairness.RangeOperator#getGreaterValue <em>Greater Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Greater Value</em>'.
	 * @see fairness.RangeOperator#getGreaterValue()
	 * @see #getRangeOperator()
	 * @generated
	 */
	EAttribute getRangeOperator_GreaterValue();

	/**
	 * Returns the meta object for enum '{@link fairness.LabelValueType <em>Label Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Label Value Type</em>'.
	 * @see fairness.LabelValueType
	 * @generated
	 */
	EEnum getLabelValueType();

	/**
	 * Returns the meta object for enum '{@link fairness.ArithmeticOperator <em>Arithmetic Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Arithmetic Operator</em>'.
	 * @see fairness.ArithmeticOperator
	 * @generated
	 */
	EEnum getArithmeticOperator();

	/**
	 * Returns the meta object for enum '{@link fairness.BiasSource <em>Bias Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bias Source</em>'.
	 * @see fairness.BiasSource
	 * @generated
	 */
	EEnum getBiasSource();

	/**
	 * Returns the meta object for enum '{@link fairness.GroupFairnessMetric <em>Group Fairness Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Group Fairness Metric</em>'.
	 * @see fairness.GroupFairnessMetric
	 * @generated
	 */
	EEnum getGroupFairnessMetric();

	/**
	 * Returns the meta object for enum '{@link fairness.IndividualFairnessMetric <em>Individual Fairness Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Individual Fairness Metric</em>'.
	 * @see fairness.IndividualFairnessMetric
	 * @generated
	 */
	EEnum getIndividualFairnessMetric();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FairnessFactory getFairnessFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fairness.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.impl.NamedElementImpl
		 * @see fairness.impl.FairnessPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link fairness.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.impl.OperationImpl
		 * @see fairness.impl.FairnessPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Equality Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__EQUALITY_OPERATOR = eINSTANCE.getOperation_EqualityOperator();

		/**
		 * The meta object literal for the '<em><b>Left Side</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__LEFT_SIDE = eINSTANCE.getOperation_LeftSide();

		/**
		 * The meta object literal for the '<em><b>Right Side</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__RIGHT_SIDE = eINSTANCE.getOperation_RightSide();

		/**
		 * The meta object literal for the '{@link fairness.impl.OperatorComponentImpl <em>Operator Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.impl.OperatorComponentImpl
		 * @see fairness.impl.FairnessPackageImpl#getOperatorComponent()
		 * @generated
		 */
		EClass OPERATOR_COMPONENT = eINSTANCE.getOperatorComponent();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR_COMPONENT__FUNCTION = eINSTANCE.getOperatorComponent_Function();

		/**
		 * The meta object literal for the '<em><b>Operationvalue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR_COMPONENT__OPERATIONVALUE = eINSTANCE.getOperatorComponent_Operationvalue();

		/**
		 * The meta object literal for the '{@link fairness.impl.AnalysisImpl <em>Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.impl.AnalysisImpl
		 * @see fairness.impl.FairnessPackageImpl#getAnalysis()
		 * @generated
		 */
		EClass ANALYSIS = eINSTANCE.getAnalysis();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS__METRIC = eINSTANCE.getAnalysis_Metric();

		/**
		 * The meta object literal for the '<em><b>Dataset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS__DATASET = eINSTANCE.getAnalysis_Dataset();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS__SCOPE = eINSTANCE.getAnalysis_Scope();

		/**
		 * The meta object literal for the '<em><b>Dataset Unprivileged Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS__DATASET_UNPRIVILEGED_GROUP = eINSTANCE.getAnalysis_DatasetUnprivilegedGroup();

		/**
		 * The meta object literal for the '<em><b>Dataset Privileged Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS__DATASET_PRIVILEGED_GROUP = eINSTANCE.getAnalysis_DatasetPrivilegedGroup();

		/**
		 * The meta object literal for the '{@link fairness.impl.GroupAnalysisImpl <em>Group Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.impl.GroupAnalysisImpl
		 * @see fairness.impl.FairnessPackageImpl#getGroupAnalysis()
		 * @generated
		 */
		EClass GROUP_ANALYSIS = eINSTANCE.getGroupAnalysis();

		/**
		 * The meta object literal for the '{@link fairness.impl.IndividualAnalysisImpl <em>Individual Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.impl.IndividualAnalysisImpl
		 * @see fairness.impl.FairnessPackageImpl#getIndividualAnalysis()
		 * @generated
		 */
		EClass INDIVIDUAL_ANALYSIS = eINSTANCE.getIndividualAnalysis();

		/**
		 * The meta object literal for the '{@link fairness.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.impl.FunctionImpl
		 * @see fairness.impl.FairnessPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '{@link fairness.impl.SensitiveVariableImpl <em>Sensitive Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.impl.SensitiveVariableImpl
		 * @see fairness.impl.FairnessPackageImpl#getSensitiveVariable()
		 * @generated
		 */
		EClass SENSITIVE_VARIABLE = eINSTANCE.getSensitiveVariable();

		/**
		 * The meta object literal for the '<em><b>Sensitive Variable Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSITIVE_VARIABLE__SENSITIVE_VARIABLE_VALUE = eINSTANCE.getSensitiveVariable_SensitiveVariableValue();

		/**
		 * The meta object literal for the '{@link fairness.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.impl.VariableImpl
		 * @see fairness.impl.FairnessPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '{@link fairness.impl.ProbabilityImpl <em>Probability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.impl.ProbabilityImpl
		 * @see fairness.impl.FairnessPackageImpl#getProbability()
		 * @generated
		 */
		EClass PROBABILITY = eINSTANCE.getProbability();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBABILITY__OBJECT = eINSTANCE.getProbability_Object();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBABILITY__CONDITION = eINSTANCE.getProbability_Condition();

		/**
		 * The meta object literal for the '{@link fairness.impl.ExpectedValueImpl <em>Expected Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.impl.ExpectedValueImpl
		 * @see fairness.impl.FairnessPackageImpl#getExpectedValue()
		 * @generated
		 */
		EClass EXPECTED_VALUE = eINSTANCE.getExpectedValue();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPECTED_VALUE__CONDITION = eINSTANCE.getExpectedValue_Condition();

		/**
		 * The meta object literal for the '<em><b>Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPECTED_VALUE__COLUMN_NAME = eINSTANCE.getExpectedValue_ColumnName();

		/**
		 * The meta object literal for the '{@link fairness.impl.GroupSizeImpl <em>Group Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.impl.GroupSizeImpl
		 * @see fairness.impl.FairnessPackageImpl#getGroupSize()
		 * @generated
		 */
		EClass GROUP_SIZE = eINSTANCE.getGroupSize();

		/**
		 * The meta object literal for the '<em><b>Group Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_SIZE__GROUP_CONDITION = eINSTANCE.getGroupSize_GroupCondition();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_SIZE__VARIABLE = eINSTANCE.getGroupSize_Variable();

		/**
		 * The meta object literal for the '{@link fairness.impl.LogicalConditionImpl <em>Logical Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.impl.LogicalConditionImpl
		 * @see fairness.impl.FairnessPackageImpl#getLogicalCondition()
		 * @generated
		 */
		EClass LOGICAL_CONDITION = eINSTANCE.getLogicalCondition();

		/**
		 * The meta object literal for the '<em><b>Sublogicalcondition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_CONDITION__SUBLOGICALCONDITION = eINSTANCE.getLogicalCondition_Sublogicalcondition();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_CONDITION__VALUE = eINSTANCE.getLogicalCondition_Value();

		/**
		 * The meta object literal for the '<em><b>Sensitivegroup</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_CONDITION__SENSITIVEGROUP = eINSTANCE.getLogicalCondition_Sensitivegroup();

		/**
		 * The meta object literal for the '{@link fairness.impl.OperationValueImpl <em>Operation Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.impl.OperationValueImpl
		 * @see fairness.impl.FairnessPackageImpl#getOperationValue()
		 * @generated
		 */
		EClass OPERATION_VALUE = eINSTANCE.getOperationValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_VALUE__VALUE = eINSTANCE.getOperationValue_Value();

		/**
		 * The meta object literal for the '{@link fairness.impl.SubLogicalConditionImpl <em>Sub Logical Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.impl.SubLogicalConditionImpl
		 * @see fairness.impl.FairnessPackageImpl#getSubLogicalCondition()
		 * @generated
		 */
		EClass SUB_LOGICAL_CONDITION = eINSTANCE.getSubLogicalCondition();

		/**
		 * The meta object literal for the '<em><b>Logical Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_LOGICAL_CONDITION__LOGICAL_OPERATOR = eINSTANCE.getSubLogicalCondition_LogicalOperator();

		/**
		 * The meta object literal for the '<em><b>Logicalcondition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_LOGICAL_CONDITION__LOGICALCONDITION = eINSTANCE.getSubLogicalCondition_Logicalcondition();

		/**
		 * The meta object literal for the '{@link fairness.impl.BiasImpl <em>Bias</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.impl.BiasImpl
		 * @see fairness.impl.FairnessPackageImpl#getBias()
		 * @generated
		 */
		EClass BIAS = eINSTANCE.getBias();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIAS__DOMAIN = eINSTANCE.getBias_Domain();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIAS__SOURCE = eINSTANCE.getBias_Source();

		/**
		 * The meta object literal for the '<em><b>Sensitive Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIAS__SENSITIVE_VARIABLES = eINSTANCE.getBias_SensitiveVariables();

		/**
		 * The meta object literal for the '<em><b>Positive Outcome</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIAS__POSITIVE_OUTCOME = eINSTANCE.getBias_PositiveOutcome();

		/**
		 * The meta object literal for the '<em><b>Unprivileged Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIAS__UNPRIVILEGED_GROUP = eINSTANCE.getBias_UnprivilegedGroup();

		/**
		 * The meta object literal for the '<em><b>Privileged Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIAS__PRIVILEGED_GROUP = eINSTANCE.getBias_PrivilegedGroup();

		/**
		 * The meta object literal for the '{@link fairness.impl.PositiveOutcomeImpl <em>Positive Outcome</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.impl.PositiveOutcomeImpl
		 * @see fairness.impl.FairnessPackageImpl#getPositiveOutcome()
		 * @generated
		 */
		EClass POSITIVE_OUTCOME = eINSTANCE.getPositiveOutcome();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITIVE_OUTCOME__NAME = eINSTANCE.getPositiveOutcome_Name();

		/**
		 * The meta object literal for the '{@link fairness.impl.GroupBiasImpl <em>Group Bias</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.impl.GroupBiasImpl
		 * @see fairness.impl.FairnessPackageImpl#getGroupBias()
		 * @generated
		 */
		EClass GROUP_BIAS = eINSTANCE.getGroupBias();

		/**
		 * The meta object literal for the '<em><b>Analysis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_BIAS__ANALYSIS = eINSTANCE.getGroupBias_Analysis();

		/**
		 * The meta object literal for the '{@link fairness.impl.IndividualBiasImpl <em>Individual Bias</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.impl.IndividualBiasImpl
		 * @see fairness.impl.FairnessPackageImpl#getIndividualBias()
		 * @generated
		 */
		EClass INDIVIDUAL_BIAS = eINSTANCE.getIndividualBias();

		/**
		 * The meta object literal for the '<em><b>Individual Analysis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_BIAS__INDIVIDUAL_ANALYSIS = eINSTANCE.getIndividualBias_IndividualAnalysis();

		/**
		 * The meta object literal for the '{@link fairness.impl.SensitiveGroupImpl <em>Sensitive Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.impl.SensitiveGroupImpl
		 * @see fairness.impl.FairnessPackageImpl#getSensitiveGroup()
		 * @generated
		 */
		EClass SENSITIVE_GROUP = eINSTANCE.getSensitiveGroup();

		/**
		 * The meta object literal for the '<em><b>Sensitive Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSITIVE_GROUP__SENSITIVE_VALUE = eINSTANCE.getSensitiveGroup_SensitiveValue();

		/**
		 * The meta object literal for the '{@link fairness.impl.VariableValueImpl <em>Variable Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.impl.VariableValueImpl
		 * @see fairness.impl.FairnessPackageImpl#getVariableValue()
		 * @generated
		 */
		EClass VARIABLE_VALUE = eINSTANCE.getVariableValue();

		/**
		 * The meta object literal for the '<em><b>Relative To Dataset Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_VALUE__RELATIVE_TO_DATASET_SIZE = eINSTANCE.getVariableValue_RelativeToDatasetSize();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_VALUE__OPERATOR = eINSTANCE.getVariableValue_Operator();

		/**
		 * The meta object literal for the '{@link fairness.impl.SensitiveVariableValueImpl <em>Sensitive Variable Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.impl.SensitiveVariableValueImpl
		 * @see fairness.impl.FairnessPackageImpl#getSensitiveVariableValue()
		 * @generated
		 */
		EClass SENSITIVE_VARIABLE_VALUE = eINSTANCE.getSensitiveVariableValue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSITIVE_VARIABLE_VALUE__NAME = eINSTANCE.getSensitiveVariableValue_Name();

		/**
		 * The meta object literal for the '{@link fairness.impl.DatasetSizeImpl <em>Dataset Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.impl.DatasetSizeImpl
		 * @see fairness.impl.FairnessPackageImpl#getDatasetSize()
		 * @generated
		 */
		EClass DATASET_SIZE = eINSTANCE.getDatasetSize();

		/**
		 * The meta object literal for the '{@link fairness.impl.LogaritmImpl <em>Logaritm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.impl.LogaritmImpl
		 * @see fairness.impl.FairnessPackageImpl#getLogaritm()
		 * @generated
		 */
		EClass LOGARITM = eINSTANCE.getLogaritm();

		/**
		 * The meta object literal for the '<em><b>Operatorcomponent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGARITM__OPERATORCOMPONENT = eINSTANCE.getLogaritm_Operatorcomponent();

		/**
		 * The meta object literal for the '{@link fairness.impl.SummationImpl <em>Summation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.impl.SummationImpl
		 * @see fairness.impl.FairnessPackageImpl#getSummation()
		 * @generated
		 */
		EClass SUMMATION = eINSTANCE.getSummation();

		/**
		 * The meta object literal for the '<em><b>Start Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUMMATION__START_RANGE = eINSTANCE.getSummation_StartRange();

		/**
		 * The meta object literal for the '<em><b>End Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUMMATION__END_RANGE = eINSTANCE.getSummation_EndRange();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUMMATION__BODY = eINSTANCE.getSummation_Body();

		/**
		 * The meta object literal for the '{@link fairness.impl.OtherVariableImpl <em>Other Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.impl.OtherVariableImpl
		 * @see fairness.impl.FairnessPackageImpl#getOtherVariable()
		 * @generated
		 */
		EClass OTHER_VARIABLE = eINSTANCE.getOtherVariable();

		/**
		 * The meta object literal for the '<em><b>Othervariablevalue</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OTHER_VARIABLE__OTHERVARIABLEVALUE = eINSTANCE.getOtherVariable_Othervariablevalue();

		/**
		 * The meta object literal for the '{@link fairness.impl.ExistingGroupFairnessMetricImpl <em>Existing Group Fairness Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.impl.ExistingGroupFairnessMetricImpl
		 * @see fairness.impl.FairnessPackageImpl#getExistingGroupFairnessMetric()
		 * @generated
		 */
		EClass EXISTING_GROUP_FAIRNESS_METRIC = eINSTANCE.getExistingGroupFairnessMetric();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXISTING_GROUP_FAIRNESS_METRIC__METRIC = eINSTANCE.getExistingGroupFairnessMetric_Metric();

		/**
		 * The meta object literal for the '{@link fairness.impl.ExistingIndividualFairnessMetricImpl <em>Existing Individual Fairness Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.impl.ExistingIndividualFairnessMetricImpl
		 * @see fairness.impl.FairnessPackageImpl#getExistingIndividualFairnessMetric()
		 * @generated
		 */
		EClass EXISTING_INDIVIDUAL_FAIRNESS_METRIC = eINSTANCE.getExistingIndividualFairnessMetric();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXISTING_INDIVIDUAL_FAIRNESS_METRIC__METRIC = eINSTANCE.getExistingIndividualFairnessMetric_Metric();

		/**
		 * The meta object literal for the '{@link fairness.impl.MetricImpl <em>Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.impl.MetricImpl
		 * @see fairness.impl.FairnessPackageImpl#getMetric()
		 * @generated
		 */
		EClass METRIC = eINSTANCE.getMetric();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC__FUNCTION = eINSTANCE.getMetric_Function();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC__OPERATOR = eINSTANCE.getMetric_Operator();

		/**
		 * The meta object literal for the '<em><b>Tolerance Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__TOLERANCE_VALUE = eINSTANCE.getMetric_ToleranceValue();

		/**
		 * The meta object literal for the '{@link fairness.impl.DatasetImpl <em>Dataset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.impl.DatasetImpl
		 * @see fairness.impl.FairnessPackageImpl#getDataset()
		 * @generated
		 */
		EClass DATASET = eINSTANCE.getDataset();

		/**
		 * The meta object literal for the '<em><b>Other Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATASET__OTHER_VARIABLE = eINSTANCE.getDataset_OtherVariable();

		/**
		 * The meta object literal for the '<em><b>Ground Truth Label Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET__GROUND_TRUTH_LABEL_NAME = eINSTANCE.getDataset_GroundTruthLabelName();

		/**
		 * The meta object literal for the '<em><b>Predicted Label Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET__PREDICTED_LABEL_NAME = eINSTANCE.getDataset_PredictedLabelName();

		/**
		 * The meta object literal for the '<em><b>Positive Outcome</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATASET__POSITIVE_OUTCOME = eINSTANCE.getDataset_PositiveOutcome();

		/**
		 * The meta object literal for the '<em><b>Dataset Sentive Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATASET__DATASET_SENTIVE_VARIABLE = eINSTANCE.getDataset_DatasetSentiveVariable();

		/**
		 * The meta object literal for the '<em><b>File Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET__FILE_PATH = eINSTANCE.getDataset_FilePath();

		/**
		 * The meta object literal for the '{@link fairness.impl.DatasetSensitiveVariableImpl <em>Dataset Sensitive Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.impl.DatasetSensitiveVariableImpl
		 * @see fairness.impl.FairnessPackageImpl#getDatasetSensitiveVariable()
		 * @generated
		 */
		EClass DATASET_SENSITIVE_VARIABLE = eINSTANCE.getDatasetSensitiveVariable();

		/**
		 * The meta object literal for the '<em><b>Mapping Sensitive Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATASET_SENSITIVE_VARIABLE__MAPPING_SENSITIVE_VARIABLE = eINSTANCE.getDatasetSensitiveVariable_MappingSensitiveVariable();

		/**
		 * The meta object literal for the '<em><b>Datasetsensitivevariablevalue</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATASET_SENSITIVE_VARIABLE__DATASETSENSITIVEVARIABLEVALUE = eINSTANCE.getDatasetSensitiveVariable_Datasetsensitivevariablevalue();

		/**
		 * The meta object literal for the '{@link fairness.impl.DatasetPositiveOutcomeImpl <em>Dataset Positive Outcome</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.impl.DatasetPositiveOutcomeImpl
		 * @see fairness.impl.FairnessPackageImpl#getDatasetPositiveOutcome()
		 * @generated
		 */
		EClass DATASET_POSITIVE_OUTCOME = eINSTANCE.getDatasetPositiveOutcome();

		/**
		 * The meta object literal for the '<em><b>Mapping Positive Outcome</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATASET_POSITIVE_OUTCOME__MAPPING_POSITIVE_OUTCOME = eINSTANCE.getDatasetPositiveOutcome_MappingPositiveOutcome();

		/**
		 * The meta object literal for the '{@link fairness.impl.DatasetSensitiveGroupImpl <em>Dataset Sensitive Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.impl.DatasetSensitiveGroupImpl
		 * @see fairness.impl.FairnessPackageImpl#getDatasetSensitiveGroup()
		 * @generated
		 */
		EClass DATASET_SENSITIVE_GROUP = eINSTANCE.getDatasetSensitiveGroup();

		/**
		 * The meta object literal for the '<em><b>Sensitive Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATASET_SENSITIVE_GROUP__SENSITIVE_VARIABLES = eINSTANCE.getDatasetSensitiveGroup_SensitiveVariables();

		/**
		 * The meta object literal for the '<em><b>Mapping Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATASET_SENSITIVE_GROUP__MAPPING_GROUP = eINSTANCE.getDatasetSensitiveGroup_MappingGroup();

		/**
		 * The meta object literal for the '{@link fairness.impl.DatasetSensitiveVariableValueImpl <em>Dataset Sensitive Variable Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.impl.DatasetSensitiveVariableValueImpl
		 * @see fairness.impl.FairnessPackageImpl#getDatasetSensitiveVariableValue()
		 * @generated
		 */
		EClass DATASET_SENSITIVE_VARIABLE_VALUE = eINSTANCE.getDatasetSensitiveVariableValue();

		/**
		 * The meta object literal for the '<em><b>Mapping Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATASET_SENSITIVE_VARIABLE_VALUE__MAPPING_VALUE = eINSTANCE.getDatasetSensitiveVariableValue_MappingValue();

		/**
		 * The meta object literal for the '{@link fairness.LogicalOperator <em>Logical Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.LogicalOperator
		 * @see fairness.impl.FairnessPackageImpl#getLogicalOperator()
		 * @generated
		 */
		EEnum LOGICAL_OPERATOR = eINSTANCE.getLogicalOperator();

		/**
		 * The meta object literal for the '{@link fairness.SingleOperatorParameter <em>Single Operator Parameter</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.SingleOperatorParameter
		 * @see fairness.impl.FairnessPackageImpl#getSingleOperatorParameter()
		 * @generated
		 */
		EEnum SINGLE_OPERATOR_PARAMETER = eINSTANCE.getSingleOperatorParameter();

		/**
		 * The meta object literal for the '{@link fairness.RangeOperatorParameter <em>Range Operator Parameter</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.RangeOperatorParameter
		 * @see fairness.impl.FairnessPackageImpl#getRangeOperatorParameter()
		 * @generated
		 */
		EEnum RANGE_OPERATOR_PARAMETER = eINSTANCE.getRangeOperatorParameter();

		/**
		 * The meta object literal for the '{@link fairness.impl.EqualityOperatorImpl <em>Equality Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.impl.EqualityOperatorImpl
		 * @see fairness.impl.FairnessPackageImpl#getEqualityOperator()
		 * @generated
		 */
		EClass EQUALITY_OPERATOR = eINSTANCE.getEqualityOperator();

		/**
		 * The meta object literal for the '{@link fairness.impl.SingleOperatorImpl <em>Single Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.impl.SingleOperatorImpl
		 * @see fairness.impl.FairnessPackageImpl#getSingleOperator()
		 * @generated
		 */
		EClass SINGLE_OPERATOR = eINSTANCE.getSingleOperator();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_OPERATOR__OPERATOR = eINSTANCE.getSingleOperator_Operator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_OPERATOR__VALUE = eINSTANCE.getSingleOperator_Value();

		/**
		 * The meta object literal for the '{@link fairness.impl.RangeOperatorImpl <em>Range Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.impl.RangeOperatorImpl
		 * @see fairness.impl.FairnessPackageImpl#getRangeOperator()
		 * @generated
		 */
		EClass RANGE_OPERATOR = eINSTANCE.getRangeOperator();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_OPERATOR__OPERATOR = eINSTANCE.getRangeOperator_Operator();

		/**
		 * The meta object literal for the '<em><b>Lower Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_OPERATOR__LOWER_VALUE = eINSTANCE.getRangeOperator_LowerValue();

		/**
		 * The meta object literal for the '<em><b>Greater Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_OPERATOR__GREATER_VALUE = eINSTANCE.getRangeOperator_GreaterValue();

		/**
		 * The meta object literal for the '{@link fairness.LabelValueType <em>Label Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.LabelValueType
		 * @see fairness.impl.FairnessPackageImpl#getLabelValueType()
		 * @generated
		 */
		EEnum LABEL_VALUE_TYPE = eINSTANCE.getLabelValueType();

		/**
		 * The meta object literal for the '{@link fairness.ArithmeticOperator <em>Arithmetic Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.ArithmeticOperator
		 * @see fairness.impl.FairnessPackageImpl#getArithmeticOperator()
		 * @generated
		 */
		EEnum ARITHMETIC_OPERATOR = eINSTANCE.getArithmeticOperator();

		/**
		 * The meta object literal for the '{@link fairness.BiasSource <em>Bias Source</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.BiasSource
		 * @see fairness.impl.FairnessPackageImpl#getBiasSource()
		 * @generated
		 */
		EEnum BIAS_SOURCE = eINSTANCE.getBiasSource();

		/**
		 * The meta object literal for the '{@link fairness.GroupFairnessMetric <em>Group Fairness Metric</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.GroupFairnessMetric
		 * @see fairness.impl.FairnessPackageImpl#getGroupFairnessMetric()
		 * @generated
		 */
		EEnum GROUP_FAIRNESS_METRIC = eINSTANCE.getGroupFairnessMetric();

		/**
		 * The meta object literal for the '{@link fairness.IndividualFairnessMetric <em>Individual Fairness Metric</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fairness.IndividualFairnessMetric
		 * @see fairness.impl.FairnessPackageImpl#getIndividualFairnessMetric()
		 * @generated
		 */
		EEnum INDIVIDUAL_FAIRNESS_METRIC = eINSTANCE.getIndividualFairnessMetric();

	}

} //FairnessPackage
