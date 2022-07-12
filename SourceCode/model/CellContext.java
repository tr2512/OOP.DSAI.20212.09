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
	
	public CellContext() {
		int[] new1 = {122, 122, 76, 89, 148, 168};
		int[] new2 = {172, 172, 173, 207,  158, 187};
		float[] new3 = {0, 0, -17.1f, 146.3f, 162.4f, -33.7f};
		this.state = new State1(new1, new2, new3, false, false, true, false);
	}
}
