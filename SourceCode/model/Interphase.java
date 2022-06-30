package model;

public class Interphase extends MiddleState {
	public void prev(CellContext cell) {
		cell.setState(new BeginState(chromoX, chromoY, chromoRotate, false));
	}
	
	public void next(CellContext cell) {
		int[] new1 = {165, 299, 282, 310, 304, 332, 288, 316, 310, 338};
		int[] new2 = {54, 174, 158, 158, 199, 175, 158, 158, 199, 175};
		float[] new3 = {0, 0, 0, 0, 0, 0, 180, 180, 180, 180};
		cell.setState(new Prophase(new1, new2, new3, true));
	}
	
	public String printState() {
		return "This is the interphase.";
	}

	public Interphase(int[] chromoX, int[] chromoY, float[] chromoRotate, boolean visible) {
		super(chromoX, chromoY, chromoRotate, visible);
		// TODO Auto-generated constructor stub
	}
}
