package parser;

import java.util.ArrayList;

import model.Event;
import model.Order;
import model.OrderCancellation;
import model.PageImpression;

public class EventBuilder extends MasterBuilder {

	private ArrayList<Event> events;
	
	private PageImpressionBuilder pageImpressionBuilder;

	private OrderBuilder orderBuilder;
	
	private OrderCancellationBuilder orderCancellationBuilder;
	
	public EventBuilder() {
		
		this.events = new ArrayList<Event>();
		this.pageImpressionBuilder = new PageImpressionBuilder(this);
		this.orderBuilder = new OrderBuilder(this);
		this.orderCancellationBuilder = new OrderCancellationBuilder(this);
	}
	
	public static EventBuilder eventBuilder() {
		
		return new EventBuilder();
	}
	
	public OrderBuilder addOrder() {
		
		events.add(new Order());
		return orderBuilder;
	}
	
	public OrderCancellationBuilder addOrderCancellation() {
		
		events.add(new OrderCancellation());
		return orderCancellationBuilder;  
	}
	
	public PageImpressionBuilder addPageImpression() {
	
		events.add(new PageImpression());
		return pageImpressionBuilder;
	}

	@Override
	protected Event getCurrentEvent() {

		return events.get(events.size() - 1);
	}
	
	@Override
	public String toString() {
		
		String retVal = "";
		
		for (Event event : events) {
			
			retVal += event.toString();
		}
		
		return retVal;
	}
	
}
