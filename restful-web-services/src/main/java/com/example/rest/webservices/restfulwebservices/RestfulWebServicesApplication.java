package com.example.rest.webservices.restfulwebservices;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import utility.exceptionhandler.RestExceptionHandler;

@SpringBootApplication
@ComponentScan({"com.example.rest.webservices.restfulwebservices"})
public class RestfulWebServicesApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(RestfulWebServicesApplication.class, args);
	}

	@Bean
	public RestExceptionHandler restExceptionHandler()
	{
		return new RestExceptionHandler();
	}
}
