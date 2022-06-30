package model;

public class DivideState extends EndState {
	
	public void prev(CellContext cell) {
		cell.setState(new Telophase());
	}
	
	public String printState() {
		return "This is the divided state";
	}
}
