package com.example.springbootstudentapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "department")
	private String department;

	@Column(name = "country")
	private String country;
	
	public Student(String firstName, String lastName, String department, String country) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.country = country;
	}

}
