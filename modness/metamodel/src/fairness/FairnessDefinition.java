/**
 */
package fairness;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fairness.FairnessDefinition#getOtherVariables <em>Other Variables</em>}</li>
 *   <li>{@link fairness.FairnessDefinition#getLabel <em>Label</em>}</li>
 *   <li>{@link fairness.FairnessDefinition#getMetric <em>Metric</em>}</li>
 * </ul>
 *
 * @see fairness.FairnessPackage#getFairnessDefinition()
 * @model abstract="true"
 * @generated
 */
public interface FairnessDefinition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Other Variables</b></em>' containment reference list.
	 * The list contents are of type {@link fairness.OtherVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Variables</em>' containment reference list.
	 * @see fairness.FairnessPackage#getFairnessDefinition_OtherVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<OtherVariable> getOtherVariables();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference list.
	 * The list contents are of type {@link fairness.Label}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference list.
	 * @see fairness.FairnessPackage#getFairnessDefinition_Label()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Label> getLabel();

	/**
	 * Returns the value of the '<em><b>Metric</b></em>' containment reference list.
	 * The list contents are of type {@link fairness.Metric}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' containment reference list.
	 * @see fairness.FairnessPackage#getFairnessDefinition_Metric()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Metric> getMetric();

} // FairnessDefinition
