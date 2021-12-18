package com.example.springbootstudentapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springbootstudentapp.entity.Student;
import com.example.springbootstudentapp.repository.StudentRepository;


@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepository studentRepository;

	@Override
	@Transactional
	public List<Student> findAll() {
		List<Student> students = studentRepository.findAll();
		return students;
	}

	@Override
	@Transactional
	public Student findById(int theId) {
		return studentRepository.findById(theId).get();
	}

	@Override
	@Transactional
	public void save(Student theStudent) {
		studentRepository.save(theStudent);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		studentRepository.deleteById(theId);
	}

	@Override
	@Transactional
	public List<Student> searchBy(String firstName, String lastName) {
		List<Student> books = studentRepository.findByFirstNameContainsAndLastNameContainsAllIgnoreCase(firstName, lastName);
		return books;
	}
}
