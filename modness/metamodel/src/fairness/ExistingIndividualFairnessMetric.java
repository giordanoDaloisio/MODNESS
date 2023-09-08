/**
 */
package fairness;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Existing Individual Fairness Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fairness.ExistingIndividualFairnessMetric#getMetric <em>Metric</em>}</li>
 * </ul>
 *
 * @see fairness.FairnessPackage#getExistingIndividualFairnessMetric()
 * @model
 * @generated
 */
public interface ExistingIndividualFairnessMetric extends Function {
	/**
	 * Returns the value of the '<em><b>Metric</b></em>' attribute.
	 * The literals are from the enumeration {@link fairness.IndividualFairnessMetric}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' attribute.
	 * @see fairness.IndividualFairnessMetric
	 * @see #setMetric(IndividualFairnessMetric)
	 * @see fairness.FairnessPackage#getExistingIndividualFairnessMetric_Metric()
	 * @model required="true"
	 * @generated
	 */
	IndividualFairnessMetric getMetric();

	/**
	 * Sets the value of the '{@link fairness.ExistingIndividualFairnessMetric#getMetric <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' attribute.
	 * @see fairness.IndividualFairnessMetric
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(IndividualFairnessMetric value);

} // ExistingIndividualFairnessMetric
