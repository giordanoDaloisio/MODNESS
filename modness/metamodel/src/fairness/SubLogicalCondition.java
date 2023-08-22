/**
 */
package fairness;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Logical Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fairness.SubLogicalCondition#getLogicalOperator <em>Logical Operator</em>}</li>
 *   <li>{@link fairness.SubLogicalCondition#getLogicalcondition <em>Logicalcondition</em>}</li>
 * </ul>
 *
 * @see fairness.FairnessPackage#getSubLogicalCondition()
 * @model
 * @generated
 */
public interface SubLogicalCondition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Logical Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link fairness.LogicalOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Operator</em>' attribute.
	 * @see fairness.LogicalOperator
	 * @see #setLogicalOperator(LogicalOperator)
	 * @see fairness.FairnessPackage#getSubLogicalCondition_LogicalOperator()
	 * @model required="true"
	 * @generated
	 */
	LogicalOperator getLogicalOperator();

	/**
	 * Sets the value of the '{@link fairness.SubLogicalCondition#getLogicalOperator <em>Logical Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Operator</em>' attribute.
	 * @see fairness.LogicalOperator
	 * @see #getLogicalOperator()
	 * @generated
	 */
	void setLogicalOperator(LogicalOperator value);

	/**
	 * Returns the value of the '<em><b>Logicalcondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logicalcondition</em>' containment reference.
	 * @see #setLogicalcondition(LogicalCondition)
	 * @see fairness.FairnessPackage#getSubLogicalCondition_Logicalcondition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LogicalCondition getLogicalcondition();

	/**
	 * Sets the value of the '{@link fairness.SubLogicalCondition#getLogicalcondition <em>Logicalcondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logicalcondition</em>' containment reference.
	 * @see #getLogicalcondition()
	 * @generated
	 */
	void setLogicalcondition(LogicalCondition value);

} // SubLogicalCondition
