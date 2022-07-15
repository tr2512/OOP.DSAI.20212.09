package model;

public class FinalState extends EndState {
	
	public FinalState() {
		
	}

	public void prev(CellContext cell) {
		cell.setState(new CytoConstrict());		
	}

	public String printState() {
		return "This is the Metaphase";
	}
}
