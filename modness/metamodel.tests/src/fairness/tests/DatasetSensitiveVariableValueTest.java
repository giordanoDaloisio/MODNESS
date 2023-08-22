/**
 */
package fairness.tests;

import fairness.DatasetSensitiveVariableValue;
import fairness.FairnessFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dataset Sensitive Variable Value</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatasetSensitiveVariableValueTest extends VariableValueTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DatasetSensitiveVariableValueTest.class);
	}

	/**
	 * Constructs a new Dataset Sensitive Variable Value test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetSensitiveVariableValueTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Dataset Sensitive Variable Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DatasetSensitiveVariableValue getFixture() {
		return (DatasetSensitiveVariableValue)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FairnessFactory.eINSTANCE.createDatasetSensitiveVariableValue());
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

} //DatasetSensitiveVariableValueTest
