package com.example.springbootudemy.entity;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author DuyND
 * @name User.java
 * @date 09/07/2023
 */
@Getter
@Setter
public class User implements Serializable {

    private int id;

    @NotEmpty(message = "{user.name.not.empty}")
    private String name;
    @Min(value = 18, message = "Tuổi phải >= 18")
    @NotNull
    private int age;
}
