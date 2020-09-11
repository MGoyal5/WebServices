package com.example.rest.webservices.restfulwebservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.webservices.restfulwebservices.entity.User;
import com.example.rest.webservices.restfulwebservices.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/getallusers")
	public List<User> getAllUsers()
	{
		return userService.getAllUsers();
	}
	
	@PostMapping("/adduser")
	public String addUser(@RequestBody User user)
	{
		return userService.addUser(user);
	}
	
	@GetMapping("/getuserbyid")
	public User getUserById(@RequestParam int id)
	{
		return userService.getUserById(id);
	}
}
