package com.vicgan.studentmanagementsystem;

import com.vicgan.studentmanagementsystem.model.Student;
import com.vicgan.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class StudentManagementSystemApplication  implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
//        try {
//            Student student1 = new Student("Vic", "Gan", "vic@email.com");
//            studentRepository.save(student1);
//
//            Student student2 = new Student("Daniel", "Richie", "danrich@gmail.com");
//            studentRepository.save(student2);
//
//            Student student3 = new Student("Den", "Kwakye", "kwakyeh@mail.com");
//            studentRepository.save(student3);
//        }
//        catch  ( Exception e){
//            System.out.println("Exception occurred.");
//        }


    }
}
