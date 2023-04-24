/**
 */
package fairness;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Bias</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fairness.GroupBias#getUnprivilegedGroup <em>Unprivileged Group</em>}</li>
 *   <li>{@link fairness.GroupBias#getPrivilegedGroup <em>Privileged Group</em>}</li>
 *   <li>{@link fairness.GroupBias#getAnalysis <em>Analysis</em>}</li>
 * </ul>
 *
 * @see fairness.FairnessPackage#getGroupBias()
 * @model
 * @generated
 */
public interface GroupBias extends Bias {
	/**
	 * Returns the value of the '<em><b>Unprivileged Group</b></em>' containment reference list.
	 * The list contents are of type {@link fairness.SensitiveGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unprivileged Group</em>' containment reference list.
	 * @see fairness.FairnessPackage#getGroupBias_UnprivilegedGroup()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SensitiveGroup> getUnprivilegedGroup();

	/**
	 * Returns the value of the '<em><b>Privileged Group</b></em>' containment reference list.
	 * The list contents are of type {@link fairness.SensitiveGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Privileged Group</em>' containment reference list.
	 * @see fairness.FairnessPackage#getGroupBias_PrivilegedGroup()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SensitiveGroup> getPrivilegedGroup();

	/**
	 * Returns the value of the '<em><b>Analysis</b></em>' containment reference list.
	 * The list contents are of type {@link fairness.GroupAnalysis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analysis</em>' containment reference list.
	 * @see fairness.FairnessPackage#getGroupBias_Analysis()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<GroupAnalysis> getAnalysis();

} // GroupBias
