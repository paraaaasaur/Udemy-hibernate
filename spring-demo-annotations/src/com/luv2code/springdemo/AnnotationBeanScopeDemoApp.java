package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		// (1) Load Spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// (2) Retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		// (3) Check if they are the same bean
		boolean identical = (theCoach == alphaCoach);
		
		System.out.println("\nPointing to the same object: " + identical);
		System.out.println("Memory location of theCoach: " + theCoach);
		System.out.println("Memory location of theCoach: " + alphaCoach);
		
		theCoach.getDailyFortune();
		
		// (4) Close the context
		context.close();
	}

}
