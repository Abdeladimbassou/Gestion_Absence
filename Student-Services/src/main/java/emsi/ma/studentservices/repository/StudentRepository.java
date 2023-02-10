package emsi.ma.studentservices.repository;

import emsi.ma.studentservices.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
public interface StudentRepository extends JpaRepository<Student, Long> {


}
