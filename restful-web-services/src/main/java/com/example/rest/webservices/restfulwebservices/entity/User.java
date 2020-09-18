package com.example.rest.webservices.restfulwebservices.entity;

//import org.springframework.boot.autoconfigure.domain.EntityScan;

//@EntityScan
public class User {

	private int id;
	private String name;
	private String password;
	
	public User()
	{
		
	}
	public User(int id, String name) {
//		super();
		this.id = id;
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
