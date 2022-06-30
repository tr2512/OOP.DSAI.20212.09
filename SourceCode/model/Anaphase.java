package model;

public class Anaphase extends MiddleState {
	
	public void prev(CellContext cell) {
		cell.setState(new Metaphase());
	}
	
	public void next(CellContext cell) {
		cell.setState(new Telophase());
	}
	
	public String printState() {
		return "This is the middle state";
	}

	public Anaphase(int[] chromoX, int[] chromoY, float[] chromoRotate, boolean visible) {
		super(chromoX, chromoY, chromoRotate, visible);
		// TODO Auto-generated constructor stub
	}
}
