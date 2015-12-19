package parser;

import model.Article;
import model.Order;

public class OrderBuilder extends MasterBuilder {
	
	public OrderBuilder(EventBuilder master) {
		
		this.master = master;
	}
	
	public EventBuilder end() {
		
		return (EventBuilder) master;
	}
	
	@Override
	protected Order getCurrentEvent() {
		return (Order) master.getCurrentEvent();
	}
	
	public OrderBuilder addArticle(String name) {
		Article article = new Article(name);
		getCurrentEvent().addArticle(article);
		return this;		
	}

	@Override
	public OrderBuilder byUser(String userId) {

		getCurrentEvent().setUserId(userId);
		return (OrderBuilder) this;
	}
	
}
