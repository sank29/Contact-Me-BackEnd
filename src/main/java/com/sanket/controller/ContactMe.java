package com.sanket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sanket.entity.Information;
import com.sanket.exception.InformationException;
import com.sanket.service.InformationService;

@RestController
public class ContactMe {
	
	@Autowired
	InformationService informationService;
	
	
	public ResponseEntity<Information> registerInformation(@RequestBody Information information) throws InformationException{
		
		if(information != null) {
			
			Information registerInformation = informationService.registerInformation(information);
			
			return new ResponseEntity<Information>(registerInformation, HttpStatus.CREATED);
			
			
		}else {
			
			throw new InformationException("Please provide correct information");
		}
		
	}
	

}


