package org.example.springbootrestdemo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Student!";
    }

    @GetMapping("/name")
    public String name() {
        return "Name: Sathwik";
    }

    @GetMapping("/course")
    public String course() {
        return "Course: Java Full Stack";
    }
}