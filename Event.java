/*
Event.java
@author JFS
25-02-22
*/

public class Event{
	//data members
	private int eventType;
	private double rate;
	private String manager;

	//constant vars
	private final String PRIV_MANAGER = "Jo Kumar";
	private final String CORP_MANAGER = "Mary Smith";
	private final double PRIV_RATE = 54.69;
	private final double CORP_RATE = 76.55;


	//constructor
	public Event(){
	}


	//set method
	public void setEventType(int eventType){
		this.eventType = eventType;
	}

	//get method
	public double getRate(){
		return rate;
	}
	public String getManager(){
		return manager;
	}

	public void projectDetails(){
	if(eventType == 1){
		//private
		manager = PRIV_MANAGER;
		rate = PRIV_RATE;
	}else if(eventType == 2){
		//corporate
		manager = CORP_MANAGER;
		rate = CORP_RATE;
	}

}



	}