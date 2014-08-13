package main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ConferenceCenterOwner {
	List<ConferenceRoom> conferenceRooms;
	List<Date> nonOperationalDates = Collections.emptyList();

	public ConferenceCenterOwner() {
		initializeConferenceRooms();
	}

	private void initializeConferenceRooms() {
		// TODO Auto-generated method stub
		conferenceRooms = new ArrayList<ConferenceRoom>();
		for (int i = 1; i <= 10; i++) {
			conferenceRooms.add(new ConferenceRoom("Room" + i));
		}

	}

	public boolean addNonOperationalDate(Date date) {
		return nonOperationalDates.add(date);
	}

	public boolean removeNonOperationalDate(Date date) {
		return nonOperationalDates.remove(date);
	}

	public boolean isOperatingOn(Date date) {

		return !nonOperationalDates.contains(date);
	}

	public boolean isOperating(Date startDate, Date endDate) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(startDate);
		do {
			if (nonOperationalDates.contains(calendar.getTime())) {
				return false;
			}
			calendar.add(Calendar.DATE, 1);
		} while (!calendar.getTime().equals(endDate));
		return true;
	}

	public Plan getPlan(Conference conference) {

		return null;
	}

	private List<Event> getAvailableRooms() {

		return null;
	}

}
