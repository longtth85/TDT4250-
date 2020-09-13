/**
 */
package studyPlan;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see studyPlan.StudyPlanFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/acceleo/query/1.0' settingDelegates='http://www.eclipse.org/acceleo/query/1.0' invocationDelegates='http://www.eclipse.org/acceleo/query/1.0'"
 * @generated
 */
public interface StudyPlanPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "studyPlan";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/tdt4250.studyPlan.model/model/studyPlan.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "studyPlan";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StudyPlanPackage eINSTANCE = studyPlan.impl.StudyPlanPackageImpl.init();

	/**
	 * The meta object id for the '{@link studyPlan.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyPlan.impl.CourseImpl
	 * @see studyPlan.impl.StudyPlanPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CREDIT = 2;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Programme Course</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__PROGRAMME_COURSE = 4;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link studyPlan.impl.StudyPlanImpl <em>Study Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyPlan.impl.StudyPlanImpl
	 * @see studyPlan.impl.StudyPlanPackageImpl#getStudyPlan()
	 * @generated
	 */
	int STUDY_PLAN = 1;

	/**
	 * The feature id for the '<em><b>Programmes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN__PROGRAMMES = 0;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN__COURSES = 1;

	/**
	 * The number of structural features of the '<em>Study Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Study Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link studyPlan.impl.ProgrammeImpl <em>Programme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyPlan.impl.ProgrammeImpl
	 * @see studyPlan.impl.StudyPlanPackageImpl#getProgramme()
	 * @generated
	 */
	int PROGRAMME = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__NAME = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__CODE = 1;

	/**
	 * The feature id for the '<em><b>Programme Start</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__PROGRAMME_START = 2;

	/**
	 * The number of structural features of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link studyPlan.impl.CourseGroupImpl <em>Course Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyPlan.impl.CourseGroupImpl
	 * @see studyPlan.impl.StudyPlanPackageImpl#getCourseGroup()
	 * @generated
	 */
	int COURSE_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP__COURSES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP__NAME = 1;

	/**
	 * The feature id for the '<em><b>Course Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP__COURSE_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Course Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Course Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link studyPlan.impl.SemesterImpl <em>Semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyPlan.impl.SemesterImpl
	 * @see studyPlan.impl.StudyPlanPackageImpl#getSemester()
	 * @generated
	 */
	int SEMESTER = 7;

	/**
	 * The meta object id for the '{@link studyPlan.impl.CourseInProgramImpl <em>Course In Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyPlan.impl.CourseInProgramImpl
	 * @see studyPlan.impl.StudyPlanPackageImpl#getCourseInProgram()
	 * @generated
	 */
	int COURSE_IN_PROGRAM = 4;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_IN_PROGRAM__SEMESTER = 0;

	/**
	 * The feature id for the '<em><b>Course</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_IN_PROGRAM__COURSE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_IN_PROGRAM__NAME = 2;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_IN_PROGRAM__YEAR = 3;

	/**
	 * The number of structural features of the '<em>Course In Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_IN_PROGRAM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Course In Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_IN_PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link studyPlan.impl.ProgrammeStartImpl <em>Programme Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyPlan.impl.ProgrammeStartImpl
	 * @see studyPlan.impl.StudyPlanPackageImpl#getProgrammeStart()
	 * @generated
	 */
	int PROGRAMME_START = 5;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_START__YEAR = 0;

	/**
	 * The feature id for the '<em><b>Programme</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_START__PROGRAMME = 1;

	/**
	 * The feature id for the '<em><b>Programme Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_START__PROGRAMME_LEVEL = 2;

	/**
	 * The number of structural features of the '<em>Programme Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_START_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Programme Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_START_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link studyPlan.impl.ProgrammeLevelImpl <em>Programme Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyPlan.impl.ProgrammeLevelImpl
	 * @see studyPlan.impl.StudyPlanPackageImpl#getProgrammeLevel()
	 * @generated
	 */
	int PROGRAMME_LEVEL = 6;

	/**
	 * The feature id for the '<em><b>Spring Semester</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_LEVEL__SPRING_SEMESTER = 0;

	/**
	 * The feature id for the '<em><b>Fall Semester</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_LEVEL__FALL_SEMESTER = 1;

	/**
	 * The feature id for the '<em><b>Next Programme Level</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_LEVEL__NEXT_PROGRAMME_LEVEL = 2;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_LEVEL__LEVEL = 3;

	/**
	 * The number of structural features of the '<em>Programme Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_LEVEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Programme Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_LEVEL_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__COURSES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Course Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__COURSE_GROUP = 2;

	/**
	 * The number of structural features of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link studyPlan.semesterType <em>semester Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyPlan.semesterType
	 * @see studyPlan.impl.StudyPlanPackageImpl#getsemesterType()
	 * @generated
	 */
	int SEMESTER_TYPE = 8;

	/**
	 * The meta object id for the '{@link studyPlan.level <em>level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyPlan.level
	 * @see studyPlan.impl.StudyPlanPackageImpl#getlevel()
	 * @generated
	 */
	int LEVEL = 9;

	/**
	 * The meta object id for the '{@link studyPlan.courseType <em>course Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyPlan.courseType
	 * @see studyPlan.impl.StudyPlanPackageImpl#getcourseType()
	 * @generated
	 */
	int COURSE_TYPE = 10;

	/**
	 * The meta object id for the '<em>Course Code</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see studyPlan.impl.StudyPlanPackageImpl#getCourseCode()
	 * @generated
	 */
	int COURSE_CODE = 11;


	/**
	 * The meta object id for the '<em>Credit</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyPlan.impl.StudyPlanPackageImpl#getCredit()
	 * @generated
	 */
	int CREDIT = 12;


	/**
	 * Returns the meta object for class '{@link studyPlan.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see studyPlan.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link studyPlan.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see studyPlan.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link studyPlan.Course#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see studyPlan.Course#getCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Code();

	/**
	 * Returns the meta object for the attribute '{@link studyPlan.Course#getCredit <em>Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit</em>'.
	 * @see studyPlan.Course#getCredit()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Credit();

	/**
	 * Returns the meta object for the attribute '{@link studyPlan.Course#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see studyPlan.Course#getLevel()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Level();

	/**
	 * Returns the meta object for the containment reference list '{@link studyPlan.Course#getProgrammeCourse <em>Programme Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programme Course</em>'.
	 * @see studyPlan.Course#getProgrammeCourse()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_ProgrammeCourse();

	/**
	 * Returns the meta object for class '{@link studyPlan.StudyPlan <em>Study Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Study Plan</em>'.
	 * @see studyPlan.StudyPlan
	 * @generated
	 */
	EClass getStudyPlan();

	/**
	 * Returns the meta object for the containment reference list '{@link studyPlan.StudyPlan#getProgrammes <em>Programmes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programmes</em>'.
	 * @see studyPlan.StudyPlan#getProgrammes()
	 * @see #getStudyPlan()
	 * @generated
	 */
	EReference getStudyPlan_Programmes();

	/**
	 * Returns the meta object for the containment reference list '{@link studyPlan.StudyPlan#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see studyPlan.StudyPlan#getCourses()
	 * @see #getStudyPlan()
	 * @generated
	 */
	EReference getStudyPlan_Courses();

	/**
	 * Returns the meta object for class '{@link studyPlan.Programme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programme</em>'.
	 * @see studyPlan.Programme
	 * @generated
	 */
	EClass getProgramme();

	/**
	 * Returns the meta object for the attribute '{@link studyPlan.Programme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see studyPlan.Programme#getName()
	 * @see #getProgramme()
	 * @generated
	 */
	EAttribute getProgramme_Name();

	/**
	 * Returns the meta object for the attribute '{@link studyPlan.Programme#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see studyPlan.Programme#getCode()
	 * @see #getProgramme()
	 * @generated
	 */
	EAttribute getProgramme_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link studyPlan.Programme#getProgrammeStart <em>Programme Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programme Start</em>'.
	 * @see studyPlan.Programme#getProgrammeStart()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_ProgrammeStart();

	/**
	 * Returns the meta object for class '{@link studyPlan.CourseGroup <em>Course Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Group</em>'.
	 * @see studyPlan.CourseGroup
	 * @generated
	 */
	EClass getCourseGroup();

	/**
	 * Returns the meta object for the reference list '{@link studyPlan.CourseGroup#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Courses</em>'.
	 * @see studyPlan.CourseGroup#getCourses()
	 * @see #getCourseGroup()
	 * @generated
	 */
	EReference getCourseGroup_Courses();

	/**
	 * Returns the meta object for the attribute '{@link studyPlan.CourseGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see studyPlan.CourseGroup#getName()
	 * @see #getCourseGroup()
	 * @generated
	 */
	EAttribute getCourseGroup_Name();

	/**
	 * Returns the meta object for the attribute '{@link studyPlan.CourseGroup#getCourseType <em>Course Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course Type</em>'.
	 * @see studyPlan.CourseGroup#getCourseType()
	 * @see #getCourseGroup()
	 * @generated
	 */
	EAttribute getCourseGroup_CourseType();

	/**
	 * Returns the meta object for class '{@link studyPlan.Semester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semester</em>'.
	 * @see studyPlan.Semester
	 * @generated
	 */
	EClass getSemester();

	/**
	 * Returns the meta object for the reference list '{@link studyPlan.Semester#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Courses</em>'.
	 * @see studyPlan.Semester#getCourses()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_Courses();

	/**
	 * Returns the meta object for the attribute '{@link studyPlan.Semester#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see studyPlan.Semester#getName()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_Name();

	/**
	 * Returns the meta object for the containment reference '{@link studyPlan.Semester#getCourseGroup <em>Course Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Course Group</em>'.
	 * @see studyPlan.Semester#getCourseGroup()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_CourseGroup();

	/**
	 * Returns the meta object for class '{@link studyPlan.CourseInProgram <em>Course In Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course In Program</em>'.
	 * @see studyPlan.CourseInProgram
	 * @generated
	 */
	EClass getCourseInProgram();

	/**
	 * Returns the meta object for the attribute '{@link studyPlan.CourseInProgram#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semester</em>'.
	 * @see studyPlan.CourseInProgram#getSemester()
	 * @see #getCourseInProgram()
	 * @generated
	 */
	EAttribute getCourseInProgram_Semester();

	/**
	 * Returns the meta object for the container reference '{@link studyPlan.CourseInProgram#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Course</em>'.
	 * @see studyPlan.CourseInProgram#getCourse()
	 * @see #getCourseInProgram()
	 * @generated
	 */
	EReference getCourseInProgram_Course();

	/**
	 * Returns the meta object for the attribute '{@link studyPlan.CourseInProgram#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see studyPlan.CourseInProgram#getYear()
	 * @see #getCourseInProgram()
	 * @generated
	 */
	EAttribute getCourseInProgram_Year();

	/**
	 * Returns the meta object for the attribute '{@link studyPlan.CourseInProgram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see studyPlan.CourseInProgram#getName()
	 * @see #getCourseInProgram()
	 * @generated
	 */
	EAttribute getCourseInProgram_Name();

	/**
	 * Returns the meta object for class '{@link studyPlan.ProgrammeStart <em>Programme Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programme Start</em>'.
	 * @see studyPlan.ProgrammeStart
	 * @generated
	 */
	EClass getProgrammeStart();

	/**
	 * Returns the meta object for the attribute '{@link studyPlan.ProgrammeStart#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see studyPlan.ProgrammeStart#getYear()
	 * @see #getProgrammeStart()
	 * @generated
	 */
	EAttribute getProgrammeStart_Year();

	/**
	 * Returns the meta object for the container reference '{@link studyPlan.ProgrammeStart#getProgramme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Programme</em>'.
	 * @see studyPlan.ProgrammeStart#getProgramme()
	 * @see #getProgrammeStart()
	 * @generated
	 */
	EReference getProgrammeStart_Programme();

	/**
	 * Returns the meta object for the containment reference '{@link studyPlan.ProgrammeStart#getProgrammeLevel <em>Programme Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Programme Level</em>'.
	 * @see studyPlan.ProgrammeStart#getProgrammeLevel()
	 * @see #getProgrammeStart()
	 * @generated
	 */
	EReference getProgrammeStart_ProgrammeLevel();

	/**
	 * Returns the meta object for class '{@link studyPlan.ProgrammeLevel <em>Programme Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programme Level</em>'.
	 * @see studyPlan.ProgrammeLevel
	 * @generated
	 */
	EClass getProgrammeLevel();

	/**
	 * Returns the meta object for the containment reference '{@link studyPlan.ProgrammeLevel#getSpringSemester <em>Spring Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spring Semester</em>'.
	 * @see studyPlan.ProgrammeLevel#getSpringSemester()
	 * @see #getProgrammeLevel()
	 * @generated
	 */
	EReference getProgrammeLevel_SpringSemester();

	/**
	 * Returns the meta object for the containment reference '{@link studyPlan.ProgrammeLevel#getFallSemester <em>Fall Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fall Semester</em>'.
	 * @see studyPlan.ProgrammeLevel#getFallSemester()
	 * @see #getProgrammeLevel()
	 * @generated
	 */
	EReference getProgrammeLevel_FallSemester();

	/**
	 * Returns the meta object for the containment reference list '{@link studyPlan.ProgrammeLevel#getNextProgrammeLevel <em>Next Programme Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Next Programme Level</em>'.
	 * @see studyPlan.ProgrammeLevel#getNextProgrammeLevel()
	 * @see #getProgrammeLevel()
	 * @generated
	 */
	EReference getProgrammeLevel_NextProgrammeLevel();

	/**
	 * Returns the meta object for the attribute '{@link studyPlan.ProgrammeLevel#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see studyPlan.ProgrammeLevel#getLevel()
	 * @see #getProgrammeLevel()
	 * @generated
	 */
	EAttribute getProgrammeLevel_Level();

	/**
	 * Returns the meta object for enum '{@link studyPlan.semesterType <em>semester Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>semester Type</em>'.
	 * @see studyPlan.semesterType
	 * @generated
	 */
	EEnum getsemesterType();

	/**
	 * Returns the meta object for enum '{@link studyPlan.level <em>level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>level</em>'.
	 * @see studyPlan.level
	 * @generated
	 */
	EEnum getlevel();

	/**
	 * Returns the meta object for enum '{@link studyPlan.courseType <em>course Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>course Type</em>'.
	 * @see studyPlan.courseType
	 * @generated
	 */
	EEnum getcourseType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Course Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Course Code</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="pattern='\\p{L}+\\d+'"
	 * @generated
	 */
	EDataType getCourseCode();

	/**
	 * Returns the meta object for data type '<em>Credit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Credit</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="minExclusive='0.0' maxInclusive='10.0'"
	 * @generated
	 */
	EDataType getCredit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StudyPlanFactory getStudyPlanFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link studyPlan.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyPlan.impl.CourseImpl
		 * @see studyPlan.impl.StudyPlanPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CODE = eINSTANCE.getCourse_Code();

		/**
		 * The meta object literal for the '<em><b>Credit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CREDIT = eINSTANCE.getCourse_Credit();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__LEVEL = eINSTANCE.getCourse_Level();

		/**
		 * The meta object literal for the '<em><b>Programme Course</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__PROGRAMME_COURSE = eINSTANCE.getCourse_ProgrammeCourse();

		/**
		 * The meta object literal for the '{@link studyPlan.impl.StudyPlanImpl <em>Study Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyPlan.impl.StudyPlanImpl
		 * @see studyPlan.impl.StudyPlanPackageImpl#getStudyPlan()
		 * @generated
		 */
		EClass STUDY_PLAN = eINSTANCE.getStudyPlan();

		/**
		 * The meta object literal for the '<em><b>Programmes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PLAN__PROGRAMMES = eINSTANCE.getStudyPlan_Programmes();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PLAN__COURSES = eINSTANCE.getStudyPlan_Courses();

		/**
		 * The meta object literal for the '{@link studyPlan.impl.ProgrammeImpl <em>Programme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyPlan.impl.ProgrammeImpl
		 * @see studyPlan.impl.StudyPlanPackageImpl#getProgramme()
		 * @generated
		 */
		EClass PROGRAMME = eINSTANCE.getProgramme();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME__NAME = eINSTANCE.getProgramme_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME__CODE = eINSTANCE.getProgramme_Code();

		/**
		 * The meta object literal for the '<em><b>Programme Start</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__PROGRAMME_START = eINSTANCE.getProgramme_ProgrammeStart();

		/**
		 * The meta object literal for the '{@link studyPlan.impl.CourseGroupImpl <em>Course Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyPlan.impl.CourseGroupImpl
		 * @see studyPlan.impl.StudyPlanPackageImpl#getCourseGroup()
		 * @generated
		 */
		EClass COURSE_GROUP = eINSTANCE.getCourseGroup();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_GROUP__COURSES = eINSTANCE.getCourseGroup_Courses();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_GROUP__NAME = eINSTANCE.getCourseGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Course Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_GROUP__COURSE_TYPE = eINSTANCE.getCourseGroup_CourseType();

		/**
		 * The meta object literal for the '{@link studyPlan.impl.SemesterImpl <em>Semester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyPlan.impl.SemesterImpl
		 * @see studyPlan.impl.StudyPlanPackageImpl#getSemester()
		 * @generated
		 */
		EClass SEMESTER = eINSTANCE.getSemester();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__COURSES = eINSTANCE.getSemester_Courses();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__NAME = eINSTANCE.getSemester_Name();

		/**
		 * The meta object literal for the '<em><b>Course Group</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__COURSE_GROUP = eINSTANCE.getSemester_CourseGroup();

		/**
		 * The meta object literal for the '{@link studyPlan.impl.CourseInProgramImpl <em>Course In Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyPlan.impl.CourseInProgramImpl
		 * @see studyPlan.impl.StudyPlanPackageImpl#getCourseInProgram()
		 * @generated
		 */
		EClass COURSE_IN_PROGRAM = eINSTANCE.getCourseInProgram();

		/**
		 * The meta object literal for the '<em><b>Semester</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_IN_PROGRAM__SEMESTER = eINSTANCE.getCourseInProgram_Semester();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_IN_PROGRAM__COURSE = eINSTANCE.getCourseInProgram_Course();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_IN_PROGRAM__YEAR = eINSTANCE.getCourseInProgram_Year();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_IN_PROGRAM__NAME = eINSTANCE.getCourseInProgram_Name();

		/**
		 * The meta object literal for the '{@link studyPlan.impl.ProgrammeStartImpl <em>Programme Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyPlan.impl.ProgrammeStartImpl
		 * @see studyPlan.impl.StudyPlanPackageImpl#getProgrammeStart()
		 * @generated
		 */
		EClass PROGRAMME_START = eINSTANCE.getProgrammeStart();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME_START__YEAR = eINSTANCE.getProgrammeStart_Year();

		/**
		 * The meta object literal for the '<em><b>Programme</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME_START__PROGRAMME = eINSTANCE.getProgrammeStart_Programme();

		/**
		 * The meta object literal for the '<em><b>Programme Level</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME_START__PROGRAMME_LEVEL = eINSTANCE.getProgrammeStart_ProgrammeLevel();

		/**
		 * The meta object literal for the '{@link studyPlan.impl.ProgrammeLevelImpl <em>Programme Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyPlan.impl.ProgrammeLevelImpl
		 * @see studyPlan.impl.StudyPlanPackageImpl#getProgrammeLevel()
		 * @generated
		 */
		EClass PROGRAMME_LEVEL = eINSTANCE.getProgrammeLevel();

		/**
		 * The meta object literal for the '<em><b>Spring Semester</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME_LEVEL__SPRING_SEMESTER = eINSTANCE.getProgrammeLevel_SpringSemester();

		/**
		 * The meta object literal for the '<em><b>Fall Semester</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME_LEVEL__FALL_SEMESTER = eINSTANCE.getProgrammeLevel_FallSemester();

		/**
		 * The meta object literal for the '<em><b>Next Programme Level</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME_LEVEL__NEXT_PROGRAMME_LEVEL = eINSTANCE.getProgrammeLevel_NextProgrammeLevel();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME_LEVEL__LEVEL = eINSTANCE.getProgrammeLevel_Level();

		/**
		 * The meta object literal for the '{@link studyPlan.semesterType <em>semester Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyPlan.semesterType
		 * @see studyPlan.impl.StudyPlanPackageImpl#getsemesterType()
		 * @generated
		 */
		EEnum SEMESTER_TYPE = eINSTANCE.getsemesterType();

		/**
		 * The meta object literal for the '{@link studyPlan.level <em>level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyPlan.level
		 * @see studyPlan.impl.StudyPlanPackageImpl#getlevel()
		 * @generated
		 */
		EEnum LEVEL = eINSTANCE.getlevel();

		/**
		 * The meta object literal for the '{@link studyPlan.courseType <em>course Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyPlan.courseType
		 * @see studyPlan.impl.StudyPlanPackageImpl#getcourseType()
		 * @generated
		 */
		EEnum COURSE_TYPE = eINSTANCE.getcourseType();

		/**
		 * The meta object literal for the '<em>Course Code</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see studyPlan.impl.StudyPlanPackageImpl#getCourseCode()
		 * @generated
		 */
		EDataType COURSE_CODE = eINSTANCE.getCourseCode();

		/**
		 * The meta object literal for the '<em>Credit</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyPlan.impl.StudyPlanPackageImpl#getCredit()
		 * @generated
		 */
		EDataType CREDIT = eINSTANCE.getCredit();

	}

} //StudyPlanPackage
