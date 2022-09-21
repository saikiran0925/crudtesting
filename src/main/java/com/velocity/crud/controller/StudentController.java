package com.velocity.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.velocity.crud.entity.Student;

import com.velocity.crud.service.StudentServiceImpl;



@RestController
public class StudentController {

	@Autowired
	StudentServiceImpl studentService;
	
	
	
	
	
	@GetMapping("/students")
	public List<Student> students(){
		return studentService.getAllStudents();
	}
	
	
	@PostMapping("/students")
	public Student register(@RequestBody Student student) {
		return studentService.saveStudent(student);
		}
	
	@GetMapping("/students/{id}")
	public Student studentById(@PathVariable Integer id) {
		return studentService.getStudentById(id);
	}
	
	@DeleteMapping("students/{id}")
	public void deleteById(@PathVariable Integer id) {
		studentService.deleteStudentById(id);
	}
}
