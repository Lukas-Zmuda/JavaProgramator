import java.util.Scanner;

public class Uloha4Kvadraticka {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, dis, r1, r2; 
		System.out.println("Zadaj a:");
		a = sc.nextDouble();
		System.out.println("Zadaj b:");
		b = sc.nextDouble();
		System.out.println("Zadaj c:");
		c = sc.nextDouble();
		
		dis = b * b - (4 * a * c);
		
		if(dis > 0) {
			r1 = (-b + Math.sqrt(dis))/(2 * a);
			r2 = (-b - Math.sqrt(dis))/(2 * a);		
			System.out.println("Rovnica ma 2 korene.");
			System.out.printf("r1 = %.3f\nr2 = %.3f\n", r1, r2);
		}else if(dis == 0) {
			r1 = -b/(2 * a);
			System.out.println("Rovnica ma 1 koren.");
			System.out.printf("r1 = %.3f\n", r1);
		}else {
			System.out.println("Rovnica nema riesenie v R");
		}
		
	}

}
