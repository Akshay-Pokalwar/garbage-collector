package com.project.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.core.dao.Product;
import com.project.core.dao.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

		public Student getById(int id);
	
}
