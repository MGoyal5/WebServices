package com.example.commonutility.commonutility.config;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import com.example.commonutility.commonutility.CommonUtilityApplication;

@Component
public class LoggerConfig {

	private static final Logger logger = LogManager.getLogger(CommonUtilityApplication.class);
	
	public Logger getLoggerObj()
	{
		return logger;
	}
}
