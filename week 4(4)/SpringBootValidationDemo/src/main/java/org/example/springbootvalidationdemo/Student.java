package org.example.springbootvalidationdemo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Student {

    @NotBlank(message = "Name cannot be empty")
    @Size(min = 3, max = 20, message = "Name must contain 3 to 20 characters")
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}