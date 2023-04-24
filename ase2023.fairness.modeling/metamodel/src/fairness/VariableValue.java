/**
 */
package fairness;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fairness.VariableValue#isRelativeToDatasetSize <em>Relative To Dataset Size</em>}</li>
 *   <li>{@link fairness.VariableValue#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see fairness.FairnessPackage#getVariableValue()
 * @model
 * @generated
 */
public interface VariableValue extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Relative To Dataset Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative To Dataset Size</em>' attribute.
	 * @see #setRelativeToDatasetSize(boolean)
	 * @see fairness.FairnessPackage#getVariableValue_RelativeToDatasetSize()
	 * @model
	 * @generated
	 */
	boolean isRelativeToDatasetSize();

	/**
	 * Sets the value of the '{@link fairness.VariableValue#isRelativeToDatasetSize <em>Relative To Dataset Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative To Dataset Size</em>' attribute.
	 * @see #isRelativeToDatasetSize()
	 * @generated
	 */
	void setRelativeToDatasetSize(boolean value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' containment reference.
	 * @see #setOperator(EqualityOperator)
	 * @see fairness.FairnessPackage#getVariableValue_Operator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EqualityOperator getOperator();

	/**
	 * Sets the value of the '{@link fairness.VariableValue#getOperator <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' containment reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(EqualityOperator value);

} // VariableValue
