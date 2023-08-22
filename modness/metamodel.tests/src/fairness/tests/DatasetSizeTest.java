/**
 */
package fairness.tests;

import fairness.DatasetSize;
import fairness.FairnessFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dataset Size</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatasetSizeTest extends FunctionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DatasetSizeTest.class);
	}

	/**
	 * Constructs a new Dataset Size test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetSizeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Dataset Size test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DatasetSize getFixture() {
		return (DatasetSize)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FairnessFactory.eINSTANCE.createDatasetSize());
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

} //DatasetSizeTest
