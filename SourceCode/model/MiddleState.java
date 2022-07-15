package model;

public abstract class MiddleState extends GeneralState{
	
	public abstract void next(CellContext cell);
	public abstract void prev(CellContext cell);
}
