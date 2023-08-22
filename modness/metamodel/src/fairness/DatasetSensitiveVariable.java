/**
 */
package fairness;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dataset Sensitive Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fairness.DatasetSensitiveVariable#getMappingSensitiveVariable <em>Mapping Sensitive Variable</em>}</li>
 *   <li>{@link fairness.DatasetSensitiveVariable#getDatasetsensitivevariablevalue <em>Datasetsensitivevariablevalue</em>}</li>
 * </ul>
 *
 * @see fairness.FairnessPackage#getDatasetSensitiveVariable()
 * @model
 * @generated
 */
public interface DatasetSensitiveVariable extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Mapping Sensitive Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Sensitive Variable</em>' reference.
	 * @see #setMappingSensitiveVariable(SensitiveVariable)
	 * @see fairness.FairnessPackage#getDatasetSensitiveVariable_MappingSensitiveVariable()
	 * @model required="true"
	 * @generated
	 */
	SensitiveVariable getMappingSensitiveVariable();

	/**
	 * Sets the value of the '{@link fairness.DatasetSensitiveVariable#getMappingSensitiveVariable <em>Mapping Sensitive Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Sensitive Variable</em>' reference.
	 * @see #getMappingSensitiveVariable()
	 * @generated
	 */
	void setMappingSensitiveVariable(SensitiveVariable value);

	/**
	 * Returns the value of the '<em><b>Datasetsensitivevariablevalue</b></em>' containment reference list.
	 * The list contents are of type {@link fairness.DatasetSensitiveVariableValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datasetsensitivevariablevalue</em>' containment reference list.
	 * @see fairness.FairnessPackage#getDatasetSensitiveVariable_Datasetsensitivevariablevalue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DatasetSensitiveVariableValue> getDatasetsensitivevariablevalue();

} // DatasetSensitiveVariable
