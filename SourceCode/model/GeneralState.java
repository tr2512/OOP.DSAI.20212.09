package model;

public abstract class GeneralState {
	protected int[] chromoX;
	protected int[] chromoY;
	protected float[] chromoRotate;
	protected boolean visible;
	protected boolean prevBtnVisible;
	protected boolean nextBtnVisible;
	protected boolean RiboVisible;
	
	public GeneralState(int[] chromoX, int[] chromoY, float[] chromoRotate, boolean visible,boolean prevBtnVisible ,boolean nextBtnVisible, boolean RiboVisible) {
		this.chromoX = chromoX;
		this.chromoY = chromoY;
		this.chromoRotate = chromoRotate;
		this.visible = visible;
		this.prevBtnVisible = prevBtnVisible;
		this.nextBtnVisible = nextBtnVisible;
		this.RiboVisible = RiboVisible;
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

	public boolean isPrevBtnVisible(){
		return prevBtnVisible;
	}

	public boolean isNextBtnVisible(){
		return nextBtnVisible;
	}

	public boolean isRiboVisible(){
		return RiboVisible;
	}
	public abstract String printState();
}
