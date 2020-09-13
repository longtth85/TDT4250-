/**
 */
package studyPlan;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyPlan.Specialization#getSpecializeProgram <em>Specialize Program</em>}</li>
 *   <li>{@link studyPlan.Specialization#getChosenIn <em>Chosen In</em>}</li>
 * </ul>
 *
 * @see studyPlan.StudyPlanPackage#getSpecialization()
 * @model
 * @generated
 */
public interface Specialization extends Programme {
	/**
	 * Returns the value of the '<em><b>Specialize Program</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialize Program</em>' reference.
	 * @see #setSpecializeProgram(Programme)
	 * @see studyPlan.StudyPlanPackage#getSpecialization_SpecializeProgram()
	 * @model
	 * @generated
	 */
	Programme getSpecializeProgram();

	/**
	 * Sets the value of the '{@link studyPlan.Specialization#getSpecializeProgram <em>Specialize Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialize Program</em>' reference.
	 * @see #getSpecializeProgram()
	 * @generated
	 */
	void setSpecializeProgram(Programme value);

	/**
	 * Returns the value of the '<em><b>Chosen In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chosen In</em>' reference.
	 * @see #setChosenIn(Semester)
	 * @see studyPlan.StudyPlanPackage#getSpecialization_ChosenIn()
	 * @model required="true"
	 * @generated
	 */
	Semester getChosenIn();

	/**
	 * Sets the value of the '{@link studyPlan.Specialization#getChosenIn <em>Chosen In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chosen In</em>' reference.
	 * @see #getChosenIn()
	 * @generated
	 */
	void setChosenIn(Semester value);

} // Specialization
