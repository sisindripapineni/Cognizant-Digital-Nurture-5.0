package org.example.springbootpathvariabledemo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/{id}")
    public String getStudent(@PathVariable int id) {
        return "Student ID: " + id;
    }

    @GetMapping("/details")
    public String getDetails(@RequestParam String name) {
        return "Student Name: " + name;
    }
}