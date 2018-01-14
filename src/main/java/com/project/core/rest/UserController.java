package com.project.core.rest;

import com.project.core.dao.User;
import com.project.core.dto.*;
import com.project.core.repository.UserRepository;
import com.project.core.service.UserService;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	UserService userService;

//	@GetMapping(value="/{id}")
//	public Integer ping(@PathVariable Integer id ) {
//		return id;
//	}
	
	@GetMapping(value="/{id}")
	public User getById(@PathVariable Long id ) {
		User user=userService.getById(id);
		return user;
	}
	
	@GetMapping(value="/namepassword/{username}/{password}")
	public User getByUsername(@PathVariable String username,@PathVariable String password)
	{
		User user=userService.findByUsername(username, password);
		if(user!=null){
			return user;
		}
		return null;
	}
	
	@PostMapping
	public User saveuser(@RequestBody User obj) {
		return userService.saveUser(obj);
	}
	
	@PutMapping("/{id}")
	public User updateuser(@PathVariable Long id, @RequestBody User user) {
		user.setId(id);
		User updatedUser= userService.updateUser(user);
		return updatedUser;
	}
}