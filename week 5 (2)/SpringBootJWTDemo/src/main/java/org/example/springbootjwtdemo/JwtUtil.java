package org.example.springbootjwtdemo;

import java.util.Base64;

public class JwtUtil {

    public static String generateToken(String username) {

        return Base64.getEncoder()
                .encodeToString((username + ":token").getBytes());
    }

}