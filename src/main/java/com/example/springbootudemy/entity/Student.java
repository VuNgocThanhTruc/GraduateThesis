package com.example.springbootudemy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * @author DuyND
 * @name Student.java
 * @date 09/08/2023
 */
@Entity
@Table(name = "student")
@Getter
@Setter
public class Student {

    @Id
    private int id;

    private String name;
}
