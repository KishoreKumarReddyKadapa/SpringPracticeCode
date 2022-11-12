package com.skslate.exception;

import java.io.IOException;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(NullPointerException.class)
	public String nullPointerExceptionHandler(Model model) {
		
		model.addAttribute("message","Null Pointer Exception...please contact admin");
		model.addAttribute("exception", "Null Pointer Exception");
		
		return "NullPointerException";
		
	}
	@ExceptionHandler(IOException.class)
	public String iOException(Model model) {
		
		model.addAttribute("message","Null Pointer Exception...please contact admin");
		model.addAttribute("exception", "Null Pointer Exception");
		
		return "NullPointerException";
		
	}
	
	@ExceptionHandler(DuplicateUser.class)
	public String duplicateUser(Model model, DuplicateUser user) {
		
		model.addAttribute("message", user.getMessage());
		model.addAttribute("statusCode", user.getStatusCode());
		
		return "DuplicateUserException";
		
	}
	@ExceptionHandler(Exception.class)
	public String defalutException(Model model) {
		
		model.addAttribute("message","Unhandle Exception");
		model.addAttribute("exception", "Please contact Admin");
		
		return "Exception";
		
	}
	
	
}
