package model;

public abstract class GeneralState {
	protected int[] chromoX;
	protected int[] chromoY;
	protected float[] chromoRotate;
	protected boolean visible;
	
	public GeneralState(int[] chromoX, int[] chromoY, float[] chromoRotate, boolean visible) {
		this.chromoX = chromoX;
		this.chromoY = chromoY;
		this.chromoRotate = chromoRotate;
		this.visible = visible;
	}
	
	public int[] getChromoX() {
		return chromoX;
	}

	public int[] getChromoY() {
		return chromoY;
	}

	public float[] getChromoRotate() {
		return chromoRotate;
	}

	public boolean isVisible() {
		return visible;
	}

	public abstract String printState();
}
