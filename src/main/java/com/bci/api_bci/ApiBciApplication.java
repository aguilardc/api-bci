package com.bci.api_bci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class ApiBciApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiBciApplication.class, args);
	}

}
