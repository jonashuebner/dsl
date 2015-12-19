package parser;

import model.Event;

public abstract class MasterBuilder {

	protected MasterBuilder master;
	
	protected abstract Event getCurrentEvent();
	
	public abstract MasterBuilder byUser(String userId);
	
	public abstract MasterBuilder end();
}
