package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		//Read the spring java  config class
		
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//Get the bean from spring container file
		
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		//Call a method on the bean
			
		System.out.println(theCoach.getDailyWorkout());
		
		//Call method to get the daily fortune
		
		System.out.println(theCoach.getDailyFortune());
		
		//call our new swim coach methods
		
		System.out.println("email : " + theCoach.getEmail());
		
		System.out.println("team : " + theCoach.getTeam());
		
		//Close the context
		
		context.close();

	}

}
