/**
 */
package fairness.impl;

import fairness.FairnessPackage;
import fairness.Logaritm;
import fairness.OperatorComponent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logaritm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fairness.impl.LogaritmImpl#getOperatorcomponent <em>Operatorcomponent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogaritmImpl extends FunctionImpl implements Logaritm {
	/**
	 * The cached value of the '{@link #getOperatorcomponent() <em>Operatorcomponent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatorcomponent()
	 * @generated
	 * @ordered
	 */
	protected OperatorComponent operatorcomponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogaritmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FairnessPackage.Literals.LOGARITM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorComponent getOperatorcomponent() {
		return operatorcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperatorcomponent(OperatorComponent newOperatorcomponent, NotificationChain msgs) {
		OperatorComponent oldOperatorcomponent = operatorcomponent;
		operatorcomponent = newOperatorcomponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FairnessPackage.LOGARITM__OPERATORCOMPONENT, oldOperatorcomponent, newOperatorcomponent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperatorcomponent(OperatorComponent newOperatorcomponent) {
		if (newOperatorcomponent != operatorcomponent) {
			NotificationChain msgs = null;
			if (operatorcomponent != null)
				msgs = ((InternalEObject)operatorcomponent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FairnessPackage.LOGARITM__OPERATORCOMPONENT, null, msgs);
			if (newOperatorcomponent != null)
				msgs = ((InternalEObject)newOperatorcomponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FairnessPackage.LOGARITM__OPERATORCOMPONENT, null, msgs);
			msgs = basicSetOperatorcomponent(newOperatorcomponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FairnessPackage.LOGARITM__OPERATORCOMPONENT, newOperatorcomponent, newOperatorcomponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FairnessPackage.LOGARITM__OPERATORCOMPONENT:
				return basicSetOperatorcomponent(null, msgs);
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
			case FairnessPackage.LOGARITM__OPERATORCOMPONENT:
				return getOperatorcomponent();
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
			case FairnessPackage.LOGARITM__OPERATORCOMPONENT:
				setOperatorcomponent((OperatorComponent)newValue);
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
			case FairnessPackage.LOGARITM__OPERATORCOMPONENT:
				setOperatorcomponent((OperatorComponent)null);
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
			case FairnessPackage.LOGARITM__OPERATORCOMPONENT:
				return operatorcomponent != null;
		}
		return super.eIsSet(featureID);
	}

} //LogaritmImpl
