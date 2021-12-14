package com.fdx.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value = "/insert/*")
public class InsertShopController {
	
	@RequestMapping(value = "main", method = RequestMethod.GET)
	public String inertPage() {
		
		return "insertPage/insertPage";
	}

}
