package main;

import java.util.List;
import java.util.Map;

public class Plan {
	String conferenceName;
	Map<Event, List<ConferenceRoom>> eventsWithAvailableRooms;

	public Plan(String conferenceName,
			Map<Event, List<ConferenceRoom>> eventsWithAvailableRooms) {
		super();
		this.conferenceName = conferenceName;
		this.eventsWithAvailableRooms = eventsWithAvailableRooms;
	}

	public String getConferenceName() {
		return conferenceName;
	}

	public Map<Event, List<ConferenceRoom>> getEventsWithAvailableRooms() {
		return eventsWithAvailableRooms;
	}

}
