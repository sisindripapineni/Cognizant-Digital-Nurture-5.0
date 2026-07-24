package org.example.springbootcruddemo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    List<Student> students = new ArrayList<>();

    public StudentController() {
        students.add(new Student(101, "Sathwik"));
        students.add(new Student(102, "Rahul"));
    }

    @GetMapping
    public List<Student> getStudents() {
        return students;
    }

    @PostMapping
    public String addStudent(@RequestBody Student student) {
        students.add(student);
        return "Student Added Successfully";
    }

    @PutMapping("/{id}")
    public String updateStudent(@PathVariable int id, @RequestBody Student student) {

        for (Student s : students) {
            if (s.getId() == id) {
                s.setName(student.getName());
                return "Student Updated Successfully";
            }
        }

        return "Student Not Found";
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {

        students.removeIf(s -> s.getId() == id);

        return "Student Deleted Successfully";
    }
}