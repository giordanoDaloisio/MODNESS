/**
 */
package fairness;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fairness.Metric#getOperator <em>Operator</em>}</li>
 *   <li>{@link fairness.Metric#getFunction <em>Function</em>}</li>
 *   <li>{@link fairness.Metric#getToleranceValue <em>Tolerance Value</em>}</li>
 * </ul>
 *
 * @see fairness.FairnessPackage#getMetric()
 * @model
 * @generated
 */
public interface Metric extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference.
	 * @see #setFunction(Function)
	 * @see fairness.FairnessPackage#getMetric_Function()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Function getFunction();

	/**
	 * Sets the value of the '{@link fairness.Metric#getFunction <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' containment reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(Function value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' containment reference.
	 * @see #setOperator(EqualityOperator)
	 * @see fairness.FairnessPackage#getMetric_Operator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EqualityOperator getOperator();

	/**
	 * Sets the value of the '{@link fairness.Metric#getOperator <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' containment reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(EqualityOperator value);

	/**
	 * Returns the value of the '<em><b>Tolerance Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tolerance Value</em>' attribute.
	 * @see #setToleranceValue(float)
	 * @see fairness.FairnessPackage#getMetric_ToleranceValue()
	 * @model required="true"
	 * @generated
	 */
	float getToleranceValue();

	/**
	 * Sets the value of the '{@link fairness.Metric#getToleranceValue <em>Tolerance Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tolerance Value</em>' attribute.
	 * @see #getToleranceValue()
	 * @generated
	 */
	void setToleranceValue(float value);

} // Metric
