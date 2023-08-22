/**
 */
package fairness.impl;

import fairness.Dataset;
import fairness.DatasetPositiveOutcome;
import fairness.DatasetSensitiveVariable;
import fairness.FairnessPackage;
import fairness.OtherVariable;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dataset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fairness.impl.DatasetImpl#getOtherVariable <em>Other Variable</em>}</li>
 *   <li>{@link fairness.impl.DatasetImpl#getGroundTruthLabelName <em>Ground Truth Label Name</em>}</li>
 *   <li>{@link fairness.impl.DatasetImpl#getPredictedLabelName <em>Predicted Label Name</em>}</li>
 *   <li>{@link fairness.impl.DatasetImpl#getPositiveOutcome <em>Positive Outcome</em>}</li>
 *   <li>{@link fairness.impl.DatasetImpl#getDatasetSentiveVariable <em>Dataset Sentive Variable</em>}</li>
 *   <li>{@link fairness.impl.DatasetImpl#getFilePath <em>File Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatasetImpl extends NamedElementImpl implements Dataset {
	/**
	 * The cached value of the '{@link #getOtherVariable() <em>Other Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<OtherVariable> otherVariable;

	/**
	 * The default value of the '{@link #getGroundTruthLabelName() <em>Ground Truth Label Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroundTruthLabelName()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUND_TRUTH_LABEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroundTruthLabelName() <em>Ground Truth Label Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroundTruthLabelName()
	 * @generated
	 * @ordered
	 */
	protected String groundTruthLabelName = GROUND_TRUTH_LABEL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPredictedLabelName() <em>Predicted Label Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredictedLabelName()
	 * @generated
	 * @ordered
	 */
	protected static final String PREDICTED_LABEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPredictedLabelName() <em>Predicted Label Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredictedLabelName()
	 * @generated
	 * @ordered
	 */
	protected String predictedLabelName = PREDICTED_LABEL_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPositiveOutcome() <em>Positive Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositiveOutcome()
	 * @generated
	 * @ordered
	 */
	protected DatasetPositiveOutcome positiveOutcome;

	/**
	 * The cached value of the '{@link #getDatasetSentiveVariable() <em>Dataset Sentive Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasetSentiveVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<DatasetSensitiveVariable> datasetSentiveVariable;

	/**
	 * The default value of the '{@link #getFilePath() <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilePath()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilePath() <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilePath()
	 * @generated
	 * @ordered
	 */
	protected String filePath = FILE_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatasetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FairnessPackage.Literals.DATASET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OtherVariable> getOtherVariable() {
		if (otherVariable == null) {
			otherVariable = new EObjectContainmentEList<OtherVariable>(OtherVariable.class, this, FairnessPackage.DATASET__OTHER_VARIABLE);
		}
		return otherVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroundTruthLabelName() {
		return groundTruthLabelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroundTruthLabelName(String newGroundTruthLabelName) {
		String oldGroundTruthLabelName = groundTruthLabelName;
		groundTruthLabelName = newGroundTruthLabelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FairnessPackage.DATASET__GROUND_TRUTH_LABEL_NAME, oldGroundTruthLabelName, groundTruthLabelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPredictedLabelName() {
		return predictedLabelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredictedLabelName(String newPredictedLabelName) {
		String oldPredictedLabelName = predictedLabelName;
		predictedLabelName = newPredictedLabelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FairnessPackage.DATASET__PREDICTED_LABEL_NAME, oldPredictedLabelName, predictedLabelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetPositiveOutcome getPositiveOutcome() {
		return positiveOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositiveOutcome(DatasetPositiveOutcome newPositiveOutcome, NotificationChain msgs) {
		DatasetPositiveOutcome oldPositiveOutcome = positiveOutcome;
		positiveOutcome = newPositiveOutcome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FairnessPackage.DATASET__POSITIVE_OUTCOME, oldPositiveOutcome, newPositiveOutcome);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositiveOutcome(DatasetPositiveOutcome newPositiveOutcome) {
		if (newPositiveOutcome != positiveOutcome) {
			NotificationChain msgs = null;
			if (positiveOutcome != null)
				msgs = ((InternalEObject)positiveOutcome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FairnessPackage.DATASET__POSITIVE_OUTCOME, null, msgs);
			if (newPositiveOutcome != null)
				msgs = ((InternalEObject)newPositiveOutcome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FairnessPackage.DATASET__POSITIVE_OUTCOME, null, msgs);
			msgs = basicSetPositiveOutcome(newPositiveOutcome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FairnessPackage.DATASET__POSITIVE_OUTCOME, newPositiveOutcome, newPositiveOutcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatasetSensitiveVariable> getDatasetSentiveVariable() {
		if (datasetSentiveVariable == null) {
			datasetSentiveVariable = new EObjectContainmentEList<DatasetSensitiveVariable>(DatasetSensitiveVariable.class, this, FairnessPackage.DATASET__DATASET_SENTIVE_VARIABLE);
		}
		return datasetSentiveVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilePath(String newFilePath) {
		String oldFilePath = filePath;
		filePath = newFilePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FairnessPackage.DATASET__FILE_PATH, oldFilePath, filePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FairnessPackage.DATASET__OTHER_VARIABLE:
				return ((InternalEList<?>)getOtherVariable()).basicRemove(otherEnd, msgs);
			case FairnessPackage.DATASET__POSITIVE_OUTCOME:
				return basicSetPositiveOutcome(null, msgs);
			case FairnessPackage.DATASET__DATASET_SENTIVE_VARIABLE:
				return ((InternalEList<?>)getDatasetSentiveVariable()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FairnessPackage.DATASET__OTHER_VARIABLE:
				return getOtherVariable();
			case FairnessPackage.DATASET__GROUND_TRUTH_LABEL_NAME:
				return getGroundTruthLabelName();
			case FairnessPackage.DATASET__PREDICTED_LABEL_NAME:
				return getPredictedLabelName();
			case FairnessPackage.DATASET__POSITIVE_OUTCOME:
				return getPositiveOutcome();
			case FairnessPackage.DATASET__DATASET_SENTIVE_VARIABLE:
				return getDatasetSentiveVariable();
			case FairnessPackage.DATASET__FILE_PATH:
				return getFilePath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FairnessPackage.DATASET__OTHER_VARIABLE:
				getOtherVariable().clear();
				getOtherVariable().addAll((Collection<? extends OtherVariable>)newValue);
				return;
			case FairnessPackage.DATASET__GROUND_TRUTH_LABEL_NAME:
				setGroundTruthLabelName((String)newValue);
				return;
			case FairnessPackage.DATASET__PREDICTED_LABEL_NAME:
				setPredictedLabelName((String)newValue);
				return;
			case FairnessPackage.DATASET__POSITIVE_OUTCOME:
				setPositiveOutcome((DatasetPositiveOutcome)newValue);
				return;
			case FairnessPackage.DATASET__DATASET_SENTIVE_VARIABLE:
				getDatasetSentiveVariable().clear();
				getDatasetSentiveVariable().addAll((Collection<? extends DatasetSensitiveVariable>)newValue);
				return;
			case FairnessPackage.DATASET__FILE_PATH:
				setFilePath((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FairnessPackage.DATASET__OTHER_VARIABLE:
				getOtherVariable().clear();
				return;
			case FairnessPackage.DATASET__GROUND_TRUTH_LABEL_NAME:
				setGroundTruthLabelName(GROUND_TRUTH_LABEL_NAME_EDEFAULT);
				return;
			case FairnessPackage.DATASET__PREDICTED_LABEL_NAME:
				setPredictedLabelName(PREDICTED_LABEL_NAME_EDEFAULT);
				return;
			case FairnessPackage.DATASET__POSITIVE_OUTCOME:
				setPositiveOutcome((DatasetPositiveOutcome)null);
				return;
			case FairnessPackage.DATASET__DATASET_SENTIVE_VARIABLE:
				getDatasetSentiveVariable().clear();
				return;
			case FairnessPackage.DATASET__FILE_PATH:
				setFilePath(FILE_PATH_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FairnessPackage.DATASET__OTHER_VARIABLE:
				return otherVariable != null && !otherVariable.isEmpty();
			case FairnessPackage.DATASET__GROUND_TRUTH_LABEL_NAME:
				return GROUND_TRUTH_LABEL_NAME_EDEFAULT == null ? groundTruthLabelName != null : !GROUND_TRUTH_LABEL_NAME_EDEFAULT.equals(groundTruthLabelName);
			case FairnessPackage.DATASET__PREDICTED_LABEL_NAME:
				return PREDICTED_LABEL_NAME_EDEFAULT == null ? predictedLabelName != null : !PREDICTED_LABEL_NAME_EDEFAULT.equals(predictedLabelName);
			case FairnessPackage.DATASET__POSITIVE_OUTCOME:
				return positiveOutcome != null;
			case FairnessPackage.DATASET__DATASET_SENTIVE_VARIABLE:
				return datasetSentiveVariable != null && !datasetSentiveVariable.isEmpty();
			case FairnessPackage.DATASET__FILE_PATH:
				return FILE_PATH_EDEFAULT == null ? filePath != null : !FILE_PATH_EDEFAULT.equals(filePath);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (groundTruthLabelName: ");
		result.append(groundTruthLabelName);
		result.append(", predictedLabelName: ");
		result.append(predictedLabelName);
		result.append(", filePath: ");
		result.append(filePath);
		result.append(')');
		return result.toString();
	}

} //DatasetImpl
