package model;

public abstract class EndState extends GeneralState {
	
	public abstract void prev(DivisionProcess cell);

	public String printState() {
		return "Done";
	}

	public String printDescription() {
		return "This is the divided state";
	}
}
