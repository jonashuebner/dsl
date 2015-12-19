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
	public MasterBuilder end() {
		
		return null;
	}

	@Override
	public MasterBuilder byUser(String userId) {

		return null;
	}
	
	
}
