package model;

public abstract class StartState extends GeneralState {
	public abstract void next(CellContext cell);

	public StartState(int[] chromoX, int[] chromoY, float[] chromoRotate, boolean visible, boolean prevBtnVisible, boolean nextBtnVisible, boolean RiboVisible) {
		super(chromoX, chromoY, chromoRotate, visible, prevBtnVisible, nextBtnVisible, RiboVisible);
	}
}
