/**
 */
package fairness.tests;

import fairness.FairnessFactory;
import fairness.SensitiveGroup;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sensitive Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SensitiveGroupTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SensitiveGroupTest.class);
	}

	/**
	 * Constructs a new Sensitive Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensitiveGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sensitive Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SensitiveGroup getFixture() {
		return (SensitiveGroup)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FairnessFactory.eINSTANCE.createSensitiveGroup());
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

} //SensitiveGroupTest
