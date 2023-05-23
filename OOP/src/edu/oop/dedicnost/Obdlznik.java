package edu.oop.dedicnost;

public class Obdlznik extends Utvar{
	
	private int dlzka, sirka;

	public Obdlznik(int x, int y, int dlzka, int sirka, String farba) {
		super(x, y, farba);
		this.dlzka = dlzka;
		this.sirka = sirka;
		
	}

	public int getDlzka() {
		return dlzka;
	}

	public void setDlzka(int dlzka) {
		this.dlzka = dlzka;
	}

	public int getSirka() {
		return sirka;
	}

	public void setSirka(int sirka) {
		this.sirka = sirka;
	}

	@Override
	public final void info() {
		System.out.println("Obdlznik na [" + this.getX() + ", " + this.getY() + "] dlzka: " 
				+ this.getDlzka() + ", sirka: " + this.getSirka() + ", farba: " + this.getFarba());
	}

	@Override
	public void zmenFarbu(String farba) {
		this.setFarba(farba);
		
	}
	
	
	/**
	 * 4.2  Ex: Superclass Person and its subclasses
	 * https://www3.ntu.edu.sg/home/ehchua/programming/java/j3f_oopexercises.html#zz-4.
	 * 
	 */
	
	

}
