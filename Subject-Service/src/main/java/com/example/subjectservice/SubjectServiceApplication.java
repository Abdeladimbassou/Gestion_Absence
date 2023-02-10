package com.example.subjectservice;

import com.example.subjectservice.entities.Cour;
import com.example.subjectservice.repos.CoursRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class SubjectServiceApplication implements CommandLineRunner {

    @Autowired
    CoursRepo coursRepo;
    public static void main(String[] args) {
        SpringApplication.run(SubjectServiceApplication.class, args);
    }

    @Autowired
    RepositoryRestConfiguration repositoryRestConfiguration;

    @Override
    public void run(String... args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(Cour.class);

        coursRepo.save(new Cour(null,"RO","5IIR",50));
        coursRepo.save(new Cour(null,"JEE","5IIR",100));
        coursRepo.save(new Cour(null,"ERP","5IIR",70));

        coursRepo.save(new Cour(null,"SIG","5IIR",47));
        coursRepo.save(new Cour(null,"C++","5IIR",82));
        coursRepo.save(new Cour(null,"Management","5IIR",73));
    }
}
