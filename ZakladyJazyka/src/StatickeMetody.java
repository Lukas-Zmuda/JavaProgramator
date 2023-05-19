
public class StatickeMetody {

	public static void main(String[] args) {
		
		pozdrav();
		
		System.out.println("Program pokracuje dalej ...");
		
		pozdrav();
		
		//vlozCiaru("////////////////");
		
		System.out.println(spocitaj(456, 123, 789));
		
		System.out.println(spocitaj(1.234, 2.587, 3.698));
		
		int[] pole = {10, 12, 1};
		vypisPole(pole);
		
		int[] vytvorenePole = vytvorPole(10);
		vypisPole(vytvorenePole);
		
	}
	
	//metoda bez navratoveho typu
	static void pozdrav() {
		vlozCiaru("---------------");
		System.out.println("Dobry den Alexander");
		vlozCiaru('-', 20);	
	}

	static void vlozCiaru(String ciara) {
		System.out.println(ciara);
	}
	
	static void vlozCiaru(char znak, int dlzka) {
		for(int i = 0; i < dlzka; i++) {
			System.out.print(znak);
		}
		System.out.println();
	}
	
	static void vlozCiaru(int dlzka, char znak) {
		vlozCiaru(znak, dlzka);
	}
	
	static void vypisPole(int[] pole) {
		for(int prvok: pole) {
			System.out.print(prvok + ", ");
		}
		System.out.println();
	}
	
	//metody s navratovym typom
	static int spocitaj(int x, int y, int z) {
		int sucet = x + y + z;
		return sucet;
	}
	
	static double spocitaj(double x, double y, double z) {
		return x + y + z;
	}
	
	static int[] vytvorPole(int hornaHranica) {
		int[] pole = new int[hornaHranica];
		for(int i = 0; i < pole.length; i++) {
			pole[i] = i + 1;
		}
		return pole;
	}
	
}
