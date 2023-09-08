/**
 */
package fairness.impl;

import fairness.ExistingIndividualFairnessMetric;
import fairness.FairnessPackage;
import fairness.IndividualFairnessMetric;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Existing Individual Fairness Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fairness.impl.ExistingIndividualFairnessMetricImpl#getMetric <em>Metric</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExistingIndividualFairnessMetricImpl extends FunctionImpl implements ExistingIndividualFairnessMetric {
	/**
	 * The default value of the '{@link #getMetric() <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected static final IndividualFairnessMetric METRIC_EDEFAULT = IndividualFairnessMetric.MANHATTAN_DISTANCE;

	/**
	 * The cached value of the '{@link #getMetric() <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected IndividualFairnessMetric metric = METRIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExistingIndividualFairnessMetricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FairnessPackage.Literals.EXISTING_INDIVIDUAL_FAIRNESS_METRIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndividualFairnessMetric getMetric() {
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetric(IndividualFairnessMetric newMetric) {
		IndividualFairnessMetric oldMetric = metric;
		metric = newMetric == null ? METRIC_EDEFAULT : newMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FairnessPackage.EXISTING_INDIVIDUAL_FAIRNESS_METRIC__METRIC, oldMetric, metric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FairnessPackage.EXISTING_INDIVIDUAL_FAIRNESS_METRIC__METRIC:
				return getMetric();
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
			case FairnessPackage.EXISTING_INDIVIDUAL_FAIRNESS_METRIC__METRIC:
				setMetric((IndividualFairnessMetric)newValue);
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
			case FairnessPackage.EXISTING_INDIVIDUAL_FAIRNESS_METRIC__METRIC:
				setMetric(METRIC_EDEFAULT);
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
			case FairnessPackage.EXISTING_INDIVIDUAL_FAIRNESS_METRIC__METRIC:
				return metric != METRIC_EDEFAULT;
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
		result.append(" (metric: ");
		result.append(metric);
		result.append(')');
		return result.toString();
	}

} //ExistingIndividualFairnessMetricImpl
