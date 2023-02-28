package com.sanket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanket.entity.Information;
import com.sanket.exception.InformationException;
import com.sanket.repository.InformationRepository;


@Service
public class InformationSerivceImpl implements InformationService {
	
	@Autowired
	InformationRepository informationRepository;

	@Override
	public Information registerInformation(Information information) throws InformationException {
		
		
		if(information != null) {
			
			return informationRepository.save(information);
			
		}else {
			
			throw new InformationException("Please provide correct information");
			
		}
		
	}

}
