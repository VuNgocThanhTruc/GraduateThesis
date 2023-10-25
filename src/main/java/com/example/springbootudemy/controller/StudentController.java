package com.example.springbootudemy.controller;

import com.example.springbootudemy.entity.Student;
import com.example.springbootudemy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author DuyND
 * @name StudentController.java
 * @date 09/08/2023
 */
@RestController
@RequestMapping("api/v1")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/student/by-id/{id}")
    public Optional<Student> getStudentById(@PathVariable int id){

        return studentService.getStudentById(id);

    }
}
