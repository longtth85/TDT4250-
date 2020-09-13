/**
 */
package studyPlan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyPlan.CourseGroup#getCourses <em>Courses</em>}</li>
 *   <li>{@link studyPlan.CourseGroup#getName <em>Name</em>}</li>
 *   <li>{@link studyPlan.CourseGroup#getCourseType <em>Course Type</em>}</li>
 * </ul>
 *
 * @see studyPlan.StudyPlanPackage#getCourseGroup()
 * @model
 * @generated
 */
public interface CourseGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link studyPlan.CourseInProgram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see studyPlan.StudyPlanPackage#getCourseGroup_Courses()
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
	 * @see studyPlan.StudyPlanPackage#getCourseGroup_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link studyPlan.CourseGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Course Type</b></em>' attribute.
	 * The literals are from the enumeration {@link studyPlan.courseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Type</em>' attribute.
	 * @see studyPlan.courseType
	 * @see #setCourseType(courseType)
	 * @see studyPlan.StudyPlanPackage#getCourseGroup_CourseType()
	 * @model
	 * @generated
	 */
	courseType getCourseType();

	/**
	 * Sets the value of the '{@link studyPlan.CourseGroup#getCourseType <em>Course Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Type</em>' attribute.
	 * @see studyPlan.courseType
	 * @see #getCourseType()
	 * @generated
	 */
	void setCourseType(courseType value);

} // CourseGroup
