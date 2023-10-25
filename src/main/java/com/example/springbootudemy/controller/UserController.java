package com.example.springbootudemy.controller;

import com.example.springbootudemy.entity.User;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author DuyND
 * @name UserController.java
 * @date 09/07/2023
 */
@RestController
@RequestMapping("api/v1")
public class UserController {

    @GetMapping("/getAllUser")
    public ResponseEntity<User> getAllUser() {
        User user = new User();
        user.setId(1);
        user.setName("Duy");
        user.setAge(25);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/saveUser")
    public ResponseEntity<String> saveUser(@Valid @RequestBody User user) {
        return ResponseEntity.ok("Success");
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
