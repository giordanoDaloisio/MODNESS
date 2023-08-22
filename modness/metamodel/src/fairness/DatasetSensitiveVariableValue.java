/**
 */
package fairness;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dataset Sensitive Variable Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fairness.DatasetSensitiveVariableValue#getMappingValue <em>Mapping Value</em>}</li>
 * </ul>
 *
 * @see fairness.FairnessPackage#getDatasetSensitiveVariableValue()
 * @model
 * @generated
 */
public interface DatasetSensitiveVariableValue extends VariableValue {
	/**
	 * Returns the value of the '<em><b>Mapping Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Value</em>' reference.
	 * @see #setMappingValue(SensitiveVariableValue)
	 * @see fairness.FairnessPackage#getDatasetSensitiveVariableValue_MappingValue()
	 * @model required="true"
	 * @generated
	 */
	SensitiveVariableValue getMappingValue();

	/**
	 * Sets the value of the '{@link fairness.DatasetSensitiveVariableValue#getMappingValue <em>Mapping Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Value</em>' reference.
	 * @see #getMappingValue()
	 * @generated
	 */
	void setMappingValue(SensitiveVariableValue value);

} // DatasetSensitiveVariableValue
