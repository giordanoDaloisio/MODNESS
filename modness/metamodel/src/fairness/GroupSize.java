/**
 */
package fairness;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fairness.GroupSize#getGroupCondition <em>Group Condition</em>}</li>
 *   <li>{@link fairness.GroupSize#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see fairness.FairnessPackage#getGroupSize()
 * @model
 * @generated
 */
public interface GroupSize extends Function {
	/**
	 * Returns the value of the '<em><b>Group Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Condition</em>' containment reference.
	 * @see #setGroupCondition(LogicalCondition)
	 * @see fairness.FairnessPackage#getGroupSize_GroupCondition()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	LogicalCondition getGroupCondition();

	/**
	 * Sets the value of the '{@link fairness.GroupSize#getGroupCondition <em>Group Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Condition</em>' containment reference.
	 * @see #getGroupCondition()
	 * @generated
	 */
	void setGroupCondition(LogicalCondition value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see fairness.FairnessPackage#getGroupSize_Variable()
	 * @model
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link fairness.GroupSize#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

} // GroupSize
