/**
 */
package fairness.tests;

import fairness.DatasetSensitiveGroup;
import fairness.FairnessFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dataset Sensitive Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatasetSensitiveGroupTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DatasetSensitiveGroupTest.class);
	}

	/**
	 * Constructs a new Dataset Sensitive Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetSensitiveGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Dataset Sensitive Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DatasetSensitiveGroup getFixture() {
		return (DatasetSensitiveGroup)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FairnessFactory.eINSTANCE.createDatasetSensitiveGroup());
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

} //DatasetSensitiveGroupTest
