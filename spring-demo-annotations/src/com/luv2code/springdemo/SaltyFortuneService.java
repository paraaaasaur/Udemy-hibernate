package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SaltyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "OMG another terrible day";
	}

}
