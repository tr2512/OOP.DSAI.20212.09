package model;

public abstract class EndState extends GeneralState {
	public abstract void prev(CellContext cell);

	public EndState(int[] chromoX, int[] chromoY, float[] chromoRotate, boolean visible) {
		super(chromoX, chromoY, chromoRotate, visible);
		// TODO Auto-generated constructor stub
	}
}
