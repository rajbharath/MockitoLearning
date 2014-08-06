package main;

import java.util.List;

public class EventRegister {
	List<Event> bookedEvents;

	public void book(Event event) {
		bookedEvents.add(event);
	}

	public void cancelBooking(Event event) {
		bookedEvents.remove(event);
	}

	public boolean isOverlapping(Event event) {
		return false;
	}
}
