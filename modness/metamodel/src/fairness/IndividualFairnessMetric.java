/**
 */
package fairness;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Individual Fairness Metric</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fairness.FairnessPackage#getIndividualFairnessMetric()
 * @model
 * @generated
 */
public enum IndividualFairnessMetric implements Enumerator {
	/**
	 * The '<em><b>MANHATTAN DISTANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANHATTAN_DISTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	MANHATTAN_DISTANCE(0, "MANHATTAN_DISTANCE", "MANHATTAN_DISTANCE"),

	/**
	 * The '<em><b>EUCLIDEAN DISTANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EUCLIDEAN_DISTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	EUCLIDEAN_DISTANCE(1, "EUCLIDEAN_DISTANCE", "EUCLIDEAN_DISTANCE"),

	/**
	 * The '<em><b>MAHALANOBIS DISTANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAHALANOBIS_DISTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	MAHALANOBIS_DISTANCE(2, "MAHALANOBIS_DISTANCE", "MAHALANOBIS_DISTANCE");

	/**
	 * The '<em><b>MANHATTAN DISTANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANHATTAN_DISTANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MANHATTAN_DISTANCE_VALUE = 0;

	/**
	 * The '<em><b>EUCLIDEAN DISTANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EUCLIDEAN_DISTANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EUCLIDEAN_DISTANCE_VALUE = 1;

	/**
	 * The '<em><b>MAHALANOBIS DISTANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAHALANOBIS_DISTANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAHALANOBIS_DISTANCE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Individual Fairness Metric</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IndividualFairnessMetric[] VALUES_ARRAY =
		new IndividualFairnessMetric[] {
			MANHATTAN_DISTANCE,
			EUCLIDEAN_DISTANCE,
			MAHALANOBIS_DISTANCE,
		};

	/**
	 * A public read-only list of all the '<em><b>Individual Fairness Metric</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IndividualFairnessMetric> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Individual Fairness Metric</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IndividualFairnessMetric get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IndividualFairnessMetric result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Individual Fairness Metric</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IndividualFairnessMetric getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IndividualFairnessMetric result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Individual Fairness Metric</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IndividualFairnessMetric get(int value) {
		switch (value) {
			case MANHATTAN_DISTANCE_VALUE: return MANHATTAN_DISTANCE;
			case EUCLIDEAN_DISTANCE_VALUE: return EUCLIDEAN_DISTANCE;
			case MAHALANOBIS_DISTANCE_VALUE: return MAHALANOBIS_DISTANCE;
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
	private IndividualFairnessMetric(int value, String name, String literal) {
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
	
} //IndividualFairnessMetric
