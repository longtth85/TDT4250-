/**
 */
package studyPlan;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course In Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyPlan.CourseInProgram#getSemester <em>Semester</em>}</li>
 *   <li>{@link studyPlan.CourseInProgram#getCourse <em>Course</em>}</li>
 *   <li>{@link studyPlan.CourseInProgram#getName <em>Name</em>}</li>
 *   <li>{@link studyPlan.CourseInProgram#getYear <em>Year</em>}</li>
 * </ul>
 *
 * @see studyPlan.StudyPlanPackage#getCourseInProgram()
 * @model
 * @generated
 */
public interface CourseInProgram extends EObject {
	/**
	 * Returns the value of the '<em><b>Semester</b></em>' attribute.
	 * The literals are from the enumeration {@link studyPlan.semesterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' attribute.
	 * @see studyPlan.semesterType
	 * @see #setSemester(semesterType)
	 * @see studyPlan.StudyPlanPackage#getCourseInProgram_Semester()
	 * @model required="true"
	 * @generated
	 */
	semesterType getSemester();

	/**
	 * Sets the value of the '{@link studyPlan.CourseInProgram#getSemester <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' attribute.
	 * @see studyPlan.semesterType
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(semesterType value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link studyPlan.Course#getProgrammeCourse <em>Programme Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' container reference.
	 * @see #setCourse(Course)
	 * @see studyPlan.StudyPlanPackage#getCourseInProgram_Course()
	 * @see studyPlan.Course#getProgrammeCourse
	 * @model opposite="programmeCourse" required="true" transient="false"
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link studyPlan.CourseInProgram#getCourse <em>Course</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' container reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see studyPlan.StudyPlanPackage#getCourseInProgram_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link studyPlan.CourseInProgram#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see studyPlan.StudyPlanPackage#getCourseInProgram_Name()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/acceleo/query/1.0 derivation='self.course.name + \' - \' + self.semester.toString() + \' \' + self.year'"
	 * @generated
	 */
	String getName();

} // CourseInProgram
