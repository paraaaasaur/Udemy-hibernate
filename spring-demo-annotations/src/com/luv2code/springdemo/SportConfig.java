package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.luv2code.springdemo")
/** 
* [Spring framework Doc] Classes annotated with:
* @Component / @Repository / @Service / @Controller / @Configuration, or
* a custom annotation that itself is annotated with @Component 
* are the only detected candidate components.
* These classes will therefore be taken into Spring container.
*/
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	// Define bean for our fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	// Define bean for our swim coach AND inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	
	// Practice #096
	@Bean
	public Coach jyuudouCoach() {
		return new JyuudouCoach(saltyFortuneService());
	}
	
	// Practice #096
	@Bean
	public FortuneService saltyFortuneService() {
		return new SaltyFortuneService();
	}
	
	
	
}
