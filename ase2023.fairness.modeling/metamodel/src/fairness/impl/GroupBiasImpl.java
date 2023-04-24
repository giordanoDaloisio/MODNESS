/**
 */
package fairness.impl;

import fairness.FairnessPackage;
import fairness.GroupAnalysis;
import fairness.GroupBias;
import fairness.SensitiveGroup;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group Bias</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fairness.impl.GroupBiasImpl#getUnprivilegedGroup <em>Unprivileged Group</em>}</li>
 *   <li>{@link fairness.impl.GroupBiasImpl#getPrivilegedGroup <em>Privileged Group</em>}</li>
 *   <li>{@link fairness.impl.GroupBiasImpl#getAnalysis <em>Analysis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupBiasImpl extends BiasImpl implements GroupBias {
	/**
	 * The cached value of the '{@link #getUnprivilegedGroup() <em>Unprivileged Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnprivilegedGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<SensitiveGroup> unprivilegedGroup;
	/**
	 * The cached value of the '{@link #getPrivilegedGroup() <em>Privileged Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivilegedGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<SensitiveGroup> privilegedGroup;
	/**
	 * The cached value of the '{@link #getAnalysis() <em>Analysis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysis()
	 * @generated
	 * @ordered
	 */
	protected EList<GroupAnalysis> analysis;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupBiasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FairnessPackage.Literals.GROUP_BIAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SensitiveGroup> getUnprivilegedGroup() {
		if (unprivilegedGroup == null) {
			unprivilegedGroup = new EObjectContainmentEList<SensitiveGroup>(SensitiveGroup.class, this, FairnessPackage.GROUP_BIAS__UNPRIVILEGED_GROUP);
		}
		return unprivilegedGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SensitiveGroup> getPrivilegedGroup() {
		if (privilegedGroup == null) {
			privilegedGroup = new EObjectContainmentEList<SensitiveGroup>(SensitiveGroup.class, this, FairnessPackage.GROUP_BIAS__PRIVILEGED_GROUP);
		}
		return privilegedGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GroupAnalysis> getAnalysis() {
		if (analysis == null) {
			analysis = new EObjectContainmentEList<GroupAnalysis>(GroupAnalysis.class, this, FairnessPackage.GROUP_BIAS__ANALYSIS);
		}
		return analysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FairnessPackage.GROUP_BIAS__UNPRIVILEGED_GROUP:
				return ((InternalEList<?>)getUnprivilegedGroup()).basicRemove(otherEnd, msgs);
			case FairnessPackage.GROUP_BIAS__PRIVILEGED_GROUP:
				return ((InternalEList<?>)getPrivilegedGroup()).basicRemove(otherEnd, msgs);
			case FairnessPackage.GROUP_BIAS__ANALYSIS:
				return ((InternalEList<?>)getAnalysis()).basicRemove(otherEnd, msgs);
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
			case FairnessPackage.GROUP_BIAS__UNPRIVILEGED_GROUP:
				return getUnprivilegedGroup();
			case FairnessPackage.GROUP_BIAS__PRIVILEGED_GROUP:
				return getPrivilegedGroup();
			case FairnessPackage.GROUP_BIAS__ANALYSIS:
				return getAnalysis();
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
			case FairnessPackage.GROUP_BIAS__UNPRIVILEGED_GROUP:
				getUnprivilegedGroup().clear();
				getUnprivilegedGroup().addAll((Collection<? extends SensitiveGroup>)newValue);
				return;
			case FairnessPackage.GROUP_BIAS__PRIVILEGED_GROUP:
				getPrivilegedGroup().clear();
				getPrivilegedGroup().addAll((Collection<? extends SensitiveGroup>)newValue);
				return;
			case FairnessPackage.GROUP_BIAS__ANALYSIS:
				getAnalysis().clear();
				getAnalysis().addAll((Collection<? extends GroupAnalysis>)newValue);
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
			case FairnessPackage.GROUP_BIAS__UNPRIVILEGED_GROUP:
				getUnprivilegedGroup().clear();
				return;
			case FairnessPackage.GROUP_BIAS__PRIVILEGED_GROUP:
				getPrivilegedGroup().clear();
				return;
			case FairnessPackage.GROUP_BIAS__ANALYSIS:
				getAnalysis().clear();
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
			case FairnessPackage.GROUP_BIAS__UNPRIVILEGED_GROUP:
				return unprivilegedGroup != null && !unprivilegedGroup.isEmpty();
			case FairnessPackage.GROUP_BIAS__PRIVILEGED_GROUP:
				return privilegedGroup != null && !privilegedGroup.isEmpty();
			case FairnessPackage.GROUP_BIAS__ANALYSIS:
				return analysis != null && !analysis.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GroupBiasImpl
