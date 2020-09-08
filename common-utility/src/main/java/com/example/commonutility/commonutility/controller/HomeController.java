package com.example.commonutility.commonutility.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.commonutility.commonutility.config.LoggerConfig;
import com.example.commonutility.commonutility.entity.Users;

@RestController
public class HomeController {

	@Autowired
	public LoggerConfig loggerConfig;
	
	@RequestMapping(value = "/logs")
	public String showLogs()
	{			
		  loggerConfig.getLoggerObj().info("this is info message");
		  loggerConfig.getLoggerObj().warn("this is a warn message");
		  loggerConfig.getLoggerObj().error("this is an error message");
		 
		return "logs";
	}
	
	
//	Users user6 = new Users(101, "test1");
	
	
	@RequestMapping(value = "/showUsers")
	public List<Users> showUsers()
	{
		List<Users> users = new ArrayList<Users>();
		Users user1 = new Users(101, "Mahesh");
		Users user2 = new Users(102, "Babitha");
		Users user3 = new Users(103, "Manglsh");
		Users user4 = new Users(104, "Sandhya");
		Users user5 = new Users(105, "Pratik");
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		
		return users;
	}
}
