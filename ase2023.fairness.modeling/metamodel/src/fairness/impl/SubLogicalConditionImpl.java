/**
 */
package fairness.impl;

import fairness.FairnessPackage;
import fairness.LogicalCondition;
import fairness.LogicalOperator;
import fairness.SubLogicalCondition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Logical Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fairness.impl.SubLogicalConditionImpl#getLogicalOperator <em>Logical Operator</em>}</li>
 *   <li>{@link fairness.impl.SubLogicalConditionImpl#getLogicalcondition <em>Logicalcondition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubLogicalConditionImpl extends NamedElementImpl implements SubLogicalCondition {
	/**
	 * The default value of the '{@link #getLogicalOperator() <em>Logical Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalOperator()
	 * @generated
	 * @ordered
	 */
	protected static final LogicalOperator LOGICAL_OPERATOR_EDEFAULT = LogicalOperator.AND;

	/**
	 * The cached value of the '{@link #getLogicalOperator() <em>Logical Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalOperator()
	 * @generated
	 * @ordered
	 */
	protected LogicalOperator logicalOperator = LOGICAL_OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLogicalcondition() <em>Logicalcondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalcondition()
	 * @generated
	 * @ordered
	 */
	protected LogicalCondition logicalcondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubLogicalConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FairnessPackage.Literals.SUB_LOGICAL_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalOperator getLogicalOperator() {
		return logicalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalOperator(LogicalOperator newLogicalOperator) {
		LogicalOperator oldLogicalOperator = logicalOperator;
		logicalOperator = newLogicalOperator == null ? LOGICAL_OPERATOR_EDEFAULT : newLogicalOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FairnessPackage.SUB_LOGICAL_CONDITION__LOGICAL_OPERATOR, oldLogicalOperator, logicalOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalCondition getLogicalcondition() {
		return logicalcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogicalcondition(LogicalCondition newLogicalcondition, NotificationChain msgs) {
		LogicalCondition oldLogicalcondition = logicalcondition;
		logicalcondition = newLogicalcondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FairnessPackage.SUB_LOGICAL_CONDITION__LOGICALCONDITION, oldLogicalcondition, newLogicalcondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalcondition(LogicalCondition newLogicalcondition) {
		if (newLogicalcondition != logicalcondition) {
			NotificationChain msgs = null;
			if (logicalcondition != null)
				msgs = ((InternalEObject)logicalcondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FairnessPackage.SUB_LOGICAL_CONDITION__LOGICALCONDITION, null, msgs);
			if (newLogicalcondition != null)
				msgs = ((InternalEObject)newLogicalcondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FairnessPackage.SUB_LOGICAL_CONDITION__LOGICALCONDITION, null, msgs);
			msgs = basicSetLogicalcondition(newLogicalcondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FairnessPackage.SUB_LOGICAL_CONDITION__LOGICALCONDITION, newLogicalcondition, newLogicalcondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FairnessPackage.SUB_LOGICAL_CONDITION__LOGICALCONDITION:
				return basicSetLogicalcondition(null, msgs);
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
			case FairnessPackage.SUB_LOGICAL_CONDITION__LOGICAL_OPERATOR:
				return getLogicalOperator();
			case FairnessPackage.SUB_LOGICAL_CONDITION__LOGICALCONDITION:
				return getLogicalcondition();
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
			case FairnessPackage.SUB_LOGICAL_CONDITION__LOGICAL_OPERATOR:
				setLogicalOperator((LogicalOperator)newValue);
				return;
			case FairnessPackage.SUB_LOGICAL_CONDITION__LOGICALCONDITION:
				setLogicalcondition((LogicalCondition)newValue);
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
			case FairnessPackage.SUB_LOGICAL_CONDITION__LOGICAL_OPERATOR:
				setLogicalOperator(LOGICAL_OPERATOR_EDEFAULT);
				return;
			case FairnessPackage.SUB_LOGICAL_CONDITION__LOGICALCONDITION:
				setLogicalcondition((LogicalCondition)null);
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
			case FairnessPackage.SUB_LOGICAL_CONDITION__LOGICAL_OPERATOR:
				return logicalOperator != LOGICAL_OPERATOR_EDEFAULT;
			case FairnessPackage.SUB_LOGICAL_CONDITION__LOGICALCONDITION:
				return logicalcondition != null;
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
		result.append(" (logicalOperator: ");
		result.append(logicalOperator);
		result.append(')');
		return result.toString();
	}

} //SubLogicalConditionImpl
