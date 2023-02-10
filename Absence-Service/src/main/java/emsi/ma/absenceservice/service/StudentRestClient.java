package emsi.ma.absenceservice.service;

import emsi.ma.absenceservice.models.Student;
import feign.RequestInterceptor;
import org.keycloak.KeycloakSecurityContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="STUDENTS-SERVICE")
public interface StudentRestClient {

    @GetMapping(path="/students/{id}")
    Student getStudentById(@PathVariable Long id);

    @GetMapping(path="/students")
    List<Student> getStudents();

}
