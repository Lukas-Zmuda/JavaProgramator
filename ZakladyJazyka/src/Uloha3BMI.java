import java.util.Scanner;

public class Uloha3BMI {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int vyska = 0, hmotnost = 0;

		System.out.println("Zadaj hmotnost [kg]: ");
		hmotnost = sc.nextInt();
		System.out.println("Zadaj vyska [cm]: ");
		vyska = sc.nextInt();
		
		double bmi = 0, v = vyska / 100.0;
		
		bmi = hmotnost / (v * v);
		//System.out.println("BMI: " + bmi);

		System.out.printf("BMI: %.4f\n", bmi);
		
		if(bmi > 40) {
			System.out.println("Obezita tretieho stupna");
		}else if(bmi > 35){
			System.out.println("Obezita druheho stupna");
		}else if(bmi > 30) {
			System.out.println("Obezita prveho stupna");
		}else if(bmi > 25) {
			System.out.println("Nadvaha");
		}else if(bmi > 18.5) {
			System.out.println("Idealna vaha");
		}else if(bmi > 16.5) {
			System.out.println("Podvaha");
		}else {
			System.out.println("Tazka podvyziva");
		}

	}

}
