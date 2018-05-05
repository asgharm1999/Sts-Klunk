package com.klunk.klunkapp.model;

import java.util.ArrayList;

public class Report {

	private ArrayList<Successes> allSuccesses;
	private ArrayList<Failures> allFailures;
	
	
	public ArrayList<Successes> getAllSuccesses() {
		return allSuccesses;
	}
	
	public void setAllSuccesses(ArrayList<Successes> allSuccesses) {
		this.allSuccesses = allSuccesses;
	}
	
	public ArrayList<Failures> getAllFailures() {
		return allFailures;
	}
	
	public void setAllFailures(ArrayList<Failures> allFailures) {
		this.allFailures = allFailures;
	}
	
	
	
	
}
