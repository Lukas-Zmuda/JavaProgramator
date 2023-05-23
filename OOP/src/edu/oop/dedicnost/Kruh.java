package edu.oop.dedicnost;

public final class Kruh extends Utvar{
	
	private double polomer;
	
	public Kruh(int x, int y, double polomer, String farba) {
		super(x, y, farba);
		this.polomer = polomer;
		this.vypln = "cierna";
	}

	public double getPolomer() {
		return polomer;
	}

	public void setPolomer(double polomer) {
		this.polomer = polomer;
	}
	
	public void info() {
		System.out.println("Kruh na [" + this.getX() + ", " + this.getY() + "] polomer: " 
								+ this.getPolomer() + " farba: " + this.getFarba());
	}

	@Override
	public void zmenFarbu(String farba) {
		this.setFarba(farba);
		
	}

}
