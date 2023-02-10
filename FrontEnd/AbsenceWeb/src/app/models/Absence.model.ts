import {Student} from "./Student.model";
import {Subject} from "./Subject.model";

export interface Absence{

  id	:number;
  student: Student;
studentID: number;
cours	:Subject;
courID:number
nbrAbsence:number;


}
