package com.klunk.klunkapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Successes {

	@JsonProperty("value")
	public String name;
	public int amountOfSuccesses;
	public Successes(String name, int successess) {
		this.name = name;
		this.amountOfSuccesses = successess;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAmountOfSuccesses() {
		return amountOfSuccesses;
	}
	
	public void setAmountOfSuccesses(int amountOfSuccesses) {
		this.amountOfSuccesses = amountOfSuccesses;
	}
	
	
}
