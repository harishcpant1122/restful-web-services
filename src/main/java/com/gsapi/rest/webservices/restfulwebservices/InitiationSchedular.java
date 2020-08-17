package com.gsapi.rest.webservices.restfulwebservices;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class InitiationSchedular {
	
	
	@Scheduled(fixedRate = 2000)
	public void initiatePayment()
	{
		System.out.println(String.format("Date is %s",new Date()));
	}

}
