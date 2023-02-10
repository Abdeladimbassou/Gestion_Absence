package emsi.ma.studentservices;

import emsi.ma.studentservices.entities.Student;
import emsi.ma.studentservices.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication

public class StudentServicesApplication implements CommandLineRunner  {

    public static void main(String[] args) {
        SpringApplication.run(StudentServicesApplication.class, args);
    }

    @Autowired
    StudentRepository studentRepository;
    @Autowired
    RepositoryRestConfiguration repositoryRestConfiguration;

    @Override
    public void run(String... args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(Student.class);

        studentRepository.save(new Student(null,"Abdeladim Bassou","TC301362","BK301362",new SimpleDateFormat("dd-MM-yyyy").parse("09-12-2024"),"AHWMO@BZBJR.emsi"));
        studentRepository.save(new Student(null,"Hamza Zouhri","TC301362","BK301362",new Date(45),"AHWMO@BZBJR.emsi"));
        studentRepository.save(new Student(null,"Walid Barragoub","TC301362","TC301362",new Date(45),"AHWMO@BZBJR.emsi"));
    }
}

