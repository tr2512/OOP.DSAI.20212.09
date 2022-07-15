package model;

public class State2 extends MiddleState {
	public void prev(CellContext cell) {
		cell.setState(new State1(chromoX, chromoY, chromoRotate, false, false, true, false, false));
	}
	
	public void next(CellContext cell) {
		int[] new1 = {123, 123, 197, 183, 184, 148};
		int[] new2 = {148, 148, 164, 129, 201, 219};
		float[] new3 = {-160, -160, 160, -43.9f, -122.7f, 93.2f};
		cell.setState(new State3(new1, new2, new3, true, true, true, false, true));
	}
	
	public String printState() {
		return "This is the interphase.";
	}

	public State2(int[] chromoX, int[] chromoY, float[] chromoRotate, boolean visible, boolean prevBtnVisible,boolean nextBtnVisible, boolean peptidoglycanFirst, boolean peptidoglycanLast) {
		super(chromoX, chromoY, chromoRotate, visible, prevBtnVisible, nextBtnVisible, peptidoglycanFirst, peptidoglycanLast);
		// TODO Auto-generated constructor stub
	}
}
