package com.airtel.spring_demo;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class TimeService24HourFormat implements TimeService {

	@Override
	public String getCurrentTime() {
		int hour = LocalDateTime.now().getHour();
		return "Current time in 24 hours: "+hour;
	}

}
