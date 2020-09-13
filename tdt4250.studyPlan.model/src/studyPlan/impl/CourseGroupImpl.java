/**
 */
package studyPlan.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import studyPlan.CourseGroup;
import studyPlan.CourseInProgram;
import studyPlan.StudyPlanPackage;
import studyPlan.courseType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyPlan.impl.CourseGroupImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link studyPlan.impl.CourseGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link studyPlan.impl.CourseGroupImpl#getCourseType <em>Course Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseGroupImpl extends MinimalEObjectImpl.Container implements CourseGroup {
	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseInProgram> courses;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCourseType() <em>Course Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseType()
	 * @generated
	 * @ordered
	 */
	protected static final courseType COURSE_TYPE_EDEFAULT = courseType.MANDATORY;

	/**
	 * The cached value of the '{@link #getCourseType() <em>Course Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseType()
	 * @generated
	 * @ordered
	 */
	protected courseType courseType = COURSE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyPlanPackage.Literals.COURSE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CourseInProgram> getCourses() {
		if (courses == null) {
			courses = new EObjectResolvingEList<CourseInProgram>(CourseInProgram.class, this, StudyPlanPackage.COURSE_GROUP__COURSES);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPlanPackage.COURSE_GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public courseType getCourseType() {
		return courseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCourseType(courseType newCourseType) {
		courseType oldCourseType = courseType;
		courseType = newCourseType == null ? COURSE_TYPE_EDEFAULT : newCourseType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPlanPackage.COURSE_GROUP__COURSE_TYPE, oldCourseType, courseType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyPlanPackage.COURSE_GROUP__COURSES:
				return getCourses();
			case StudyPlanPackage.COURSE_GROUP__NAME:
				return getName();
			case StudyPlanPackage.COURSE_GROUP__COURSE_TYPE:
				return getCourseType();
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
			case StudyPlanPackage.COURSE_GROUP__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends CourseInProgram>)newValue);
				return;
			case StudyPlanPackage.COURSE_GROUP__NAME:
				setName((String)newValue);
				return;
			case StudyPlanPackage.COURSE_GROUP__COURSE_TYPE:
				setCourseType((courseType)newValue);
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
			case StudyPlanPackage.COURSE_GROUP__COURSES:
				getCourses().clear();
				return;
			case StudyPlanPackage.COURSE_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StudyPlanPackage.COURSE_GROUP__COURSE_TYPE:
				setCourseType(COURSE_TYPE_EDEFAULT);
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
			case StudyPlanPackage.COURSE_GROUP__COURSES:
				return courses != null && !courses.isEmpty();
			case StudyPlanPackage.COURSE_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StudyPlanPackage.COURSE_GROUP__COURSE_TYPE:
				return courseType != COURSE_TYPE_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", courseType: ");
		result.append(courseType);
		result.append(')');
		return result.toString();
	}

} //CourseGroupImpl
