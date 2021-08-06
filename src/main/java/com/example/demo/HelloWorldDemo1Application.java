/**
 * @author Sanobar Mujawar
 * @since 06.08.21
 * 
 * Purpose: To create and understand simple spring boot application
 * 
 */

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldDemo1Application {

	public static void main(String[] args) {
		System.out.println("Hello From Sanobar");
		SpringApplication.run(HelloWorldDemo1Application.class, args);
	}

}
