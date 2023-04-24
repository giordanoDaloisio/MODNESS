/**
 */
package fairness.tests;

import fairness.DatasetPositiveOutcome;
import fairness.FairnessFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dataset Positive Outcome</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatasetPositiveOutcomeTest extends VariableValueTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DatasetPositiveOutcomeTest.class);
	}

	/**
	 * Constructs a new Dataset Positive Outcome test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetPositiveOutcomeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Dataset Positive Outcome test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DatasetPositiveOutcome getFixture() {
		return (DatasetPositiveOutcome)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FairnessFactory.eINSTANCE.createDatasetPositiveOutcome());
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

} //DatasetPositiveOutcomeTest
