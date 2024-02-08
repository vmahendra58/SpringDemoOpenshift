package com.openshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDemoOpenshiftApplication {
	
	@GetMapping("/")
	public String message() {
		return "Openshift tested sucessfully";
	}
	
	@PostMapping("/{input}")
	public String getMessage(@PathVariable String input) {
		return "your input is "+input;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoOpenshiftApplication.class, args);
		System.out.println("application started...");
	}

}
