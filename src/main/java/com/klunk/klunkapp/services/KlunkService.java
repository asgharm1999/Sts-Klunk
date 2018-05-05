package com.klunk.klunkapp.services;

import java.util.ArrayList;

import com.klunk.klunkapp.model.ListOfDays;
import com.klunk.klunkapp.model.LogData;
import com.klunk.klunkapp.model.Logs;
import com.klunk.klunkapp.model.Report;
import com.klunk.klunkapp.model.WeeklyLog;

public interface KlunkService {
	
	public Logs getLogs();
	public WeeklyLog getWeeklyLogs(String week);
	public Report getWeeklyReport();
	public Report getDailyReport(String week);
	public int[] getWeeklySuccessFailures(WeeklyLog wLogs);
	public int[] getDailySuccessFailures(ArrayList<LogData> day);
	public Report getEndpointReport();
	public ArrayList<WeeklyLog> transformWeeklyLogs();
	public ArrayList<LogData> getDailyLogs(String week, String day);
	public ArrayList<ListOfDays> getListOfDays(String week);

}
