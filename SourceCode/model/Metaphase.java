package model;

public class Metaphase extends MiddleState {
	
	public void prev(DivisionProcess cell) {
		cell.setState(new Prophase(process));
	}
	
	public void next(DivisionProcess cell) {
		cell.setState(new Anaphase(process));
	}
	
	public String printState() {
		return "Metaphase";
	}

	public String printDescription() {
		return "The nucleus dissolves and the cell's chromosomes condense and move together, aligning in the center of the dividing cell.";
	}


	public Metaphase(String process) {
		super();
		this.process = process;
		if (process.equals("Meiosis")) {
			this.chromoX = new float[]{294, 300, 314, 320, 294, 300, 314, 320};
			this.chromoY = new float[]{175, 175, 175, 175, 230, 230, 230, 230};
		} else {
			this.chromoX = new float[]{304, 310, 304, 310, 304, 310, 304, 310};
			this.chromoY = new float[]{120, 120, 175, 175, 230, 230, 285, 285};
		}
		
		this.chromoRotate = new float[]{0, 180, 0, 180, 0, 180, 0, 180};
		this.visible = new boolean[] {true, false, false};	
		super.fitComponent();
	}
}
