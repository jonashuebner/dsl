package builder;

import events.Article;
import events.Order;

public class OrderBuilder extends EventBuilder<Order> {

	public OrderBuilder add() {
		events.add(new Order());
		return this;
	}
	
	public OrderBuilder addArticle(String name) {
		Article article = new Article(name);
		getCurrentOrder().addArticle(article);
		return this;		
	}
	
	private Order getCurrentOrder() {
		return events.get(events.size() - 1);
	}
}
