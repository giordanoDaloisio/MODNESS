/**
 */
package fairness.tests;

import fairness.ExistingIndividualFairnessMetric;
import fairness.FairnessFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Existing Individual Fairness Metric</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExistingIndividualFairnessMetricTest extends FunctionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExistingIndividualFairnessMetricTest.class);
	}

	/**
	 * Constructs a new Existing Individual Fairness Metric test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistingIndividualFairnessMetricTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Existing Individual Fairness Metric test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExistingIndividualFairnessMetric getFixture() {
		return (ExistingIndividualFairnessMetric)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FairnessFactory.eINSTANCE.createExistingIndividualFairnessMetric());
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

} //ExistingIndividualFairnessMetricTest
