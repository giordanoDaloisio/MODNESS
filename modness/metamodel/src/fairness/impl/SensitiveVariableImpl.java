/**
 */
package fairness.impl;

import fairness.FairnessPackage;
import fairness.SensitiveVariable;
import fairness.SensitiveVariableValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensitive Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fairness.impl.SensitiveVariableImpl#getSensitiveVariableValue <em>Sensitive Variable Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensitiveVariableImpl extends VariableImpl implements SensitiveVariable {
	/**
	 * The cached value of the '{@link #getSensitiveVariableValue() <em>Sensitive Variable Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensitiveVariableValue()
	 * @generated
	 * @ordered
	 */
	protected EList<SensitiveVariableValue> sensitiveVariableValue;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensitiveVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FairnessPackage.Literals.SENSITIVE_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SensitiveVariableValue> getSensitiveVariableValue() {
		if (sensitiveVariableValue == null) {
			sensitiveVariableValue = new EObjectContainmentEList<SensitiveVariableValue>(SensitiveVariableValue.class, this, FairnessPackage.SENSITIVE_VARIABLE__SENSITIVE_VARIABLE_VALUE);
		}
		return sensitiveVariableValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FairnessPackage.SENSITIVE_VARIABLE__SENSITIVE_VARIABLE_VALUE:
				return ((InternalEList<?>)getSensitiveVariableValue()).basicRemove(otherEnd, msgs);
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
			case FairnessPackage.SENSITIVE_VARIABLE__SENSITIVE_VARIABLE_VALUE:
				return getSensitiveVariableValue();
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
			case FairnessPackage.SENSITIVE_VARIABLE__SENSITIVE_VARIABLE_VALUE:
				getSensitiveVariableValue().clear();
				getSensitiveVariableValue().addAll((Collection<? extends SensitiveVariableValue>)newValue);
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
			case FairnessPackage.SENSITIVE_VARIABLE__SENSITIVE_VARIABLE_VALUE:
				getSensitiveVariableValue().clear();
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
			case FairnessPackage.SENSITIVE_VARIABLE__SENSITIVE_VARIABLE_VALUE:
				return sensitiveVariableValue != null && !sensitiveVariableValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SensitiveVariableImpl
