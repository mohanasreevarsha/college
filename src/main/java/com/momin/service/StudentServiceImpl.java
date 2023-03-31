package com.momin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.momin.model.Student;
import com.momin.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepo sRepo;
	

	@Override
	public Student saveStudent(Student s) {
		
		return sRepo.save(s);
	}

	@Override
	public Student updateStudent(Student s) {
	
		return sRepo.save(s);
	
	}

	@Override
	public Student getStudent(Integer id) {
		// TODO Auto-generated method stub
		return sRepo.findById(id).get();
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return sRepo.findAll();
	}

	@Override
	public boolean deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		Optional<Student> student = sRepo.findById(id);
	    if(student.isPresent()){
	        sRepo.deleteById(id);
	        return true;
	    }
	    return false;
	}

	@Override
	public boolean studentLogin(Student s) {
		// TODO Auto-generated method stub
	    String email = s.getEmail();
	    String pass1 = s.getPassword();
	    String pass2 =  sRepo.studentLogin(email);
	    if(pass1.equals(pass2))
	    	return true;
	    else
		return false;
	}


	

}
