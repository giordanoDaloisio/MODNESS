/**
 */
package fairness.tests;

import fairness.FairnessFactory;
import fairness.GroupBias;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Group Bias</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GroupBiasTest extends BiasTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GroupBiasTest.class);
	}

	/**
	 * Constructs a new Group Bias test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupBiasTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Group Bias test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GroupBias getFixture() {
		return (GroupBias)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FairnessFactory.eINSTANCE.createGroupBias());
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

} //GroupBiasTest
