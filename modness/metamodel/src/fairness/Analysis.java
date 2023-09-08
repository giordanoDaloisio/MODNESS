/**
 */
package fairness;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fairness.Analysis#getMetric <em>Metric</em>}</li>
 *   <li>{@link fairness.Analysis#getDataset <em>Dataset</em>}</li>
 *   <li>{@link fairness.Analysis#getScope <em>Scope</em>}</li>
 *   <li>{@link fairness.Analysis#getDatasetUnprivilegedGroup <em>Dataset Unprivileged Group</em>}</li>
 *   <li>{@link fairness.Analysis#getDatasetPrivilegedGroup <em>Dataset Privileged Group</em>}</li>
 * </ul>
 *
 * @see fairness.FairnessPackage#getAnalysis()
 * @model abstract="true"
 * @generated
 */
public interface Analysis extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Metric</b></em>' containment reference list.
	 * The list contents are of type {@link fairness.Metric}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' containment reference list.
	 * @see fairness.FairnessPackage#getAnalysis_Metric()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Metric> getMetric();

	/**
	 * Returns the value of the '<em><b>Dataset</b></em>' containment reference list.
	 * The list contents are of type {@link fairness.Dataset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataset</em>' containment reference list.
	 * @see fairness.FairnessPackage#getAnalysis_Dataset()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Dataset> getDataset();

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see #setScope(String)
	 * @see fairness.FairnessPackage#getAnalysis_Scope()
	 * @model
	 * @generated
	 */
	String getScope();

	/**
	 * Sets the value of the '{@link fairness.Analysis#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(String value);

	/**
	 * Returns the value of the '<em><b>Dataset Unprivileged Group</b></em>' containment reference list.
	 * The list contents are of type {@link fairness.DatasetSensitiveGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataset Unprivileged Group</em>' containment reference list.
	 * @see fairness.FairnessPackage#getAnalysis_DatasetUnprivilegedGroup()
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
	 * @see fairness.FairnessPackage#getAnalysis_DatasetPrivilegedGroup()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DatasetSensitiveGroup> getDatasetPrivilegedGroup();

} // Analysis
