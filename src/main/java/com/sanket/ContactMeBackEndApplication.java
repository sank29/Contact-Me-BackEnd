package com.sanket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sanket.service.InformationService;

@SpringBootApplication
public class ContactMeBackEndApplication {
	
	@Autowired
	InformationService informationService;

	public static void main(String[] args) {
		SpringApplication.run(ContactMeBackEndApplication.class, args); 
	}

}
