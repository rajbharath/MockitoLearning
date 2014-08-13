package main;

public class MeetingOrganizer {

	public static void main(String[] args) {

		Conference conference = new Conference("Hackathon", "13-08-2014",
				"15-08-2014");
		ConferenceCenterOwner conferenceCenterOwner = new ConferenceCenterOwner();
		Plan plan = conferenceCenterOwner.getPlan(conference);
		// TODO print the plan
	}

}
