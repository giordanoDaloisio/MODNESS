/**
 */
package fairness.impl;

import fairness.FairnessPackage;
import fairness.IndividualAnalysis;
import fairness.IndividualBias;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Individual Bias</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fairness.impl.IndividualBiasImpl#getIndividualAnalysis <em>Individual Analysis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndividualBiasImpl extends BiasImpl implements IndividualBias {
	/**
	 * The cached value of the '{@link #getIndividualAnalysis() <em>Individual Analysis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividualAnalysis()
	 * @generated
	 * @ordered
	 */
	protected EList<IndividualAnalysis> individualAnalysis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndividualBiasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FairnessPackage.Literals.INDIVIDUAL_BIAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndividualAnalysis> getIndividualAnalysis() {
		if (individualAnalysis == null) {
			individualAnalysis = new EObjectContainmentEList<IndividualAnalysis>(IndividualAnalysis.class, this, FairnessPackage.INDIVIDUAL_BIAS__INDIVIDUAL_ANALYSIS);
		}
		return individualAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FairnessPackage.INDIVIDUAL_BIAS__INDIVIDUAL_ANALYSIS:
				return ((InternalEList<?>)getIndividualAnalysis()).basicRemove(otherEnd, msgs);
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
			case FairnessPackage.INDIVIDUAL_BIAS__INDIVIDUAL_ANALYSIS:
				return getIndividualAnalysis();
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
			case FairnessPackage.INDIVIDUAL_BIAS__INDIVIDUAL_ANALYSIS:
				getIndividualAnalysis().clear();
				getIndividualAnalysis().addAll((Collection<? extends IndividualAnalysis>)newValue);
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
			case FairnessPackage.INDIVIDUAL_BIAS__INDIVIDUAL_ANALYSIS:
				getIndividualAnalysis().clear();
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
			case FairnessPackage.INDIVIDUAL_BIAS__INDIVIDUAL_ANALYSIS:
				return individualAnalysis != null && !individualAnalysis.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IndividualBiasImpl
