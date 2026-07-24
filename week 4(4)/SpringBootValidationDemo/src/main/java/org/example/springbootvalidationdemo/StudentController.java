package org.example.springbootvalidationdemo;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    @PostMapping
    public String addStudent(@Valid @RequestBody Student student) {
        return "Student Added Successfully: " + student.getName();
    }
}