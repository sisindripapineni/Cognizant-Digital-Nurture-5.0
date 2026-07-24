package org.example.hibernatedemo.repository;

import org.example.hibernatedemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}