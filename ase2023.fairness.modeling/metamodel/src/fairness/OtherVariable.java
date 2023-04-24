/**
 */
package fairness;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Other Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fairness.OtherVariable#getOthervariablevalue <em>Othervariablevalue</em>}</li>
 * </ul>
 *
 * @see fairness.FairnessPackage#getOtherVariable()
 * @model
 * @generated
 */
public interface OtherVariable extends Variable {
	/**
	 * Returns the value of the '<em><b>Othervariablevalue</b></em>' containment reference list.
	 * The list contents are of type {@link fairness.VariableValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Othervariablevalue</em>' containment reference list.
	 * @see fairness.FairnessPackage#getOtherVariable_Othervariablevalue()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableValue> getOthervariablevalue();

} // OtherVariable
