package model;

public class EndProkaDivide extends EndState {
	
	public EndProkaDivide() {
		super();
		this.chromoX = new float[] {417, 417, 410, 396, 440, 400};
		this.chromoY = new float[] {99, 268, 125, 86, 287, 305};
		this.chromoRotate = new float[] {0, 0, 160, -43.9f, -122.7f, 93.2f};
		this.visible = new boolean[]{true, false, false};
	}

	public void prev(DivisionProcess cell) {
		cell.setState(new CytoConstrict());		
	}

	
	public String printState() {
		return "This is the end of binary fission";
	}
}
