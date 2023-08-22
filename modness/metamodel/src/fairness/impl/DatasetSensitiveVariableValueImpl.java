/**
 */
package fairness.impl;

import fairness.DatasetSensitiveVariableValue;
import fairness.FairnessPackage;
import fairness.SensitiveVariableValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dataset Sensitive Variable Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fairness.impl.DatasetSensitiveVariableValueImpl#getMappingValue <em>Mapping Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatasetSensitiveVariableValueImpl extends VariableValueImpl implements DatasetSensitiveVariableValue {
	/**
	 * The cached value of the '{@link #getMappingValue() <em>Mapping Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingValue()
	 * @generated
	 * @ordered
	 */
	protected SensitiveVariableValue mappingValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatasetSensitiveVariableValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FairnessPackage.Literals.DATASET_SENSITIVE_VARIABLE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensitiveVariableValue getMappingValue() {
		if (mappingValue != null && mappingValue.eIsProxy()) {
			InternalEObject oldMappingValue = (InternalEObject)mappingValue;
			mappingValue = (SensitiveVariableValue)eResolveProxy(oldMappingValue);
			if (mappingValue != oldMappingValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FairnessPackage.DATASET_SENSITIVE_VARIABLE_VALUE__MAPPING_VALUE, oldMappingValue, mappingValue));
			}
		}
		return mappingValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensitiveVariableValue basicGetMappingValue() {
		return mappingValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappingValue(SensitiveVariableValue newMappingValue) {
		SensitiveVariableValue oldMappingValue = mappingValue;
		mappingValue = newMappingValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FairnessPackage.DATASET_SENSITIVE_VARIABLE_VALUE__MAPPING_VALUE, oldMappingValue, mappingValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FairnessPackage.DATASET_SENSITIVE_VARIABLE_VALUE__MAPPING_VALUE:
				if (resolve) return getMappingValue();
				return basicGetMappingValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FairnessPackage.DATASET_SENSITIVE_VARIABLE_VALUE__MAPPING_VALUE:
				setMappingValue((SensitiveVariableValue)newValue);
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
			case FairnessPackage.DATASET_SENSITIVE_VARIABLE_VALUE__MAPPING_VALUE:
				setMappingValue((SensitiveVariableValue)null);
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
			case FairnessPackage.DATASET_SENSITIVE_VARIABLE_VALUE__MAPPING_VALUE:
				return mappingValue != null;
		}
		return super.eIsSet(featureID);
	}

} //DatasetSensitiveVariableValueImpl
