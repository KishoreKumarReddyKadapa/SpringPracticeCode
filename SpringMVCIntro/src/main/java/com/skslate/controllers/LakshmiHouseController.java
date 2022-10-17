package com.skslate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("lakshmiHouse")
public class LakshmiHouseController {

	@ResponseBody
	@RequestMapping("/sisterGift")
	public String sister() {
		return "Sister Received Makeup kit ... sent from US ...";
	}
	
	@ResponseBody
	@RequestMapping("/broGift")
	public String brotherGift() {
		return "Sister Received Cricket kit ... sent from US ...";
	}
}
