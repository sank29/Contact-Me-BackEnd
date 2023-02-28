package com.sanket.service;

import com.sanket.entity.Information;
import com.sanket.exception.InformationException;

public interface InformationService {
	
	public Information registerInformation(Information information) throws InformationException;

}
