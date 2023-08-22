/**
 */
package fairness;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Existing Fairness Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fairness.ExistingFairnessMetric#getMetric <em>Metric</em>}</li>
 * </ul>
 *
 * @see fairness.FairnessPackage#getExistingFairnessMetric()
 * @model
 * @generated
 */
public interface ExistingFairnessMetric extends Function {

	/**
	 * Returns the value of the '<em><b>Metric</b></em>' attribute.
	 * The literals are from the enumeration {@link fairness.FairnessMetric}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' attribute.
	 * @see fairness.FairnessMetric
	 * @see #setMetric(FairnessMetric)
	 * @see fairness.FairnessPackage#getExistingFairnessMetric_Metric()
	 * @model required="true"
	 * @generated
	 */
	FairnessMetric getMetric();

	/**
	 * Sets the value of the '{@link fairness.ExistingFairnessMetric#getMetric <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' attribute.
	 * @see fairness.FairnessMetric
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(FairnessMetric value);
} // ExistingFairnessMetric
