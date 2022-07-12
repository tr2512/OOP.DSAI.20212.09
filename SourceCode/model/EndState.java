package model;

public abstract class EndState extends GeneralState {
	public abstract void prev(CellContext cell);

	public EndState(int[] chromoX, int[] chromoY, float[] chromoRotate, boolean visible, boolean prevBtnVisible, boolean nextBtnVisible, boolean RiboVisible) {
		super(chromoX, chromoY, chromoRotate, visible, prevBtnVisible, nextBtnVisible, RiboVisible);
		// TODO Auto-generated constructor stub
	}
}
