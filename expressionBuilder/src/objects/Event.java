package objects;

public class Event {

	private String name;
	private String startTime;
	private String endTime;
	private String location;
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public String getName() {
		
		return this.name;
	}
	
	public void setStartTime(String startTime) {
		
		this.startTime = startTime;
	}
	public void setEndTime(String endTime) {
		
		this.endTime = endTime;
	}

	public void setLocation(String location) {
		
		this.location = location;
	}
	
	public String toString() {
		
		return name + " " + startTime + " " + endTime + " " + location;
	}
}
