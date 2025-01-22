package com.airtel.spring_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EnglishGreetingService implements GreetingService {
//	@Autowired			// inject the timeservice object into english greeting service object
//	@Qualifier("timeService24HourFormat")
	private TimeService timeService;
	
//	@Autowired				// constructor injection
//	public EnglishGreetingService(@Qualifier("timeService24HourFormat") TimeService timeService) {
//		this.timeService = timeService;
//	}
	
	@Override
	public void greet(String name) {
		System.out.println("Hello, "+name);
	}

	public TimeService getTimeService() {
		return timeService;
	}
	
	@Autowired			// Setter injection
	@Qualifier("timeService24HourFormat")
	public void setTimeService(TimeService timeService) {
		this.timeService = timeService;
	}
	
	

}
