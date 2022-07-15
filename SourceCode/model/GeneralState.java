package model;

public abstract class GeneralState {
	static float width;
	static float height;
	protected String process;
	protected float[] chromoX;
	protected float[] chromoY;
	protected float[] chromoRotate;
	protected boolean[] visible;
	
	public float[] getChromoX() {
		return chromoX;
	}

	public float[] getChromoY() {
		return chromoY;
	}

	public float[] getChromoRotate() {
		return chromoRotate;
	}

	public boolean[] isVisible() {
		return visible;
	}
	
	public void fitComponent() {
		for (int i = 0; i < chromoX.length; i++) {
			chromoX[i] = chromoX[i]*GeneralState.width/600;
			chromoY[i] = chromoY[i]*GeneralState.width/600;
		}
	}
	
	public String getProcess() {
		return process;
	}
	
	public static void setSize(float x, float y) {
		GeneralState.width = x;
		GeneralState.height = y;
	}

	public abstract String printState();
	public abstract String printDescription();
}
