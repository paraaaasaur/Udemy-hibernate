package com.luv2code.springdemo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springdemo.mvc.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {		
		// 1. Create a student object
		Student theStudent = new Student();
		
		// 2. Add student object to the model
		theModel.addAttribute("student", theStudent);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute ("student") Student theStudent) {
		
		// log the input data
		
		System.out.println("The student: " + theStudent.getFirstName() + " " 
										+ theStudent.getLastName());
		
		return "student-confirmation";
	}
}
