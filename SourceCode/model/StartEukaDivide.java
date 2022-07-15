package model;

public class StartEukaDivide extends StartState {

	public void next(DivisionProcess cell) {
		cell.setState(new Interphase(process));
	}
	
	public StartEukaDivide(String process) {
		super();
		this.process = process;
		this.chromoX = new float[] {276, 270, 292, 305, 324, 330, 334, 338};
		this.chromoY = new float[] {220, 188, 185, 229, 229, 185, 188, 229};
		this.chromoRotate = new float[]{0, 180, -31, 0, 19.7f, -159.4f, 0, 19.7f};
		this.visible = new boolean[]{false, true, false};
		super.fitComponent();
	}
	
}
