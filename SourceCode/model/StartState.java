package model;

public abstract class StartState extends GeneralState {
	public abstract void next(DivisionProcess cell);
}