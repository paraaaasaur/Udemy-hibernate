package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("kusoCoach")
@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

	// (3) Field Injection (via Java Technology, called "reflection")
	@Autowired
	@Qualifier("databaseFortuneService")
	private FortuneService fortuneService;
	
	// (2) (3)
	public TennisCoach() {
		System.out.println("*** TennisCoach: Inside default constructor ***");
	}
	/*
	// (2-1) Setter Injection
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("*** TennisCoach: Inside setFortuneService() method ***");
		this.fortuneService = fortuneService;
	}
	*/
	
	/*
	// (2-2) Non-setter method Injection
	@Autowired
	public void castSomeMagicSpell(FortuneService fortuneService) {
		System.out.println("*** TennisCoach: Inside castSomeMagicSpell() method ***");
		this.fortuneService = fortuneService;
	}
	
	*/
	
	/*
	@Autowired  
	// (1) Constructor Injection
	// Spring will therefore go looking for any registered bean that fits automatically
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	
	// Define my init method
	@PostConstruct
	public void sayYourPrayers() {
		System.out.println("*** Inside custom init method ***");
		return;
	}
	// Define my destroy method
	@PreDestroy void youShouldntSeeThis() {
		System.out.println("*** Inside custom destroy method ***");
		return;
	}
	

}
