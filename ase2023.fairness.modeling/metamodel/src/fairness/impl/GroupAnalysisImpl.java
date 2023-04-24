/**
 */
package fairness.impl;

import fairness.DatasetSensitiveGroup;
import fairness.FairnessPackage;
import fairness.GroupAnalysis;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group Analysis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fairness.impl.GroupAnalysisImpl#getDatasetUnprivilegedGroup <em>Dataset Unprivileged Group</em>}</li>
 *   <li>{@link fairness.impl.GroupAnalysisImpl#getDatasetPrivilegedGroup <em>Dataset Privileged Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupAnalysisImpl extends AnalysisImpl implements GroupAnalysis {
	/**
	 * The cached value of the '{@link #getDatasetUnprivilegedGroup() <em>Dataset Unprivileged Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasetUnprivilegedGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<DatasetSensitiveGroup> datasetUnprivilegedGroup;
	/**
	 * The cached value of the '{@link #getDatasetPrivilegedGroup() <em>Dataset Privileged Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasetPrivilegedGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<DatasetSensitiveGroup> datasetPrivilegedGroup;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupAnalysisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FairnessPackage.Literals.GROUP_ANALYSIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatasetSensitiveGroup> getDatasetUnprivilegedGroup() {
		if (datasetUnprivilegedGroup == null) {
			datasetUnprivilegedGroup = new EObjectContainmentEList<DatasetSensitiveGroup>(DatasetSensitiveGroup.class, this, FairnessPackage.GROUP_ANALYSIS__DATASET_UNPRIVILEGED_GROUP);
		}
		return datasetUnprivilegedGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatasetSensitiveGroup> getDatasetPrivilegedGroup() {
		if (datasetPrivilegedGroup == null) {
			datasetPrivilegedGroup = new EObjectContainmentEList<DatasetSensitiveGroup>(DatasetSensitiveGroup.class, this, FairnessPackage.GROUP_ANALYSIS__DATASET_PRIVILEGED_GROUP);
		}
		return datasetPrivilegedGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FairnessPackage.GROUP_ANALYSIS__DATASET_UNPRIVILEGED_GROUP:
				return ((InternalEList<?>)getDatasetUnprivilegedGroup()).basicRemove(otherEnd, msgs);
			case FairnessPackage.GROUP_ANALYSIS__DATASET_PRIVILEGED_GROUP:
				return ((InternalEList<?>)getDatasetPrivilegedGroup()).basicRemove(otherEnd, msgs);
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
			case FairnessPackage.GROUP_ANALYSIS__DATASET_UNPRIVILEGED_GROUP:
				return getDatasetUnprivilegedGroup();
			case FairnessPackage.GROUP_ANALYSIS__DATASET_PRIVILEGED_GROUP:
				return getDatasetPrivilegedGroup();
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
			case FairnessPackage.GROUP_ANALYSIS__DATASET_UNPRIVILEGED_GROUP:
				getDatasetUnprivilegedGroup().clear();
				getDatasetUnprivilegedGroup().addAll((Collection<? extends DatasetSensitiveGroup>)newValue);
				return;
			case FairnessPackage.GROUP_ANALYSIS__DATASET_PRIVILEGED_GROUP:
				getDatasetPrivilegedGroup().clear();
				getDatasetPrivilegedGroup().addAll((Collection<? extends DatasetSensitiveGroup>)newValue);
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
			case FairnessPackage.GROUP_ANALYSIS__DATASET_UNPRIVILEGED_GROUP:
				getDatasetUnprivilegedGroup().clear();
				return;
			case FairnessPackage.GROUP_ANALYSIS__DATASET_PRIVILEGED_GROUP:
				getDatasetPrivilegedGroup().clear();
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
			case FairnessPackage.GROUP_ANALYSIS__DATASET_UNPRIVILEGED_GROUP:
				return datasetUnprivilegedGroup != null && !datasetUnprivilegedGroup.isEmpty();
			case FairnessPackage.GROUP_ANALYSIS__DATASET_PRIVILEGED_GROUP:
				return datasetPrivilegedGroup != null && !datasetPrivilegedGroup.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GroupAnalysisImpl
