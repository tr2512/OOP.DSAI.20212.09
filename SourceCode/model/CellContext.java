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
		int[] new1 = {165, 299, 276, 270, 292, 305, 324, 330, 344, 338};
		int[] new2 = {54, 174, 190, 158, 155, 199, 199, 155, 158, 199};
		float[] new3 = {0, 0, 0, 180, -31, 0, 19.7f, -159.4f, 0, 19.7f};
		this.state = new BeginState(new1, new2, new3, false);
	}
}
