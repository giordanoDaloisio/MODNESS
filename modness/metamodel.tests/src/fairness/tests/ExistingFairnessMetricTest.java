/**
 */
package fairness.tests;

import fairness.ExistingFairnessMetric;
import fairness.FairnessFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Existing Fairness Metric</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExistingFairnessMetricTest extends FunctionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExistingFairnessMetricTest.class);
	}

	/**
	 * Constructs a new Existing Fairness Metric test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistingFairnessMetricTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Existing Fairness Metric test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExistingFairnessMetric getFixture() {
		return (ExistingFairnessMetric)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FairnessFactory.eINSTANCE.createExistingFairnessMetric());
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

} //ExistingFairnessMetricTest
