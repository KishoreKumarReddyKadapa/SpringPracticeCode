package com.skslate.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skslate.dto.RegisterUserDto;
import com.skslate.dto.UserInfoDto;

@Controller
public class LoveCalculatorController {

	@Autowired
	LoveCalculatorService loveCalculatorService;
	
	
	
//	@RequestMapping(value="/",method=RequestMethod.GET)
	@RequestMapping("/")  
	public String welcomePage(@ModelAttribute UserInfoDto userInfoDto) { 
	return "WelcomePage";	
	}
	
	@RequestMapping("/resultPage")
	public String resultPage(@Valid @ModelAttribute UserInfoDto userInfoDto, BindingResult result) {
	//DTO -- > Data transfer Object
		
		if(result.hasErrors()) {
			System.out.println("My Form has errors********************");
			List<ObjectError> allErrors = result.getAllErrors();
			for(ObjectError errorObj : allErrors) {
				System.out.println(">>>"+errorObj);
			}
			
			return "WelcomePage";
		}
		
		System.out.println("userInfo::"+userInfoDto);
		return "ResultPage";
	}
	
	@RequestMapping("/regPage")  
	public String regPage(@ModelAttribute("regUser") RegisterUserDto registerUserDto) { 
		
		return "RegistrationPage";
	}
	
	@RequestMapping("/registerUser")
	public String registerUser(@Valid @ModelAttribute("regUser") RegisterUserDto registerUserDto, BindingResult result) {
	//DTO -- > Data transfer Object
		loveCalculatorService.saveRegPeople();
		
		if(result.hasErrors()) {
			System.out.println("My Form has errors********************");
			List<ObjectError> allErrors = result.getAllErrors();
			for(ObjectError errorObj : allErrors) {
				System.out.println(">>>"+errorObj);
			}
			
			return "RegistrationPage";
		}
		
		//saving
		
		return "LoginPage";
	}
	
//	@ExceptionHandler(NullPointerException.class)
//	public String nullPointerExceptionHandler(Model model) {
//		
//		model.addAttribute("message","Null Pointer Exception...please contact admin");
//		model.addAttribute("exception", "Null Pointer Exception");
//		
//		return "NullPointerException";
//		
//	}
	
	@RequestMapping("/loveCalc")  
	public String loveCalc() { 
		
		throw new NullPointerException();
	}
	
}
