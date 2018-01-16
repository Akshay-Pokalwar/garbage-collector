package com.project.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.core.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByUsername(String username); // No need to write query. 
	
	public User getById(Long id);
	
	

}
