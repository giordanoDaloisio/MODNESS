/**
 */
package fairness.impl;

import fairness.ArithmeticOperator;
import fairness.FairnessPackage;
import fairness.Operation;
import fairness.OperatorComponent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fairness.impl.OperationImpl#getEqualityOperator <em>Equality Operator</em>}</li>
 *   <li>{@link fairness.impl.OperationImpl#getLeftSide <em>Left Side</em>}</li>
 *   <li>{@link fairness.impl.OperationImpl#getRightSide <em>Right Side</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends FunctionImpl implements Operation {
	/**
	 * The default value of the '{@link #getEqualityOperator() <em>Equality Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEqualityOperator()
	 * @generated
	 * @ordered
	 */
	protected static final ArithmeticOperator EQUALITY_OPERATOR_EDEFAULT = ArithmeticOperator.SUM;

	/**
	 * The cached value of the '{@link #getEqualityOperator() <em>Equality Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEqualityOperator()
	 * @generated
	 * @ordered
	 */
	protected ArithmeticOperator equalityOperator = EQUALITY_OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLeftSide() <em>Left Side</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftSide()
	 * @generated
	 * @ordered
	 */
	protected OperatorComponent leftSide;

	/**
	 * The cached value of the '{@link #getRightSide() <em>Right Side</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightSide()
	 * @generated
	 * @ordered
	 */
	protected OperatorComponent rightSide;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FairnessPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticOperator getEqualityOperator() {
		return equalityOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEqualityOperator(ArithmeticOperator newEqualityOperator) {
		ArithmeticOperator oldEqualityOperator = equalityOperator;
		equalityOperator = newEqualityOperator == null ? EQUALITY_OPERATOR_EDEFAULT : newEqualityOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FairnessPackage.OPERATION__EQUALITY_OPERATOR, oldEqualityOperator, equalityOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorComponent getLeftSide() {
		return leftSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftSide(OperatorComponent newLeftSide, NotificationChain msgs) {
		OperatorComponent oldLeftSide = leftSide;
		leftSide = newLeftSide;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FairnessPackage.OPERATION__LEFT_SIDE, oldLeftSide, newLeftSide);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftSide(OperatorComponent newLeftSide) {
		if (newLeftSide != leftSide) {
			NotificationChain msgs = null;
			if (leftSide != null)
				msgs = ((InternalEObject)leftSide).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FairnessPackage.OPERATION__LEFT_SIDE, null, msgs);
			if (newLeftSide != null)
				msgs = ((InternalEObject)newLeftSide).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FairnessPackage.OPERATION__LEFT_SIDE, null, msgs);
			msgs = basicSetLeftSide(newLeftSide, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FairnessPackage.OPERATION__LEFT_SIDE, newLeftSide, newLeftSide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorComponent getRightSide() {
		return rightSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightSide(OperatorComponent newRightSide, NotificationChain msgs) {
		OperatorComponent oldRightSide = rightSide;
		rightSide = newRightSide;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FairnessPackage.OPERATION__RIGHT_SIDE, oldRightSide, newRightSide);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightSide(OperatorComponent newRightSide) {
		if (newRightSide != rightSide) {
			NotificationChain msgs = null;
			if (rightSide != null)
				msgs = ((InternalEObject)rightSide).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FairnessPackage.OPERATION__RIGHT_SIDE, null, msgs);
			if (newRightSide != null)
				msgs = ((InternalEObject)newRightSide).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FairnessPackage.OPERATION__RIGHT_SIDE, null, msgs);
			msgs = basicSetRightSide(newRightSide, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FairnessPackage.OPERATION__RIGHT_SIDE, newRightSide, newRightSide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FairnessPackage.OPERATION__LEFT_SIDE:
				return basicSetLeftSide(null, msgs);
			case FairnessPackage.OPERATION__RIGHT_SIDE:
				return basicSetRightSide(null, msgs);
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
			case FairnessPackage.OPERATION__EQUALITY_OPERATOR:
				return getEqualityOperator();
			case FairnessPackage.OPERATION__LEFT_SIDE:
				return getLeftSide();
			case FairnessPackage.OPERATION__RIGHT_SIDE:
				return getRightSide();
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
			case FairnessPackage.OPERATION__EQUALITY_OPERATOR:
				setEqualityOperator((ArithmeticOperator)newValue);
				return;
			case FairnessPackage.OPERATION__LEFT_SIDE:
				setLeftSide((OperatorComponent)newValue);
				return;
			case FairnessPackage.OPERATION__RIGHT_SIDE:
				setRightSide((OperatorComponent)newValue);
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
			case FairnessPackage.OPERATION__EQUALITY_OPERATOR:
				setEqualityOperator(EQUALITY_OPERATOR_EDEFAULT);
				return;
			case FairnessPackage.OPERATION__LEFT_SIDE:
				setLeftSide((OperatorComponent)null);
				return;
			case FairnessPackage.OPERATION__RIGHT_SIDE:
				setRightSide((OperatorComponent)null);
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
			case FairnessPackage.OPERATION__EQUALITY_OPERATOR:
				return equalityOperator != EQUALITY_OPERATOR_EDEFAULT;
			case FairnessPackage.OPERATION__LEFT_SIDE:
				return leftSide != null;
			case FairnessPackage.OPERATION__RIGHT_SIDE:
				return rightSide != null;
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
		result.append(" (equalityOperator: ");
		result.append(equalityOperator);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
