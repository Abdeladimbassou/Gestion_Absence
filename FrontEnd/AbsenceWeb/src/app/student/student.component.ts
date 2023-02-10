import { Component } from '@angular/core';
import {StudentService} from "../services/student.service";
import {Absence} from "../models/Absence.model";
import {Student} from "../models/Student.model";
import { Router } from '@angular/router';
@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent {
    constructor(private studentService: StudentService, private router: Router) { }


    students !: Array<Student> ;

    handleDeleteStudent(student: any) {
        if (confirm(`Are you sure you want to delete the student with ID ${student.id}?`)) {
            this.studentService.deleteStudent(student.id)
                .subscribe(

                    () => {
                        this.students = this.students.filter(s => s.id !== student.id);
                    },

                    error => {
                        console.error(error);
                        alert('An error occurred while trying to delete the student.');
                    }
                );
        }
    }

    handleUpdateStudent(student: any) {
        // Navigate to the update student page, passing the student ID as a parameter
        this.router.navigate(['/update-student', student.id]);
    }

}
