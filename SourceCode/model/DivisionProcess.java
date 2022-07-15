package model;

public class DivisionProcess {	
	
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
	
	public String printCurrentState() {
		return state.printState();
	}
	
	public DivisionProcess(String process) { 
		if (process.equals("binaryFission")){
			this.state = new StartProkaDivide();
		} else {
			this.state = new StartEukaDivide(process);
		}
	}
}
