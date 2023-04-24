/**
 */
package fairness.impl;

import fairness.FairnessPackage;
import fairness.RangeOperator;
import fairness.RangeOperatorParameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fairness.impl.RangeOperatorImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link fairness.impl.RangeOperatorImpl#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link fairness.impl.RangeOperatorImpl#getGreaterValue <em>Greater Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RangeOperatorImpl extends EqualityOperatorImpl implements RangeOperator {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final RangeOperatorParameter OPERATOR_EDEFAULT = RangeOperatorParameter.IN_INCLUDED;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected RangeOperatorParameter operator = OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowerValue() <em>Lower Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerValue()
	 * @generated
	 * @ordered
	 */
	protected static final float LOWER_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLowerValue() <em>Lower Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerValue()
	 * @generated
	 * @ordered
	 */
	protected float lowerValue = LOWER_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGreaterValue() <em>Greater Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreaterValue()
	 * @generated
	 * @ordered
	 */
	protected static final float GREATER_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getGreaterValue() <em>Greater Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreaterValue()
	 * @generated
	 * @ordered
	 */
	protected float greaterValue = GREATER_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RangeOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FairnessPackage.Literals.RANGE_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeOperatorParameter getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(RangeOperatorParameter newOperator) {
		RangeOperatorParameter oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FairnessPackage.RANGE_OPERATOR__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLowerValue() {
		return lowerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerValue(float newLowerValue) {
		float oldLowerValue = lowerValue;
		lowerValue = newLowerValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FairnessPackage.RANGE_OPERATOR__LOWER_VALUE, oldLowerValue, lowerValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getGreaterValue() {
		return greaterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGreaterValue(float newGreaterValue) {
		float oldGreaterValue = greaterValue;
		greaterValue = newGreaterValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FairnessPackage.RANGE_OPERATOR__GREATER_VALUE, oldGreaterValue, greaterValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FairnessPackage.RANGE_OPERATOR__OPERATOR:
				return getOperator();
			case FairnessPackage.RANGE_OPERATOR__LOWER_VALUE:
				return getLowerValue();
			case FairnessPackage.RANGE_OPERATOR__GREATER_VALUE:
				return getGreaterValue();
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
			case FairnessPackage.RANGE_OPERATOR__OPERATOR:
				setOperator((RangeOperatorParameter)newValue);
				return;
			case FairnessPackage.RANGE_OPERATOR__LOWER_VALUE:
				setLowerValue((Float)newValue);
				return;
			case FairnessPackage.RANGE_OPERATOR__GREATER_VALUE:
				setGreaterValue((Float)newValue);
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
			case FairnessPackage.RANGE_OPERATOR__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case FairnessPackage.RANGE_OPERATOR__LOWER_VALUE:
				setLowerValue(LOWER_VALUE_EDEFAULT);
				return;
			case FairnessPackage.RANGE_OPERATOR__GREATER_VALUE:
				setGreaterValue(GREATER_VALUE_EDEFAULT);
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
			case FairnessPackage.RANGE_OPERATOR__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case FairnessPackage.RANGE_OPERATOR__LOWER_VALUE:
				return lowerValue != LOWER_VALUE_EDEFAULT;
			case FairnessPackage.RANGE_OPERATOR__GREATER_VALUE:
				return greaterValue != GREATER_VALUE_EDEFAULT;
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(", lowerValue: ");
		result.append(lowerValue);
		result.append(", greaterValue: ");
		result.append(greaterValue);
		result.append(')');
		return result.toString();
	}

} //RangeOperatorImpl
