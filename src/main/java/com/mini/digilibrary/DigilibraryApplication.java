package com.mini.digilibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DigilibraryApplication {

	public static void main(String[] args) {
		System.out.println("First print from main");
		SpringApplication.run(DigilibraryApplication.class, args);
	}

}
