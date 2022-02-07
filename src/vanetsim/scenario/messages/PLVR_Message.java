package vanetsim.scenario.messages;

import vanetsim.scenario.Vehicle;

public class PLVR_Message extends Message {
	
	private String text;
	
	public PLVR_Message(String text) {
		super();
		this.text = text;
	}
	
	public String getText() {
		return this.text;
	}
	
	@Override
	public void execute(Vehicle vehicle) {
		// TODO Auto-generated method stub
	}
	
}
