package parser;

import model.OrderCancellation;

public class OrderCancellationBuilder extends MasterBuilder {
	
	public OrderCancellationBuilder(EventBuilder master) {
		
		this.master = master;
	}
	
	@Override
	protected OrderCancellation getCurrentEvent() {
		
		return (OrderCancellation) master.getCurrentEvent();
	}

	@Override
	public EventBuilder end() {
		
		return (EventBuilder) this.master;
	}	
	
	public OrderCancellationBuilder byUser(String userId) {
		
		getCurrentEvent().setUserId(userId);
		return this;
	}
}
