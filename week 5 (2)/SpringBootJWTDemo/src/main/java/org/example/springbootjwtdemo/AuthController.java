package org.example.springbootjwtdemo;

import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    @GetMapping("/login")
    public String login(@RequestParam String username) {

        return JwtUtil.generateToken(username);

    }

}