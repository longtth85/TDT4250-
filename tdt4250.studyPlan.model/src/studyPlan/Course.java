/**
 */
package studyPlan;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyPlan.Course#getName <em>Name</em>}</li>
 *   <li>{@link studyPlan.Course#getCode <em>Code</em>}</li>
 *   <li>{@link studyPlan.Course#getCredit <em>Credit</em>}</li>
 *   <li>{@link studyPlan.Course#getLevel <em>Level</em>}</li>
 *   <li>{@link studyPlan.Course#getProgrammeCourse <em>Programme Course</em>}</li>
 * </ul>
 *
 * @see studyPlan.StudyPlanPackage#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see studyPlan.StudyPlanPackage#getCourse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link studyPlan.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see studyPlan.StudyPlanPackage#getCourse_Code()
	 * @model dataType="studyPlan.CourseCode"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link studyPlan.Course#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit</em>' attribute.
	 * @see #setCredit(float)
	 * @see studyPlan.StudyPlanPackage#getCourse_Credit()
	 * @model dataType="studyPlan.Credit"
	 * @generated
	 */
	float getCredit();

	/**
	 * Sets the value of the '{@link studyPlan.Course#getCredit <em>Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit</em>' attribute.
	 * @see #getCredit()
	 * @generated
	 */
	void setCredit(float value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link studyPlan.level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see studyPlan.level
	 * @see #setLevel(level)
	 * @see studyPlan.StudyPlanPackage#getCourse_Level()
	 * @model
	 * @generated
	 */
	level getLevel();

	/**
	 * Sets the value of the '{@link studyPlan.Course#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see studyPlan.level
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(level value);

	/**
	 * Returns the value of the '<em><b>Programme Course</b></em>' containment reference list.
	 * The list contents are of type {@link studyPlan.CourseInProgram}.
	 * It is bidirectional and its opposite is '{@link studyPlan.CourseInProgram#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme Course</em>' containment reference list.
	 * @see studyPlan.StudyPlanPackage#getCourse_ProgrammeCourse()
	 * @see studyPlan.CourseInProgram#getCourse
	 * @model opposite="course" containment="true"
	 * @generated
	 */
	EList<CourseInProgram> getProgrammeCourse();

} // Course
