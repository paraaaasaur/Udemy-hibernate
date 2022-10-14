package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// (1) Load in Spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// (2) Get bean from Spring container
		// ※If not found >> NoSuchBeanDefinitionException
		Coach theCoach = context.getBean("kusoCoach", Coach.class);
//		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		
		// (3) Call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		// (3-1) Call new method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// (4) Close the context
		context.close();
	}

}
