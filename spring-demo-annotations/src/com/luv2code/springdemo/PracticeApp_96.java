package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PracticeApp_96 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach theCoach = context.getBean("jyuudouCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		try {
			context.close();						
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("*** Context closed successfully ***");
		}
		
		

	}

}
