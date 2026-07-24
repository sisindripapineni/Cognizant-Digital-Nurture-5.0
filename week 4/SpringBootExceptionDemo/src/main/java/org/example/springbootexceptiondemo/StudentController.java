package org.example.springbootexceptiondemo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    @GetMapping("/{id}")
    public String getStudent(@PathVariable int id) {

        if (id <= 0) {
            throw new RuntimeException("Invalid Student ID");
        }

        return "Student ID : " + id;
    }
}