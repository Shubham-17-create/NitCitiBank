package com.nt.service;

import java.util.Calendar;

public class WishMessageServiceImpl implements IWishMessageService {

	@Override
	public String generateWishMessage() {
		//get system date and time
		Calendar cal = Calendar.getInstance();
		
		//get current hour of the day
		int hour =cal.get(Calendar.HOUR_OF_DAY);
		
		//generate wish Message
		
		if(hour<12)
			return"Good Morning";
		else if(hour<16)
			return"Good Afternoon";
		else if(hour<20)
			return"Good Evening";
		else
		    return "Good Night";
	}

}
