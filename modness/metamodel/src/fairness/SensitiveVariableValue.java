/**
 */
package fairness;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensitive Variable Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fairness.SensitiveVariableValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fairness.FairnessPackage#getSensitiveVariableValue()
 * @model
 * @generated
 */
public interface SensitiveVariableValue extends EObject {

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see fairness.FairnessPackage#getSensitiveVariableValue_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link fairness.SensitiveVariableValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);
} // SensitiveVariableValue
