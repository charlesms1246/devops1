package com.example.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {
    
    @GetMapping("/")
    public String getStudent() {
        return "Hello, Student!";
    }

}
