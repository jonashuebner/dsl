package parser;

import model.PageImpression;

public class PageImpressionBuilder extends SecondLayerBuilder {

	public PageImpressionBuilder(EventBuilder master) {
		
		this.master = master;
	}
	
	@Override
	protected PageImpression getCurrentEvent() {
	
		return (PageImpression) master.getCurrentEvent();
	}

	@Override
	public EventBuilder end() {
		
		return (EventBuilder) this.master;
	}

	@Override
	public MasterBuilder byUser(String userId) {

		getCurrentEvent().setUserId(userId);
		return (PageImpressionBuilder) this;
	}

	
}
