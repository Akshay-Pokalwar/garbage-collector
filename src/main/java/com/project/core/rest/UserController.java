package com.project.core.rest;

import com.project.core.dao.User;
import com.project.core.dto.*;
import com.project.core.repository.UserRepository;
import com.project.core.service.UserService;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/test")
public class UserController {
	
	@Autowired
	UserService userService;

	@GetMapping(value="/{id}")
	public Integer ping(@PathVariable Integer id ) {
		return id;
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