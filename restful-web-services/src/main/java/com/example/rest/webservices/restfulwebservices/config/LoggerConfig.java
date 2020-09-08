package com.example.rest.webservices.restfulwebservices.config;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import com.example.rest.webservices.restfulwebservices.RestfulWebServicesApplication;

@Component
public class LoggerConfig {

	private static final Logger logger = LogManager.getLogger(RestfulWebServicesApplication.class);
	
	public Logger getLoggerObj()
	{
		return logger;
	}
}
