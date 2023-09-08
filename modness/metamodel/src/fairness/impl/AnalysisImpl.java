/**
 */
package fairness.impl;

import fairness.Analysis;
import fairness.Dataset;
import fairness.DatasetSensitiveGroup;
import fairness.FairnessPackage;
import fairness.Metric;
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
 * An implementation of the model object '<em><b>Analysis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fairness.impl.AnalysisImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link fairness.impl.AnalysisImpl#getDataset <em>Dataset</em>}</li>
 *   <li>{@link fairness.impl.AnalysisImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link fairness.impl.AnalysisImpl#getDatasetUnprivilegedGroup <em>Dataset Unprivileged Group</em>}</li>
 *   <li>{@link fairness.impl.AnalysisImpl#getDatasetPrivilegedGroup <em>Dataset Privileged Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AnalysisImpl extends NamedElementImpl implements Analysis {
	/**
	 * The cached value of the '{@link #getMetric() <em>Metric</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected EList<Metric> metric;

	/**
	 * The cached value of the '{@link #getDataset() <em>Dataset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataset()
	 * @generated
	 * @ordered
	 */
	protected EList<Dataset> dataset;

	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final String SCOPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected String scope = SCOPE_EDEFAULT;

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
	protected AnalysisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FairnessPackage.Literals.ANALYSIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Metric> getMetric() {
		if (metric == null) {
			metric = new EObjectContainmentEList<Metric>(Metric.class, this, FairnessPackage.ANALYSIS__METRIC);
		}
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dataset> getDataset() {
		if (dataset == null) {
			dataset = new EObjectContainmentEList<Dataset>(Dataset.class, this, FairnessPackage.ANALYSIS__DATASET);
		}
		return dataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(String newScope) {
		String oldScope = scope;
		scope = newScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FairnessPackage.ANALYSIS__SCOPE, oldScope, scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatasetSensitiveGroup> getDatasetUnprivilegedGroup() {
		if (datasetUnprivilegedGroup == null) {
			datasetUnprivilegedGroup = new EObjectContainmentEList<DatasetSensitiveGroup>(DatasetSensitiveGroup.class, this, FairnessPackage.ANALYSIS__DATASET_UNPRIVILEGED_GROUP);
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
			datasetPrivilegedGroup = new EObjectContainmentEList<DatasetSensitiveGroup>(DatasetSensitiveGroup.class, this, FairnessPackage.ANALYSIS__DATASET_PRIVILEGED_GROUP);
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
			case FairnessPackage.ANALYSIS__METRIC:
				return ((InternalEList<?>)getMetric()).basicRemove(otherEnd, msgs);
			case FairnessPackage.ANALYSIS__DATASET:
				return ((InternalEList<?>)getDataset()).basicRemove(otherEnd, msgs);
			case FairnessPackage.ANALYSIS__DATASET_UNPRIVILEGED_GROUP:
				return ((InternalEList<?>)getDatasetUnprivilegedGroup()).basicRemove(otherEnd, msgs);
			case FairnessPackage.ANALYSIS__DATASET_PRIVILEGED_GROUP:
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
			case FairnessPackage.ANALYSIS__METRIC:
				return getMetric();
			case FairnessPackage.ANALYSIS__DATASET:
				return getDataset();
			case FairnessPackage.ANALYSIS__SCOPE:
				return getScope();
			case FairnessPackage.ANALYSIS__DATASET_UNPRIVILEGED_GROUP:
				return getDatasetUnprivilegedGroup();
			case FairnessPackage.ANALYSIS__DATASET_PRIVILEGED_GROUP:
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
			case FairnessPackage.ANALYSIS__METRIC:
				getMetric().clear();
				getMetric().addAll((Collection<? extends Metric>)newValue);
				return;
			case FairnessPackage.ANALYSIS__DATASET:
				getDataset().clear();
				getDataset().addAll((Collection<? extends Dataset>)newValue);
				return;
			case FairnessPackage.ANALYSIS__SCOPE:
				setScope((String)newValue);
				return;
			case FairnessPackage.ANALYSIS__DATASET_UNPRIVILEGED_GROUP:
				getDatasetUnprivilegedGroup().clear();
				getDatasetUnprivilegedGroup().addAll((Collection<? extends DatasetSensitiveGroup>)newValue);
				return;
			case FairnessPackage.ANALYSIS__DATASET_PRIVILEGED_GROUP:
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
			case FairnessPackage.ANALYSIS__METRIC:
				getMetric().clear();
				return;
			case FairnessPackage.ANALYSIS__DATASET:
				getDataset().clear();
				return;
			case FairnessPackage.ANALYSIS__SCOPE:
				setScope(SCOPE_EDEFAULT);
				return;
			case FairnessPackage.ANALYSIS__DATASET_UNPRIVILEGED_GROUP:
				getDatasetUnprivilegedGroup().clear();
				return;
			case FairnessPackage.ANALYSIS__DATASET_PRIVILEGED_GROUP:
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
			case FairnessPackage.ANALYSIS__METRIC:
				return metric != null && !metric.isEmpty();
			case FairnessPackage.ANALYSIS__DATASET:
				return dataset != null && !dataset.isEmpty();
			case FairnessPackage.ANALYSIS__SCOPE:
				return SCOPE_EDEFAULT == null ? scope != null : !SCOPE_EDEFAULT.equals(scope);
			case FairnessPackage.ANALYSIS__DATASET_UNPRIVILEGED_GROUP:
				return datasetUnprivilegedGroup != null && !datasetUnprivilegedGroup.isEmpty();
			case FairnessPackage.ANALYSIS__DATASET_PRIVILEGED_GROUP:
				return datasetPrivilegedGroup != null && !datasetPrivilegedGroup.isEmpty();
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
		result.append(" (scope: ");
		result.append(scope);
		result.append(')');
		return result.toString();
	}

} //AnalysisImpl
