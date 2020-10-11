# tdt4250-2020
Repository for the assignments of the course TDT4250 at NTNU

# Assignment 1
## Structure
### `tdt4250.studyPlan.model`
contains the source code and the model
* `src` contains the generated source code
* `model` contains the ECore model, the generator model and a dynamic instance

* `Manually written constraints:` CourseCode EDataType must have the correct format. Also Semester should have minimum of 30 credits total.
* `OCL:` Semester should have minimum of 30 credits and should only contain courses for the proper semester(this one is not correctly implemented).
* `Derived Feature:` attribute name in Eclass Semester is unchangable, transient, volatile and gets it's name from the semester attributes in the Eclass ProgrammeLevel

Course Groups are also not properly implemented

#Assignment 2
The ecore model got simplified to accomadate the assigment and to make implementing model transformation with Acceleo M2T easier.
The model transformation is in the package `tdt4250.studyPlan.model.html`.

The Transformation is viewable in `tdt4250.studyPlan.model.html\src\no\tdt4250\model\html\ntnu.html`

It is also possible to run the transformation by launching `tdt4250.studyPlan.model.html\src\no\tdt4250\model\html\main\generateHTML.mtl` as an Acceleo Program and specifying
`tdt4250.studyPlan.model\model\programmes.xmi` as the instance and your desired target folder.
