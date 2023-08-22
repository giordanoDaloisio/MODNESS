/**
 */
package fairness.impl;

import fairness.FairnessPackage;
import fairness.Function;
import fairness.OperationValue;
import fairness.OperatorComponent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operator Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fairness.impl.OperatorComponentImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link fairness.impl.OperatorComponentImpl#getOperationvalue <em>Operationvalue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperatorComponentImpl extends NamedElementImpl implements OperatorComponent {
	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected Function function;

	/**
	 * The cached value of the '{@link #getOperationvalue() <em>Operationvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationvalue()
	 * @generated
	 * @ordered
	 */
	protected OperationValue operationvalue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatorComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FairnessPackage.Literals.OPERATOR_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function getFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunction(Function newFunction, NotificationChain msgs) {
		Function oldFunction = function;
		function = newFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FairnessPackage.OPERATOR_COMPONENT__FUNCTION, oldFunction, newFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(Function newFunction) {
		if (newFunction != function) {
			NotificationChain msgs = null;
			if (function != null)
				msgs = ((InternalEObject)function).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FairnessPackage.OPERATOR_COMPONENT__FUNCTION, null, msgs);
			if (newFunction != null)
				msgs = ((InternalEObject)newFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FairnessPackage.OPERATOR_COMPONENT__FUNCTION, null, msgs);
			msgs = basicSetFunction(newFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FairnessPackage.OPERATOR_COMPONENT__FUNCTION, newFunction, newFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationValue getOperationvalue() {
		return operationvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationvalue(OperationValue newOperationvalue, NotificationChain msgs) {
		OperationValue oldOperationvalue = operationvalue;
		operationvalue = newOperationvalue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FairnessPackage.OPERATOR_COMPONENT__OPERATIONVALUE, oldOperationvalue, newOperationvalue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationvalue(OperationValue newOperationvalue) {
		if (newOperationvalue != operationvalue) {
			NotificationChain msgs = null;
			if (operationvalue != null)
				msgs = ((InternalEObject)operationvalue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FairnessPackage.OPERATOR_COMPONENT__OPERATIONVALUE, null, msgs);
			if (newOperationvalue != null)
				msgs = ((InternalEObject)newOperationvalue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FairnessPackage.OPERATOR_COMPONENT__OPERATIONVALUE, null, msgs);
			msgs = basicSetOperationvalue(newOperationvalue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FairnessPackage.OPERATOR_COMPONENT__OPERATIONVALUE, newOperationvalue, newOperationvalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FairnessPackage.OPERATOR_COMPONENT__FUNCTION:
				return basicSetFunction(null, msgs);
			case FairnessPackage.OPERATOR_COMPONENT__OPERATIONVALUE:
				return basicSetOperationvalue(null, msgs);
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
			case FairnessPackage.OPERATOR_COMPONENT__FUNCTION:
				return getFunction();
			case FairnessPackage.OPERATOR_COMPONENT__OPERATIONVALUE:
				return getOperationvalue();
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
			case FairnessPackage.OPERATOR_COMPONENT__FUNCTION:
				setFunction((Function)newValue);
				return;
			case FairnessPackage.OPERATOR_COMPONENT__OPERATIONVALUE:
				setOperationvalue((OperationValue)newValue);
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
			case FairnessPackage.OPERATOR_COMPONENT__FUNCTION:
				setFunction((Function)null);
				return;
			case FairnessPackage.OPERATOR_COMPONENT__OPERATIONVALUE:
				setOperationvalue((OperationValue)null);
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
			case FairnessPackage.OPERATOR_COMPONENT__FUNCTION:
				return function != null;
			case FairnessPackage.OPERATOR_COMPONENT__OPERATIONVALUE:
				return operationvalue != null;
		}
		return super.eIsSet(featureID);
	}

} //OperatorComponentImpl
