package model;

public abstract class MiddleState extends GeneralState{
	
	public abstract void next(CellContext cell);
	public abstract void prev(CellContext cell);
	
	public MiddleState(int[] chromoX, int[] chromoY, float[] chromoRotate, boolean visible) {
		super(chromoX, chromoY, chromoRotate, visible);
		// TODO Auto-generated constructor stub
	}
}
