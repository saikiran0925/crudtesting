package com.velocity.crud.service;

import java.util.List;

import com.velocity.crud.entity.Student;

public interface StudentService {

	
	Student saveStudent(Student student);
	List<Student> getAllStudents(); 
	Student getStudentById(Integer id);
	void deleteStudentById(Integer id);
	
	List<String> restCheck();
	
	
}
