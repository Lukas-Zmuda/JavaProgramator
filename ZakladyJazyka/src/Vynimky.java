import java.util.InputMismatchException;
import java.util.Scanner;

public class Vynimky {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int c1, c2, vysledok;
		
		try {
			System.out.println("Zadaj cislo: ");
			c1 = sc.nextInt();
			
			System.out.println("Zadaj cislo: ");
			c2 = sc.nextInt();
			
			vysledok = c1 / c2;
			
			System.out.println(c1 + " / " + c2 + " = " + vysledok);			
		}catch(ArithmeticException ae) {
			System.out.println("Nulou nie je mozne delit!");
		}catch(InputMismatchException ime) {
			System.out.println("Musis zadat cislo!");
		}catch(Exception e) {
			System.out.println("Nastala nejaka chyba!");
		}
		
		System.out.println("Program pokracuje dalej ....");

	}

}
