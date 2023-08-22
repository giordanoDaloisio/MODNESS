/**
 */
package fairness;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dataset Positive Outcome</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fairness.DatasetPositiveOutcome#getMappingPositiveOutcome <em>Mapping Positive Outcome</em>}</li>
 * </ul>
 *
 * @see fairness.FairnessPackage#getDatasetPositiveOutcome()
 * @model
 * @generated
 */
public interface DatasetPositiveOutcome extends VariableValue {
	/**
	 * Returns the value of the '<em><b>Mapping Positive Outcome</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Positive Outcome</em>' reference.
	 * @see #setMappingPositiveOutcome(PositiveOutcome)
	 * @see fairness.FairnessPackage#getDatasetPositiveOutcome_MappingPositiveOutcome()
	 * @model required="true"
	 * @generated
	 */
	PositiveOutcome getMappingPositiveOutcome();

	/**
	 * Sets the value of the '{@link fairness.DatasetPositiveOutcome#getMappingPositiveOutcome <em>Mapping Positive Outcome</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Positive Outcome</em>' reference.
	 * @see #getMappingPositiveOutcome()
	 * @generated
	 */
	void setMappingPositiveOutcome(PositiveOutcome value);

} // DatasetPositiveOutcome
