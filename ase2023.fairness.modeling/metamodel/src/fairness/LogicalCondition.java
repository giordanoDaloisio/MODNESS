/**
 */
package fairness;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fairness.LogicalCondition#getSublogicalcondition <em>Sublogicalcondition</em>}</li>
 *   <li>{@link fairness.LogicalCondition#getValue <em>Value</em>}</li>
 *   <li>{@link fairness.LogicalCondition#getSensitivegroup <em>Sensitivegroup</em>}</li>
 * </ul>
 *
 * @see fairness.FairnessPackage#getLogicalCondition()
 * @model
 * @generated
 */
public interface LogicalCondition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sublogicalcondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sublogicalcondition</em>' containment reference.
	 * @see #setSublogicalcondition(SubLogicalCondition)
	 * @see fairness.FairnessPackage#getLogicalCondition_Sublogicalcondition()
	 * @model containment="true"
	 * @generated
	 */
	SubLogicalCondition getSublogicalcondition();

	/**
	 * Sets the value of the '{@link fairness.LogicalCondition#getSublogicalcondition <em>Sublogicalcondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sublogicalcondition</em>' containment reference.
	 * @see #getSublogicalcondition()
	 * @generated
	 */
	void setSublogicalcondition(SubLogicalCondition value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(VariableValue)
	 * @see fairness.FairnessPackage#getLogicalCondition_Value()
	 * @model
	 * @generated
	 */
	VariableValue getValue();

	/**
	 * Sets the value of the '{@link fairness.LogicalCondition#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(VariableValue value);

	/**
	 * Returns the value of the '<em><b>Sensitivegroup</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensitivegroup</em>' reference.
	 * @see #setSensitivegroup(DatasetSensitiveGroup)
	 * @see fairness.FairnessPackage#getLogicalCondition_Sensitivegroup()
	 * @model
	 * @generated
	 */
	DatasetSensitiveGroup getSensitivegroup();

	/**
	 * Sets the value of the '{@link fairness.LogicalCondition#getSensitivegroup <em>Sensitivegroup</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensitivegroup</em>' reference.
	 * @see #getSensitivegroup()
	 * @generated
	 */
	void setSensitivegroup(DatasetSensitiveGroup value);

} // LogicalCondition
