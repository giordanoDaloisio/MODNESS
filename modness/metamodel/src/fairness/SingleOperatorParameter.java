/**
 */
package fairness;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Single Operator Parameter</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fairness.FairnessPackage#getSingleOperatorParameter()
 * @model
 * @generated
 */
public enum SingleOperatorParameter implements Enumerator {
	/**
	 * The '<em><b>EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	EQUAL(0, "EQUAL", "EQUAL"),

	/**
	 * The '<em><b>GREATER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER(1, "GREATER", "GREATER"),

	/**
	 * The '<em><b>MINOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINOR_VALUE
	 * @generated
	 * @ordered
	 */
	MINOR(2, "MINOR", "MINOR"),

	/**
	 * The '<em><b>GREATER EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER_EQUAL(3, "GREATER_EQUAL", "GREATER_EQUAL"),

	/**
	 * The '<em><b>MINOR EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINOR_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	MINOR_EQUAL(4, "MINOR_EQUAL", "MINOR_EQUAL"),

	/**
	 * The '<em><b>NOT EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_EQUAL(5, "NOT_EQUAL", "NOT_EQUAL");

	/**
	 * The '<em><b>EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EQUAL_VALUE = 0;

	/**
	 * The '<em><b>GREATER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_VALUE = 1;

	/**
	 * The '<em><b>MINOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MINOR_VALUE = 2;

	/**
	 * The '<em><b>GREATER EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_EQUAL_VALUE = 3;

	/**
	 * The '<em><b>MINOR EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINOR_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MINOR_EQUAL_VALUE = 4;

	/**
	 * The '<em><b>NOT EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_EQUAL_VALUE = 5;

	/**
	 * An array of all the '<em><b>Single Operator Parameter</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SingleOperatorParameter[] VALUES_ARRAY =
		new SingleOperatorParameter[] {
			EQUAL,
			GREATER,
			MINOR,
			GREATER_EQUAL,
			MINOR_EQUAL,
			NOT_EQUAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Single Operator Parameter</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SingleOperatorParameter> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Single Operator Parameter</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SingleOperatorParameter get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SingleOperatorParameter result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Single Operator Parameter</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SingleOperatorParameter getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SingleOperatorParameter result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Single Operator Parameter</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SingleOperatorParameter get(int value) {
		switch (value) {
			case EQUAL_VALUE: return EQUAL;
			case GREATER_VALUE: return GREATER;
			case MINOR_VALUE: return MINOR;
			case GREATER_EQUAL_VALUE: return GREATER_EQUAL;
			case MINOR_EQUAL_VALUE: return MINOR_EQUAL;
			case NOT_EQUAL_VALUE: return NOT_EQUAL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SingleOperatorParameter(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //SingleOperatorParameter
