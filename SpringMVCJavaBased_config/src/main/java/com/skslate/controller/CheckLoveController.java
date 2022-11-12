package com.skslate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CheckLoveController {

	@RequestMapping("/checkLove")
	public String checkLove() {
		
		throw new NullPointerException();
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
}
