package com.skslate.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {

		
		// Spring Container - IOC container
		ApplicationContext ac = new ClassPathXmlApplicationContext("springbeans.xml");
		
		Airtel air = (Airtel)ac.getBean("airtel"); // id --> of xml file
		System.out.println("Store Area:: "+air.getAirtelStores().toString());

		
	}

}
