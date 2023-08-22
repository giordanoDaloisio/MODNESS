/**
 */
package fairness;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fairness.Operation#getEqualityOperator <em>Equality Operator</em>}</li>
 *   <li>{@link fairness.Operation#getLeftSide <em>Left Side</em>}</li>
 *   <li>{@link fairness.Operation#getRightSide <em>Right Side</em>}</li>
 * </ul>
 *
 * @see fairness.FairnessPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends Function {
	/**
	 * Returns the value of the '<em><b>Equality Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link fairness.ArithmeticOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equality Operator</em>' attribute.
	 * @see fairness.ArithmeticOperator
	 * @see #setEqualityOperator(ArithmeticOperator)
	 * @see fairness.FairnessPackage#getOperation_EqualityOperator()
	 * @model required="true"
	 * @generated
	 */
	ArithmeticOperator getEqualityOperator();

	/**
	 * Sets the value of the '{@link fairness.Operation#getEqualityOperator <em>Equality Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equality Operator</em>' attribute.
	 * @see fairness.ArithmeticOperator
	 * @see #getEqualityOperator()
	 * @generated
	 */
	void setEqualityOperator(ArithmeticOperator value);

	/**
	 * Returns the value of the '<em><b>Left Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Side</em>' containment reference.
	 * @see #setLeftSide(OperatorComponent)
	 * @see fairness.FairnessPackage#getOperation_LeftSide()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OperatorComponent getLeftSide();

	/**
	 * Sets the value of the '{@link fairness.Operation#getLeftSide <em>Left Side</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Side</em>' containment reference.
	 * @see #getLeftSide()
	 * @generated
	 */
	void setLeftSide(OperatorComponent value);

	/**
	 * Returns the value of the '<em><b>Right Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Side</em>' containment reference.
	 * @see #setRightSide(OperatorComponent)
	 * @see fairness.FairnessPackage#getOperation_RightSide()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OperatorComponent getRightSide();

	/**
	 * Sets the value of the '{@link fairness.Operation#getRightSide <em>Right Side</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Side</em>' containment reference.
	 * @see #getRightSide()
	 * @generated
	 */
	void setRightSide(OperatorComponent value);

} // Operation
