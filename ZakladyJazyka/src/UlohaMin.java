import java.util.Scanner;

public class UlohaMin {
	
	/*
	 * Vytvorte program, ktory nacita vysku jednotlivych ludi.
	 * Na konci vypise najmensiu vysku
	 * Program najprv nacita pocet ludi a potom samotne vysky ludi
	 * -> 5
	 * -> 178
	 * -> 187
	 * -> 190
	 * -> 168
	 * -> 188
	 * <- Najmensia vyska: 168 cm	 * 
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int pocet = 0;
		int min = 999;
		int i = 0;
		
		System.out.println("Zadaj pocet ludi: ");
		pocet = sc.nextInt();
		
		int[] vyska = new int[pocet];
		do {
			System.out.println("Zadaj vysku: ");
			vyska[i] = sc.nextInt();
			i++;
		}while(i < pocet);
		
		for(int v: vyska) {
			if(v < min) {
				min = v;
			}
		}
		
		System.out.println("Najmensi clovek ma vysku: " + min + " cm");

	}

}
