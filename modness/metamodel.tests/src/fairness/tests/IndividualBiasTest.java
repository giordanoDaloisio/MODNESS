/**
 */
package fairness.tests;

import fairness.FairnessFactory;
import fairness.IndividualBias;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Individual Bias</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IndividualBiasTest extends BiasTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IndividualBiasTest.class);
	}

	/**
	 * Constructs a new Individual Bias test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndividualBiasTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Individual Bias test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IndividualBias getFixture() {
		return (IndividualBias)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FairnessFactory.eINSTANCE.createIndividualBias());
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

} //IndividualBiasTest
