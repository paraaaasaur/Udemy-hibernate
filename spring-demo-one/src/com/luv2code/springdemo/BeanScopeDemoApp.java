package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// Load the Spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// Retrieve bean from the container
		Coach theCoachA = context.getBean("myCoach", Coach.class);
		Coach theCoachB = context.getBean("myCoach", Coach.class);
		
		// Check if they are same objects
		Boolean result = theCoachA == theCoachB;
		
		System.out.println("\nPiointing to the same object? " + result);
		System.out.println("Memory location of the CoachA =  " + theCoachA);
		System.out.println("Memory location of the CoachB =  " + theCoachB);
		
		// Close the context
		context.close();

	}

}
