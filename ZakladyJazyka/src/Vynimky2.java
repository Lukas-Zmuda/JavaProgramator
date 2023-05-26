
public class Vynimky2 {

	public static void main(String[] args) {
		
		try {
			metoda1();
		} catch (VlastnaVynimka e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void metoda1() throws VlastnaVynimka, ArithmeticException {
		metoda2();
		
	}

	private static void metoda2() throws VlastnaVynimka{
		throw new VlastnaVynimka();
		
	}

	
	/**
	 * 7.1  Ex: The Discount System
	 * TODO
	 */
}
