package model;

public class Telophase extends MiddleState {
	
	public void prev(CellContext cell) {
		cell.setState(new Anaphase());
	}
	
	public void next(CellContext cell) {
		cell.setState(new DivideState());
	}
	
	public String printState() {
		return "This is the telophase state";
	}
}
