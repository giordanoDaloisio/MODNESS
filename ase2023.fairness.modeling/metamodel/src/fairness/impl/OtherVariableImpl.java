/**
 */
package fairness.impl;

import fairness.FairnessPackage;
import fairness.OtherVariable;
import fairness.VariableValue;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Other Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fairness.impl.OtherVariableImpl#getOthervariablevalue <em>Othervariablevalue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OtherVariableImpl extends VariableImpl implements OtherVariable {
	/**
	 * The cached value of the '{@link #getOthervariablevalue() <em>Othervariablevalue</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOthervariablevalue()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableValue> othervariablevalue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OtherVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FairnessPackage.Literals.OTHER_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableValue> getOthervariablevalue() {
		if (othervariablevalue == null) {
			othervariablevalue = new EObjectContainmentEList<VariableValue>(VariableValue.class, this, FairnessPackage.OTHER_VARIABLE__OTHERVARIABLEVALUE);
		}
		return othervariablevalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FairnessPackage.OTHER_VARIABLE__OTHERVARIABLEVALUE:
				return ((InternalEList<?>)getOthervariablevalue()).basicRemove(otherEnd, msgs);
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
			case FairnessPackage.OTHER_VARIABLE__OTHERVARIABLEVALUE:
				return getOthervariablevalue();
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
			case FairnessPackage.OTHER_VARIABLE__OTHERVARIABLEVALUE:
				getOthervariablevalue().clear();
				getOthervariablevalue().addAll((Collection<? extends VariableValue>)newValue);
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
			case FairnessPackage.OTHER_VARIABLE__OTHERVARIABLEVALUE:
				getOthervariablevalue().clear();
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
			case FairnessPackage.OTHER_VARIABLE__OTHERVARIABLEVALUE:
				return othervariablevalue != null && !othervariablevalue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OtherVariableImpl
