/**
 */
package fairness.impl;

import fairness.FairnessPackage;
import fairness.SensitiveGroup;
import fairness.SensitiveVariableValue;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensitive Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fairness.impl.SensitiveGroupImpl#getSensitiveValue <em>Sensitive Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensitiveGroupImpl extends NamedElementImpl implements SensitiveGroup {
	/**
	 * The cached value of the '{@link #getSensitiveValue() <em>Sensitive Value</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensitiveValue()
	 * @generated
	 * @ordered
	 */
	protected EList<SensitiveVariableValue> sensitiveValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensitiveGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FairnessPackage.Literals.SENSITIVE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SensitiveVariableValue> getSensitiveValue() {
		if (sensitiveValue == null) {
			sensitiveValue = new EObjectResolvingEList<SensitiveVariableValue>(SensitiveVariableValue.class, this, FairnessPackage.SENSITIVE_GROUP__SENSITIVE_VALUE);
		}
		return sensitiveValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FairnessPackage.SENSITIVE_GROUP__SENSITIVE_VALUE:
				return getSensitiveValue();
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
			case FairnessPackage.SENSITIVE_GROUP__SENSITIVE_VALUE:
				getSensitiveValue().clear();
				getSensitiveValue().addAll((Collection<? extends SensitiveVariableValue>)newValue);
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
			case FairnessPackage.SENSITIVE_GROUP__SENSITIVE_VALUE:
				getSensitiveValue().clear();
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
			case FairnessPackage.SENSITIVE_GROUP__SENSITIVE_VALUE:
				return sensitiveValue != null && !sensitiveValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SensitiveGroupImpl
