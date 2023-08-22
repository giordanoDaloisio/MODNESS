/**
 */
package fairness;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fairness.SingleOperator#getOperator <em>Operator</em>}</li>
 *   <li>{@link fairness.SingleOperator#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fairness.FairnessPackage#getSingleOperator()
 * @model
 * @generated
 */
public interface SingleOperator extends EqualityOperator {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link fairness.SingleOperatorParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see fairness.SingleOperatorParameter
	 * @see #setOperator(SingleOperatorParameter)
	 * @see fairness.FairnessPackage#getSingleOperator_Operator()
	 * @model required="true"
	 * @generated
	 */
	SingleOperatorParameter getOperator();

	/**
	 * Sets the value of the '{@link fairness.SingleOperator#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see fairness.SingleOperatorParameter
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(SingleOperatorParameter value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see fairness.FairnessPackage#getSingleOperator_Value()
	 * @model required="true"
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link fairness.SingleOperator#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

} // SingleOperator
