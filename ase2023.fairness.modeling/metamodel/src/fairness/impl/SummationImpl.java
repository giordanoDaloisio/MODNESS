/**
 */
package fairness.impl;

import fairness.FairnessPackage;
import fairness.OperatorComponent;
import fairness.Summation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Summation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fairness.impl.SummationImpl#getStartRange <em>Start Range</em>}</li>
 *   <li>{@link fairness.impl.SummationImpl#getEndRange <em>End Range</em>}</li>
 *   <li>{@link fairness.impl.SummationImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SummationImpl extends FunctionImpl implements Summation {
	/**
	 * The cached value of the '{@link #getStartRange() <em>Start Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartRange()
	 * @generated
	 * @ordered
	 */
	protected OperatorComponent startRange;

	/**
	 * The cached value of the '{@link #getEndRange() <em>End Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndRange()
	 * @generated
	 * @ordered
	 */
	protected OperatorComponent endRange;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected OperatorComponent body;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SummationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FairnessPackage.Literals.SUMMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorComponent getStartRange() {
		return startRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartRange(OperatorComponent newStartRange, NotificationChain msgs) {
		OperatorComponent oldStartRange = startRange;
		startRange = newStartRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FairnessPackage.SUMMATION__START_RANGE, oldStartRange, newStartRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartRange(OperatorComponent newStartRange) {
		if (newStartRange != startRange) {
			NotificationChain msgs = null;
			if (startRange != null)
				msgs = ((InternalEObject)startRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FairnessPackage.SUMMATION__START_RANGE, null, msgs);
			if (newStartRange != null)
				msgs = ((InternalEObject)newStartRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FairnessPackage.SUMMATION__START_RANGE, null, msgs);
			msgs = basicSetStartRange(newStartRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FairnessPackage.SUMMATION__START_RANGE, newStartRange, newStartRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorComponent getEndRange() {
		return endRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndRange(OperatorComponent newEndRange, NotificationChain msgs) {
		OperatorComponent oldEndRange = endRange;
		endRange = newEndRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FairnessPackage.SUMMATION__END_RANGE, oldEndRange, newEndRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndRange(OperatorComponent newEndRange) {
		if (newEndRange != endRange) {
			NotificationChain msgs = null;
			if (endRange != null)
				msgs = ((InternalEObject)endRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FairnessPackage.SUMMATION__END_RANGE, null, msgs);
			if (newEndRange != null)
				msgs = ((InternalEObject)newEndRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FairnessPackage.SUMMATION__END_RANGE, null, msgs);
			msgs = basicSetEndRange(newEndRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FairnessPackage.SUMMATION__END_RANGE, newEndRange, newEndRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorComponent getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(OperatorComponent newBody, NotificationChain msgs) {
		OperatorComponent oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FairnessPackage.SUMMATION__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(OperatorComponent newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FairnessPackage.SUMMATION__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FairnessPackage.SUMMATION__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FairnessPackage.SUMMATION__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FairnessPackage.SUMMATION__START_RANGE:
				return basicSetStartRange(null, msgs);
			case FairnessPackage.SUMMATION__END_RANGE:
				return basicSetEndRange(null, msgs);
			case FairnessPackage.SUMMATION__BODY:
				return basicSetBody(null, msgs);
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
			case FairnessPackage.SUMMATION__START_RANGE:
				return getStartRange();
			case FairnessPackage.SUMMATION__END_RANGE:
				return getEndRange();
			case FairnessPackage.SUMMATION__BODY:
				return getBody();
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
			case FairnessPackage.SUMMATION__START_RANGE:
				setStartRange((OperatorComponent)newValue);
				return;
			case FairnessPackage.SUMMATION__END_RANGE:
				setEndRange((OperatorComponent)newValue);
				return;
			case FairnessPackage.SUMMATION__BODY:
				setBody((OperatorComponent)newValue);
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
			case FairnessPackage.SUMMATION__START_RANGE:
				setStartRange((OperatorComponent)null);
				return;
			case FairnessPackage.SUMMATION__END_RANGE:
				setEndRange((OperatorComponent)null);
				return;
			case FairnessPackage.SUMMATION__BODY:
				setBody((OperatorComponent)null);
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
			case FairnessPackage.SUMMATION__START_RANGE:
				return startRange != null;
			case FairnessPackage.SUMMATION__END_RANGE:
				return endRange != null;
			case FairnessPackage.SUMMATION__BODY:
				return body != null;
		}
		return super.eIsSet(featureID);
	}

} //SummationImpl
