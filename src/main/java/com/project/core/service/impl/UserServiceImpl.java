package com.project.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.project.core.dao.User;
import com.project.core.repository.UserRepository;
import com.project.core.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepo;

	@Override
	public User saveUser(User user) {
		//@TODO: Save Encrypted password
		//@TODO: Validate User data
		/*Read User data, Validate it, encrypt password and then save encrypted password_*/
		/*Use Getters and setters for modifying user object
		 * Use org.springframework.security.crypto.bcrypt class for bcrypt
		 * Add spring security dependency for that^
		 * Store password in bCrypt Format, there are maven libraries to encrypt plain text to bCrypt 
		 * */ 
		BCryptPasswordEncoder bc = new BCryptPasswordEncoder();
		String encPassword =  bc.encode(user.getPassword());
		user.setPassword(encPassword);
		User u = userRepo.save(user);
		return u;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		User existingUser = userRepo.findByUsername(user.getUsername());
		if(existingUser==null) throw new RuntimeException("User with usernaem="+user.getUsername()+ " Not found");
		//@TODO: Do some more validations.
		
		user.setId(existingUser.getId());
		return userRepo.save(user);
	}

}
