/**
 */
package studyPlan.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import studyPlan.Programme;
import studyPlan.ProgrammeLevel;
import studyPlan.ProgrammeStart;
import studyPlan.StudyPlanPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programme Start</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyPlan.impl.ProgrammeStartImpl#getYear <em>Year</em>}</li>
 *   <li>{@link studyPlan.impl.ProgrammeStartImpl#getProgramme <em>Programme</em>}</li>
 *   <li>{@link studyPlan.impl.ProgrammeStartImpl#getProgrammeLevel <em>Programme Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgrammeStartImpl extends MinimalEObjectImpl.Container implements ProgrammeStart {
	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected int year = YEAR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProgrammeLevel() <em>Programme Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammeLevel()
	 * @generated
	 * @ordered
	 */
	protected ProgrammeLevel programmeLevel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgrammeStartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyPlanPackage.Literals.PROGRAMME_START;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYear(int newYear) {
		int oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPlanPackage.PROGRAMME_START__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Programme getProgramme() {
		if (eContainerFeatureID() != StudyPlanPackage.PROGRAMME_START__PROGRAMME) return null;
		return (Programme)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramme(Programme newProgramme, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProgramme, StudyPlanPackage.PROGRAMME_START__PROGRAMME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgramme(Programme newProgramme) {
		if (newProgramme != eInternalContainer() || (eContainerFeatureID() != StudyPlanPackage.PROGRAMME_START__PROGRAMME && newProgramme != null)) {
			if (EcoreUtil.isAncestor(this, newProgramme))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProgramme != null)
				msgs = ((InternalEObject)newProgramme).eInverseAdd(this, StudyPlanPackage.PROGRAMME__PROGRAMME_START, Programme.class, msgs);
			msgs = basicSetProgramme(newProgramme, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPlanPackage.PROGRAMME_START__PROGRAMME, newProgramme, newProgramme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgrammeLevel getProgrammeLevel() {
		return programmeLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgrammeLevel(ProgrammeLevel newProgrammeLevel, NotificationChain msgs) {
		ProgrammeLevel oldProgrammeLevel = programmeLevel;
		programmeLevel = newProgrammeLevel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StudyPlanPackage.PROGRAMME_START__PROGRAMME_LEVEL, oldProgrammeLevel, newProgrammeLevel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgrammeLevel(ProgrammeLevel newProgrammeLevel) {
		if (newProgrammeLevel != programmeLevel) {
			NotificationChain msgs = null;
			if (programmeLevel != null)
				msgs = ((InternalEObject)programmeLevel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StudyPlanPackage.PROGRAMME_START__PROGRAMME_LEVEL, null, msgs);
			if (newProgrammeLevel != null)
				msgs = ((InternalEObject)newProgrammeLevel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StudyPlanPackage.PROGRAMME_START__PROGRAMME_LEVEL, null, msgs);
			msgs = basicSetProgrammeLevel(newProgrammeLevel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPlanPackage.PROGRAMME_START__PROGRAMME_LEVEL, newProgrammeLevel, newProgrammeLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyPlanPackage.PROGRAMME_START__PROGRAMME:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProgramme((Programme)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyPlanPackage.PROGRAMME_START__PROGRAMME:
				return basicSetProgramme(null, msgs);
			case StudyPlanPackage.PROGRAMME_START__PROGRAMME_LEVEL:
				return basicSetProgrammeLevel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case StudyPlanPackage.PROGRAMME_START__PROGRAMME:
				return eInternalContainer().eInverseRemove(this, StudyPlanPackage.PROGRAMME__PROGRAMME_START, Programme.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyPlanPackage.PROGRAMME_START__YEAR:
				return getYear();
			case StudyPlanPackage.PROGRAMME_START__PROGRAMME:
				return getProgramme();
			case StudyPlanPackage.PROGRAMME_START__PROGRAMME_LEVEL:
				return getProgrammeLevel();
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
			case StudyPlanPackage.PROGRAMME_START__YEAR:
				setYear((Integer)newValue);
				return;
			case StudyPlanPackage.PROGRAMME_START__PROGRAMME:
				setProgramme((Programme)newValue);
				return;
			case StudyPlanPackage.PROGRAMME_START__PROGRAMME_LEVEL:
				setProgrammeLevel((ProgrammeLevel)newValue);
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
			case StudyPlanPackage.PROGRAMME_START__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case StudyPlanPackage.PROGRAMME_START__PROGRAMME:
				setProgramme((Programme)null);
				return;
			case StudyPlanPackage.PROGRAMME_START__PROGRAMME_LEVEL:
				setProgrammeLevel((ProgrammeLevel)null);
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
			case StudyPlanPackage.PROGRAMME_START__YEAR:
				return year != YEAR_EDEFAULT;
			case StudyPlanPackage.PROGRAMME_START__PROGRAMME:
				return getProgramme() != null;
			case StudyPlanPackage.PROGRAMME_START__PROGRAMME_LEVEL:
				return programmeLevel != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (year: ");
		result.append(year);
		result.append(')');
		return result.toString();
	}

} //ProgrammeStartImpl
