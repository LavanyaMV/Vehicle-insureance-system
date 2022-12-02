package com.vehicle.service;

import java.util.List;

import com.vehicle.entity.User;

public interface UserService {

	//save operation
	User saveUser(User user);
	
	//read operation
	List<User> fetchUserList();
	
	//update operation
	User updateUser(User user, int userId);
	
	//delete operation
	boolean deleteUserById(int userId);
	
}