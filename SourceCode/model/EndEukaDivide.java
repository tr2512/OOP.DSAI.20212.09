package model;

public class EndEukaDivide extends EndState {
	
	public EndEukaDivide(String process) {
		super();
		this.process = process;
		this.chromoX = new float[] {138, 135, 146, 305/2, 324/2, 330/2, 334/2, 338/2};
		this.chromoY = new float[] {220/2, 188/2, 185/2, 229/2, 229/2, 185/2, 188/2, 229/2};
		this.chromoRotate = new float[]{0, 180, -31, 0, 19.7f, -159.4f, 0, 19.7f};
		this.visible = new boolean[]{true, true, false};
	}

	public void prev(DivisionProcess cell) {
		cell.setState(new Telophase(process));
	}

}
