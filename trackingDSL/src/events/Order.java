package events;

import java.util.ArrayList;

public class Order extends Event {

	String name;
	String date;
	ArrayList<Article> articles = new ArrayList<Article>();
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public String getName() {
		
		return this.name;
	}
	
	public void addArticle(Article article) {
		
		articles.add(article);
	}
}
