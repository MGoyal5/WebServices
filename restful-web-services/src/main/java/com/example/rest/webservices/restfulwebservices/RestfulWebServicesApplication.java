package com.example.rest.webservices.restfulwebservices;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.ansi.AnsiElement;
import org.springframework.boot.ansi.AnsiOutput;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.rest.webservices.restfulwebservices"})
public class RestfulWebServicesApplication {

	
	public static void main(String[] args) {
		AnsiOutput.getEnabled();
		SpringApplication.run(RestfulWebServicesApplication.class, args);
	}

}
