package main;

import java.util.Date;
import java.util.List;

public class Conference {
	String name;
	Date startDate;
	Date endDate;
	List<Event> events;

	public Conference(String name, Date startDate, Date endDate) {
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getName() {
		return name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void addEvent(Event event) {
		events.add(event);
	}

	public void removeEvent(Event event) {
		events.remove(event);
	}

}
