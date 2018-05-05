package com.klunk.klunkapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Failures {
	
	@JsonProperty("value")
	private String name;
	private int amountOfFailures;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAmountOfFailures() {
		return amountOfFailures;
	}
	
	public void setAmountOfFailures(int amountOfFailures) {
		this.amountOfFailures = amountOfFailures;
	}
	
	

}
