/**
 */
package fairness;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Summation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fairness.Summation#getStartRange <em>Start Range</em>}</li>
 *   <li>{@link fairness.Summation#getEndRange <em>End Range</em>}</li>
 *   <li>{@link fairness.Summation#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see fairness.FairnessPackage#getSummation()
 * @model
 * @generated
 */
public interface Summation extends Function {
	/**
	 * Returns the value of the '<em><b>Start Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Range</em>' containment reference.
	 * @see #setStartRange(OperatorComponent)
	 * @see fairness.FairnessPackage#getSummation_StartRange()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OperatorComponent getStartRange();

	/**
	 * Sets the value of the '{@link fairness.Summation#getStartRange <em>Start Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Range</em>' containment reference.
	 * @see #getStartRange()
	 * @generated
	 */
	void setStartRange(OperatorComponent value);

	/**
	 * Returns the value of the '<em><b>End Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Range</em>' containment reference.
	 * @see #setEndRange(OperatorComponent)
	 * @see fairness.FairnessPackage#getSummation_EndRange()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OperatorComponent getEndRange();

	/**
	 * Sets the value of the '{@link fairness.Summation#getEndRange <em>End Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Range</em>' containment reference.
	 * @see #getEndRange()
	 * @generated
	 */
	void setEndRange(OperatorComponent value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(OperatorComponent)
	 * @see fairness.FairnessPackage#getSummation_Body()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OperatorComponent getBody();

	/**
	 * Sets the value of the '{@link fairness.Summation#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(OperatorComponent value);

} // Summation
