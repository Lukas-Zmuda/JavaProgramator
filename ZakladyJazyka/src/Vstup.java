import java.util.Scanner;

public class Vstup {

	public static void main(String[] args) {
		
		//deklaracia a inicializacia objektu
		Scanner sc = new Scanner(System.in);
		
		String meno;
		
		System.out.println("Zadaj meno: ");
		meno = sc.nextLine();
		
		System.out.println("Ahoj " + meno + "!");
		
		System.out.println("V ktorom roku si sa narodil " + meno + "?");
		int rokNarodenia;
		
		rokNarodenia = sc.nextInt();
		System.out.println("Mas " + (2023 - rokNarodenia) + " rokov.");

	}

}
