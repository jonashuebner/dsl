package controller;

import expressionBuilder.CalendarBuilder;

public class Controller {
	
	public static void main(String[] argv) {

		CalendarBuilder builder = new CalendarBuilder();
		
		builder
		.add("Test").from("16:30").to("17:00").at("FH Wedel")
		.add("Test2").from("18:00").to("19:30").at("Uni Hamburg");
		
		System.out.println(builder.getContent().toString());
	}
}
