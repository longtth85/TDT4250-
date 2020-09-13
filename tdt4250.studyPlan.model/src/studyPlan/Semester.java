/**
 */
package studyPlan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyPlan.Semester#getCourses <em>Courses</em>}</li>
 *   <li>{@link studyPlan.Semester#getName <em>Name</em>}</li>
 *   <li>{@link studyPlan.Semester#getCourseGroup <em>Course Group</em>}</li>
 * </ul>
 *
 * @see studyPlan.StudyPlanPackage#getSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='min30Credits'"
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link studyPlan.CourseInProgram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see studyPlan.StudyPlanPackage#getSemester_Courses()
	 * @model
	 * @generated
	 */
	EList<CourseInProgram> getCourses();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see studyPlan.StudyPlanPackage#getSemester_Name()
	 * @model annotation="http://www.eclipse.org/acceleo/query/1.0 derivation='if self.eContainmentFeature() &lt;&gt; null and self.eContainmentFeature().name = \'fallSemester\' then \'Fall\' else \'Spring\' endif'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link studyPlan.Semester#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Course Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Group</em>' containment reference.
	 * @see #setCourseGroup(CourseGroup)
	 * @see studyPlan.StudyPlanPackage#getSemester_CourseGroup()
	 * @model containment="true"
	 * @generated
	 */
	CourseGroup getCourseGroup();

	/**
	 * Sets the value of the '{@link studyPlan.Semester#getCourseGroup <em>Course Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Group</em>' containment reference.
	 * @see #getCourseGroup()
	 * @generated
	 */
	void setCourseGroup(CourseGroup value);

} // Semester
