/**
 */
package fairness;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fairness.Label#getLabelvalue <em>Labelvalue</em>}</li>
 * </ul>
 *
 * @see fairness.FairnessPackage#getLabel()
 * @model abstract="true"
 * @generated
 */
public interface Label extends Variable {
	/**
	 * Returns the value of the '<em><b>Labelvalue</b></em>' containment reference list.
	 * The list contents are of type {@link fairness.LabelValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labelvalue</em>' containment reference list.
	 * @see fairness.FairnessPackage#getLabel_Labelvalue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<LabelValue> getLabelvalue();

} // Label
