package com.luv2code.springdemo;

public class RandomFortuneService implements FortuneService {

	private String[] fortunes = {"kichi", "kyou", "miosha"};
	
	@Override
	public String getFortune() {
		Integer idx = Double.valueOf(Math.floor(3 * Math.random())).intValue();
		return fortunes[idx];
	}

}
