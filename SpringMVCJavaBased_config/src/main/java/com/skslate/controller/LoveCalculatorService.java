package com.skslate.controller;

import org.springframework.stereotype.Service;

import com.skslate.exception.DuplicateUser;

@Service
public class LoveCalculatorService {
	
	public String saveRegPeople() {
		
		try {
		//Saving --> calling dao
			throw new Exception();
			
		}catch(Exception e) {
			
			throw new DuplicateUser("Duplicate Username","400");
		}
		
		//return "Registration Success";
	}

}
