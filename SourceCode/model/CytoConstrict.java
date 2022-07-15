package model;

public class CytoConstrict extends MiddleState {
	
	public void prev(DivisionProcess cell) {
		cell.setState(new NuConstrict());
	}
	
	public void next(DivisionProcess cell) {
		cell.setState(new EndProkaDivide());
	}
	
	public String printState() {
		return "Binary fission";
	}

	public String printDescription() {
		return "This is where cytoplasm split into 2 half.";
	}

	public CytoConstrict() {
		super();
		this.chromoX = new float[] {129, 129, 197, 183, 184, 148};
		this.chromoY = new float[] {163, 163, 164, 129, 201, 219};
		this.chromoRotate = new float[] {0, 0, 160, -43.9f, -122.7f, 93.2f};
		this.visible = new boolean[] {true, false, true};
	}
}
