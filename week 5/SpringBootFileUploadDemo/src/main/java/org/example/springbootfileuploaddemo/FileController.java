package org.example.springbootfileuploaddemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class FileController {

    @GetMapping("/")
    public String uploadPage() {
        return "upload";
    }

    @PostMapping("/upload")
    public String uploadFile(@RequestParam("file") MultipartFile file)
            throws IOException {

        File destination = new File("uploads");

        if (!destination.exists()) {
            destination.mkdir();
        }

        file.transferTo(new File(destination, file.getOriginalFilename()));

        return "success";
    }
}