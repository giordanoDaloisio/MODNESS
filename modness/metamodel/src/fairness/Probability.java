/**
 */
package fairness;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Probability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fairness.Probability#getObject <em>Object</em>}</li>
 *   <li>{@link fairness.Probability#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see fairness.FairnessPackage#getProbability()
 * @model
 * @generated
 */
public interface Probability extends Function {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(LogicalCondition)
	 * @see fairness.FairnessPackage#getProbability_Object()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LogicalCondition getObject();

	/**
	 * Sets the value of the '{@link fairness.Probability#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(LogicalCondition value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(LogicalCondition)
	 * @see fairness.FairnessPackage#getProbability_Condition()
	 * @model containment="true"
	 * @generated
	 */
	LogicalCondition getCondition();

	/**
	 * Sets the value of the '{@link fairness.Probability#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(LogicalCondition value);

} // Probability
