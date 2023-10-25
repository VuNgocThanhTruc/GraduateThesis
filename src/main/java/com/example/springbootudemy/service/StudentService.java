package com.example.springbootudemy.service;

import com.example.springbootudemy.entity.Student;
import com.example.springbootudemy.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * @author DuyND
 * @name StudentService.java
 * @date 09/08/2023
 */
@Service
@Transactional(readOnly = true)
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Optional<Student> getStudentById(int id){
        return studentRepository.findById(id);
    }


}
