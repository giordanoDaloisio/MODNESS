/**
 */
package fairness;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Range Operator Parameter</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fairness.FairnessPackage#getRangeOperatorParameter()
 * @model
 * @generated
 */
public enum RangeOperatorParameter implements Enumerator {
	/**
	 * The '<em><b>IN INCLUDED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_INCLUDED_VALUE
	 * @generated
	 * @ordered
	 */
	IN_INCLUDED(0, "IN_INCLUDED", "IN_INCLUDED"),

	/**
	 * The '<em><b>IN EXCLUDED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_EXCLUDED_VALUE
	 * @generated
	 * @ordered
	 */
	IN_EXCLUDED(1, "IN_EXCLUDED", "IN_EXCLUDED"),

	/**
	 * The '<em><b>IN LOWER INCLUDED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_LOWER_INCLUDED_VALUE
	 * @generated
	 * @ordered
	 */
	IN_LOWER_INCLUDED(2, "IN_LOWER_INCLUDED", "IN_LOWER_INCLUDED"),

	/**
	 * The '<em><b>IN GREATER INCLUDED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_GREATER_INCLUDED_VALUE
	 * @generated
	 * @ordered
	 */
	IN_GREATER_INCLUDED(3, "IN_GREATER_INCLUDED", "IN_GREATER_INCLUDED");

	/**
	 * The '<em><b>IN INCLUDED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_INCLUDED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IN_INCLUDED_VALUE = 0;

	/**
	 * The '<em><b>IN EXCLUDED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_EXCLUDED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IN_EXCLUDED_VALUE = 1;

	/**
	 * The '<em><b>IN LOWER INCLUDED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_LOWER_INCLUDED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IN_LOWER_INCLUDED_VALUE = 2;

	/**
	 * The '<em><b>IN GREATER INCLUDED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_GREATER_INCLUDED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IN_GREATER_INCLUDED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Range Operator Parameter</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RangeOperatorParameter[] VALUES_ARRAY =
		new RangeOperatorParameter[] {
			IN_INCLUDED,
			IN_EXCLUDED,
			IN_LOWER_INCLUDED,
			IN_GREATER_INCLUDED,
		};

	/**
	 * A public read-only list of all the '<em><b>Range Operator Parameter</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RangeOperatorParameter> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Range Operator Parameter</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RangeOperatorParameter get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RangeOperatorParameter result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Range Operator Parameter</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RangeOperatorParameter getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RangeOperatorParameter result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Range Operator Parameter</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RangeOperatorParameter get(int value) {
		switch (value) {
			case IN_INCLUDED_VALUE: return IN_INCLUDED;
			case IN_EXCLUDED_VALUE: return IN_EXCLUDED;
			case IN_LOWER_INCLUDED_VALUE: return IN_LOWER_INCLUDED;
			case IN_GREATER_INCLUDED_VALUE: return IN_GREATER_INCLUDED;
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
	private RangeOperatorParameter(int value, String name, String literal) {
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
	
} //RangeOperatorParameter
