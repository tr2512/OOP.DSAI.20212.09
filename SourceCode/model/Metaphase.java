package model;

public class Metaphase extends MiddleState {
	
	public void prev(CellContext cell) {
		cell.setState(new Prophase(process));
	}
	
	public void next(CellContext cell) {
		cell.setState(new Anaphase(process));
	}
	
	public String printState() {
		return "This is the Metaphase";
	}

	public Metaphase(String process) {
		super();
		this.process = process;
		if (process.equals("meiosis")) {
			this.chromoX = new float[]{294, 300, 314, 320, 294, 300, 314, 320};
			this.chromoY = new float[]{175, 175, 175, 175, 230, 230, 230, 230};
		} else {
			this.chromoX = new float[]{304, 310, 304, 310, 304, 310, 304, 310};
			this.chromoY = new float[]{120, 120, 175, 175, 230, 230, 285, 285};
		}
		
		this.chromoRotate = new float[]{0, 180, 0, 180, 0, 180, 0, 180};
		this.visible = new boolean[] {true, false, false};	
		super.fitComponent();
		// TODO Auto-generated constructor stub
	}
}
