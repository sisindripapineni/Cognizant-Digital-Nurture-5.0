package org.example.springbootloggingdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    private static final Logger logger =
            LoggerFactory.getLogger(StudentController.class);

    @GetMapping("/{id}")
    public String getStudent(@PathVariable int id) {

        logger.info("Fetching student with ID: {}", id);

        if (id <= 0) {
            logger.error("Invalid Student ID: {}", id);
            return "Invalid Student ID";
        }

        logger.info("Student Found Successfully");

        return "Student ID : " + id;
    }
}