/**
 */
package fairness;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Individual Bias</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fairness.IndividualBias#getIndividualAnalysis <em>Individual Analysis</em>}</li>
 * </ul>
 *
 * @see fairness.FairnessPackage#getIndividualBias()
 * @model
 * @generated
 */
public interface IndividualBias extends Bias {

	/**
	 * Returns the value of the '<em><b>Individual Analysis</b></em>' containment reference list.
	 * The list contents are of type {@link fairness.IndividualAnalysis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual Analysis</em>' containment reference list.
	 * @see fairness.FairnessPackage#getIndividualBias_IndividualAnalysis()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<IndividualAnalysis> getIndividualAnalysis();

} // IndividualBias
