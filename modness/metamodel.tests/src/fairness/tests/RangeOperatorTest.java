/**
 */
package fairness.tests;

import fairness.FairnessFactory;
import fairness.RangeOperator;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Range Operator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RangeOperatorTest extends EqualityOperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RangeOperatorTest.class);
	}

	/**
	 * Constructs a new Range Operator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeOperatorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Range Operator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RangeOperator getFixture() {
		return (RangeOperator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FairnessFactory.eINSTANCE.createRangeOperator());
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

} //RangeOperatorTest
