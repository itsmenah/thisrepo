package com.Bootcamp.FirstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class FirstProjectApplication {

	public static void main(String[] args) {
		//My proj
		SpringApplication.run(FirstProjectApplication.class, args);
	}

}
