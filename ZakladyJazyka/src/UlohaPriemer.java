import java.util.Scanner;

public class UlohaPriemer {

	/**
	 * Aritmeticky priemer z n zadanych cisel
	 * n je zadane na vstupe
	 * 
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int pocet = 0, cislo = 0, suma = 0;
		double priemer = 0;
		
		System.out.println("Zadaj pocet cisel:");
		pocet = sc.nextInt();
		
		for(int i = 0; i < pocet; i++) {
			System.out.println("Zadaj cislo:");
			cislo = sc.nextInt();
			suma += cislo;
		}
		
		priemer = (double)suma / pocet;
		
		System.out.println("Priemer: " + priemer);

	}

}
