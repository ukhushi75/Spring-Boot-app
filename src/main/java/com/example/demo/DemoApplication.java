package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController   // this makes the class able to handle web requests
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// simple REST endpoint
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to my Spring Boot app!";
	}
//
//	echo "# Spring-Boot-app" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/ukhushi75/Spring-Boot-app.git
//	git push -u origin main
}
