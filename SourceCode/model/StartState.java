package model;

public abstract class StartState extends GeneralState {

	public abstract void next(DivisionProcess cell);

	public String printState() {
		return "Start";
	}

	public String printDescription() {
		return "This is the start of the process.";
	}

}
