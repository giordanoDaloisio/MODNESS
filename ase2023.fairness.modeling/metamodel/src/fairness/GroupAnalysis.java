/**
 */
package fairness;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Analysis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fairness.GroupAnalysis#getDatasetUnprivilegedGroup <em>Dataset Unprivileged Group</em>}</li>
 *   <li>{@link fairness.GroupAnalysis#getDatasetPrivilegedGroup <em>Dataset Privileged Group</em>}</li>
 * </ul>
 *
 * @see fairness.FairnessPackage#getGroupAnalysis()
 * @model
 * @generated
 */
public interface GroupAnalysis extends Analysis {
	/**
	 * Returns the value of the '<em><b>Dataset Unprivileged Group</b></em>' containment reference list.
	 * The list contents are of type {@link fairness.DatasetSensitiveGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataset Unprivileged Group</em>' containment reference list.
	 * @see fairness.FairnessPackage#getGroupAnalysis_DatasetUnprivilegedGroup()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DatasetSensitiveGroup> getDatasetUnprivilegedGroup();

	/**
	 * Returns the value of the '<em><b>Dataset Privileged Group</b></em>' containment reference list.
	 * The list contents are of type {@link fairness.DatasetSensitiveGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataset Privileged Group</em>' containment reference list.
	 * @see fairness.FairnessPackage#getGroupAnalysis_DatasetPrivilegedGroup()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DatasetSensitiveGroup> getDatasetPrivilegedGroup();

} // GroupAnalysis
