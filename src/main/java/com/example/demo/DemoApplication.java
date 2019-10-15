package com.example.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;


@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class DemoApplication {
	
	@RequestMapping("/")
	String home() {
		return "Hello World! test server !!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("hello there");
	}

}
