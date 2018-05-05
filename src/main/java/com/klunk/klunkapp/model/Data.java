package com.klunk.klunkapp.model;

import org.springframework.web.client.RestTemplate;

public class Data {
	
	//Has to be static
	public static Logs logs = getLogFromJson();
	
	private static Logs getLogFromJson() {
		
		//ResTamplate allows us to go out of our app to pull data
		
		RestTemplate restTemplate = new RestTemplate();
		
		return restTemplate.getForObject("http://localhost:8080/data.json",Logs.class);
	}
}
