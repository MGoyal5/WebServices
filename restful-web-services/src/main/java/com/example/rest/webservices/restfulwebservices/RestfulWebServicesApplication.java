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
import utility.logger.LogInterceptor;
import utility.logger.LoggingService;
import utility.logger.LoggingServiceImpl;

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
	
	@Bean
	public LogInterceptor logInterceptor() {
		
		return new LogInterceptor();
	}
	
	@Bean
	public CustomRequestBodyAdviceAdapter customRequestAdviceAdapter() {
		return new CustomRequestBodyAdviceAdapter();
	}
	
	@Bean
	public CustomResponseBodyAdviceAdapter customResponseBodyAdviceAdapter() {
		return new CustomResponseBodyAdviceAdapter();
	}
	
	@Bean
	public LoggingService loggingService()
	{
		return new LoggingServiceImpl();
	}
	
	@Bean
	public CommonsRequestLoggingFilter requestLoggingFilter() {
	    CommonsRequestLoggingFilter loggingFilter = new CommonsRequestLoggingFilter();
	    loggingFilter.setIncludeClientInfo(true);
	    loggingFilter.setIncludeQueryString(true);
	    loggingFilter.setIncludePayload(true);
	    loggingFilter.setIncludeHeaders(false);
	    return loggingFilter;
	}
}
