/**
 */
package fairness.impl;

import fairness.DatasetSensitiveGroup;
import fairness.FairnessPackage;
import fairness.LogicalCondition;
import fairness.SubLogicalCondition;
import fairness.VariableValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fairness.impl.LogicalConditionImpl#getSublogicalcondition <em>Sublogicalcondition</em>}</li>
 *   <li>{@link fairness.impl.LogicalConditionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link fairness.impl.LogicalConditionImpl#getSensitivegroup <em>Sensitivegroup</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalConditionImpl extends NamedElementImpl implements LogicalCondition {
	/**
	 * The cached value of the '{@link #getSublogicalcondition() <em>Sublogicalcondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSublogicalcondition()
	 * @generated
	 * @ordered
	 */
	protected SubLogicalCondition sublogicalcondition;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected VariableValue value;

	/**
	 * The cached value of the '{@link #getSensitivegroup() <em>Sensitivegroup</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensitivegroup()
	 * @generated
	 * @ordered
	 */
	protected DatasetSensitiveGroup sensitivegroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FairnessPackage.Literals.LOGICAL_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubLogicalCondition getSublogicalcondition() {
		return sublogicalcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSublogicalcondition(SubLogicalCondition newSublogicalcondition, NotificationChain msgs) {
		SubLogicalCondition oldSublogicalcondition = sublogicalcondition;
		sublogicalcondition = newSublogicalcondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FairnessPackage.LOGICAL_CONDITION__SUBLOGICALCONDITION, oldSublogicalcondition, newSublogicalcondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSublogicalcondition(SubLogicalCondition newSublogicalcondition) {
		if (newSublogicalcondition != sublogicalcondition) {
			NotificationChain msgs = null;
			if (sublogicalcondition != null)
				msgs = ((InternalEObject)sublogicalcondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FairnessPackage.LOGICAL_CONDITION__SUBLOGICALCONDITION, null, msgs);
			if (newSublogicalcondition != null)
				msgs = ((InternalEObject)newSublogicalcondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FairnessPackage.LOGICAL_CONDITION__SUBLOGICALCONDITION, null, msgs);
			msgs = basicSetSublogicalcondition(newSublogicalcondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FairnessPackage.LOGICAL_CONDITION__SUBLOGICALCONDITION, newSublogicalcondition, newSublogicalcondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableValue getValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject)value;
			value = (VariableValue)eResolveProxy(oldValue);
			if (value != oldValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FairnessPackage.LOGICAL_CONDITION__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableValue basicGetValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(VariableValue newValue) {
		VariableValue oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FairnessPackage.LOGICAL_CONDITION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetSensitiveGroup getSensitivegroup() {
		if (sensitivegroup != null && sensitivegroup.eIsProxy()) {
			InternalEObject oldSensitivegroup = (InternalEObject)sensitivegroup;
			sensitivegroup = (DatasetSensitiveGroup)eResolveProxy(oldSensitivegroup);
			if (sensitivegroup != oldSensitivegroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FairnessPackage.LOGICAL_CONDITION__SENSITIVEGROUP, oldSensitivegroup, sensitivegroup));
			}
		}
		return sensitivegroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetSensitiveGroup basicGetSensitivegroup() {
		return sensitivegroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensitivegroup(DatasetSensitiveGroup newSensitivegroup) {
		DatasetSensitiveGroup oldSensitivegroup = sensitivegroup;
		sensitivegroup = newSensitivegroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FairnessPackage.LOGICAL_CONDITION__SENSITIVEGROUP, oldSensitivegroup, sensitivegroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FairnessPackage.LOGICAL_CONDITION__SUBLOGICALCONDITION:
				return basicSetSublogicalcondition(null, msgs);
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
			case FairnessPackage.LOGICAL_CONDITION__SUBLOGICALCONDITION:
				return getSublogicalcondition();
			case FairnessPackage.LOGICAL_CONDITION__VALUE:
				if (resolve) return getValue();
				return basicGetValue();
			case FairnessPackage.LOGICAL_CONDITION__SENSITIVEGROUP:
				if (resolve) return getSensitivegroup();
				return basicGetSensitivegroup();
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
			case FairnessPackage.LOGICAL_CONDITION__SUBLOGICALCONDITION:
				setSublogicalcondition((SubLogicalCondition)newValue);
				return;
			case FairnessPackage.LOGICAL_CONDITION__VALUE:
				setValue((VariableValue)newValue);
				return;
			case FairnessPackage.LOGICAL_CONDITION__SENSITIVEGROUP:
				setSensitivegroup((DatasetSensitiveGroup)newValue);
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
			case FairnessPackage.LOGICAL_CONDITION__SUBLOGICALCONDITION:
				setSublogicalcondition((SubLogicalCondition)null);
				return;
			case FairnessPackage.LOGICAL_CONDITION__VALUE:
				setValue((VariableValue)null);
				return;
			case FairnessPackage.LOGICAL_CONDITION__SENSITIVEGROUP:
				setSensitivegroup((DatasetSensitiveGroup)null);
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
			case FairnessPackage.LOGICAL_CONDITION__SUBLOGICALCONDITION:
				return sublogicalcondition != null;
			case FairnessPackage.LOGICAL_CONDITION__VALUE:
				return value != null;
			case FairnessPackage.LOGICAL_CONDITION__SENSITIVEGROUP:
				return sensitivegroup != null;
		}
		return super.eIsSet(featureID);
	}

} //LogicalConditionImpl
