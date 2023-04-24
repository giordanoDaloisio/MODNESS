/**
 */
package fairness.impl;

import fairness.Bias;
import fairness.BiasSource;
import fairness.FairnessPackage;
import fairness.PositiveOutcome;
import fairness.SensitiveVariable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bias</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fairness.impl.BiasImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link fairness.impl.BiasImpl#getSource <em>Source</em>}</li>
 *   <li>{@link fairness.impl.BiasImpl#getSensitiveVariables <em>Sensitive Variables</em>}</li>
 *   <li>{@link fairness.impl.BiasImpl#getPositiveOutcome <em>Positive Outcome</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BiasImpl extends NamedElementImpl implements Bias {
	/**
	 * The default value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected String domain = DOMAIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<BiasSource> source;

	/**
	 * The cached value of the '{@link #getSensitiveVariables() <em>Sensitive Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensitiveVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<SensitiveVariable> sensitiveVariables;

	/**
	 * The cached value of the '{@link #getPositiveOutcome() <em>Positive Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositiveOutcome()
	 * @generated
	 * @ordered
	 */
	protected PositiveOutcome positiveOutcome;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BiasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FairnessPackage.Literals.BIAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(String newDomain) {
		String oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FairnessPackage.BIAS__DOMAIN, oldDomain, domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BiasSource> getSource() {
		if (source == null) {
			source = new EDataTypeUniqueEList<BiasSource>(BiasSource.class, this, FairnessPackage.BIAS__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SensitiveVariable> getSensitiveVariables() {
		if (sensitiveVariables == null) {
			sensitiveVariables = new EObjectContainmentEList<SensitiveVariable>(SensitiveVariable.class, this, FairnessPackage.BIAS__SENSITIVE_VARIABLES);
		}
		return sensitiveVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveOutcome getPositiveOutcome() {
		return positiveOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositiveOutcome(PositiveOutcome newPositiveOutcome, NotificationChain msgs) {
		PositiveOutcome oldPositiveOutcome = positiveOutcome;
		positiveOutcome = newPositiveOutcome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FairnessPackage.BIAS__POSITIVE_OUTCOME, oldPositiveOutcome, newPositiveOutcome);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositiveOutcome(PositiveOutcome newPositiveOutcome) {
		if (newPositiveOutcome != positiveOutcome) {
			NotificationChain msgs = null;
			if (positiveOutcome != null)
				msgs = ((InternalEObject)positiveOutcome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FairnessPackage.BIAS__POSITIVE_OUTCOME, null, msgs);
			if (newPositiveOutcome != null)
				msgs = ((InternalEObject)newPositiveOutcome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FairnessPackage.BIAS__POSITIVE_OUTCOME, null, msgs);
			msgs = basicSetPositiveOutcome(newPositiveOutcome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FairnessPackage.BIAS__POSITIVE_OUTCOME, newPositiveOutcome, newPositiveOutcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FairnessPackage.BIAS__SENSITIVE_VARIABLES:
				return ((InternalEList<?>)getSensitiveVariables()).basicRemove(otherEnd, msgs);
			case FairnessPackage.BIAS__POSITIVE_OUTCOME:
				return basicSetPositiveOutcome(null, msgs);
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
			case FairnessPackage.BIAS__DOMAIN:
				return getDomain();
			case FairnessPackage.BIAS__SOURCE:
				return getSource();
			case FairnessPackage.BIAS__SENSITIVE_VARIABLES:
				return getSensitiveVariables();
			case FairnessPackage.BIAS__POSITIVE_OUTCOME:
				return getPositiveOutcome();
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
			case FairnessPackage.BIAS__DOMAIN:
				setDomain((String)newValue);
				return;
			case FairnessPackage.BIAS__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends BiasSource>)newValue);
				return;
			case FairnessPackage.BIAS__SENSITIVE_VARIABLES:
				getSensitiveVariables().clear();
				getSensitiveVariables().addAll((Collection<? extends SensitiveVariable>)newValue);
				return;
			case FairnessPackage.BIAS__POSITIVE_OUTCOME:
				setPositiveOutcome((PositiveOutcome)newValue);
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
			case FairnessPackage.BIAS__DOMAIN:
				setDomain(DOMAIN_EDEFAULT);
				return;
			case FairnessPackage.BIAS__SOURCE:
				getSource().clear();
				return;
			case FairnessPackage.BIAS__SENSITIVE_VARIABLES:
				getSensitiveVariables().clear();
				return;
			case FairnessPackage.BIAS__POSITIVE_OUTCOME:
				setPositiveOutcome((PositiveOutcome)null);
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
			case FairnessPackage.BIAS__DOMAIN:
				return DOMAIN_EDEFAULT == null ? domain != null : !DOMAIN_EDEFAULT.equals(domain);
			case FairnessPackage.BIAS__SOURCE:
				return source != null && !source.isEmpty();
			case FairnessPackage.BIAS__SENSITIVE_VARIABLES:
				return sensitiveVariables != null && !sensitiveVariables.isEmpty();
			case FairnessPackage.BIAS__POSITIVE_OUTCOME:
				return positiveOutcome != null;
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
		result.append(" (domain: ");
		result.append(domain);
		result.append(", source: ");
		result.append(source);
		result.append(')');
		return result.toString();
	}

} //BiasImpl
