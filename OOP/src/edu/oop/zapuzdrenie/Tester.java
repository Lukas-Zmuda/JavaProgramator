package edu.oop.zapuzdrenie;

public class Tester {

	public static void main(String[] args) {
		
		
		Ucet u1 = new Ucet("SK123215465468", 500);
		u1.info();
		
		u1.vklad(1000);
		u1.info();
		
		u1.vyber(100);
		u1.info();
		
		//u1.zostatok = -1000;
		u1.info();
		
		System.out.println(u1.getZostatok());
		
		//u1.setZostatok(456);
		u1.info();

	}

}
