/**
 */
package fairness;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Bias Source</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fairness.FairnessPackage#getBiasSource()
 * @model
 * @generated
 */
public enum BiasSource implements Enumerator {
	/**
	 * The '<em><b>WRONG ALGORITHM BEHAVIOUR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRONG_ALGORITHM_BEHAVIOUR_VALUE
	 * @generated
	 * @ordered
	 */
	WRONG_ALGORITHM_BEHAVIOUR(0, "WRONG_ALGORITHM_BEHAVIOUR", "WRONG_ALGORITHM_BEHAVIOUR"),

	/**
	 * The '<em><b>HUMAN DISCRIMINATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HUMAN_DISCRIMINATION_VALUE
	 * @generated
	 * @ordered
	 */
	HUMAN_DISCRIMINATION(1, "HUMAN_DISCRIMINATION", "HUMAN_DISCRIMINATION"),

	/**
	 * The '<em><b>WRONG MEASUREMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRONG_MEASUREMENT_VALUE
	 * @generated
	 * @ordered
	 */
	WRONG_MEASUREMENT(2, "WRONG_MEASUREMENT", "WRONG_MEASUREMENT"),

	/**
	 * The '<em><b>OMITTED VARIABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OMITTED_VARIABLE_VALUE
	 * @generated
	 * @ordered
	 */
	OMITTED_VARIABLE(3, "OMITTED_VARIABLE", "OMITTED_VARIABLE"),

	/**
	 * The '<em><b>WRONG SAMPLING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRONG_SAMPLING_VALUE
	 * @generated
	 * @ordered
	 */
	WRONG_SAMPLING(4, "WRONG_SAMPLING", "WRONG_SAMPLING"),

	/**
	 * The '<em><b>WRONG AGGREGATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRONG_AGGREGATION_VALUE
	 * @generated
	 * @ordered
	 */
	WRONG_AGGREGATION(5, "WRONG_AGGREGATION", "WRONG_AGGREGATION"),

	/**
	 * The '<em><b>WRONG LINKING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRONG_LINKING_VALUE
	 * @generated
	 * @ordered
	 */
	WRONG_LINKING(6, "WRONG_LINKING", "WRONG_LINKING"),

	/**
	 * The '<em><b>WRONG PRESENTATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRONG_PRESENTATION_VALUE
	 * @generated
	 * @ordered
	 */
	WRONG_PRESENTATION(7, "WRONG_PRESENTATION", "WRONG_PRESENTATION"),

	/**
	 * The '<em><b>RESULT RANKING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESULT_RANKING_VALUE
	 * @generated
	 * @ordered
	 */
	RESULT_RANKING(8, "RESULT_RANKING", "RESULT_RANKING"),

	/**
	 * The '<em><b>WRONG SYSTEM EVALUATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRONG_SYSTEM_EVALUATION_VALUE
	 * @generated
	 * @ordered
	 */
	WRONG_SYSTEM_EVALUATION(9, "WRONG_SYSTEM_EVALUATION", "WRONG_SYSTEM_EVALUATION"),

	/**
	 * The '<em><b>WRONG SYSTEM TARGET POPULATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRONG_SYSTEM_TARGET_POPULATION_VALUE
	 * @generated
	 * @ordered
	 */
	WRONG_SYSTEM_TARGET_POPULATION(10, "WRONG_SYSTEM_TARGET_POPULATION", "WRONG_SYSTEM_TARGET_POPULATION"),

	/**
	 * The '<em><b>CHANGE IN TARGET POPULATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANGE_IN_TARGET_POPULATION_VALUE
	 * @generated
	 * @ordered
	 */
	CHANGE_IN_TARGET_POPULATION(11, "CHANGE_IN_TARGET_POPULATION", "CHANGE_IN_TARGET_POPULATION");

