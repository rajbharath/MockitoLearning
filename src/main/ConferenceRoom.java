package main;

import java.util.Date;
import java.util.List;

public class ConferenceRoom {
	String roomName;
	BookingHistory bookingHistory;
	Integer capacity;
	List<Date> maintenanceDates;

	public ConferenceRoom(String roomName) {
		this.roomName = roomName;
		bookingHistory = new BookingHistory();
	}

	public boolean isAvailableFor(Event event) {
		return false;
	}
}
