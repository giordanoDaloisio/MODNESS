/**
 */
package fairness.tests;

import fairness.FairnessFactory;
import fairness.LogicalCondition;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Logical Condition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogicalConditionTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LogicalConditionTest.class);
	}

	/**
	 * Constructs a new Logical Condition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalConditionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Logical Condition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LogicalCondition getFixture() {
		return (LogicalCondition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FairnessFactory.eINSTANCE.createLogicalCondition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //LogicalConditionTest
