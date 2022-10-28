package com.skslate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sivahouse")
public class SivaHouseController {

	@ResponseBody
	@RequestMapping("/letter")
	public String familyMembers() {
		
		return "Siva House :: Letter Received ...";
	}
}
