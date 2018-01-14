package com.project.core.service;

import com.project.core.dao.User;

public interface UserService {
	
	User saveUser(User user);
	
	User updateUser(User user);
	
	User getById(Long id);
	
	User findByUsername(String username,String password);

}
