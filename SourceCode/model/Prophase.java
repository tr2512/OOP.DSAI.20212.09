package model;

public class Prophase extends MiddleState {
	
	public void prev(CellContext cell) {
		int[] new1 = {165, 299, 276, 270, 292, 305, 324, 330, 344, 338};
		int[] new2 = {54, 174, 190, 158, 155, 199, 199, 155, 158, 199};
		float[] new3 = {0, 0, 0, 180, -31, 0, 19.7f, -159.4f, 0, 19.7f};
		cell.setState(new Interphase(new1, new2, new3, true));
	}
	
	public void next(CellContext cell) {
		cell.setState(new Metaphase());
	}
	
	public String printState() {
		return "This is the prophase";
	}

	public Prophase(int[] chromoX, int[] chromoY, float[] chromoRotate, boolean visible) {
		super(chromoX, chromoY, chromoRotate, visible);
		// TODO Auto-generated constructor stub
	}
}
