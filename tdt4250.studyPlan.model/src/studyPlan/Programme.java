/**
 */
package studyPlan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyPlan.Programme#getName <em>Name</em>}</li>
 *   <li>{@link studyPlan.Programme#getCode <em>Code</em>}</li>
 *   <li>{@link studyPlan.Programme#getProgrammeStart <em>Programme Start</em>}</li>
 * </ul>
 *
 * @see studyPlan.StudyPlanPackage#getProgramme()
 * @model
 * @generated
 */
public interface Programme extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see studyPlan.StudyPlanPackage#getProgramme_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link studyPlan.Programme#getName <em>Name</em>}' attribute.
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
	 * @see studyPlan.StudyPlanPackage#getProgramme_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link studyPlan.Programme#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Programme Start</b></em>' containment reference list.
	 * The list contents are of type {@link studyPlan.ProgrammeStart}.
	 * It is bidirectional and its opposite is '{@link studyPlan.ProgrammeStart#getProgramme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme Start</em>' containment reference list.
	 * @see studyPlan.StudyPlanPackage#getProgramme_ProgrammeStart()
	 * @see studyPlan.ProgrammeStart#getProgramme
	 * @model opposite="programme" containment="true"
	 * @generated
	 */
	EList<ProgrammeStart> getProgrammeStart();

} // Programme
