/**
 */
package fairness.util;

import fairness.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fairness.FairnessPackage
 * @generated
 */
public class FairnessSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FairnessPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FairnessSwitch() {
		if (modelPackage == null) {
			modelPackage = FairnessPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FairnessPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FairnessPackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = caseFunction(operation);
				if (result == null) result = caseNamedElement(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FairnessPackage.OPERATOR_COMPONENT: {
				OperatorComponent operatorComponent = (OperatorComponent)theEObject;
				T result = caseOperatorComponent(operatorComponent);
				if (result == null) result = caseNamedElement(operatorComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FairnessPackage.ANALYSIS: {
				Analysis analysis = (Analysis)theEObject;
				T result = caseAnalysis(analysis);
				if (result == null) result = caseNamedElement(analysis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FairnessPackage.GROUP_ANALYSIS: {
				GroupAnalysis groupAnalysis = (GroupAnalysis)theEObject;
				T result = caseGroupAnalysis(groupAnalysis);
				if (result == null) result = caseAnalysis(groupAnalysis);
				if (result == null) result = caseNamedElement(groupAnalysis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FairnessPackage.INDIVIDUAL_ANALYSIS: {
				IndividualAnalysis individualAnalysis = (IndividualAnalysis)theEObject;
				T result = caseIndividualAnalysis(individualAnalysis);
				if (result == null) result = caseAnalysis(individualAnalysis);
				if (result == null) result = caseNamedElement(individualAnalysis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FairnessPackage.FUNCTION: {
				Function function = (Function)theEObject;
				T result = caseFunction(function);
				if (result == null) result = caseNamedElement(function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FairnessPackage.SENSITIVE_VARIABLE: {
				SensitiveVariable sensitiveVariable = (SensitiveVariable)theEObject;
				T result = caseSensitiveVariable(sensitiveVariable);
				if (result == null) result = caseVariable(sensitiveVariable);
				if (result == null) result = caseNamedElement(sensitiveVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FairnessPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseNamedElement(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FairnessPackage.PROBABILITY: {
				Probability probability = (Probability)theEObject;
				T result = caseProbability(probability);
				if (result == null) result = caseFunction(probability);
				if (result == null) result = caseNamedElement(probability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FairnessPackage.EXPECTED_VALUE: {
				ExpectedValue expectedValue = (ExpectedValue)theEObject;
				T result = caseExpectedValue(expectedValue);
				if (result == null) result = caseFunction(expectedValue);
				if (result == null) result = caseNamedElement(expectedValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FairnessPackage.GROUP_SIZE: {
				GroupSize groupSize = (GroupSize)theEObject;
				T result = caseGroupSize(groupSize);
				if (result == null) result = caseFunction(groupSize);
				if (result == null) result = caseNamedElement(groupSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FairnessPackage.LOGICAL_CONDITION: {
				LogicalCondition logicalCondition = (LogicalCondition)theEObject;
				T result = caseLogicalCondition(logicalCondition);
				if (result == null) result = caseNamedElement(logicalCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FairnessPackage.OPERATION_VALUE: {
				OperationValue operationValue = (OperationValue)theEObject;
				T result = caseOperationValue(operationValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FairnessPackage.SUB_LOGICAL_CONDITION: {
				SubLogicalCondition subLogicalCondition = (SubLogicalCondition)theEObject;
				T result = caseSubLogicalCondition(subLogicalCondition);
				if (result == null) result = caseNamedElement(subLogicalCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FairnessPackage.BIAS: {
				Bias bias = (Bias)theEObject;
				T result = caseBias(bias);
				if (result == null) result = caseNamedElement(bias);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FairnessPackage.POSITIVE_OUTCOME: {
				PositiveOutcome positiveOutcome = (PositiveOutcome)theEObject;
				T result = casePositiveOutcome(positiveOutcome);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FairnessPackage.GROUP_BIAS: {
				GroupBias groupBias = (GroupBias)theEObject;
				T result = caseGroupBias(groupBias);
				if (result == null) result = caseBias(groupBias);
				if (result == null) result = caseNamedElement(groupBias);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FairnessPackage.INDIVIDUAL_BIAS: {
				IndividualBias individualBias = (IndividualBias)theEObject;
				T result = caseIndividualBias(individualBias);
				if (result == null) result = caseBias(individualBias);
				if (result == null) result = caseNamedElement(individualBias);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FairnessPackage.SENSITIVE_GROUP: {
				SensitiveGroup sensitiveGroup = (SensitiveGroup)theEObject;
				T result = caseSensitiveGroup(sensitiveGroup);
				if (result == null) result = caseNamedElement(sensitiveGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FairnessPackage.VARIABLE_VALUE: {
				VariableValue variableValue = (VariableValue)theEObject;
				T result = caseVariableValue(variableValue);
				if (result == null) result = caseNamedElement(variableValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FairnessPackage.SENSITIVE_VARIABLE_VALUE: {
				SensitiveVariableValue sensitiveVariableValue = (SensitiveVariableValue)theEObject;
				T result = caseSensitiveVariableValue(sensitiveVariableValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FairnessPackage.DATASET_SIZE: {
				DatasetSize datasetSize = (DatasetSize)theEObject;
				T result = caseDatasetSize(datasetSize);
				if (result == null) result = caseFunction(datasetSize);
				if (result == null) result = caseNamedElement(datasetSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FairnessPackage.LOGARITM: {
				Logaritm logaritm = (Logaritm)theEObject;
				T result = caseLogaritm(logaritm);
				if (result == null) result = caseFunction(logaritm);
				if (result == null) result = caseNamedElement(logaritm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FairnessPackage.SUMMATION: {
				Summation summation = (Summation)theEObject;
				T result = caseSummation(summation);
				if (result == null) result = caseFunction(summation);
				if (result == null) result = caseNamedElement(summation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FairnessPackage.OTHER_VARIABLE: {
				OtherVariable otherVariable = (OtherVariable)theEObject;
				T result = caseOtherVariable(otherVariable);
				if (result == null) result = caseVariable(otherVariable);
				if (result == null) result = caseNamedElement(otherVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FairnessPackage.EXISTING_GROUP_FAIRNESS_METRIC: {
				ExistingGroupFairnessMetric existingGroupFairnessMetric = (ExistingGroupFairnessMetric)theEObject;
				T result = caseExistingGroupFairnessMetric(existingGroupFairnessMetric);
				if (result == null) result = caseFunction(existingGroupFairnessMetric);
				if (result == null) result = caseNamedElement(existingGroupFairnessMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FairnessPackage.EXISTING_INDIVIDUAL_FAIRNESS_METRIC: {
				ExistingIndividualFairnessMetric existingIndividualFairnessMetric = (ExistingIndividualFairnessMetric)theEObject;
				T result = caseExistingIndividualFairnessMetric(existingIndividualFairnessMetric);
				if (result == null) result = caseFunction(existingIndividualFairnessMetric);
				if (result == null) result = caseNamedElement(existingIndividualFairnessMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FairnessPackage.METRIC: {
				Metric metric = (Metric)theEObject;
				T result = caseMetric(metric);
				if (result == null) result = caseNamedElement(metric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FairnessPackage.DATASET: {
				Dataset dataset = (Dataset)theEObject;
				T result = caseDataset(dataset);
				if (result == null) result = caseNamedElement(dataset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FairnessPackage.DATASET_SENSITIVE_VARIABLE: {
				DatasetSensitiveVariable datasetSensitiveVariable = (DatasetSensitiveVariable)theEObject;
				T result = caseDatasetSensitiveVariable(datasetSensitiveVariable);
				if (result == null) result = caseNamedElement(datasetSensitiveVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FairnessPackage.DATASET_POSITIVE_OUTCOME: {
				DatasetPositiveOutcome datasetPositiveOutcome = (DatasetPositiveOutcome)theEObject;
				T result = caseDatasetPositiveOutcome(datasetPositiveOutcome);
				if (result == null) result = caseVariableValue(datasetPositiveOutcome);
				if (result == null) result = caseNamedElement(datasetPositiveOutcome);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FairnessPackage.DATASET_SENSITIVE_GROUP: {
				DatasetSensitiveGroup datasetSensitiveGroup = (DatasetSensitiveGroup)theEObject;
				T result = caseDatasetSensitiveGroup(datasetSensitiveGroup);
				if (result == null) result = caseNamedElement(datasetSensitiveGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FairnessPackage.DATASET_SENSITIVE_VARIABLE_VALUE: {
				DatasetSensitiveVariableValue datasetSensitiveVariableValue = (DatasetSensitiveVariableValue)theEObject;
				T result = caseDatasetSensitiveVariableValue(datasetSensitiveVariableValue);
				if (result == null) result = caseVariableValue(datasetSensitiveVariableValue);
				if (result == null) result = caseNamedElement(datasetSensitiveVariableValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FairnessPackage.EQUALITY_OPERATOR: {
				EqualityOperator equalityOperator = (EqualityOperator)theEObject;
				T result = caseEqualityOperator(equalityOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FairnessPackage.SINGLE_OPERATOR: {
				SingleOperator singleOperator = (SingleOperator)theEObject;
				T result = caseSingleOperator(singleOperator);
				if (result == null) result = caseEqualityOperator(singleOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FairnessPackage.RANGE_OPERATOR: {
				RangeOperator rangeOperator = (RangeOperator)theEObject;
				T result = caseRangeOperator(rangeOperator);
				if (result == null) result = caseEqualityOperator(rangeOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperatorComponent(OperatorComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analysis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalysis(Analysis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Analysis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupAnalysis(GroupAnalysis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Individual Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Individual Analysis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndividualAnalysis(IndividualAnalysis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensitive Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensitive Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensitiveVariable(SensitiveVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Probability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Probability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProbability(Probability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expected Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expected Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpectedValue(ExpectedValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupSize(GroupSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalCondition(LogicalCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationValue(OperationValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Logical Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Logical Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubLogicalCondition(SubLogicalCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bias</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bias</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBias(Bias object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positive Outcome</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positive Outcome</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositiveOutcome(PositiveOutcome object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Bias</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Bias</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupBias(GroupBias object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Individual Bias</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Individual Bias</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndividualBias(IndividualBias object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensitive Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensitive Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensitiveGroup(SensitiveGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableValue(VariableValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensitive Variable Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensitive Variable Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensitiveVariableValue(SensitiveVariableValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dataset Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dataset Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatasetSize(DatasetSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logaritm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logaritm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogaritm(Logaritm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Summation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Summation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSummation(Summation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Other Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Other Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOtherVariable(OtherVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Existing Group Fairness Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Existing Group Fairness Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExistingGroupFairnessMetric(ExistingGroupFairnessMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Existing Individual Fairness Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Existing Individual Fairness Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExistingIndividualFairnessMetric(ExistingIndividualFairnessMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetric(Metric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dataset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dataset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataset(Dataset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dataset Sensitive Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dataset Sensitive Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatasetSensitiveVariable(DatasetSensitiveVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dataset Positive Outcome</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dataset Positive Outcome</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatasetPositiveOutcome(DatasetPositiveOutcome object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dataset Sensitive Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dataset Sensitive Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatasetSensitiveGroup(DatasetSensitiveGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dataset Sensitive Variable Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dataset Sensitive Variable Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatasetSensitiveVariableValue(DatasetSensitiveVariableValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equality Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equality Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqualityOperator(EqualityOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleOperator(SingleOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeOperator(RangeOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FairnessSwitch
