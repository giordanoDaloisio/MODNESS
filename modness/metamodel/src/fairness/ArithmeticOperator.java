/**
 */
package fairness;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Arithmetic Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fairness.FairnessPackage#getArithmeticOperator()
 * @model
 * @generated
 */
public enum ArithmeticOperator implements Enumerator {
	/**
	 * The '<em><b>SUM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUM_VALUE
	 * @generated
	 * @ordered
	 */
	SUM(0, "SUM", "SUM"),

	/**
	 * The '<em><b>DIFFERENCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIFFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	DIFFERENCE(1, "DIFFERENCE", "DIFFERENCE"),

	/**
	 * The '<em><b>MULTIPLICATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLICATION_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLICATION(2, "MULTIPLICATION", "MULTIPLICATION"),

	/**
	 * The '<em><b>RATIO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RATIO_VALUE
	 * @generated
	 * @ordered
	 */
	RATIO(3, "RATIO", "RATIO");

	/**
	 * The '<em><b>SUM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUM_VALUE = 0;

	/**
	 * The '<em><b>DIFFERENCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIFFERENCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIFFERENCE_VALUE = 1;

	/**
	 * The '<em><b>MULTIPLICATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLICATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLICATION_VALUE = 2;

	/**
	 * The '<em><b>RATIO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RATIO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_VALUE = 3;

	/**
	 * An array of all the '<em><b>Arithmetic Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ArithmeticOperator[] VALUES_ARRAY =
		new ArithmeticOperator[] {
			SUM,
			DIFFERENCE,
			MULTIPLICATION,
			RATIO,
		};

	/**
	 * A public read-only list of all the '<em><b>Arithmetic Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ArithmeticOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Arithmetic Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArithmeticOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArithmeticOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Arithmetic Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArithmeticOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArithmeticOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Arithmetic Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArithmeticOperator get(int value) {
		switch (value) {
			case SUM_VALUE: return SUM;
			case DIFFERENCE_VALUE: return DIFFERENCE;
			case MULTIPLICATION_VALUE: return MULTIPLICATION;
			case RATIO_VALUE: return RATIO;
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
	private ArithmeticOperator(int value, String name, String literal) {
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
	
} //ArithmeticOperator
