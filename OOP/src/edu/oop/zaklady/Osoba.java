package edu.oop.zaklady;

public class Osoba {
	
	//instancne premenne
	//vlastnosti
	String meno;
	String priezvisko;
	int vek;
	char pohlavie;//m - muz, z - zena

	//konstruktory
	Osoba(){
		meno = "nezname";
		priezvisko = "nezname";
		vek = 1;
		pohlavie = 'm';
	}
	
	Osoba(String m, String p, int v, char pp){
		meno = m;
		priezvisko = p;
		vek = v;
		pohlavie = pp;
	}
	
	//metody
	void pozdrav() {
		System.out.println("Ahoj, volam sa " + meno + " " + priezvisko + "!");
	}
	
	String pohlavieSlovom() {
		if(pohlavie == 'm') {
			return "muz";
		}else {
			return "zena";
		}
	}
	
	void info() {
		System.out.println("Meno a priezvisko: " + meno + " " + priezvisko);
		System.out.println("Vek: " + vek);
		System.out.println("Pohlavie: " + pohlavieSlovom());
	}
}
