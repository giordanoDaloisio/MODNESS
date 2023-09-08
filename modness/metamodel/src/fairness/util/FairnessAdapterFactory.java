/**
 */
package fairness.util;

import fairness.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fairness.FairnessPackage
 * @generated
 */
public class FairnessAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FairnessPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FairnessAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FairnessPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FairnessSwitch<Adapter> modelSwitch =
		new FairnessSwitch<Adapter>() {
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseOperatorComponent(OperatorComponent object) {
				return createOperatorComponentAdapter();
			}
			@Override
			public Adapter caseAnalysis(Analysis object) {
				return createAnalysisAdapter();
			}
			@Override
			public Adapter caseGroupAnalysis(GroupAnalysis object) {
				return createGroupAnalysisAdapter();
			}
			@Override
			public Adapter caseIndividualAnalysis(IndividualAnalysis object) {
				return createIndividualAnalysisAdapter();
			}
			@Override
			public Adapter caseFunction(Function object) {
				return createFunctionAdapter();
			}
			@Override
			public Adapter caseSensitiveVariable(SensitiveVariable object) {
				return createSensitiveVariableAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseProbability(Probability object) {
				return createProbabilityAdapter();
			}
			@Override
			public Adapter caseExpectedValue(ExpectedValue object) {
				return createExpectedValueAdapter();
			}
			@Override
			public Adapter caseGroupSize(GroupSize object) {
				return createGroupSizeAdapter();
			}
			@Override
			public Adapter caseLogicalCondition(LogicalCondition object) {
				return createLogicalConditionAdapter();
			}
			@Override
			public Adapter caseOperationValue(OperationValue object) {
				return createOperationValueAdapter();
			}
			@Override
			public Adapter caseSubLogicalCondition(SubLogicalCondition object) {
				return createSubLogicalConditionAdapter();
			}
			@Override
			public Adapter caseBias(Bias object) {
				return createBiasAdapter();
			}
			@Override
			public Adapter casePositiveOutcome(PositiveOutcome object) {
				return createPositiveOutcomeAdapter();
			}
			@Override
			public Adapter caseGroupBias(GroupBias object) {
				return createGroupBiasAdapter();
			}
			@Override
			public Adapter caseIndividualBias(IndividualBias object) {
				return createIndividualBiasAdapter();
			}
			@Override
			public Adapter caseSensitiveGroup(SensitiveGroup object) {
				return createSensitiveGroupAdapter();
			}
			@Override
			public Adapter caseVariableValue(VariableValue object) {
				return createVariableValueAdapter();
			}
			@Override
			public Adapter caseSensitiveVariableValue(SensitiveVariableValue object) {
				return createSensitiveVariableValueAdapter();
			}
			@Override
			public Adapter caseDatasetSize(DatasetSize object) {
				return createDatasetSizeAdapter();
			}
			@Override
			public Adapter caseLogaritm(Logaritm object) {
				return createLogaritmAdapter();
			}
			@Override
			public Adapter caseSummation(Summation object) {
				return createSummationAdapter();
			}
			@Override
			public Adapter caseOtherVariable(OtherVariable object) {
				return createOtherVariableAdapter();
			}
			@Override
			public Adapter caseExistingGroupFairnessMetric(ExistingGroupFairnessMetric object) {
				return createExistingGroupFairnessMetricAdapter();
			}
			@Override
			public Adapter caseExistingIndividualFairnessMetric(ExistingIndividualFairnessMetric object) {
				return createExistingIndividualFairnessMetricAdapter();
			}
			@Override
			public Adapter caseMetric(Metric object) {
				return createMetricAdapter();
			}
			@Override
			public Adapter caseDataset(Dataset object) {
				return createDatasetAdapter();
			}
			@Override
			public Adapter caseDatasetSensitiveVariable(DatasetSensitiveVariable object) {
				return createDatasetSensitiveVariableAdapter();
			}
			@Override
			public Adapter caseDatasetPositiveOutcome(DatasetPositiveOutcome object) {
				return createDatasetPositiveOutcomeAdapter();
			}
			@Override
			public Adapter caseDatasetSensitiveGroup(DatasetSensitiveGroup object) {
				return createDatasetSensitiveGroupAdapter();
			}
			@Override
			public Adapter caseDatasetSensitiveVariableValue(DatasetSensitiveVariableValue object) {
				return createDatasetSensitiveVariableValueAdapter();
			}
			@Override
			public Adapter caseEqualityOperator(EqualityOperator object) {
				return createEqualityOperatorAdapter();
			}
			@Override
			public Adapter caseSingleOperator(SingleOperator object) {
				return createSingleOperatorAdapter();
			}
			@Override
			public Adapter caseRangeOperator(RangeOperator object) {
				return createRangeOperatorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link fairness.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fairness.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fairness.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fairness.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fairness.OperatorComponent <em>Operator Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fairness.OperatorComponent
	 * @generated
	 */
	public Adapter createOperatorComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fairness.Analysis <em>Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fairness.Analysis
	 * @generated
	 */
	public Adapter createAnalysisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fairness.GroupAnalysis <em>Group Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fairness.GroupAnalysis
	 * @generated
	 */
	public Adapter createGroupAnalysisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fairness.IndividualAnalysis <em>Individual Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fairness.IndividualAnalysis
	 * @generated
	 */
	public Adapter createIndividualAnalysisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fairness.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fairness.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fairness.SensitiveVariable <em>Sensitive Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fairness.SensitiveVariable
	 * @generated
	 */
	public Adapter createSensitiveVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fairness.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fairness.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fairness.Probability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fairness.Probability
	 * @generated
	 */
	public Adapter createProbabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fairness.ExpectedValue <em>Expected Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fairness.ExpectedValue
	 * @generated
	 */
	public Adapter createExpectedValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fairness.GroupSize <em>Group Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fairness.GroupSize
	 * @generated
	 */
	public Adapter createGroupSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fairness.LogicalCondition <em>Logical Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fairness.LogicalCondition
	 * @generated
	 */
	public Adapter createLogicalConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fairness.OperationValue <em>Operation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fairness.OperationValue
	 * @generated
	 */
	public Adapter createOperationValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fairness.SubLogicalCondition <em>Sub Logical Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fairness.SubLogicalCondition
	 * @generated
	 */
	public Adapter createSubLogicalConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fairness.Bias <em>Bias</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fairness.Bias
	 * @generated
	 */
	public Adapter createBiasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fairness.PositiveOutcome <em>Positive Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fairness.PositiveOutcome
	 * @generated
	 */
	public Adapter createPositiveOutcomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fairness.GroupBias <em>Group Bias</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fairness.GroupBias
	 * @generated
	 */
	public Adapter createGroupBiasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fairness.IndividualBias <em>Individual Bias</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fairness.IndividualBias
	 * @generated
	 */
	public Adapter createIndividualBiasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fairness.SensitiveGroup <em>Sensitive Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fairness.SensitiveGroup
	 * @generated
	 */
	public Adapter createSensitiveGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fairness.VariableValue <em>Variable Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fairness.VariableValue
	 * @generated
	 */
	public Adapter createVariableValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fairness.SensitiveVariableValue <em>Sensitive Variable Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fairness.SensitiveVariableValue
	 * @generated
	 */
	public Adapter createSensitiveVariableValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fairness.DatasetSize <em>Dataset Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fairness.DatasetSize
	 * @generated
	 */
	public Adapter createDatasetSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fairness.Logaritm <em>Logaritm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fairness.Logaritm
	 * @generated
	 */
	public Adapter createLogaritmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fairness.Summation <em>Summation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fairness.Summation
	 * @generated
	 */
	public Adapter createSummationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fairness.OtherVariable <em>Other Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fairness.OtherVariable
	 * @generated
	 */
	public Adapter createOtherVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fairness.ExistingGroupFairnessMetric <em>Existing Group Fairness Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fairness.ExistingGroupFairnessMetric
	 * @generated
	 */
	public Adapter createExistingGroupFairnessMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fairness.ExistingIndividualFairnessMetric <em>Existing Individual Fairness Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fairness.ExistingIndividualFairnessMetric
	 * @generated
	 */
	public Adapter createExistingIndividualFairnessMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fairness.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fairness.Metric
	 * @generated
	 */
	public Adapter createMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fairness.Dataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fairness.Dataset
	 * @generated
	 */
	public Adapter createDatasetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fairness.DatasetSensitiveVariable <em>Dataset Sensitive Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fairness.DatasetSensitiveVariable
	 * @generated
	 */
	public Adapter createDatasetSensitiveVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fairness.DatasetPositiveOutcome <em>Dataset Positive Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fairness.DatasetPositiveOutcome
	 * @generated
	 */
	public Adapter createDatasetPositiveOutcomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fairness.DatasetSensitiveGroup <em>Dataset Sensitive Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fairness.DatasetSensitiveGroup
	 * @generated
	 */
	public Adapter createDatasetSensitiveGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fairness.DatasetSensitiveVariableValue <em>Dataset Sensitive Variable Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fairness.DatasetSensitiveVariableValue
	 * @generated
	 */
	public Adapter createDatasetSensitiveVariableValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fairness.EqualityOperator <em>Equality Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fairness.EqualityOperator
	 * @generated
	 */
	public Adapter createEqualityOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fairness.SingleOperator <em>Single Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fairness.SingleOperator
	 * @generated
	 */
	public Adapter createSingleOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fairness.RangeOperator <em>Range Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fairness.RangeOperator
	 * @generated
	 */
	public Adapter createRangeOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FairnessAdapterFactory
