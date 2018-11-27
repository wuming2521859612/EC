package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/toHomePage")
	public String toHomePage(){
		return "Home";
	}
	
	
}
