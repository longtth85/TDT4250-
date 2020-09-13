/**
 */
package studyPlan.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import studyPlan.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StudyPlanFactoryImpl extends EFactoryImpl implements StudyPlanFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StudyPlanFactory init() {
		try {
			StudyPlanFactory theStudyPlanFactory = (StudyPlanFactory)EPackage.Registry.INSTANCE.getEFactory(StudyPlanPackage.eNS_URI);
			if (theStudyPlanFactory != null) {
				return theStudyPlanFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StudyPlanFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyPlanFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StudyPlanPackage.COURSE: return createCourse();
			case StudyPlanPackage.STUDY_PLAN: return createStudyPlan();
			case StudyPlanPackage.PROGRAMME: return createProgramme();
			case StudyPlanPackage.COURSE_GROUP: return createCourseGroup();
			case StudyPlanPackage.COURSE_IN_PROGRAM: return createCourseInProgram();
			case StudyPlanPackage.PROGRAMME_START: return createProgrammeStart();
			case StudyPlanPackage.PROGRAMME_LEVEL: return createProgrammeLevel();
			case StudyPlanPackage.SEMESTER: return createSemester();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case StudyPlanPackage.SEMESTER_TYPE:
				return createsemesterTypeFromString(eDataType, initialValue);
			case StudyPlanPackage.LEVEL:
				return createlevelFromString(eDataType, initialValue);
			case StudyPlanPackage.COURSE_TYPE:
				return createcourseTypeFromString(eDataType, initialValue);
			case StudyPlanPackage.COURSE_CODE:
				return createCourseCodeFromString(eDataType, initialValue);
			case StudyPlanPackage.CREDIT:
				return createCreditFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case StudyPlanPackage.SEMESTER_TYPE:
				return convertsemesterTypeToString(eDataType, instanceValue);
			case StudyPlanPackage.LEVEL:
				return convertlevelToString(eDataType, instanceValue);
			case StudyPlanPackage.COURSE_TYPE:
				return convertcourseTypeToString(eDataType, instanceValue);
			case StudyPlanPackage.COURSE_CODE:
				return convertCourseCodeToString(eDataType, instanceValue);
			case StudyPlanPackage.CREDIT:
				return convertCreditToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Course createCourse() {
		CourseImpl course = new CourseImpl();
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyPlan createStudyPlan() {
		StudyPlanImpl studyPlan = new StudyPlanImpl();
		return studyPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Programme createProgramme() {
		ProgrammeImpl programme = new ProgrammeImpl();
		return programme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CourseGroup createCourseGroup() {
		CourseGroupImpl courseGroup = new CourseGroupImpl();
		return courseGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Semester createSemester() {
		SemesterImpl semester = new SemesterImpl();
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CourseInProgram createCourseInProgram() {
		CourseInProgramImpl courseInProgram = new CourseInProgramImpl();
		return courseInProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgrammeStart createProgrammeStart() {
		ProgrammeStartImpl programmeStart = new ProgrammeStartImpl();
		return programmeStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgrammeLevel createProgrammeLevel() {
		ProgrammeLevelImpl programmeLevel = new ProgrammeLevelImpl();
		return programmeLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public semesterType createsemesterTypeFromString(EDataType eDataType, String initialValue) {
		semesterType result = semesterType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertsemesterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public level createlevelFromString(EDataType eDataType, String initialValue) {
		level result = level.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertlevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public courseType createcourseTypeFromString(EDataType eDataType, String initialValue) {
		courseType result = courseType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertcourseTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String createCourseCodeFromString(EDataType eDataType, String initialValue) {
		if (! initialValue.matches("[A-Z]+[0-9]+")) {
			throw new IllegalArgumentException("Course code must have the format [Letters] followed by [Numbers]");
		}
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertCourseCodeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createCreditFromString(EDataType eDataType, String initialValue) {
		return (Float)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCreditToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyPlanPackage getStudyPlanPackage() {
		return (StudyPlanPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StudyPlanPackage getPackage() {
		return StudyPlanPackage.eINSTANCE;
	}

} //StudyPlanFactoryImpl
