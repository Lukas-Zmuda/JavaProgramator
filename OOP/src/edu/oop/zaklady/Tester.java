package edu.oop.zaklady;

public class Tester {

	public static void main(String[] args) {
		
		//deklaracia objektu
		Osoba os1;
		
		//inicializacia objektu
		os1 = new Osoba();
		
		
		os1.meno = "Jan";
		os1.priezvisko = "Hrasko";
		os1.vek = 41;
		os1.pohlavie = 'm';
		
		//System.out.println(os1.priezvisko);

		os1.pozdrav();
		
		Osoba os2 = new Osoba();
		System.out.println(os2.vek);
		
		os2.meno = "Ruzena";
		os2.priezvisko = "Sipkova";
		os2.pohlavie = 'z';
		os2.vek = 25;
		
		os2.pozdrav();
		
		//System.out.println(os2.pohlavieSlovom());
		
		os1.info();
		os2.info();
		
		Osoba os3 = new Osoba("Fero", "Mravec", 15, 'm');
		
		os3.info();
		
		//Vytvorte triedu, ktora bude obsahovat aspon 
		//3 instancne premenne
		//2 konstruktory
		//4 metody (2 bez a 2 s navratovou hodnotou)
		
	}

}
