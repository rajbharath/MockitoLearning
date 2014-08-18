package test;

import java.util.ArrayList;
import java.util.Iterator;

import main.Conference;
import main.ConferenceCenterOwner;
import main.Event;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ConferenceCenterOwnerTester {
	@Mock
	private Conference conference;

	@Mock
	private Event event;

	@Mock
	private ArrayList<Event> events;

	@Mock
	private Iterator<Event> iterator;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getPlan() {

		Mockito.when(conference.getEvents()).thenReturn(events);
		Mockito.when(events.iterator()).thenReturn(iterator);
		Mockito.when(iterator.hasNext()).thenReturn(true).thenReturn(false);
		Mockito.when(iterator.next()).thenReturn(event);

		ConferenceCenterOwner owner = new ConferenceCenterOwner();
		owner.getPlan(conference);

		Mockito.verify(conference).getEvents();
		Mockito.verify(iterator, Mockito.times(2)).hasNext();
		Mockito.verify(event, Mockito.atMost(10)).getStartTime();

	}
}
