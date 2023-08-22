/**
 */
package fairness.tests;

import fairness.FairnessFactory;
import fairness.Logaritm;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Logaritm</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogaritmTest extends FunctionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LogaritmTest.class);
	}

	/**
	 * Constructs a new Logaritm test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogaritmTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Logaritm test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Logaritm getFixture() {
		return (Logaritm)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FairnessFactory.eINSTANCE.createLogaritm());
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

} //LogaritmTest
