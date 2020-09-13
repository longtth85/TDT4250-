/**
 */
package studyPlan;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>course Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see studyPlan.StudyPlanPackage#getcourseLevel()
 * @model
 * @generated
 */
public enum courseLevel implements Enumerator {
	/**
	 * The '<em><b>Year1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEAR1_VALUE
	 * @generated
	 * @ordered
	 */
	YEAR1(0, "Year1", "Year1"),

	/**
	 * The '<em><b>Year2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEAR2_VALUE
	 * @generated
	 * @ordered
	 */
	YEAR2(1, "Year2", "Year2"),

	/**
	 * The '<em><b>Year3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEAR3_VALUE
	 * @generated
	 * @ordered
	 */
	YEAR3(2, "Year3", "Year3"),

	/**
	 * The '<em><b>Year4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEAR4_VALUE
	 * @generated
	 * @ordered
	 */
	YEAR4(3, "Year4", "Year4"),

	/**
	 * The '<em><b>Year5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEAR5_VALUE
	 * @generated
	 * @ordered
	 */
	YEAR5(4, "Year5", "Year5");

	/**
	 * The '<em><b>Year1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEAR1
	 * @model name="Year1"
	 * @generated
	 * @ordered
	 */
	public static final int YEAR1_VALUE = 0;

	/**
	 * The '<em><b>Year2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEAR2
	 * @model name="Year2"
	 * @generated
	 * @ordered
	 */
	public static final int YEAR2_VALUE = 1;

	/**
	 * The '<em><b>Year3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEAR3
	 * @model name="Year3"
	 * @generated
	 * @ordered
	 */
	public static final int YEAR3_VALUE = 2;

	/**
	 * The '<em><b>Year4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEAR4
	 * @model name="Year4"
	 * @generated
	 * @ordered
	 */
	public static final int YEAR4_VALUE = 3;

	/**
	 * The '<em><b>Year5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEAR5
	 * @model name="Year5"
	 * @generated
	 * @ordered
	 */
	public static final int YEAR5_VALUE = 4;

	/**
	 * An array of all the '<em><b>course Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final courseLevel[] VALUES_ARRAY =
		new courseLevel[] {
			YEAR1,
			YEAR2,
			YEAR3,
			YEAR4,
			YEAR5,
		};

	/**
	 * A public read-only list of all the '<em><b>course Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<courseLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>course Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static courseLevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			courseLevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>course Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static courseLevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			courseLevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>course Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static courseLevel get(int value) {
		switch (value) {
			case YEAR1_VALUE: return YEAR1;
			case YEAR2_VALUE: return YEAR2;
			case YEAR3_VALUE: return YEAR3;
			case YEAR4_VALUE: return YEAR4;
			case YEAR5_VALUE: return YEAR5;
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
	private courseLevel(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //courseLevel
