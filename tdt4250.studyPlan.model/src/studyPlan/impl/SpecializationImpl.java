/**
 */
package studyPlan.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import studyPlan.Programme;
import studyPlan.Semester;
import studyPlan.Specialization;
import studyPlan.StudyPlanPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyPlan.impl.SpecializationImpl#getSpecializeProgram <em>Specialize Program</em>}</li>
 *   <li>{@link studyPlan.impl.SpecializationImpl#getChosenIn <em>Chosen In</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecializationImpl extends ProgrammeImpl implements Specialization {
	/**
	 * The cached value of the '{@link #getSpecializeProgram() <em>Specialize Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializeProgram()
	 * @generated
	 * @ordered
	 */
	protected Programme specializeProgram;
	/**
	 * The cached value of the '{@link #getChosenIn() <em>Chosen In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChosenIn()
	 * @generated
	 * @ordered
	 */
	protected Semester chosenIn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecializationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyPlanPackage.Literals.SPECIALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Programme getSpecializeProgram() {
		if (specializeProgram != null && specializeProgram.eIsProxy()) {
			InternalEObject oldSpecializeProgram = (InternalEObject)specializeProgram;
			specializeProgram = (Programme)eResolveProxy(oldSpecializeProgram);
			if (specializeProgram != oldSpecializeProgram) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StudyPlanPackage.SPECIALIZATION__SPECIALIZE_PROGRAM, oldSpecializeProgram, specializeProgram));
			}
		}
		return specializeProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Programme basicGetSpecializeProgram() {
		return specializeProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecializeProgram(Programme newSpecializeProgram) {
		Programme oldSpecializeProgram = specializeProgram;
		specializeProgram = newSpecializeProgram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPlanPackage.SPECIALIZATION__SPECIALIZE_PROGRAM, oldSpecializeProgram, specializeProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Semester getChosenIn() {
		if (chosenIn != null && chosenIn.eIsProxy()) {
			InternalEObject oldChosenIn = (InternalEObject)chosenIn;
			chosenIn = (Semester)eResolveProxy(oldChosenIn);
			if (chosenIn != oldChosenIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StudyPlanPackage.SPECIALIZATION__CHOSEN_IN, oldChosenIn, chosenIn));
			}
		}
		return chosenIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semester basicGetChosenIn() {
		return chosenIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChosenIn(Semester newChosenIn) {
		Semester oldChosenIn = chosenIn;
		chosenIn = newChosenIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPlanPackage.SPECIALIZATION__CHOSEN_IN, oldChosenIn, chosenIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyPlanPackage.SPECIALIZATION__SPECIALIZE_PROGRAM:
				if (resolve) return getSpecializeProgram();
				return basicGetSpecializeProgram();
			case StudyPlanPackage.SPECIALIZATION__CHOSEN_IN:
				if (resolve) return getChosenIn();
				return basicGetChosenIn();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StudyPlanPackage.SPECIALIZATION__SPECIALIZE_PROGRAM:
				setSpecializeProgram((Programme)newValue);
				return;
			case StudyPlanPackage.SPECIALIZATION__CHOSEN_IN:
				setChosenIn((Semester)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StudyPlanPackage.SPECIALIZATION__SPECIALIZE_PROGRAM:
				setSpecializeProgram((Programme)null);
				return;
			case StudyPlanPackage.SPECIALIZATION__CHOSEN_IN:
				setChosenIn((Semester)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StudyPlanPackage.SPECIALIZATION__SPECIALIZE_PROGRAM:
				return specializeProgram != null;
			case StudyPlanPackage.SPECIALIZATION__CHOSEN_IN:
				return chosenIn != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecializationImpl
