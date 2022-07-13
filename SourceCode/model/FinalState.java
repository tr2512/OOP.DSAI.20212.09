package model;

public class FinalState extends EndState {
	
	public FinalState(int[] chromoX, int[] chromoY, float[] chromoRotate, boolean visible, boolean prevBtnVisible, boolean nextBtnVisible, boolean peptidoglycanFirst, boolean peptidoglycanLast) {
		super(chromoX, chromoY, chromoRotate, visible, prevBtnVisible, nextBtnVisible, peptidoglycanFirst, peptidoglycanLast);
		//TODO Auto-generated constructor stub
	}

	public void prev(CellContext cell) {
		int[] new1 = {129, 129, 197, 183, 184, 148};
		int[] new2 = {163, 163, 164, 129, 201, 219};
		float[] new3 = {0, 0, 160, -43.9f, -122.7f, 93.2f};
		cell.setState(new State3(new1, new2, new3, true, true, true, false, true));		
	}

	
	public String printState() {
		return "This is the Metaphase";
	}
}
