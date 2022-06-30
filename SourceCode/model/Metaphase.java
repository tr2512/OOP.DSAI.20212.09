package model;

public class Metaphase extends MiddleState {
	
	public void prev(CellContext cell) {
		cell.setState(new Prophase());
	}
	
	public void next(CellContext cell) {
		cell.setState(new Anaphase());
	}
	
	public String printState() {
		return "This is the Metaphase";
	}
}
