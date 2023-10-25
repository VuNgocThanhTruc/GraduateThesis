package com.example.springbootudemy.repository;

import com.example.springbootudemy.entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

/**
 * @author DuyND
 * @name StudentRepository.java
 * @date 09/08/2023
 */
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
