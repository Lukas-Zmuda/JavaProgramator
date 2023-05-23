package edu.oop.dedicnost;

public class Tester {

	public static void main(String[] args) {
		//Utvar u = new Utvar(0, 0, "cierna");
		
		//u.info();
		
		//u.vypln = "asdsa";
		
		Kruh k = new Kruh(1, 1, 10, "cervena");
		
		//k.info();
		
		Utvar obdl = new Obdlznik(2, 2, 10, 12, "zeleny");
		
		//obdl.info();
		
		Utvar[] utvary = new Utvar[3];
		utvary[0] = new Kruh(100, -100, 1500, "ruzovy");
		utvary[1] = obdl;
		utvary[2] = k;
		
		for(Utvar uu: utvary) {
			uu.info();
		}

		

	}
}