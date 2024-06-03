package com.example.contentmaker.controller;


import com.example.contentmaker.student.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/students")
public class StudentsController {

    @GetMapping
    public List<Student> getAllStudents() {
        return List.of(new Student(UUID.randomUUID(), "Rashidullo", "Abdullayev", "abdullayev@gmail.com", Student.Gender.MALE));
    }

}
