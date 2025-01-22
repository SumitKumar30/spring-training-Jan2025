package com.airtel.spring_demo;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class TimeService12HourFormat implements TimeService {

	@Override
	public String getCurrentTime() {
		int hour = LocalDateTime.now().getHour();
		return ("Current time is: " + (hour > 12 ? hour-12 : hour));
	}

}
