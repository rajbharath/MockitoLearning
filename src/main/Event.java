package main;

import java.util.Date;

public class Event {
	Date date;
	String startTime;
	String endTime;// 24hours format 23.24
	int noOfAttendees;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public int getNoOfAttendees() {
		return noOfAttendees;
	}

	public void setNoOfAttendees(int noOfAttendees) {
		this.noOfAttendees = noOfAttendees;
	}

}
