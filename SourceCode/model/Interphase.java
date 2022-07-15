package model;

public class Interphase extends MiddleState {
	public void prev(DivisionProcess cell) {
		if (process.equals("Meiosis2")) {
			cell.setState(new Telophase("Meiosis"));
		} else {
			cell.setState(new StartEukaDivide(process));
		}
	}
	
	public void next(DivisionProcess cell) {
		cell.setState(new Prophase(process));
	}
	
	public String printState() {
		return "Interphase";
	}

	public String printDescription() {
		return "The phase of the cell cycle in which a typical cell spends most of its life.";
	}

	
	public Interphase(String process) {
		super();
		this.process = process;
		if (process.equals("Meiosis2")) {
			this.chromoX = new float[]{300, 300 + 6, 300, 300 + 6, 300, 300 + 6, 300, 300 + 6};
			this.chromoY = new float[]{175, 175, 175, 175, 230, 230, 230, 230};
			this.chromoRotate = new float[]{0, 180, 0, 180, 0, 180, 0, 180};
		} else {
			this.chromoX = new float[] {276, 270, 292, 305, 324, 330, 334, 338};
			this.chromoY = new float[] {220, 188, 185, 229, 229, 185, 188, 229};
			this.chromoRotate = new float[]{0, 180, -31, 0, 19.7f, -159.4f, 0, 19.7f};
		}
		
		this.visible = new boolean[]{true, true, false};
		super.fitComponent();
	}
}
