package com.springpeace.springboothellopeace.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class PageMyPasswordController {
	@RequestMapping("/index.html")
	public ModelAndView fristPage() {
		return new ModelAndView("index");	
	}
	
	@RequestMapping("/mypassword.html")
	public ModelAndView myPassword() {
		return new ModelAndView("mypassword");	
	}
	
	@RequestMapping("/addmypassword.html")
	public ModelAndView addMyPassword() {
		return new ModelAndView("addmypassword");	
	}
	
	@RequestMapping("/updatemypassword.html")
	public ModelAndView updateMyPassword() {
		return new ModelAndView("updatemypassword");	
	}
	
	@RequestMapping("/deletemypassword.html")
	public ModelAndView deleteMyPassword() {
		return new ModelAndView("deletemypassword");	
	}
}
