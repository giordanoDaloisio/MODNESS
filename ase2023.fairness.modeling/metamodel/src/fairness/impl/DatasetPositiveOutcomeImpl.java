/**
 */
package fairness.impl;

import fairness.DatasetPositiveOutcome;
import fairness.FairnessPackage;
import fairness.PositiveOutcome;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dataset Positive Outcome</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fairness.impl.DatasetPositiveOutcomeImpl#getMappingPositiveOutcome <em>Mapping Positive Outcome</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatasetPositiveOutcomeImpl extends VariableValueImpl implements DatasetPositiveOutcome {
	/**
	 * The cached value of the '{@link #getMappingPositiveOutcome() <em>Mapping Positive Outcome</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingPositiveOutcome()
	 * @generated
	 * @ordered
	 */
	protected PositiveOutcome mappingPositiveOutcome;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatasetPositiveOutcomeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FairnessPackage.Literals.DATASET_POSITIVE_OUTCOME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveOutcome getMappingPositiveOutcome() {
		if (mappingPositiveOutcome != null && mappingPositiveOutcome.eIsProxy()) {
			InternalEObject oldMappingPositiveOutcome = (InternalEObject)mappingPositiveOutcome;
			mappingPositiveOutcome = (PositiveOutcome)eResolveProxy(oldMappingPositiveOutcome);
			if (mappingPositiveOutcome != oldMappingPositiveOutcome) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FairnessPackage.DATASET_POSITIVE_OUTCOME__MAPPING_POSITIVE_OUTCOME, oldMappingPositiveOutcome, mappingPositiveOutcome));
			}
		}
		return mappingPositiveOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveOutcome basicGetMappingPositiveOutcome() {
		return mappingPositiveOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappingPositiveOutcome(PositiveOutcome newMappingPositiveOutcome) {
		PositiveOutcome oldMappingPositiveOutcome = mappingPositiveOutcome;
		mappingPositiveOutcome = newMappingPositiveOutcome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FairnessPackage.DATASET_POSITIVE_OUTCOME__MAPPING_POSITIVE_OUTCOME, oldMappingPositiveOutcome, mappingPositiveOutcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FairnessPackage.DATASET_POSITIVE_OUTCOME__MAPPING_POSITIVE_OUTCOME:
				if (resolve) return getMappingPositiveOutcome();
				return basicGetMappingPositiveOutcome();
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
			case FairnessPackage.DATASET_POSITIVE_OUTCOME__MAPPING_POSITIVE_OUTCOME:
				setMappingPositiveOutcome((PositiveOutcome)newValue);
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
			case FairnessPackage.DATASET_POSITIVE_OUTCOME__MAPPING_POSITIVE_OUTCOME:
				setMappingPositiveOutcome((PositiveOutcome)null);
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
			case FairnessPackage.DATASET_POSITIVE_OUTCOME__MAPPING_POSITIVE_OUTCOME:
				return mappingPositiveOutcome != null;
		}
		return super.eIsSet(featureID);
	}

} //DatasetPositiveOutcomeImpl
