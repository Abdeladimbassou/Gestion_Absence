import {Component, OnInit} from '@angular/core';
import {Student} from "../models/Student.model";
import {StudentService} from "../services/student.service";
import {Teacher} from "../models/Teacher.model";
import {TeacherService} from "../services/teacher.service";

@Component({
  selector: 'app-teacher',
  templateUrl: './teacher.component.html',
  styleUrls: ['./teacher.component.css']
})
export class TeacherComponent implements OnInit {
  erreurMessage!: object;

  teachers !: Array<Teacher> ;

  constructor( private teacherService:TeacherService){}
  ngOnInit(): void {
    this.teacherService.getTeachers().subscribe({
      next:(data)=>{
        console.log(data)

        this.teachers=data._embedded.teachers
        console.log(this.teachers)

      },error:(err)=>{
        this.erreurMessage=err.message;
        console.log(err)
      }
    })
  }


  handelDeleteTeacher(teacher: Teacher) {

  }

  handelUpdateTeacher(teacher: Teacher) {

  }
}
