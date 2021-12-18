package com.example.springbootstudentapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootstudentapp.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
//	https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#query-by-example
	List<Student> findByFirstNameContainsAndLastNameContainsAllIgnoreCase(String firstName, String lastName);
}
