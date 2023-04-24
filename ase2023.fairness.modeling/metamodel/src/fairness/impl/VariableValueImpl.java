/**
 */
package fairness.impl;

import fairness.EqualityOperator;
import fairness.FairnessPackage;
import fairness.VariableValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fairness.impl.VariableValueImpl#isRelativeToDatasetSize <em>Relative To Dataset Size</em>}</li>
 *   <li>{@link fairness.impl.VariableValueImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableValueImpl extends NamedElementImpl implements VariableValue {
	/**
	 * The default value of the '{@link #isRelativeToDatasetSize() <em>Relative To Dataset Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRelativeToDatasetSize()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RELATIVE_TO_DATASET_SIZE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRelativeToDatasetSize() <em>Relative To Dataset Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRelativeToDatasetSize()
	 * @generated
	 * @ordered
	 */
	protected boolean relativeToDatasetSize = RELATIVE_TO_DATASET_SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected EqualityOperator operator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FairnessPackage.Literals.VARIABLE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRelativeToDatasetSize() {
		return relativeToDatasetSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativeToDatasetSize(boolean newRelativeToDatasetSize) {
		boolean oldRelativeToDatasetSize = relativeToDatasetSize;
		relativeToDatasetSize = newRelativeToDatasetSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FairnessPackage.VARIABLE_VALUE__RELATIVE_TO_DATASET_SIZE, oldRelativeToDatasetSize, relativeToDatasetSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqualityOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperator(EqualityOperator newOperator, NotificationChain msgs) {
		EqualityOperator oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FairnessPackage.VARIABLE_VALUE__OPERATOR, oldOperator, newOperator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(EqualityOperator newOperator) {
		if (newOperator != operator) {
			NotificationChain msgs = null;
			if (operator != null)
				msgs = ((InternalEObject)operator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FairnessPackage.VARIABLE_VALUE__OPERATOR, null, msgs);
			if (newOperator != null)
				msgs = ((InternalEObject)newOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FairnessPackage.VARIABLE_VALUE__OPERATOR, null, msgs);
			msgs = basicSetOperator(newOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FairnessPackage.VARIABLE_VALUE__OPERATOR, newOperator, newOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FairnessPackage.VARIABLE_VALUE__OPERATOR:
				return basicSetOperator(null, msgs);
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
			case FairnessPackage.VARIABLE_VALUE__RELATIVE_TO_DATASET_SIZE:
				return isRelativeToDatasetSize();
			case FairnessPackage.VARIABLE_VALUE__OPERATOR:
				return getOperator();
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
			case FairnessPackage.VARIABLE_VALUE__RELATIVE_TO_DATASET_SIZE:
				setRelativeToDatasetSize((Boolean)newValue);
				return;
			case FairnessPackage.VARIABLE_VALUE__OPERATOR:
				setOperator((EqualityOperator)newValue);
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
			case FairnessPackage.VARIABLE_VALUE__RELATIVE_TO_DATASET_SIZE:
				setRelativeToDatasetSize(RELATIVE_TO_DATASET_SIZE_EDEFAULT);
				return;
			case FairnessPackage.VARIABLE_VALUE__OPERATOR:
				setOperator((EqualityOperator)null);
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
			case FairnessPackage.VARIABLE_VALUE__RELATIVE_TO_DATASET_SIZE:
				return relativeToDatasetSize != RELATIVE_TO_DATASET_SIZE_EDEFAULT;
			case FairnessPackage.VARIABLE_VALUE__OPERATOR:
				return operator != null;
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
		result.append(" (relativeToDatasetSize: ");
		result.append(relativeToDatasetSize);
		result.append(')');
		return result.toString();
	}

} //VariableValueImpl
