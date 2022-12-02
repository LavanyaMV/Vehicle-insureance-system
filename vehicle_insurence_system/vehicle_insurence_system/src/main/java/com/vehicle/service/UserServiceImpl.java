package com.vehicle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicle.entity.User;
import com.vehicle.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired//DI
	UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
//		Learner learner1= learnerRepository.save(learner);
//		if(learner1!=null)
//			return true;
//		else 
//			return false;
	return userRepository.save(user);
	
	}

	@Override
	public List<User> fetchUserList() {
		
		return userRepository.findAll();
	}

	@Override
	public User updateUser(User user, int userId) {
		// TODO Auto-generated method stub
		
		User user1=userRepository.findById(userId).get();
		if(user1!=null)
		{
			//if(learner.getLearnerName()!="")
			user1.setUserName(user.getUserName());
			user1.setUserContact(user.getUserContact());
		}
		userRepository.save(user1);
		
		return user1;
	}

	@Override
	public boolean deleteUserById(int userId) {
		// TODO Auto-generated method stub
		try
		{
		
			userRepository.deleteById(userId);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}

}