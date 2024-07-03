package com.maxchauo.remote_assignment_wk3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RemoteAssignmentWk3Application {

	public static void main(String[] args) {
		SpringApplication.run(RemoteAssignmentWk3Application.class, args);
	}

	@GetMapping
	public String sayHi(){
		return "I am Max,this is the first time i launch Spring Boot server!";
	}
}
