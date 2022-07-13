package model;

public abstract class StartState extends GeneralState {
	public abstract void next(CellContext cell);

	public StartState(int[] chromoX, int[] chromoY, float[] chromoRotate, boolean visible, boolean prevBtnVisible, boolean nextBtnVisible, boolean peptidoglycanFirst, boolean peptidoglycanLast) {
		super(chromoX, chromoY, chromoRotate, visible, prevBtnVisible, nextBtnVisible, peptidoglycanFirst, peptidoglycanLast);
	}
}
