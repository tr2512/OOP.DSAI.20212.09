package model;

public class StartProkaDivide extends StartState {
	public void next(DivisionProcess cell) {
		cell.setState(new NuConstrict());
	}
	
	public String printState() {
		return "This is the original cell before binary fission";
	}

	public StartProkaDivide() {
		super();
		this.chromoX = new float[] {105, 105, 76, 89, 148, 168};
		this.chromoY = new float[] {160, 160, 173, 207,  158, 187};
		this.chromoRotate = new float[] {0, 0, -17.1f, 146.3f, 162.4f, -33.7f};
		this.visible = new boolean[] {false, false, false};
	}	
}
