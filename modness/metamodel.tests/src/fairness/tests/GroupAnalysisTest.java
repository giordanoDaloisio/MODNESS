/**
 */
package fairness.tests;

import fairness.FairnessFactory;
import fairness.GroupAnalysis;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Group Analysis</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GroupAnalysisTest extends AnalysisTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GroupAnalysisTest.class);
	}

	/**
	 * Constructs a new Group Analysis test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupAnalysisTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Group Analysis test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GroupAnalysis getFixture() {
		return (GroupAnalysis)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FairnessFactory.eINSTANCE.createGroupAnalysis());
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

} //GroupAnalysisTest
