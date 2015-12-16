package controller;

import builder.OrderBuilder;

public class TestController {

	public static void main(String[] argv) {
		
		OrderBuilder orderBuilder = new OrderBuilder();
		
		orderBuilder.add().
			addArticle("Hose").
			addArticle("T-Shirt");

	}
}
