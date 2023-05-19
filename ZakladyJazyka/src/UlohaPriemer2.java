import java.util.Scanner;

public class UlohaPriemer2 {

	/**
	 * Aritmeticky priemer z n zadanych cisel
	 * pri zadani cisla 0 nacitavanie skonci
	 * 
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int pocet = 0, cislo = 123, suma = 0;
		double priemer = 0;
		
//		do {
//			System.out.println("Zadaj cislo:");
//			cislo = sc.nextInt();
//			suma += cislo;
//			pocet++;
//		}while(cislo != 0);
		
		while(true){
			System.out.println("Zadaj cislo:");
			cislo = sc.nextInt();
			if(cislo == 0) {
				break;
			}
			suma += cislo;
			pocet++;
		}
		
			
		priemer = (double)suma / pocet;
		
		System.out.println("Priemer: " + priemer);

	}

}
