// POJO
package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

	// Define a private field for dependency
	private FortuneService fortuneService;
	
	// Define a constructor for DI
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30min on batting practice";
		
	}

	@Override
	public String getDailyFortune() {
		// Use my fortune service  to get a fortune
		return fortuneService.getFortune();
	}
}
