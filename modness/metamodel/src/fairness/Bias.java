/**
 */
package fairness;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bias</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fairness.Bias#getDomain <em>Domain</em>}</li>
 *   <li>{@link fairness.Bias#getSource <em>Source</em>}</li>
 *   <li>{@link fairness.Bias#getSensitiveVariables <em>Sensitive Variables</em>}</li>
 *   <li>{@link fairness.Bias#getPositiveOutcome <em>Positive Outcome</em>}</li>
 *   <li>{@link fairness.Bias#getUnprivilegedGroup <em>Unprivileged Group</em>}</li>
 *   <li>{@link fairness.Bias#getPrivilegedGroup <em>Privileged Group</em>}</li>
 * </ul>
 *
 * @see fairness.FairnessPackage#getBias()
 * @model abstract="true"
 * @generated
 */
public interface Bias extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' attribute.
	 * @see #setDomain(String)
	 * @see fairness.FairnessPackage#getBias_Domain()
	 * @model required="true"
	 * @generated
	 */
	String getDomain();

	/**
	 * Sets the value of the '{@link fairness.Bias#getDomain <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' attribute.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute list.
	 * The list contents are of type {@link fairness.BiasSource}.
	 * The literals are from the enumeration {@link fairness.BiasSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute list.
	 * @see fairness.BiasSource
	 * @see fairness.FairnessPackage#getBias_Source()
	 * @model required="true"
	 * @generated
	 */
	EList<BiasSource> getSource();

	/**
	 * Returns the value of the '<em><b>Sensitive Variables</b></em>' containment reference list.
	 * The list contents are of type {@link fairness.SensitiveVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensitive Variables</em>' containment reference list.
	 * @see fairness.FairnessPackage#getBias_SensitiveVariables()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SensitiveVariable> getSensitiveVariables();

	/**
	 * Returns the value of the '<em><b>Positive Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positive Outcome</em>' containment reference.
	 * @see #setPositiveOutcome(PositiveOutcome)
	 * @see fairness.FairnessPackage#getBias_PositiveOutcome()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PositiveOutcome getPositiveOutcome();

	/**
	 * Sets the value of the '{@link fairness.Bias#getPositiveOutcome <em>Positive Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positive Outcome</em>' containment reference.
	 * @see #getPositiveOutcome()
	 * @generated
	 */
	void setPositiveOutcome(PositiveOutcome value);

	/**
	 * Returns the value of the '<em><b>Unprivileged Group</b></em>' containment reference list.
	 * The list contents are of type {@link fairness.SensitiveGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unprivileged Group</em>' containment reference list.
	 * @see fairness.FairnessPackage#getBias_UnprivilegedGroup()
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
	 * @see fairness.FairnessPackage#getBias_PrivilegedGroup()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SensitiveGroup> getPrivilegedGroup();

} // Bias
