package com.skslate.customValidations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer>{

	private int minAge;
	private int maxAge;
	
	@Override
	public void initialize(Age ageObj) {
		this.minAge = ageObj.minAge();
		this.maxAge = ageObj.maxAge();
	}
	
	@Override
	public boolean isValid(Integer age, ConstraintValidatorContext context) {
		if(age == null) {
			return false;
		}
		if(age < minAge) {
			return false;
		}
		if(age > maxAge) {
			return false;
		}
		
		
		return true;
	}

}
