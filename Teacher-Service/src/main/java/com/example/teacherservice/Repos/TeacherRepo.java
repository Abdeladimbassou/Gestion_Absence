package com.example.teacherservice.Repos;

import com.example.teacherservice.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
public interface TeacherRepo extends JpaRepository<Teacher,Long> {

}
