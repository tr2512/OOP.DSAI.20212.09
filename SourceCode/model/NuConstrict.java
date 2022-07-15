package model;

public class NuConstrict extends MiddleState {
	public void prev(DivisionProcess cell) {
		cell.setState(new StartProkaDivide());
	}
	
	public void next(DivisionProcess cell) {
		cell.setState(new CytoConstrict());
	}
	
	public String printState() {
		return "This is when nucleus split.";
	}

	public NuConstrict() {
		super();
		this.chromoX = new float[] {105, 105, 76, 89, 148, 168};
		this.chromoY = new float[] {160, 160, 173, 207,  158, 187};
		this.chromoRotate = new float[] {0, 0, -17.1f, 146.3f, 162.4f, -33.7f};
		this.visible = new boolean[] {true, false, false};
	}
}
