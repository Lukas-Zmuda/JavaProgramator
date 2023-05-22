package edu.oop.zapuzdrenie;

public class Ucet {
	
	private String nazov;
	private double zostatok;
	
	public Ucet(String nazov, double zostatok){
		this.setZostatok(zostatok);
		this.nazov = nazov;
	}
	
	public String getNazov() {
		return this.nazov;
	}
	
	public void setNazov(String nazov) {
		this.nazov = nazov;
	}
	
	public double getZostatok() {
		return zostatok;
	}

	private void setZostatok(double zostatok) {
		if(zostatok > 0) {
			this.zostatok = zostatok;			
		}else {
			this.zostatok = 0;
			System.out.println("Zaporny zostatok");
		}
	}

	public void vklad(double suma) {
		if(suma > 0) {
			this.zostatok += suma;
			System.out.println("Vklad na ucet #" + this.nazov + " " + suma + " EUR");
		}else {
			System.out.println("Nepovolena suma vkladu (" + suma + ")!");
		}
	}
	
	public void vyber(double suma) {
		if(suma > 0) {
			if(suma < this.zostatok) {
				this.zostatok -= suma;
				System.out.println("Vyber z uctu #" + this.nazov + " " + suma + " EUR");
			}else {
				System.out.println("Nedostatocne prostriedky na ucte!");
			}
		}else {
			System.out.println("Nepovolena suma vyberu (" + suma + ")!");
		}
	}
	
	public void info() {
		System.out.println("Ucet #" + this.nazov);
		System.out.println("Zostatok: " + this.zostatok);
	}
	
	

}
