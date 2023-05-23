package edu.oop.dedicnost;

public abstract class Utvar extends Object{
	
	private int x, y;
	private String farba;
	protected String vypln;
		
	public Utvar(int x, int y, String farba) {
		this.x = x;
		this.y = y;
		this.farba = farba;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getFarba() {
		return farba;
	}
	
	
	public void setFarba(String farba) {
		this.farba = farba;
	}

	public abstract void info();
	
	public abstract void zmenFarbu(String farba);
	

}
