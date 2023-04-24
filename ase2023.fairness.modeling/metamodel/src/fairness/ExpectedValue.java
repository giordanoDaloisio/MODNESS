/**
 */
package fairness;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expected Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fairness.ExpectedValue#getCondition <em>Condition</em>}</li>
 *   <li>{@link fairness.ExpectedValue#getColumnName <em>Column Name</em>}</li>
 * </ul>
 *
 * @see fairness.FairnessPackage#getExpectedValue()
 * @model
 * @generated
 */
public interface ExpectedValue extends Function {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(LogicalCondition)
	 * @see fairness.FairnessPackage#getExpectedValue_Condition()
	 * @model containment="true"
	 * @generated
	 */
	LogicalCondition getCondition();

	/**
	 * Sets the value of the '{@link fairness.ExpectedValue#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(LogicalCondition value);

	/**
	 * Returns the value of the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Name</em>' attribute.
	 * @see #setColumnName(String)
	 * @see fairness.FairnessPackage#getExpectedValue_ColumnName()
	 * @model required="true"
	 * @generated
	 */
	String getColumnName();

	/**
	 * Sets the value of the '{@link fairness.ExpectedValue#getColumnName <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Name</em>' attribute.
	 * @see #getColumnName()
	 * @generated
	 */
	void setColumnName(String value);

} // ExpectedValue
