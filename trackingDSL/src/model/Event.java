package model;

public abstract class Event {

	protected String userId;
	protected String id;
	
	public void setUserId(String userId) {
		
		this.userId = userId;
	}
	
	public String getUserId() {
		
		return this.userId;
	}
	
	public void setId(String id) {
		
		this.id = id;
	}
	
	public String getId() {
		
		return this.id;
	}
	
	@Override
	public String toString() {
		
		String retVal = "";
		
		retVal = "UserId : " + userId + ";\n";
		retVal += "Id : " + id + ";\n"; 
		
		return retVal;
	}
	
}

