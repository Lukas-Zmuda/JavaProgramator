
public class Pole {

	public static void main(String[] args) {
		
		//deklaracia a inicializacia pola
		int[] cisla = new int[10];
		
		cisla[0] = 10;
		cisla[1] = cisla[0] + 5;
		cisla[2] = cisla[1] * 3;
		cisla[3] = -7;
		cisla[4] = 100;
		cisla[5] = 111;
		cisla[6] = 789;
		cisla[7] = 7777;
		cisla[8] = 123456789;
		cisla[9] = -78;
		
		System.out.println("Druhy prvok pola ma hodnotu: " + cisla[1]);
		
		System.out.println("Pocet prvkov pola: " + cisla.length);
		
		for(int i = 0; i < cisla.length; i++) {
			System.out.print(cisla[i] + " ");
		}

		System.out.println();
		for(int i = cisla.length - 1; i > -1; i--) {
			System.out.print(cisla[i] + " ");
		}
		
		System.out.println();
		String[] mena = {"Fero", "Ivan", "Matej", "Maros", "Jan"};
		
		double[] ds = {1.4, 2.3, 56, 7.9};
		
		
		for(int i = 0; i < mena.length; i++) {
			System.out.println((i + 1) + ". " + mena[i]);
		}
		
		for(String m: mena) {
			System.out.print(m + ", ");
		}
		
	}

}
