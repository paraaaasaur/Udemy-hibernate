package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		// (1) Load in Spring config file - Java config class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// (2) Get bean from Spring container
		// ※If not found >> NoSuchBeanDefinitionException
//		Coach theCoach = context.getBean("swimCoach", Coach.class);
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		
		// (3) Call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		// (3-1) Call new method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		// (3-2) Call methods from SwimCoach w/ .properties files' values injected 
		System.out.println("Email: " + theCoach.getEmail());
		System.out.println("Team: " + theCoach.getTeam());
		
		// (4) Close the context
		context.close();
	}

}
