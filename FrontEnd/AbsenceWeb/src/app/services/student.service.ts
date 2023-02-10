import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {KeycloakSecurityService} from "./keycloak-security.service";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class StudentService {
    private baseUrl = 'http://localhost:8080/STUDENTS-SERVICE/students';
  constructor(private http:HttpClient,private key:KeycloakSecurityService) { }

  public getStudents(): Observable<any>{

    return this.http.get("http://localhost:8080/STUDENTS-SERVICE/students",
      {headers:new HttpHeaders({
          Authorization:'Bearer '+this.key.kc.token,
        })});


  };
    updateStudent(id: number, value: any): Observable<object> {
        return this.http.put(`${this.baseUrl}/${id}`, value);
    }

    deleteStudent(id: number): Observable<any> {
        return this.http.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
    }
}
