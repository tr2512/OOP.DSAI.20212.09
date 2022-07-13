package model;

public class State3 extends MiddleState {
	
	public void prev(CellContext cell) {
		int[] new1 = {122, 122, 76, 89, 148, 168};
		int[] new2 = {172, 172, 173, 207, 158, 187};
		float[] new3 = {0, 0, -17.1f, 146.3f, 162.4f, -33.7f};
		cell.setState(new State2(new1, new2, new3, true, true, true, false, false));
	}
	
	public void next(CellContext cell) {
		// int[] new1 = {129, 129, 197, 183, 184, 148};
		// int[] new2 = {163, 163, 164, 129, 201, 219};
		// float[] new3 = {0, 0, 160, -43.9f, -122.7f, 93.2f};
		int[] new1 = {417, 417, 410, 396, 440, 400};
		int[] new2 = {99, 268, 125, 86, 287, 305};
		float[] new3 = {0, 0, 160, -43.9f, -122.7f, 93.2f};
		// 		cell.setState(new FinalState(new1, new2, new3, true, true, false, false));
		cell.setState(new FinalState(new1, new2, new3, true, true, true, false, false));
	}
	
	public String printState() {
		return "This is the prophase";
	}

	public State3(int[] chromoX, int[] chromoY, float[] chromoRotate, boolean visible, boolean prevBtnVisible,boolean nextBtnVisible, boolean peptidoglycanFirst, boolean peptidoglycanLast) {
		super(chromoX, chromoY, chromoRotate, visible, prevBtnVisible,nextBtnVisible, peptidoglycanFirst, peptidoglycanLast);
		// TODO Auto-generated constructor stub
	}
}
