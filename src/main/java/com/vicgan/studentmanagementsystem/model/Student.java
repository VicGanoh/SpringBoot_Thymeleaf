package com.vicgan.studentmanagementsystem.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

@Entity
@Table
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    @NotNull(message = "first name cannot be null")
    private String firstName;

    @NotNull(message = "last name cannot be null")
    @Column(nullable = false)
    private String lastName;

    @NotNull(message = "email cannot be null")
    @Column(nullable = false)
    @Email(message = "Enter a valid email address")
    private String email;

//    @Column
//    @Past(message = "Date of birth must be in the past")
//    private LocalDate dob;

    public Student() {
    }

    public long getId() {
        return id;
    }

    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        //this.dob = dob;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public LocalDate getDob() {
//        return dob;
//    }

//    public void setDob(LocalDate dob) {
//        this.dob = dob;
//    }

//    public int getAge() {
//        return Period.between(this.dob, LocalDate.now()).getYears();
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
}
