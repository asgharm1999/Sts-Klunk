package com.klunk.klunkapp.services;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.klunk.klunkapp.model.Data;
import com.klunk.klunkapp.model.ListOfDays;
import com.klunk.klunkapp.model.LogData;
import com.klunk.klunkapp.model.Logs;
import com.klunk.klunkapp.model.Report;
import com.klunk.klunkapp.model.WeeklyLog;

@Component
public class KlunkServiceImpl implements KlunkService {

	@Override
	public Logs getLogs() {
		return Data.logs;
	}

	@Override
	public WeeklyLog getWeeklyLogs(String week) {
		Logs logs = getLogs();
		WeeklyLog specifiedWeek = null;
		if(week.toLowerCase().equals("weekone")) {
			specifiedWeek = logs.getWeekOne();
		} else if(week.toLowerCase().equals("weektwo")) {
			specifiedWeek = logs.getWeekTwo();
		} else if(week.toLowerCase().equals("weekthreeo")) {
			specifiedWeek = logs.getWeekThree();
		} else if(week.toLowerCase().equals("weekfour")) {
			specifiedWeek = logs.getWeekFour();
		}
		return specifiedWeek;
	}

	@Override
	public Report getWeeklyReport() {
		Logs logs = getLogs();
		 
		int successIndex = 0;
		int failIndex = 0;
		
		int[] weekOneCounts = getWeeklySuccessFailures(logs.getWeekOne());
		int[] weekTwoCounts = getWeeklySuccessFailures(logs.getWeekTwo());
		int[] weekThreeCounts = getWeeklySuccessFailures(logs.getWeekThree());
		int[] weekFourCounts = getWeeklySuccessFailures(logs.getWeekFour());
		
		Report weeklyReport = new Report();
		return weeklyReport;
	}

	@Override
	public int[] getWeeklySuccessFailures(WeeklyLog wLogs) {
		return null;
	}

	@Override
	public int[] getDailySuccessFailures(ArrayList<LogData> day) {
		return null;
	}

	@Override
	public Report getEndpointReport() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<WeeklyLog> transformWeeklyLogs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<LogData> getDailyLogs(String week, String day) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ListOfDays> getListOfDays(String week) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Report getDailyReport(String week) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
