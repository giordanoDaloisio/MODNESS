/**
 */
package fairness;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Existing Group Fairness Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fairness.ExistingGroupFairnessMetric#getMetric <em>Metric</em>}</li>
 * </ul>
 *
 * @see fairness.FairnessPackage#getExistingGroupFairnessMetric()
 * @model
 * @generated
 */
public interface ExistingGroupFairnessMetric extends Function {
	/**
	 * Returns the value of the '<em><b>Metric</b></em>' attribute.
	 * The literals are from the enumeration {@link fairness.GroupFairnessMetric}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' attribute.
	 * @see fairness.GroupFairnessMetric
	 * @see #setMetric(GroupFairnessMetric)
	 * @see fairness.FairnessPackage#getExistingGroupFairnessMetric_Metric()
	 * @model required="true"
	 * @generated
	 */
	GroupFairnessMetric getMetric();

	/**
	 * Sets the value of the '{@link fairness.ExistingGroupFairnessMetric#getMetric <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' attribute.
	 * @see fairness.GroupFairnessMetric
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(GroupFairnessMetric value);

} // ExistingGroupFairnessMetric