	/**
	 * The '<em><b>WRONG ALGORITHM BEHAVIOUR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRONG_ALGORITHM_BEHAVIOUR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WRONG_ALGORITHM_BEHAVIOUR_VALUE = 0;

	/**
	 * The '<em><b>HUMAN DISCRIMINATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HUMAN_DISCRIMINATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HUMAN_DISCRIMINATION_VALUE = 1;

	/**
	 * The '<em><b>WRONG MEASUREMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRONG_MEASUREMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WRONG_MEASUREMENT_VALUE = 2;

	/**
	 * The '<em><b>OMITTED VARIABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OMITTED_VARIABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OMITTED_VARIABLE_VALUE = 3;

	/**
	 * The '<em><b>WRONG SAMPLING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRONG_SAMPLING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WRONG_SAMPLING_VALUE = 4;

	/**
	 * The '<em><b>WRONG AGGREGATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRONG_AGGREGATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WRONG_AGGREGATION_VALUE = 5;

	/**
	 * The '<em><b>WRONG LINKING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRONG_LINKING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WRONG_LINKING_VALUE = 6;

	/**
	 * The '<em><b>WRONG PRESENTATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRONG_PRESENTATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WRONG_PRESENTATION_VALUE = 7;

	/**
	 * The '<em><b>RESULT RANKING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESULT_RANKING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESULT_RANKING_VALUE = 8;

	/**
	 * The '<em><b>WRONG SYSTEM EVALUATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRONG_SYSTEM_EVALUATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WRONG_SYSTEM_EVALUATION_VALUE = 9;

	/**
	 * The '<em><b>WRONG SYSTEM TARGET POPULATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRONG_SYSTEM_TARGET_POPULATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WRONG_SYSTEM_TARGET_POPULATION_VALUE = 10;

	/**
	 * The '<em><b>CHANGE IN TARGET POPULATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANGE_IN_TARGET_POPULATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_IN_TARGET_POPULATION_VALUE = 11;

	/**
	 * An array of all the '<em><b>Bias Source</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BiasSource[] VALUES_ARRAY =
		new BiasSource[] {
			WRONG_ALGORITHM_BEHAVIOUR,
			HUMAN_DISCRIMINATION,
			WRONG_MEASUREMENT,
			OMITTED_VARIABLE,
			WRONG_SAMPLING,
			WRONG_AGGREGATION,
			WRONG_LINKING,
			WRONG_PRESENTATION,
			RESULT_RANKING,
			WRONG_SYSTEM_EVALUATION,
			WRONG_SYSTEM_TARGET_POPULATION,
			CHANGE_IN_TARGET_POPULATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Bias Source</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BiasSource> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Bias Source</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BiasSource get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BiasSource result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Bias Source</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BiasSource getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BiasSource result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Bias Source</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BiasSource get(int value) {
		switch (value) {
			case WRONG_ALGORITHM_BEHAVIOUR_VALUE: return WRONG_ALGORITHM_BEHAVIOUR;
			case HUMAN_DISCRIMINATION_VALUE: return HUMAN_DISCRIMINATION;
			case WRONG_MEASUREMENT_VALUE: return WRONG_MEASUREMENT;
			case OMITTED_VARIABLE_VALUE: return OMITTED_VARIABLE;
			case WRONG_SAMPLING_VALUE: return WRONG_SAMPLING;
			case WRONG_AGGREGATION_VALUE: return WRONG_AGGREGATION;
			case WRONG_LINKING_VALUE: return WRONG_LINKING;
			case WRONG_PRESENTATION_VALUE: return WRONG_PRESENTATION;
			case RESULT_RANKING_VALUE: return RESULT_RANKING;
			case WRONG_SYSTEM_EVALUATION_VALUE: return WRONG_SYSTEM_EVALUATION;
			case WRONG_SYSTEM_TARGET_POPULATION_VALUE: return WRONG_SYSTEM_TARGET_POPULATION;
			case CHANGE_IN_TARGET_POPULATION_VALUE: return CHANGE_IN_TARGET_POPULATION;
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
	private BiasSource(int value, String name, String literal) {
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
	
} //BiasSource
