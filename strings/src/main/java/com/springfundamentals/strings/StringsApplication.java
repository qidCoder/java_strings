package com.springfundamentals.strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//adding in the controller
@RestController
@SpringBootApplication
public class StringsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsApplication.class, args);
	}
	
	//adding in the GET request and the root route
	@RequestMapping("/")
	//add in the logic for the root route
	public String helloWorld() {
		return "Hello Client! How are you doing?";
	}
	
	//adding in the GET request and the random route
	@RequestMapping("/random")
	//add in the logic for the random route
	public String helloRandom() {
		return "Spring Boot is great! So easy to just respond with strings";
	}
	

}
