package com.skslate.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sk.dto.Airtel;
import com.skslate.config.AppConfig;

public class Mobile {

	public static void main(String[] args) {

		
		// Spring Container - IOC container
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Airtel air = (Airtel)ac.getBean("airtel"); // id --> of xml file
		System.out.println("Store Area:: "+air.getAirtelStores().toString());

		
	}

}
