package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	public static void main(String[] args) {
		
		// (1) Load the Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// (2) Retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// (3) Call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// (3-2) Call another(fortune-telling) method on the bean
		System.out.println(theCoach.getDailyFortune());
		
		// (4) Close the context
		context.close();
	}
}
