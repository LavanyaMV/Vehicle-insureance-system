package com.vehicle.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.vehicle.entity.User;
import com.vehicle.service.UserService;
//frontController------>Handler Mapping----->frontController------>RestController---->Handler Method--->Service--->Repository---->Database

@RestController
public class UserController 
{
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> fetchLearnerDetails()//handler method
	{
		return userService.fetchUserList();
	}
	
	@DeleteMapping("/users/{id}")
	public boolean deleteUserById(@PathVariable("id") int userId)
	{
		return userService.deleteUserById(userId);
	}
	
	@PostMapping("/users")
	public User saveLearner(@RequestBody User user)
	{
		return userService.saveUser(user);
	}
	
	@PutMapping("/users/{id}")
	public User updateLearner(@RequestBody User user,@PathVariable("id") int userId)
	{
		return userService.updateUser(user, userId);
	}	
}