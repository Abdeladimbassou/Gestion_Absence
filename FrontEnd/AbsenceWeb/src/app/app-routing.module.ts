import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {AbsecnceComponent} from "./absecnce/absecnce.component";
import {StudentComponent} from "./student/student.component";
import {TeacherComponent} from "./teacher/teacher.component";

const routes: Routes = [
  {path:"Abcenses",component : AbsecnceComponent},
  {path:"Students",component:StudentComponent },
  {path:"Teachers",component:TeacherComponent },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
