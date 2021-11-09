package com.vicgan.studentmanagementsystem.repository;

import com.vicgan.studentmanagementsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
