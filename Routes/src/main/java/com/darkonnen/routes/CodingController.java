package com.darkonnen.routes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")

public class CodingController {
	
	@RequestMapping("")
	public String coding() {
		return "Hello, world";
	}
	
	@RequestMapping("/python")
	public String python() {
		return "Route for Python";
	}

	@RequestMapping("/java")
	public String java() {
		return "¡Java/Spring es mejor!";
	}

}
