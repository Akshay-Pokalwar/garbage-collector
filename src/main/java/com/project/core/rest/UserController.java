package com.project.core.rest;

import com.project.core.domain.User;
import com.project.core.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
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
		return new User(new Long(-1));
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