package com.example.rest.webservices.restfulwebservices.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.rest.webservices.restfulwebservices.entity.User;

import utility.logger.LoggerConfig;

@Service
public class UserService {

	public List<User> users = new ArrayList<User>();
	
	public LoggerConfig loggerConfig = new LoggerConfig();
	
	public List<User> getAllUsers()
	{
		if(users.isEmpty())
			loggerConfig.getLoggerObj().warn("Please add atleast one user in the list");
		else
			loggerConfig.getLoggerObj().info("List of users are " + users);
		return users;
	}
	
	public String addUser(User user)
	{
		String message;
		users.add(user);
		message="user is added in the list";
		loggerConfig.getLoggerObj().info(message);
		return message;
	}

	public User getUserById(int id) {
		// TODO Auto-generated method stub
		User userById = null;
		for(User user: users)
		{
			if(user.getId()==id)
				userById = user;
				
		}
		
		return userById;
	}
}
