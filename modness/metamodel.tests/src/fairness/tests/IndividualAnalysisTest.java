/**
 */
package fairness.tests;

import fairness.FairnessFactory;
import fairness.IndividualAnalysis;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Individual Analysis</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IndividualAnalysisTest extends AnalysisTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IndividualAnalysisTest.class);
	}

	/**
	 * Constructs a new Individual Analysis test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndividualAnalysisTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Individual Analysis test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IndividualAnalysis getFixture() {
		return (IndividualAnalysis)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FairnessFactory.eINSTANCE.createIndividualAnalysis());
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

} //IndividualAnalysisTest
