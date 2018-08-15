package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

	@Component
	
public class TennisCoach implements Coach {
		
		private FortuneService fortuneService;
		
		//define a default constructor
		
		public TennisCoach() {
			
			System.out.println("TennisCoach : inside default constructor");
		}
		
		//define my init method
		@PostConstruct
		public void doMyStartupStuff() {
			
			System.out.println("inside domystartupstuff");
		}
		
		//define my destroy method
		@PreDestroy
		public void doMyCleanupStuff() {
			
			System.out.println("inside domycleanupstuff");
		}
		
		/*
		
	// define setter method
		
@Autowired
		public void setFortuneService(FortuneService fortuneService) {
			
			System.out.println("TennisCoach : inside setter method");
			
			this.fortuneService = fortuneService;
		}

		*/
		
	/*	@Autowired
	public TennisCoach(FortuneService fortuneService) {
			this.fortuneService = fortuneService;
		}*/

	@Override
	public String getDailyWorkout() {
		
		return "Practice your backhand volley";
	}


	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
