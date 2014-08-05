package main;

import java.util.Date;
import java.util.List;

public class ConferenceRoom {
	EventRegister register;
	Capacity capacity;
	List<Date> maintenanceDates;

	public ConferenceRoom() {
		register = new EventRegister();
	}

	public boolean isAvailableFor(Event event) {
		return false;
	}
}
