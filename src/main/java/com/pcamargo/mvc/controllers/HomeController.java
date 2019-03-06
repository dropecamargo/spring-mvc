package com.pcamargo.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping("/showForm")
	public ModelAndView showForm() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("show-form");
		return mav;
	}
	
	@RequestMapping("/processForm")
	public ModelAndView processForm() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("success-form");
		return mav;
	}
}
