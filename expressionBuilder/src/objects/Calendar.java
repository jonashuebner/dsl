package objects;

import java.util.ArrayList;

public class Calendar {

	private ArrayList<Event> events = new ArrayList<Event>();
	
	public ArrayList<Event> getEvents() {
		
		return events;
	}
	
	public void addEvent(Event newEvent) {
		
		events.add(newEvent);
	}
	
	public String toString() {
		
		String retVal = "";
		
		for (Event event : events) {
			
			retVal = retVal + "\n" + event.toString();
		}
		
		return retVal;
	}
}
