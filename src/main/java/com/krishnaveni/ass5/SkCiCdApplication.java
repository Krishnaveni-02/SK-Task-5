package com.krishnaveni.ass5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SkCiCdApplication {
	
	public String executeCICD() {
		return "You have successfully implemented CI/CD Pipeline";
	}

	public static void main(String[] args) {
		SpringApplication.run(SkCiCdApplication.class, args);
	}

}
