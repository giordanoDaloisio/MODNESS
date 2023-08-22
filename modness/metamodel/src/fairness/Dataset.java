/**
 */
package fairness;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dataset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fairness.Dataset#getOtherVariable <em>Other Variable</em>}</li>
 *   <li>{@link fairness.Dataset#getGroundTruthLabelName <em>Ground Truth Label Name</em>}</li>
 *   <li>{@link fairness.Dataset#getPredictedLabelName <em>Predicted Label Name</em>}</li>
 *   <li>{@link fairness.Dataset#getPositiveOutcome <em>Positive Outcome</em>}</li>
 *   <li>{@link fairness.Dataset#getDatasetSentiveVariable <em>Dataset Sentive Variable</em>}</li>
 *   <li>{@link fairness.Dataset#getFilePath <em>File Path</em>}</li>
 * </ul>
 *
 * @see fairness.FairnessPackage#getDataset()
 * @model
 * @generated
 */
public interface Dataset extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Other Variable</b></em>' containment reference list.
	 * The list contents are of type {@link fairness.OtherVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Variable</em>' containment reference list.
	 * @see fairness.FairnessPackage#getDataset_OtherVariable()
	 * @model containment="true"
	 * @generated
	 */
	EList<OtherVariable> getOtherVariable();

	/**
	 * Returns the value of the '<em><b>Ground Truth Label Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ground Truth Label Name</em>' attribute.
	 * @see #setGroundTruthLabelName(String)
	 * @see fairness.FairnessPackage#getDataset_GroundTruthLabelName()
	 * @model
	 * @generated
	 */
	String getGroundTruthLabelName();

	/**
	 * Sets the value of the '{@link fairness.Dataset#getGroundTruthLabelName <em>Ground Truth Label Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ground Truth Label Name</em>' attribute.
	 * @see #getGroundTruthLabelName()
	 * @generated
	 */
	void setGroundTruthLabelName(String value);

	/**
	 * Returns the value of the '<em><b>Predicted Label Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicted Label Name</em>' attribute.
	 * @see #setPredictedLabelName(String)
	 * @see fairness.FairnessPackage#getDataset_PredictedLabelName()
	 * @model
	 * @generated
	 */
	String getPredictedLabelName();

	/**
	 * Sets the value of the '{@link fairness.Dataset#getPredictedLabelName <em>Predicted Label Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicted Label Name</em>' attribute.
	 * @see #getPredictedLabelName()
	 * @generated
	 */
	void setPredictedLabelName(String value);

	/**
	 * Returns the value of the '<em><b>Positive Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positive Outcome</em>' containment reference.
	 * @see #setPositiveOutcome(DatasetPositiveOutcome)
	 * @see fairness.FairnessPackage#getDataset_PositiveOutcome()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DatasetPositiveOutcome getPositiveOutcome();

	/**
	 * Sets the value of the '{@link fairness.Dataset#getPositiveOutcome <em>Positive Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positive Outcome</em>' containment reference.
	 * @see #getPositiveOutcome()
	 * @generated
	 */
	void setPositiveOutcome(DatasetPositiveOutcome value);

	/**
	 * Returns the value of the '<em><b>Dataset Sentive Variable</b></em>' containment reference list.
	 * The list contents are of type {@link fairness.DatasetSensitiveVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataset Sentive Variable</em>' containment reference list.
	 * @see fairness.FairnessPackage#getDataset_DatasetSentiveVariable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DatasetSensitiveVariable> getDatasetSentiveVariable();

	/**
	 * Returns the value of the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Path</em>' attribute.
	 * @see #setFilePath(String)
	 * @see fairness.FairnessPackage#getDataset_FilePath()
	 * @model required="true"
	 * @generated
	 */
	String getFilePath();

	/**
	 * Sets the value of the '{@link fairness.Dataset#getFilePath <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Path</em>' attribute.
	 * @see #getFilePath()
	 * @generated
	 */
	void setFilePath(String value);

} // Dataset
