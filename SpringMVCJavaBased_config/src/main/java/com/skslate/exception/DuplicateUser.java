package com.skslate.exception;

public class DuplicateUser extends RuntimeException {

	private String message;
	private String statusCode;
	
	public DuplicateUser(String message, String statusCode) {
		this.message = message;
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public String getStatusCode() {
		return statusCode;
	}
	
	
}
