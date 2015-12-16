package builder;

import java.util.ArrayList;

import events.Event;

public abstract class EventBuilder<T extends Event> {

	protected ArrayList<T> events = new ArrayList<T>();
	
}
