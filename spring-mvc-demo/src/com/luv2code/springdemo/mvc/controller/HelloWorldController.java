package com.luv2code.springdemo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	// To show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form"; // ** This shall lead to: WEB-INF/view/helloworld-form.jsp 
	}
	
	// To process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	
	
	
	
	
}
