/**
 */
package fairness.tests;

import fairness.ExistingGroupFairnessMetric;
import fairness.FairnessFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Existing Group Fairness Metric</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExistingGroupFairnessMetricTest extends FunctionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExistingGroupFairnessMetricTest.class);
	}

	/**
	 * Constructs a new Existing Group Fairness Metric test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistingGroupFairnessMetricTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Existing Group Fairness Metric test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExistingGroupFairnessMetric getFixture() {
		return (ExistingGroupFairnessMetric)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FairnessFactory.eINSTANCE.createExistingGroupFairnessMetric());
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

} //ExistingGroupFairnessMetricTest
