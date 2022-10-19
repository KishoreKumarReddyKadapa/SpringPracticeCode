package com.skslate.controllers;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("lakshmiHouse")
public class LakshmiHouseController {

	@RequestMapping("/gitStatus")
	public String sister(Model model, HttpServletRequest  req) {
		
		String giftName = req.getParameter("giftName");
		String toWhom = req.getParameter("toWhom");
		String price = req.getParameter("price");
		model.addAttribute("toWhom",toWhom);
		model.addAttribute("giftPrice",price);
		model.addAttribute("giftName",giftName);
		model.addAttribute("giftSentDate",new Date());
		
		return "Response";
	}
	
	@ResponseBody
	@RequestMapping("/broGift")
	public String brotherGift() {
		return "Sister Received Cricket kit ... sent from US ...";
	}
}
