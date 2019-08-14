package com.palaciossystems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
	
	@RequestMapping("/")
	public String showIndex(){
		return "index";
	}
	
	@RequestMapping("/about")
	public String showAbout(){
		return "about";
	}

}
