package controller;

import formatBuilder.ConsoleFormatter;
import formatBuilder.MasterFormatter;
import parser.EventBuilder;

public class TestController implements MasterController {

	public void main(String[] argv) {
		
		ConsoleFormatter formatter = new ConsoleFormatter(); 
		
		useDSL(formatter);
	}

	@Override
	public String useDSL(MasterFormatter formatter) {
		
		EventBuilder eventBuilder = new EventBuilder();
		
		eventBuilder
		.addOrder()
			.addArticle("T-Shirt")
			.byUser("001")
		.end()
		.addOrder()
			.addArticle("Hose")
		.end()
		;
		
		return formatter.format(eventBuilder);
	}
}
