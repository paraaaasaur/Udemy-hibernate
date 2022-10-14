// POJO
package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}

	// Add an initial method
	public void doMyStartupStuff() {
		System.out.println("*** Trackcoach: inside method doMyStartupStuff  ***");
	}
	
	// Add a destroy method
	public void doMyCleanupStuffYoYo() {
		System.out.println("*** Trackcoach: inside method doMyCleanupStuffYoYo  ***");
	}
	
	
	
	
	
	
}
