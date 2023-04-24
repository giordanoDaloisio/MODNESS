/**
 */
package fairness.impl;

import fairness.DatasetSensitiveVariable;
import fairness.DatasetSensitiveVariableValue;
import fairness.FairnessPackage;
import fairness.SensitiveVariable;
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
 * An implementation of the model object '<em><b>Dataset Sensitive Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fairness.impl.DatasetSensitiveVariableImpl#getMappingSensitiveVariable <em>Mapping Sensitive Variable</em>}</li>
 *   <li>{@link fairness.impl.DatasetSensitiveVariableImpl#getDatasetsensitivevariablevalue <em>Datasetsensitivevariablevalue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatasetSensitiveVariableImpl extends NamedElementImpl implements DatasetSensitiveVariable {
	/**
	 * The cached value of the '{@link #getMappingSensitiveVariable() <em>Mapping Sensitive Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingSensitiveVariable()
	 * @generated
	 * @ordered
	 */
	protected SensitiveVariable mappingSensitiveVariable;

	/**
	 * The cached value of the '{@link #getDatasetsensitivevariablevalue() <em>Datasetsensitivevariablevalue</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasetsensitivevariablevalue()
	 * @generated
	 * @ordered
	 */
	protected EList<DatasetSensitiveVariableValue> datasetsensitivevariablevalue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatasetSensitiveVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FairnessPackage.Literals.DATASET_SENSITIVE_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensitiveVariable getMappingSensitiveVariable() {
		if (mappingSensitiveVariable != null && mappingSensitiveVariable.eIsProxy()) {
			InternalEObject oldMappingSensitiveVariable = (InternalEObject)mappingSensitiveVariable;
			mappingSensitiveVariable = (SensitiveVariable)eResolveProxy(oldMappingSensitiveVariable);
			if (mappingSensitiveVariable != oldMappingSensitiveVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FairnessPackage.DATASET_SENSITIVE_VARIABLE__MAPPING_SENSITIVE_VARIABLE, oldMappingSensitiveVariable, mappingSensitiveVariable));
			}
		}
		return mappingSensitiveVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensitiveVariable basicGetMappingSensitiveVariable() {
		return mappingSensitiveVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappingSensitiveVariable(SensitiveVariable newMappingSensitiveVariable) {
		SensitiveVariable oldMappingSensitiveVariable = mappingSensitiveVariable;
		mappingSensitiveVariable = newMappingSensitiveVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FairnessPackage.DATASET_SENSITIVE_VARIABLE__MAPPING_SENSITIVE_VARIABLE, oldMappingSensitiveVariable, mappingSensitiveVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatasetSensitiveVariableValue> getDatasetsensitivevariablevalue() {
		if (datasetsensitivevariablevalue == null) {
			datasetsensitivevariablevalue = new EObjectContainmentEList<DatasetSensitiveVariableValue>(DatasetSensitiveVariableValue.class, this, FairnessPackage.DATASET_SENSITIVE_VARIABLE__DATASETSENSITIVEVARIABLEVALUE);
		}
		return datasetsensitivevariablevalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FairnessPackage.DATASET_SENSITIVE_VARIABLE__DATASETSENSITIVEVARIABLEVALUE:
				return ((InternalEList<?>)getDatasetsensitivevariablevalue()).basicRemove(otherEnd, msgs);
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
			case FairnessPackage.DATASET_SENSITIVE_VARIABLE__MAPPING_SENSITIVE_VARIABLE:
				if (resolve) return getMappingSensitiveVariable();
				return basicGetMappingSensitiveVariable();
			case FairnessPackage.DATASET_SENSITIVE_VARIABLE__DATASETSENSITIVEVARIABLEVALUE:
				return getDatasetsensitivevariablevalue();
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
			case FairnessPackage.DATASET_SENSITIVE_VARIABLE__MAPPING_SENSITIVE_VARIABLE:
				setMappingSensitiveVariable((SensitiveVariable)newValue);
				return;
			case FairnessPackage.DATASET_SENSITIVE_VARIABLE__DATASETSENSITIVEVARIABLEVALUE:
				getDatasetsensitivevariablevalue().clear();
				getDatasetsensitivevariablevalue().addAll((Collection<? extends DatasetSensitiveVariableValue>)newValue);
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
			case FairnessPackage.DATASET_SENSITIVE_VARIABLE__MAPPING_SENSITIVE_VARIABLE:
				setMappingSensitiveVariable((SensitiveVariable)null);
				return;
			case FairnessPackage.DATASET_SENSITIVE_VARIABLE__DATASETSENSITIVEVARIABLEVALUE:
				getDatasetsensitivevariablevalue().clear();
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
			case FairnessPackage.DATASET_SENSITIVE_VARIABLE__MAPPING_SENSITIVE_VARIABLE:
				return mappingSensitiveVariable != null;
			case FairnessPackage.DATASET_SENSITIVE_VARIABLE__DATASETSENSITIVEVARIABLEVALUE:
				return datasetsensitivevariablevalue != null && !datasetsensitivevariablevalue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DatasetSensitiveVariableImpl
