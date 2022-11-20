package com.luv2code.springdemo.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	// To read form data & add data to the model
	@RequestMapping("/processFormV2")
	public String letsShout(HttpServletRequest request, Model model) {
		// 1. Read request parameter from the HTML form
		String theName = request.getParameter("studentName");
		
		// 2. Convert all data to caps
		theName = theName.toUpperCase();
		
		// 3. Create the message
		String result = "Yo! " + theName;
		
		// 4. Add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}

	
	
	
	
	
}
