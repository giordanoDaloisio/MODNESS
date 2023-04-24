/**
 */
package fairness;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fairness.OperatorComponent#getFunction <em>Function</em>}</li>
 *   <li>{@link fairness.OperatorComponent#getOperationvalue <em>Operationvalue</em>}</li>
 * </ul>
 *
 * @see fairness.FairnessPackage#getOperatorComponent()
 * @model
 * @generated
 */
public interface OperatorComponent extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference.
	 * @see #setFunction(Function)
	 * @see fairness.FairnessPackage#getOperatorComponent_Function()
	 * @model containment="true"
	 * @generated
	 */
	Function getFunction();

	/**
	 * Sets the value of the '{@link fairness.OperatorComponent#getFunction <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' containment reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(Function value);

	/**
	 * Returns the value of the '<em><b>Operationvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operationvalue</em>' containment reference.
	 * @see #setOperationvalue(OperationValue)
	 * @see fairness.FairnessPackage#getOperatorComponent_Operationvalue()
	 * @model containment="true"
	 * @generated
	 */
	OperationValue getOperationvalue();

	/**
	 * Sets the value of the '{@link fairness.OperatorComponent#getOperationvalue <em>Operationvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operationvalue</em>' containment reference.
	 * @see #getOperationvalue()
	 * @generated
	 */
	void setOperationvalue(OperationValue value);

} // OperatorComponent
