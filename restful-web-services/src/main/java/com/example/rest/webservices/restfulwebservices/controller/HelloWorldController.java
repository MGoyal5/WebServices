package com.example.rest.webservices.restfulwebservices.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.webservices.restfulwebservices.config.LoggerConfig;

@RestController
@RequestMapping(value = "/helloWorld")
public class HelloWorldController {

	@Autowired
	public LoggerConfig loggerConfig;
	
	@RequestMapping(value = "/showText")
	public String showHelloMessage(@RequestParam(value ="text", defaultValue ="World") String text)
	{			
		  loggerConfig.getLoggerObj().info("this is info message");
		  loggerConfig.getLoggerObj().warn("this is a warn message");
		  loggerConfig.getLoggerObj().error("this is an error message");
		 
		return "Hello " + text;
	}
	
}
