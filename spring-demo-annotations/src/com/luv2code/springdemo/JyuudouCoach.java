package com.luv2code.springdemo;

public class JyuudouCoach implements Coach {

	private FortuneService fortuneService;
	
	public JyuudouCoach(FortuneService fortuneService) {
		System.out.println("*** Inside JyuudouCoach's constructor ***");
		this.fortuneService = fortuneService;
		System.out.println("*** Injection completed ***");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Fix your whole body flexibllity";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
