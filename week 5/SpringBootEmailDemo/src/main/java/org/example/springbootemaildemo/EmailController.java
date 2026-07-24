package org.example.springbootemaildemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private JavaMailSender mailSender;

    @GetMapping("/send")
    public String sendEmail() {

        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo("receiver@gmail.com");
        message.setSubject("Spring Boot Email");
        message.setText("Hello! This email was sent from Spring Boot.");

        mailSender.send(message);

        return "Email Sent Successfully!";
    }
}