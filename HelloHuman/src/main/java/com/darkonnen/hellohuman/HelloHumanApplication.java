package com.darkonnen.hellohuman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloHumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloHumanApplication.class, args);
	}
	
	@RequestMapping("/")
	public String index(@RequestParam(value = "name", required = false) String name) {
		if (name == null) {
			return "Hello human. Welcome to Spring Boot";
		} else {
			return String.format("Hello %s. Welcome to Spring Boot", name);
		}
	}


}
