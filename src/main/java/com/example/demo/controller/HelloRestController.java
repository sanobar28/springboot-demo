package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import com.example.demo.model.User;

/**
 * RestController mapping request data to define request handler method. Used to
 * create RESTful web services
 */

@RestController
@RequestMapping("/hello")
public class HelloRestController {

	// UC1 - Display message 
	@RequestMapping(value = { "", "/", "/home" })
	public String index() {
		return "Hello from Bridgelabz";
	}

	/**
	 * UC2- Request Method Get and passed name as query parameter
	 * @param name
	 * @return
	 */
	@RequestMapping(value = { "/query" }, method = RequestMethod.GET)
	public String sayHello(@RequestParam(value = "name") String name) {
		return "Hello " + name + "!";
	}

	/**
	 * UC3- Request Method Get and passed name as path variable
	 * @param name
	 * @return
	 */
	@GetMapping("/param/{name}")
	public String sayHelloParam(@PathVariable String name) {
		return "Hello " + name + "!";
	}

	/**
	 * UC4- POST Request Method and pass first name and last name in the Body
	 * @param user
	 * @return
	 */
	@PostMapping("/post")
	public String sayHello(@RequestBody User user) {
		return "Hello " + user.getFirstName() + " " + user.getLastName() + "!";
	}

}
