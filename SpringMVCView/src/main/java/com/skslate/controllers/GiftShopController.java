package com.skslate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("giftShop")
public class GiftShopController {

	@RequestMapping(value="/search", method=RequestMethod.GET)
	public String giftStore() {
		return "GiftShop";
	}
}
