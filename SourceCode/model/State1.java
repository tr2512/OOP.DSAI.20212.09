package model;

public class State1 extends StartState {
	public void next(CellContext cell) {
		cell.setState(new State2(chromoX, chromoY, chromoRotate, true, true, true, false));
	}
	
	public String printState() {
		return "This is the original cell before cell division";
	}

	public State1(int[] chromoX, int[] chromoY, float[] chromoRotate, boolean visible, boolean prevBtnVisible,boolean nextBtnVisible ,boolean RiboVisible) {
		super(chromoX, chromoY, chromoRotate, visible, prevBtnVisible, nextBtnVisible ,RiboVisible);
	}	
}
