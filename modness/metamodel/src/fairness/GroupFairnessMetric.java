/**
 */
package fairness;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Group Fairness Metric</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fairness.FairnessPackage#getGroupFairnessMetric()
 * @model
 * @generated
 */
public enum GroupFairnessMetric implements Enumerator {
	/**
	 * The '<em><b>STATISTICAL PARITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATISTICAL_PARITY_VALUE
	 * @generated
	 * @ordered
	 */
	STATISTICAL_PARITY(0, "STATISTICAL_PARITY", "STATISTICAL_PARITY"),

	/**
	 * The '<em><b>DISPARATE IMPACT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISPARATE_IMPACT_VALUE
	 * @generated
	 * @ordered
	 */
	DISPARATE_IMPACT(1, "DISPARATE_IMPACT", "DISPARATE_IMPACT"),

	/**
	 * The '<em><b>EQUALIZED ODDS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUALIZED_ODDS_VALUE
	 * @generated
	 * @ordered
	 */
	EQUALIZED_ODDS(2, "EQUALIZED_ODDS", "EQUALIZED_ODDS"),

	/**
	 * The '<em><b>EQUAL ACCURACY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL_ACCURACY_VALUE
	 * @generated
	 * @ordered
	 */
	EQUAL_ACCURACY(3, "EQUAL_ACCURACY", "EQUAL_ACCURACY"),

	/**
	 * The '<em><b>FALSE POSITIVE DIFFERENCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FALSE_POSITIVE_DIFFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	FALSE_POSITIVE_DIFFERENCE(4, "FALSE_POSITIVE_DIFFERENCE", "FALSE_POSITIVE_DIFFERENCE"),

	/**
	 * The '<em><b>TRUE POSITIVE DIFFERENCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRUE_POSITIVE_DIFFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	TRUE_POSITIVE_DIFFERENCE(5, "TRUE_POSITIVE_DIFFERENCE", "TRUE_POSITIVE_DIFFERENCE");

	/**
	 * The '<em><b>STATISTICAL PARITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATISTICAL_PARITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STATISTICAL_PARITY_VALUE = 0;

	/**
	 * The '<em><b>DISPARATE IMPACT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISPARATE_IMPACT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DISPARATE_IMPACT_VALUE = 1;

	/**
	 * The '<em><b>EQUALIZED ODDS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUALIZED_ODDS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EQUALIZED_ODDS_VALUE = 2;

	/**
	 * The '<em><b>EQUAL ACCURACY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL_ACCURACY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EQUAL_ACCURACY_VALUE = 3;

	/**
	 * The '<em><b>FALSE POSITIVE DIFFERENCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FALSE_POSITIVE_DIFFERENCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FALSE_POSITIVE_DIFFERENCE_VALUE = 4;

	/**
	 * The '<em><b>TRUE POSITIVE DIFFERENCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRUE_POSITIVE_DIFFERENCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRUE_POSITIVE_DIFFERENCE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Group Fairness Metric</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GroupFairnessMetric[] VALUES_ARRAY =
		new GroupFairnessMetric[] {
			STATISTICAL_PARITY,
			DISPARATE_IMPACT,
			EQUALIZED_ODDS,
			EQUAL_ACCURACY,
			FALSE_POSITIVE_DIFFERENCE,
			TRUE_POSITIVE_DIFFERENCE,
		};

	/**
	 * A public read-only list of all the '<em><b>Group Fairness Metric</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GroupFairnessMetric> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Group Fairness Metric</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GroupFairnessMetric get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GroupFairnessMetric result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Group Fairness Metric</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GroupFairnessMetric getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GroupFairnessMetric result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Group Fairness Metric</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GroupFairnessMetric get(int value) {
		switch (value) {
			case STATISTICAL_PARITY_VALUE: return STATISTICAL_PARITY;
			case DISPARATE_IMPACT_VALUE: return DISPARATE_IMPACT;
			case EQUALIZED_ODDS_VALUE: return EQUALIZED_ODDS;
			case EQUAL_ACCURACY_VALUE: return EQUAL_ACCURACY;
			case FALSE_POSITIVE_DIFFERENCE_VALUE: return FALSE_POSITIVE_DIFFERENCE;
			case TRUE_POSITIVE_DIFFERENCE_VALUE: return TRUE_POSITIVE_DIFFERENCE;
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
	private GroupFairnessMetric(int value, String name, String literal) {
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
	
} //GroupFairnessMetric
