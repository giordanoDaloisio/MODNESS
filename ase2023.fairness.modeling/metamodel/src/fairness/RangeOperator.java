/**
 */
package fairness;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fairness.RangeOperator#getOperator <em>Operator</em>}</li>
 *   <li>{@link fairness.RangeOperator#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link fairness.RangeOperator#getGreaterValue <em>Greater Value</em>}</li>
 * </ul>
 *
 * @see fairness.FairnessPackage#getRangeOperator()
 * @model
 * @generated
 */
public interface RangeOperator extends EqualityOperator {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link fairness.RangeOperatorParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see fairness.RangeOperatorParameter
	 * @see #setOperator(RangeOperatorParameter)
	 * @see fairness.FairnessPackage#getRangeOperator_Operator()
	 * @model required="true"
	 * @generated
	 */
	RangeOperatorParameter getOperator();

	/**
	 * Sets the value of the '{@link fairness.RangeOperator#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see fairness.RangeOperatorParameter
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(RangeOperatorParameter value);

	/**
	 * Returns the value of the '<em><b>Lower Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Value</em>' attribute.
	 * @see #setLowerValue(float)
	 * @see fairness.FairnessPackage#getRangeOperator_LowerValue()
	 * @model required="true"
	 * @generated
	 */
	float getLowerValue();

	/**
	 * Sets the value of the '{@link fairness.RangeOperator#getLowerValue <em>Lower Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Value</em>' attribute.
	 * @see #getLowerValue()
	 * @generated
	 */
	void setLowerValue(float value);

	/**
	 * Returns the value of the '<em><b>Greater Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Greater Value</em>' attribute.
	 * @see #setGreaterValue(float)
	 * @see fairness.FairnessPackage#getRangeOperator_GreaterValue()
	 * @model required="true"
	 * @generated
	 */
	float getGreaterValue();

	/**
	 * Sets the value of the '{@link fairness.RangeOperator#getGreaterValue <em>Greater Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Greater Value</em>' attribute.
	 * @see #getGreaterValue()
	 * @generated
	 */
	void setGreaterValue(float value);

} // RangeOperator
