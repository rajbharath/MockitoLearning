package main;

import java.util.Date;

public class Event {
	String eventName;
	Date date;
	String startTime;
	String endTime;// 24hours format 23.24
	int noOfAttendees;

	public Event(String eventName, Date date, String startTime, String endTime,
			int noOfAttendees) {
		super();
		this.eventName = eventName;
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
		this.noOfAttendees = noOfAttendees;
	}

	public Date getDate() {
		return date;
	}

	public String getStartTime() {
		return startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public int getNoOfAttendees() {
		return noOfAttendees;
	}

}
