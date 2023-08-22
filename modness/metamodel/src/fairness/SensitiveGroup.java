/**
 */
package fairness;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensitive Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fairness.SensitiveGroup#getSensitiveValue <em>Sensitive Value</em>}</li>
 * </ul>
 *
 * @see fairness.FairnessPackage#getSensitiveGroup()
 * @model
 * @generated
 */
public interface SensitiveGroup extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sensitive Value</b></em>' reference list.
	 * The list contents are of type {@link fairness.SensitiveVariableValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensitive Value</em>' reference list.
	 * @see fairness.FairnessPackage#getSensitiveGroup_SensitiveValue()
	 * @model required="true"
	 * @generated
	 */
	EList<SensitiveVariableValue> getSensitiveValue();

} // SensitiveGroup
