package com.project.core.service;

import org.springframework.stereotype.Component;

import com.project.core.domain.User;

@Component
public interface UserService {
	
	User saveUser(User user);
	
	User updateUser(User user);
	
	User getById(Long id);
	
	User findByUsername(String username,String password);

}
