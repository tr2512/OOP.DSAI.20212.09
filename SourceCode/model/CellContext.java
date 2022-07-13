package model;

public class CellContext {	
	
	private GeneralState state;

	public void setState(GeneralState state) {
		this.state = state;
	}
	
	public GeneralState getState() {
		return state;
	}

	public void nextState() {
		if (state instanceof StartState) {
			((StartState) state).next(this);
		} else if (state instanceof MiddleState) {
			((MiddleState) state).next(this);
		}
	}
	
	public void prevState() {
		if (state instanceof MiddleState) {
			((MiddleState) state).prev(this);
		} else if (state instanceof EndState) {
			((EndState) state).prev(this);
		}
	}
	
	public void printCurrentState() {
		state.printState();
	}
	
	public CellContext(String process) {
		this.state = new BeginState(process);
	}
}
