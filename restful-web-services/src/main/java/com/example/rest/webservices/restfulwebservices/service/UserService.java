package com.example.rest.webservices.restfulwebservices.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest.webservices.restfulwebservices.entity.User;

import utility.constants.ErrorStatus;
import utility.exceptionhandler.runtimeexception.IposException;
import utility.logger.LogHelper;
import utility.property.PropertyHandler;


@Service
public class UserService {
	
	@Autowired
	private PropertyHandler propertyHandler;
	
	public List<User> users = new ArrayList<User>();
	
	public List<User> getAllUsers(){
		if(users.isEmpty())
			LogHelper.warn(UserService.class ,"Please add atleast one user in the list");
		else
			LogHelper.info(UserService.class, "List of users are " + users);
		return users;
	}
	
	public String addUser(User user){
		String message;
		System.out.println("name is " + propertyHandler.getPropertyValue("name"));
		for(User userCheck: users){
			if(userCheck.getId()==user.getId()){
				throw new IposException(ErrorStatus.ENTITYALREADYEXIST.getReasonPhrase());
			}				
		}
		users.add(user);
		message="user is added in the list";
		LogHelper.info(UserService.class,message);
		return message;
	}

	public User getUserById(int id){
		// TODO Auto-generated method stub
		User userById = null;
		for(User user: users){			
			if(user.getId()==id)
				userById = user;			
		}
		if(userById == null){
			throw new IposException(ErrorStatus.ENTITYNOTFOUND.getReasonPhrase());
		}
		return userById;
	}
}
