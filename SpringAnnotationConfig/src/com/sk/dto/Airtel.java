package com.sk.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

import com.skslate.Store;

@Component
public class Airtel  {
	@Autowired
	private Store airtelStore;
	

	public Store getAirtelStores() {
		return airtelStore;
	}
	
	

}
