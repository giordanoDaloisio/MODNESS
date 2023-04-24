/**
 */
package fairness;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dataset Sensitive Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fairness.DatasetSensitiveGroup#getSensitiveVariables <em>Sensitive Variables</em>}</li>
 *   <li>{@link fairness.DatasetSensitiveGroup#getMappingGroup <em>Mapping Group</em>}</li>
 * </ul>
 *
 * @see fairness.FairnessPackage#getDatasetSensitiveGroup()
 * @model
 * @generated
 */
public interface DatasetSensitiveGroup extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sensitive Variables</b></em>' reference list.
	 * The list contents are of type {@link fairness.DatasetSensitiveVariableValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensitive Variables</em>' reference list.
	 * @see fairness.FairnessPackage#getDatasetSensitiveGroup_SensitiveVariables()
	 * @model required="true"
	 * @generated
	 */
	EList<DatasetSensitiveVariableValue> getSensitiveVariables();

	/**
	 * Returns the value of the '<em><b>Mapping Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Group</em>' reference.
	 * @see #setMappingGroup(SensitiveGroup)
	 * @see fairness.FairnessPackage#getDatasetSensitiveGroup_MappingGroup()
	 * @model required="true"
	 * @generated
	 */
	SensitiveGroup getMappingGroup();

	/**
	 * Sets the value of the '{@link fairness.DatasetSensitiveGroup#getMappingGroup <em>Mapping Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Group</em>' reference.
	 * @see #getMappingGroup()
	 * @generated
	 */
	void setMappingGroup(SensitiveGroup value);

} // DatasetSensitiveGroup
