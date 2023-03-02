import java.util.Scanner;

public class UObvodObsahObdlznika {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dlzka = 14;
		int sirka = 37;
		
		System.out.println("Zadaj dlzku obdlznika:");
		dlzka = sc.nextInt();
		System.out.println("Zadaj sirku obdlznika:");
		sirka = sc.nextInt();
		
		int obvod = 2 * (dlzka + sirka);
		int obsah = dlzka * sirka;
		
		System.out.println("Obdlznik so stranami " 
				+ dlzka + " cm, " + sirka + " cm.\nObvod = " + obvod + " cm\nObsah = " + obsah + " cm2");

	}

}
