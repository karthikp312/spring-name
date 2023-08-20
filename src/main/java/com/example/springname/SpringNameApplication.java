package com.example.springname;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringNameApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringNameApplication.class, args);
	}

	@GetMapping("/name")
	public static String getName(){
		return "Hi Karthik!!";
	}
}
