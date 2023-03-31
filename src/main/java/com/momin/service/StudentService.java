package com.momin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.momin.model.Student;

@Service
public interface StudentService {
	public Student getStudent(Integer id);
	public List<Student> getStudents();
	public Student saveStudent(Student s);
	public Student updateStudent(Student s);
	public boolean deleteStudent(Integer id);
	public boolean studentLogin(Student s);
	
	

}
