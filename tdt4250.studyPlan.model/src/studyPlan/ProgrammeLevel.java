/**
 */
package studyPlan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyPlan.ProgrammeLevel#getSpringSemester <em>Spring Semester</em>}</li>
 *   <li>{@link studyPlan.ProgrammeLevel#getFallSemester <em>Fall Semester</em>}</li>
 *   <li>{@link studyPlan.ProgrammeLevel#getNextProgrammeLevel <em>Next Programme Level</em>}</li>
 *   <li>{@link studyPlan.ProgrammeLevel#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see studyPlan.StudyPlanPackage#getProgrammeLevel()
 * @model annotation="http://www.eclipse.org/acceleo/query/1.0 springContainsOnlySpringCourses='if self.springSemester &lt;&gt; null then not self.springSemester.courses.semester.toString()-&gt;exists(name | name &lt;&gt; \'Spring\') else true endif' fallContainsOnlyFallCourses='if self.fallSemester &lt;&gt; null then not self.fallSemester.courses.semester.toString()-&gt;exists(name | name &lt;&gt; \'Autumn\') else true endif'"
 * @generated
 */
public interface ProgrammeLevel extends EObject {
	/**
	 * Returns the value of the '<em><b>Spring Semester</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spring Semester</em>' containment reference.
	 * @see #setSpringSemester(Semester)
	 * @see studyPlan.StudyPlanPackage#getProgrammeLevel_SpringSemester()
	 * @model containment="true"
	 * @generated
	 */
	Semester getSpringSemester();

	/**
	 * Sets the value of the '{@link studyPlan.ProgrammeLevel#getSpringSemester <em>Spring Semester</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spring Semester</em>' containment reference.
	 * @see #getSpringSemester()
	 * @generated
	 */
	void setSpringSemester(Semester value);

	/**
	 * Returns the value of the '<em><b>Fall Semester</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fall Semester</em>' containment reference.
	 * @see #setFallSemester(Semester)
	 * @see studyPlan.StudyPlanPackage#getProgrammeLevel_FallSemester()
	 * @model containment="true"
	 * @generated
	 */
	Semester getFallSemester();

	/**
	 * Sets the value of the '{@link studyPlan.ProgrammeLevel#getFallSemester <em>Fall Semester</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fall Semester</em>' containment reference.
	 * @see #getFallSemester()
	 * @generated
	 */
	void setFallSemester(Semester value);

	/**
	 * Returns the value of the '<em><b>Next Programme Level</b></em>' containment reference list.
	 * The list contents are of type {@link studyPlan.ProgrammeLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Programme Level</em>' containment reference list.
	 * @see studyPlan.StudyPlanPackage#getProgrammeLevel_NextProgrammeLevel()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProgrammeLevel> getNextProgrammeLevel();

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link studyPlan.level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see studyPlan.level
	 * @see #setLevel(level)
	 * @see studyPlan.StudyPlanPackage#getProgrammeLevel_Level()
	 * @model
	 * @generated
	 */
	level getLevel();

	/**
	 * Sets the value of the '{@link studyPlan.ProgrammeLevel#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see studyPlan.level
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(level value);

} // ProgrammeLevel
