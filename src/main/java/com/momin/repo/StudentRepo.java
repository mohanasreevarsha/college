package com.momin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.momin.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
	
    @Query("select s.password from Student s where email = :e")
   public String studentLogin(@Param("e") String email);
}
