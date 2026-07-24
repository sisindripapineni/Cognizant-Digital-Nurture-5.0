package org.example.springbootformdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("student", new Student());
        return "index";
    }

    @PostMapping("/submit")
    public String submit(@ModelAttribute Student student, Model model) {

        model.addAttribute("name", student.getName());

        return "success";
    }
}