/**
 */
package fairness.impl;

import fairness.DatasetSensitiveGroup;
import fairness.DatasetSensitiveVariableValue;
import fairness.FairnessPackage;
import fairness.SensitiveGroup;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dataset Sensitive Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fairness.impl.DatasetSensitiveGroupImpl#getSensitiveVariables <em>Sensitive Variables</em>}</li>
 *   <li>{@link fairness.impl.DatasetSensitiveGroupImpl#getMappingGroup <em>Mapping Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatasetSensitiveGroupImpl extends NamedElementImpl implements DatasetSensitiveGroup {
	/**
	 * The cached value of the '{@link #getSensitiveVariables() <em>Sensitive Variables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensitiveVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<DatasetSensitiveVariableValue> sensitiveVariables;

	/**
	 * The cached value of the '{@link #getMappingGroup() <em>Mapping Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingGroup()
	 * @generated
	 * @ordered
	 */
	protected SensitiveGroup mappingGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatasetSensitiveGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FairnessPackage.Literals.DATASET_SENSITIVE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatasetSensitiveVariableValue> getSensitiveVariables() {
		if (sensitiveVariables == null) {
			sensitiveVariables = new EObjectResolvingEList<DatasetSensitiveVariableValue>(DatasetSensitiveVariableValue.class, this, FairnessPackage.DATASET_SENSITIVE_GROUP__SENSITIVE_VARIABLES);
		}
		return sensitiveVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensitiveGroup getMappingGroup() {
		if (mappingGroup != null && mappingGroup.eIsProxy()) {
			InternalEObject oldMappingGroup = (InternalEObject)mappingGroup;
			mappingGroup = (SensitiveGroup)eResolveProxy(oldMappingGroup);
			if (mappingGroup != oldMappingGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FairnessPackage.DATASET_SENSITIVE_GROUP__MAPPING_GROUP, oldMappingGroup, mappingGroup));
			}
		}
		return mappingGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensitiveGroup basicGetMappingGroup() {
		return mappingGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappingGroup(SensitiveGroup newMappingGroup) {
		SensitiveGroup oldMappingGroup = mappingGroup;
		mappingGroup = newMappingGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FairnessPackage.DATASET_SENSITIVE_GROUP__MAPPING_GROUP, oldMappingGroup, mappingGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FairnessPackage.DATASET_SENSITIVE_GROUP__SENSITIVE_VARIABLES:
				return getSensitiveVariables();
			case FairnessPackage.DATASET_SENSITIVE_GROUP__MAPPING_GROUP:
				if (resolve) return getMappingGroup();
				return basicGetMappingGroup();
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
			case FairnessPackage.DATASET_SENSITIVE_GROUP__SENSITIVE_VARIABLES:
				getSensitiveVariables().clear();
				getSensitiveVariables().addAll((Collection<? extends DatasetSensitiveVariableValue>)newValue);
				return;
			case FairnessPackage.DATASET_SENSITIVE_GROUP__MAPPING_GROUP:
				setMappingGroup((SensitiveGroup)newValue);
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
			case FairnessPackage.DATASET_SENSITIVE_GROUP__SENSITIVE_VARIABLES:
				getSensitiveVariables().clear();
				return;
			case FairnessPackage.DATASET_SENSITIVE_GROUP__MAPPING_GROUP:
				setMappingGroup((SensitiveGroup)null);
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
			case FairnessPackage.DATASET_SENSITIVE_GROUP__SENSITIVE_VARIABLES:
				return sensitiveVariables != null && !sensitiveVariables.isEmpty();
			case FairnessPackage.DATASET_SENSITIVE_GROUP__MAPPING_GROUP:
				return mappingGroup != null;
		}
		return super.eIsSet(featureID);
	}

} //DatasetSensitiveGroupImpl
