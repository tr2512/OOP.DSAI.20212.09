package model;

public abstract class EndState extends GeneralState {
	public abstract void prev(CellContext cell);

	public EndState(int[] chromoX, int[] chromoY, float[] chromoRotate, boolean visible, boolean prevBtnVisible, boolean nextBtnVisible, boolean peptidoglycanFirst, boolean peptidoglycanLast) {
		super(chromoX, chromoY, chromoRotate, visible, prevBtnVisible, nextBtnVisible, peptidoglycanFirst, peptidoglycanLast);
		// TODO Auto-generated constructor stub
	}
}
