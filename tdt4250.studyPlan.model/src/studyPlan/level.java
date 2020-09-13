/**
 */
package studyPlan;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see studyPlan.StudyPlanPackage#getlevel()
 * @model
 * @generated
 */
public enum level implements Enumerator {
	/**
	 * The '<em><b>Level1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL1_VALUE
	 * @generated
	 * @ordered
	 */
	LEVEL1(0, "Level1", "Level1"),

	/**
	 * The '<em><b>Level2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL2_VALUE
	 * @generated
	 * @ordered
	 */
	LEVEL2(1, "Level2", "Level2"),

	/**
	 * The '<em><b>Level3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL3_VALUE
	 * @generated
	 * @ordered
	 */
	LEVEL3(2, "Level3", "Level3"),

	/**
	 * The '<em><b>Level4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL4_VALUE
	 * @generated
	 * @ordered
	 */
	LEVEL4(3, "Level4", "Level4"),

	/**
	 * The '<em><b>Level5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL5_VALUE
	 * @generated
	 * @ordered
	 */
	LEVEL5(4, "Level5", "Level5");

	/**
	 * The '<em><b>Level1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL1
	 * @model name="Level1"
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL1_VALUE = 0;

	/**
	 * The '<em><b>Level2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL2
	 * @model name="Level2"
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL2_VALUE = 1;

	/**
	 * The '<em><b>Level3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL3
	 * @model name="Level3"
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL3_VALUE = 2;

	/**
	 * The '<em><b>Level4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL4
	 * @model name="Level4"
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL4_VALUE = 3;

	/**
	 * The '<em><b>Level5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL5
	 * @model name="Level5"
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL5_VALUE = 4;

	/**
	 * An array of all the '<em><b>level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final level[] VALUES_ARRAY =
		new level[] {
			LEVEL1,
			LEVEL2,
			LEVEL3,
			LEVEL4,
			LEVEL5,
		};

	/**
	 * A public read-only list of all the '<em><b>level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<level> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static level get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			level result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static level getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			level result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static level get(int value) {
		switch (value) {
			case LEVEL1_VALUE: return LEVEL1;
			case LEVEL2_VALUE: return LEVEL2;
			case LEVEL3_VALUE: return LEVEL3;
			case LEVEL4_VALUE: return LEVEL4;
			case LEVEL5_VALUE: return LEVEL5;
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
	private level(int value, String name, String literal) {
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
	
} //level
