package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Practice Fast Bowling for 15 min";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
