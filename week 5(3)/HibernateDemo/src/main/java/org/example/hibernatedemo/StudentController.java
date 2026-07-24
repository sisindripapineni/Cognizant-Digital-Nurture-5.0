package org.example.hibernatedemo.controller;

import org.example.hibernatedemo.entity.Student;
import org.example.hibernatedemo.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final StudentRepository repository;

    public StudentController(StudentRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        return repository.save(student);
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return repository.findAll();
    }
}