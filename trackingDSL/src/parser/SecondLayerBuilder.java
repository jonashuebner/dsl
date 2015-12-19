package parser;

public abstract class SecondLayerBuilder extends MasterBuilder {

	protected EventBuilder master;
	
	public abstract MasterBuilder byUser(String userId);
	
	public abstract MasterBuilder end();
}
