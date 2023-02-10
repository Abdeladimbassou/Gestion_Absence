import {Component, OnInit} from '@angular/core';
import {AbsenceService} from "../services/absence.service";
import {Absence} from "../models/Absence.model";

@Component({
  selector: 'app-absecnce',
  templateUrl: './absecnce.component.html',
  styleUrls: ['./absecnce.component.css']
})
export class AbsecnceComponent implements OnInit {

  constructor(private absenceService : AbsenceService) {}
  erreurMessage!: object;

  absences !: Array<Absence> ;

  ngOnInit(): void {

    this.absenceService.getAbsences().subscribe({
      next:(data)=>{
        console.log(data)

        this.absences=data
      },error:(err)=>{
        this.erreurMessage=err.message;
        console.log(err)
      }
    })
  }

  handelUpdateAbsence(absence: Absence) {
    
  }

  handelDeleteAbsence(absence: Absence) {
    
  }
}
