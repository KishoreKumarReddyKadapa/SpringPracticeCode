package com.skslate.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class UserInfoDto {
	//@NotEmpty(message="Your Name Should not be empty")
	@Size
	private String name;
	
	@NotEmpty(message="Crush Name Should not be empty")
	private String crushName;
	
	private boolean agreeTc;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCrushName() {
		return crushName;
	}
	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}
	public boolean isAgreeTc() {
		return agreeTc;
	}
	public void setAgreeTc(boolean agreeTc) {
		this.agreeTc = agreeTc;
	}
	

}
