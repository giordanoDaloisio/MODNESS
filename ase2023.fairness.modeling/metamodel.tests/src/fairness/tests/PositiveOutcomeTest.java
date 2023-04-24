/**
 */
package fairness.tests;

import fairness.FairnessFactory;
import fairness.PositiveOutcome;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Positive Outcome</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PositiveOutcomeTest extends TestCase {

	/**
	 * The fixture for this Positive Outcome test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositiveOutcome fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PositiveOutcomeTest.class);
	}

	/**
	 * Constructs a new Positive Outcome test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveOutcomeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Positive Outcome test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PositiveOutcome fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Positive Outcome test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositiveOutcome getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FairnessFactory.eINSTANCE.createPositiveOutcome());
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

} //PositiveOutcomeTest
