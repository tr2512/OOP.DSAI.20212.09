package model;

public abstract class MiddleState extends GeneralState{
	
	public abstract void next(DivisionProcess cell);
	public abstract void prev(DivisionProcess cell);
	
}
