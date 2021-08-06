package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestController mapping request data 
 * to define request handler method.
 * Used to create RESTful web services 
 */

@RestController
public class HelloRestController {
	
	@RequestMapping("/")
	public String index() {
		return "Hello from Bridgelabz";
		
	}

}
