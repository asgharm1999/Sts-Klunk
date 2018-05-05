package com.klunk.klunkapp.model;

import java.util.ArrayList;

public class WeeklyLog {
	
	private ArrayList<LogData> monday;
	
	private ArrayList<LogData> tuesday;
	
	private ArrayList<LogData> wednesday;
	
	private ArrayList<LogData> thursday;

	private ArrayList<LogData> friday;

	public ArrayList<LogData> getMonday() {
		return monday;
	}

	public void setMonday(ArrayList<LogData> monday) {
		this.monday = monday;
	}

	public ArrayList<LogData> getTuesday() {
		return tuesday;
	}

	public void setTuesday(ArrayList<LogData> tuesday) {
		this.tuesday = tuesday;
	}

	public ArrayList<LogData> getWednesday() {
		return wednesday;
	}

	public void setWednesday(ArrayList<LogData> wednesday) {
		this.wednesday = wednesday;
	}

	public ArrayList<LogData> getThursday() {
		return thursday;
	}

	public void setThursday(ArrayList<LogData> thursday) {
		this.thursday = thursday;
	}

	public ArrayList<LogData> getFriday() {
		return friday;
	}

	public void setFriday(ArrayList<LogData> friday) {
		this.friday = friday;
	}
	
}
