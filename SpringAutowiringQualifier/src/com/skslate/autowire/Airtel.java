package com.skslate.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Airtel  {
	@Autowired
	private AirtelStore airtelStores1;
	

	public AirtelStore getAirtelStores() {
		return airtelStores1;
	}
	
	

}
