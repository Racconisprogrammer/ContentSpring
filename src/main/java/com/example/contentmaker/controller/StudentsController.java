package com.example.contentmaker.controller;


import com.example.contentmaker.student.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentsController {

    @GetMapping
    public List<Student> getAllStudents() {

    }

}
