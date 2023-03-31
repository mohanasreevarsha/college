package com.momin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.momin.model.Student;
import com.momin.service.StudentService;

@RestController
@CrossOrigin("*")
@RequestMapping("sathya")
public class StudentController {

	@Autowired
	private StudentService services;
	
	@PostMapping("/savestudent")
	public Student saveProduct(@RequestBody Student s) {
	    return services.saveStudent(s);
	}
	
	
	@DeleteMapping("/deletestudent/{id}")
	public boolean deleteProduct(@PathVariable int id) {
		return services.deleteStudent(id);
	}
	
	
	@GetMapping("/getonestudent/{id}")
	public  Student getStudent(@PathVariable int id) {
		return services.getStudent(id);
	}
	
	@GetMapping("/getallstudent")
	public List<Student> getStudents(){
       return services.getStudents();
	}
	
	@PutMapping("/updatestudent")
	public Student updateStudent(@RequestBody Student s){
		return services.updateStudent(s);
	}
	
	@PostMapping("/studentlogin")
	public  boolean StudentLogin(@RequestBody Student s) {
		
		return services.studentLogin(s);
	}
	
	
}
