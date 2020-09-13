/**
 */
package studyPlan.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import studyPlan.ProgrammeLevel;
import studyPlan.Semester;
import studyPlan.StudyPlanPackage;
import studyPlan.level;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programme Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyPlan.impl.ProgrammeLevelImpl#getSpringSemester <em>Spring Semester</em>}</li>
 *   <li>{@link studyPlan.impl.ProgrammeLevelImpl#getFallSemester <em>Fall Semester</em>}</li>
 *   <li>{@link studyPlan.impl.ProgrammeLevelImpl#getNextProgrammeLevel <em>Next Programme Level</em>}</li>
 *   <li>{@link studyPlan.impl.ProgrammeLevelImpl#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgrammeLevelImpl extends MinimalEObjectImpl.Container implements ProgrammeLevel {
	/**
	 * The cached value of the '{@link #getSpringSemester() <em>Spring Semester</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpringSemester()
	 * @generated
	 * @ordered
	 */
	protected Semester springSemester;

	/**
	 * The cached value of the '{@link #getFallSemester() <em>Fall Semester</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFallSemester()
	 * @generated
	 * @ordered
	 */
	protected Semester fallSemester;

	/**
	 * The cached value of the '{@link #getNextProgrammeLevel() <em>Next Programme Level</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextProgrammeLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<ProgrammeLevel> nextProgrammeLevel;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final level LEVEL_EDEFAULT = level.LEVEL1;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected level level = LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgrammeLevelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyPlanPackage.Literals.PROGRAMME_LEVEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Semester getSpringSemester() {
		return springSemester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpringSemester(Semester newSpringSemester, NotificationChain msgs) {
		Semester oldSpringSemester = springSemester;
		springSemester = newSpringSemester;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StudyPlanPackage.PROGRAMME_LEVEL__SPRING_SEMESTER, oldSpringSemester, newSpringSemester);
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
	public void setSpringSemester(Semester newSpringSemester) {
		if (newSpringSemester != springSemester) {
			NotificationChain msgs = null;
			if (springSemester != null)
				msgs = ((InternalEObject)springSemester).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StudyPlanPackage.PROGRAMME_LEVEL__SPRING_SEMESTER, null, msgs);
			if (newSpringSemester != null)
				msgs = ((InternalEObject)newSpringSemester).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StudyPlanPackage.PROGRAMME_LEVEL__SPRING_SEMESTER, null, msgs);
			msgs = basicSetSpringSemester(newSpringSemester, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPlanPackage.PROGRAMME_LEVEL__SPRING_SEMESTER, newSpringSemester, newSpringSemester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Semester getFallSemester() {
		return fallSemester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFallSemester(Semester newFallSemester, NotificationChain msgs) {
		Semester oldFallSemester = fallSemester;
		fallSemester = newFallSemester;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StudyPlanPackage.PROGRAMME_LEVEL__FALL_SEMESTER, oldFallSemester, newFallSemester);
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
	public void setFallSemester(Semester newFallSemester) {
		if (newFallSemester != fallSemester) {
			NotificationChain msgs = null;
			if (fallSemester != null)
				msgs = ((InternalEObject)fallSemester).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StudyPlanPackage.PROGRAMME_LEVEL__FALL_SEMESTER, null, msgs);
			if (newFallSemester != null)
				msgs = ((InternalEObject)newFallSemester).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StudyPlanPackage.PROGRAMME_LEVEL__FALL_SEMESTER, null, msgs);
			msgs = basicSetFallSemester(newFallSemester, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPlanPackage.PROGRAMME_LEVEL__FALL_SEMESTER, newFallSemester, newFallSemester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProgrammeLevel> getNextProgrammeLevel() {
		if (nextProgrammeLevel == null) {
			nextProgrammeLevel = new EObjectContainmentEList<ProgrammeLevel>(ProgrammeLevel.class, this, StudyPlanPackage.PROGRAMME_LEVEL__NEXT_PROGRAMME_LEVEL);
		}
		return nextProgrammeLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public level getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLevel(level newLevel) {
		level oldLevel = level;
		level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPlanPackage.PROGRAMME_LEVEL__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyPlanPackage.PROGRAMME_LEVEL__SPRING_SEMESTER:
				return basicSetSpringSemester(null, msgs);
			case StudyPlanPackage.PROGRAMME_LEVEL__FALL_SEMESTER:
				return basicSetFallSemester(null, msgs);
			case StudyPlanPackage.PROGRAMME_LEVEL__NEXT_PROGRAMME_LEVEL:
				return ((InternalEList<?>)getNextProgrammeLevel()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyPlanPackage.PROGRAMME_LEVEL__SPRING_SEMESTER:
				return getSpringSemester();
			case StudyPlanPackage.PROGRAMME_LEVEL__FALL_SEMESTER:
				return getFallSemester();
			case StudyPlanPackage.PROGRAMME_LEVEL__NEXT_PROGRAMME_LEVEL:
				return getNextProgrammeLevel();
			case StudyPlanPackage.PROGRAMME_LEVEL__LEVEL:
				return getLevel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StudyPlanPackage.PROGRAMME_LEVEL__SPRING_SEMESTER:
				setSpringSemester((Semester)newValue);
				return;
			case StudyPlanPackage.PROGRAMME_LEVEL__FALL_SEMESTER:
				setFallSemester((Semester)newValue);
				return;
			case StudyPlanPackage.PROGRAMME_LEVEL__NEXT_PROGRAMME_LEVEL:
				getNextProgrammeLevel().clear();
				getNextProgrammeLevel().addAll((Collection<? extends ProgrammeLevel>)newValue);
				return;
			case StudyPlanPackage.PROGRAMME_LEVEL__LEVEL:
				setLevel((level)newValue);
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
			case StudyPlanPackage.PROGRAMME_LEVEL__SPRING_SEMESTER:
				setSpringSemester((Semester)null);
				return;
			case StudyPlanPackage.PROGRAMME_LEVEL__FALL_SEMESTER:
				setFallSemester((Semester)null);
				return;
			case StudyPlanPackage.PROGRAMME_LEVEL__NEXT_PROGRAMME_LEVEL:
				getNextProgrammeLevel().clear();
				return;
			case StudyPlanPackage.PROGRAMME_LEVEL__LEVEL:
				setLevel(LEVEL_EDEFAULT);
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
			case StudyPlanPackage.PROGRAMME_LEVEL__SPRING_SEMESTER:
				return springSemester != null;
			case StudyPlanPackage.PROGRAMME_LEVEL__FALL_SEMESTER:
				return fallSemester != null;
			case StudyPlanPackage.PROGRAMME_LEVEL__NEXT_PROGRAMME_LEVEL:
				return nextProgrammeLevel != null && !nextProgrammeLevel.isEmpty();
			case StudyPlanPackage.PROGRAMME_LEVEL__LEVEL:
				return level != LEVEL_EDEFAULT;
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
		result.append(" (level: ");
		result.append(level);
		result.append(')');
		return result.toString();
	}

} //ProgrammeLevelImpl
