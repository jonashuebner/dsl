package expressionBuilder;

import objects.Calendar;
import objects.Event;

// ExpressionBuilder needed for internal DSL's

// What is an Expression Builder?
	// provides a fluent API on an regular API
	
// Function of an Expression Builder:
	// class provides a fluent interface
	// translates into calls on an underlying command - query API (Calendar, Event)
	// translates fluent interface into command - query API

// Question for Implementation:
	// Using one or multiple Expression Builders
	// think it's only for modularization
public class CalendarBuilder {

	private Calendar content = new Calendar();
	
	public CalendarBuilder() {
		
	}
	
	public CalendarBuilder add(String name) {
		
		content.addEvent(new Event());
		getCurrentEvent().setName(name);
		return this;
	}
	
	private Event getCurrentEvent() {
		
		return content.getEvents().get(content.getEvents().size() - 1);
	}
	
	public CalendarBuilder from(String startTime) {
		
		getCurrentEvent().setStartTime(startTime);
		return this;
	}

	public CalendarBuilder to(String endTime) {
		
		getCurrentEvent().setEndTime(endTime);
		return this;
	}
	
	public CalendarBuilder at(String location) {
		
		getCurrentEvent().setLocation(location);
		return this;
	}
	
	public Calendar getContent() {
		
		return content;
	}
}
