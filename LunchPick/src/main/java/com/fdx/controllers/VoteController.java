package com.fdx.controllers;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/vote/*")
public class VoteController {
	
	@RequestMapping(value = "main", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "lunchVote/vote_main";
	}
	
	
	@RequestMapping(value = "allRandom", method = RequestMethod.GET)
	public String allRandom(Locale locale, Model model) {
		
		return "lunchVote/allRandom";
	}
	

}
