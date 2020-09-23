package com.example.rest.webservices.restfulwebservices;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.web.filter.CommonsRequestLoggingFilter;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

import utility.exceptionhandler.RestExceptionHandler;
import utility.logger.CustomRequestBodyAdviceAdapter;
import utility.logger.CustomResponseBodyAdviceAdapter;
import utility.logger.CustomeRequestLoggingFilter;
import utility.logger.LogInterceptor;
import utility.logger.LoggingService;
import utility.logger.LoggingServiceImpl;
import utility.property.PropertyHandler;

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
	
	/*
	 * @Bean public LogInterceptor logInterceptor() {
	 * 
	 * return new LogInterceptor(); }
	 * 
	 * @Bean public CustomRequestBodyAdviceAdapter customRequestAdviceAdapter() {
	 * return new CustomRequestBodyAdviceAdapter(); }
	 * 
	 * @Bean public CustomResponseBodyAdviceAdapter
	 * customResponseBodyAdviceAdapter() { return new
	 * CustomResponseBodyAdviceAdapter(); }
	 * 
	 * @Bean public LoggingService loggingService() { return new
	 * LoggingServiceImpl(); }
	 */
	
	@Bean
	public CustomeRequestLoggingFilter customeRequestLoggingFilter() {
		return new CustomeRequestLoggingFilter();
	}

}
