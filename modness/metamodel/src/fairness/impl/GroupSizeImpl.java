/**
 */
package fairness.impl;

import fairness.FairnessPackage;
import fairness.GroupSize;
import fairness.LogicalCondition;

import fairness.Variable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group Size</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fairness.impl.GroupSizeImpl#getGroupCondition <em>Group Condition</em>}</li>
 *   <li>{@link fairness.impl.GroupSizeImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupSizeImpl extends FunctionImpl implements GroupSize {
	/**
	 * The cached value of the '{@link #getGroupCondition() <em>Group Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupCondition()
	 * @generated
	 * @ordered
	 */
	protected LogicalCondition groupCondition;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable variable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupSizeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FairnessPackage.Literals.GROUP_SIZE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalCondition getGroupCondition() {
		return groupCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupCondition(LogicalCondition newGroupCondition, NotificationChain msgs) {
		LogicalCondition oldGroupCondition = groupCondition;
		groupCondition = newGroupCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FairnessPackage.GROUP_SIZE__GROUP_CONDITION, oldGroupCondition, newGroupCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupCondition(LogicalCondition newGroupCondition) {
		if (newGroupCondition != groupCondition) {
			NotificationChain msgs = null;
			if (groupCondition != null)
				msgs = ((InternalEObject)groupCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FairnessPackage.GROUP_SIZE__GROUP_CONDITION, null, msgs);
			if (newGroupCondition != null)
				msgs = ((InternalEObject)newGroupCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FairnessPackage.GROUP_SIZE__GROUP_CONDITION, null, msgs);
			msgs = basicSetGroupCondition(newGroupCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FairnessPackage.GROUP_SIZE__GROUP_CONDITION, newGroupCondition, newGroupCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getVariable() {
		if (variable != null && variable.eIsProxy()) {
			InternalEObject oldVariable = (InternalEObject)variable;
			variable = (Variable)eResolveProxy(oldVariable);
			if (variable != oldVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FairnessPackage.GROUP_SIZE__VARIABLE, oldVariable, variable));
			}
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(Variable newVariable) {
		Variable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FairnessPackage.GROUP_SIZE__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FairnessPackage.GROUP_SIZE__GROUP_CONDITION:
				return basicSetGroupCondition(null, msgs);
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
			case FairnessPackage.GROUP_SIZE__GROUP_CONDITION:
				return getGroupCondition();
			case FairnessPackage.GROUP_SIZE__VARIABLE:
				if (resolve) return getVariable();
				return basicGetVariable();
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
			case FairnessPackage.GROUP_SIZE__GROUP_CONDITION:
				setGroupCondition((LogicalCondition)newValue);
				return;
			case FairnessPackage.GROUP_SIZE__VARIABLE:
				setVariable((Variable)newValue);
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
			case FairnessPackage.GROUP_SIZE__GROUP_CONDITION:
				setGroupCondition((LogicalCondition)null);
				return;
			case FairnessPackage.GROUP_SIZE__VARIABLE:
				setVariable((Variable)null);
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
			case FairnessPackage.GROUP_SIZE__GROUP_CONDITION:
				return groupCondition != null;
			case FairnessPackage.GROUP_SIZE__VARIABLE:
				return variable != null;
		}
		return super.eIsSet(featureID);
	}

} //GroupSizeImpl
