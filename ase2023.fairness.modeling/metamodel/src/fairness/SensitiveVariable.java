/**
 */
package fairness;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensitive Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fairness.SensitiveVariable#getSensitiveVariableValue <em>Sensitive Variable Value</em>}</li>
 * </ul>
 *
 * @see fairness.FairnessPackage#getSensitiveVariable()
 * @model
 * @generated
 */
public interface SensitiveVariable extends Variable {
	/**
	 * Returns the value of the '<em><b>Sensitive Variable Value</b></em>' containment reference list.
	 * The list contents are of type {@link fairness.SensitiveVariableValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensitive Variable Value</em>' containment reference list.
	 * @see fairness.FairnessPackage#getSensitiveVariable_SensitiveVariableValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SensitiveVariableValue> getSensitiveVariableValue();

} // SensitiveVariable
