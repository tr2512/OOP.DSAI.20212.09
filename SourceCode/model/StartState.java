package model;

public abstract class StartState extends GeneralState {
	public abstract void next(CellContext cell);

	public StartState(int[] chromoX, int[] chromoY, float[] chromoRotate, boolean visible) {
		super(chromoX, chromoY, chromoRotate, visible);
	}
}
