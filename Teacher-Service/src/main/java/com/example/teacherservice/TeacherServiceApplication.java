package com.example.teacherservice;

import com.example.teacherservice.Repos.TeacherRepo;
import com.example.teacherservice.entities.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class TeacherServiceApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(TeacherServiceApplication.class, args);
    }

    @Autowired
    TeacherRepo teacherRepo;
    @Override
    public void run(String... args) throws Exception {
        teacherRepo.save(new Teacher(null,"Abdeladim BASSOU","TC301362",new SimpleDateFormat("dd-MM-yyyy").parse("09-12-2024"),"AHWMO@BZBJR.emsi"));
        teacherRepo.save(new Teacher(null,"Hamza ZOUHRI","TC301362",new SimpleDateFormat("dd-MM-yyyy").parse("09-12-2024"),"AHWMO@BZBJR.emsi"));
        teacherRepo.save(new Teacher(null,"Walid Barragoub","TC301362",new SimpleDateFormat("dd-MM-yyyy").parse("09-12-2024"),"AHWMO@BZBJR.emsi"));
        teacherRepo.save(new Teacher(null,"Mohammed Saad Jaouhari","TC301362",new SimpleDateFormat("dd-MM-yyyy").parse("09-12-2024"),"AHWMO@BZBJR.emsi"));
        teacherRepo.save(new Teacher(null,"Omar RASSIF","TC301362",new SimpleDateFormat("dd-MM-yyyy").parse("09-12-2024"),"AHWMO@BZBJR.emsi"));
    }
}
