/**
 */
package fairness.tests;

import fairness.DatasetSensitiveVariable;
import fairness.FairnessFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dataset Sensitive Variable</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatasetSensitiveVariableTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DatasetSensitiveVariableTest.class);
	}

	/**
	 * Constructs a new Dataset Sensitive Variable test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetSensitiveVariableTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Dataset Sensitive Variable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DatasetSensitiveVariable getFixture() {
		return (DatasetSensitiveVariable)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FairnessFactory.eINSTANCE.createDatasetSensitiveVariable());
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

} //DatasetSensitiveVariableTest
