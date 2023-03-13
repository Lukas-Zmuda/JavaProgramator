import java.util.Scanner;

public class Horoskop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Zadaj deň narodenia: ");
		int den = sc.nextInt();
		System.out.println("Zadaj mesiac narodenia: ");
		int mesiac = sc.nextInt();

		if ((den > 31) || (mesiac >= 13) || (mesiac == 4 || mesiac == 6 || mesiac == 9 || mesiac == 11) && (den > 30)
				|| (mesiac == 2 && den > 29)) {
			System.out.println("Neplatný dátum!");
		} else {
			switch (mesiac) {
			case 1:
				System.out.print("Narodil si sa " + den + ". januára a tvoje znamenie ");
				if (den <= 20) {
					System.out.print("je kozorožec.");
				} else {
					System.out.print("je vodnár.");
				}
				break;
			case 2:
				System.out.print("Narodil si sa " + den + ". februára a tvoje znamenie ");
				if (den <= 19) {
					System.out.print("je vodnár.");
				} else {
					System.out.print("sú ryby");
				}
				break;
			case 3:
				System.out.print("Narodil si sa " + den + ". marca a tvoje znamenie ");
				if (den <= 20) {
					System.out.print("sú ryby.");
				} else {
					System.out.print("je baran.");
				}
				break;
			case 4:
				System.out.print("Narodil si sa " + den + ". apríla a tvoje znamenie ");
				if (den <= 20) {
					System.out.print("je baran.");
				} else {
					System.out.print("je býk.");
				}
				break;
			case 5:
				System.out.print("Narodil si sa " + den + ". mája a tvoje znamenie ");
				if (den <= 20) {
					System.out.print("je býk.");
				} else {
					System.out.print("sú blíženci.");
				}
				break;
			case 6:
				System.out.print("Narodil si sa " + den + ". júna a tvoje znamenie ");
				if (den <= 21) {
					System.out.print("sú blíženci.");
				} else {
					System.out.print("je rak.");
				}
				break;
			case 7:
				System.out.print("Narodil si sa " + den + ". júla a tvoje znamenie ");
				if (den <= 22) {
					System.out.print("je rak.");
				} else {
					System.out.print("je lev.");
				}
				break;
			case 8:
				System.out.print("Narodil si sa " + den + ". augusta a tvoje znamenie ");
				if (den <= 22) {
					System.out.print("je lev.");
				} else{
					System.out.print("je panna.");
				}
				break;
			case 9:
				System.out.print("Narodil si sa " + den + ". septembra a tvoje znamenie ");
				if (den <= 22) {
					System.out.print("je panna.");
				} else if (den >= 23) {
					System.out.print("sú váhy.");
				}
				break;
			case 10:
				System.out.print("Narodil si sa " + den + ". októbra a tvoje znamenie ");
				if (den <= 22) {
					System.out.print("sú váhy.");
				} else if (den >= 23) {
					System.out.print("je škorpión.");
				}
				break;
			case 11:
				System.out.print("Narodil si sa " + den + ". novembra a tvoje znamenie ");
				if (den <= 22) {
					System.out.print("je škorpión.");
				} else if (den >= 23) {
					System.out.print("je strelec.");
				}
				break;
			case 12:
				System.out.print("Narodil si sa " + den + ". decembra a tvoje znamenie ");
				if (den <= 21) {
					System.out.print("je strelec.");
				} else if (den >= 22) {
					System.out.print("je kozorožec.");
				}
				break;
			}
		}

	}
}

