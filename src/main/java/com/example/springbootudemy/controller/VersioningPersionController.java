package com.example.springbootudemy.controller;

import com.example.springbootudemy.entity.Person;
import com.example.springbootudemy.entity.Person2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DuyND
 * @name VersioningPersionController.java
 * @date 25/07/2023
 */
@RestController
@RequestMapping("api/v1")
public class VersioningPersionController {

    @GetMapping("/person")
    public Person getPerson(){
        return new Person("Trần Sơn Giang");
    }
    @GetMapping("/person/ver2")
    public Person2 getPerson2(){
        return new Person2("Nguyễn Đăng","Duy");
    }
}
