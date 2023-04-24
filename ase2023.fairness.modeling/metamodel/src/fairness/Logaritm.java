/**
 */
package fairness;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logaritm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fairness.Logaritm#getOperatorcomponent <em>Operatorcomponent</em>}</li>
 * </ul>
 *
 * @see fairness.FairnessPackage#getLogaritm()
 * @model
 * @generated
 */
public interface Logaritm extends Function {
	/**
	 * Returns the value of the '<em><b>Operatorcomponent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operatorcomponent</em>' containment reference.
	 * @see #setOperatorcomponent(OperatorComponent)
	 * @see fairness.FairnessPackage#getLogaritm_Operatorcomponent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OperatorComponent getOperatorcomponent();

	/**
	 * Sets the value of the '{@link fairness.Logaritm#getOperatorcomponent <em>Operatorcomponent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operatorcomponent</em>' containment reference.
	 * @see #getOperatorcomponent()
	 * @generated
	 */
	void setOperatorcomponent(OperatorComponent value);

} // Logaritm
