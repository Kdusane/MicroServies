package com.personaldetail_services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PersonalDetailServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalDetailServiceApplication.class, args);
	}

}
