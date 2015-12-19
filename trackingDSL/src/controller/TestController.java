package controller;

import formatBuilder.ConsoleFormatter;
import formatBuilder.MasterFormatter;
import parser.EventBuilder;

public class TestController implements MasterController {

	public static void main(String[] argv) {
		
		ConsoleFormatter formatter = new ConsoleFormatter(); 
		
		System.out.println(useDSL(formatter));
	}

	public static String useDSL(MasterFormatter formatter) {
		
		EventBuilder eventBuilder = EventBuilder.eventBuilder();
		
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
