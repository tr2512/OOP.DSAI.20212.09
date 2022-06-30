package model;

public class BeginState extends StartState {
	public void next(CellContext cell) {
		cell.setState(new Interphase(chromoX, chromoY, chromoRotate, true));
	}
	
	public String printState() {
		return "This is the original cell before cell division";
	}

	public BeginState(int[] chromoX, int[] chromoY, float[] chromoRotate, boolean visible) {
		super(chromoX, chromoY, chromoRotate, visible);
	}	
}
