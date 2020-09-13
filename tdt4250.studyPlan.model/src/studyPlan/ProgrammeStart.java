/**
 */
package studyPlan;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyPlan.ProgrammeStart#getYear <em>Year</em>}</li>
 *   <li>{@link studyPlan.ProgrammeStart#getProgramme <em>Programme</em>}</li>
 *   <li>{@link studyPlan.ProgrammeStart#getProgrammeLevel <em>Programme Level</em>}</li>
 * </ul>
 *
 * @see studyPlan.StudyPlanPackage#getProgrammeStart()
 * @model
 * @generated
 */
public interface ProgrammeStart extends EObject {
	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see studyPlan.StudyPlanPackage#getProgrammeStart_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link studyPlan.ProgrammeStart#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Programme</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link studyPlan.Programme#getProgrammeStart <em>Programme Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme</em>' container reference.
	 * @see #setProgramme(Programme)
	 * @see studyPlan.StudyPlanPackage#getProgrammeStart_Programme()
	 * @see studyPlan.Programme#getProgrammeStart
	 * @model opposite="programmeStart" required="true" transient="false"
	 * @generated
	 */
	Programme getProgramme();

	/**
	 * Sets the value of the '{@link studyPlan.ProgrammeStart#getProgramme <em>Programme</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme</em>' container reference.
	 * @see #getProgramme()
	 * @generated
	 */
	void setProgramme(Programme value);

	/**
	 * Returns the value of the '<em><b>Programme Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme Level</em>' containment reference.
	 * @see #setProgrammeLevel(ProgrammeLevel)
	 * @see studyPlan.StudyPlanPackage#getProgrammeStart_ProgrammeLevel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ProgrammeLevel getProgrammeLevel();

	/**
	 * Sets the value of the '{@link studyPlan.ProgrammeStart#getProgrammeLevel <em>Programme Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme Level</em>' containment reference.
	 * @see #getProgrammeLevel()
	 * @generated
	 */
	void setProgrammeLevel(ProgrammeLevel value);

} // ProgrammeStart
