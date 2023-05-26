import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> mena = new ArrayList<>();
		
		mena.add("Daniel");//0
		mena.add("Tomas");
		mena.add("Marek");
		mena.add("Lukas");//3
		
		
		for(String meno: mena) {
			System.out.print(meno + ", ");
		}
		System.out.println();
		
		System.out.println("Pocet mien v zozname: " + mena.size());
		
		System.out.println("Posledny v zozname je " + mena.get(mena.size() - 1));
		
		mena.add(1, "Peter");
		
		for(String meno: mena) {
			System.out.print(meno + ", ");
		}
		System.out.println();
		
		System.out.println("Je Marek v zozname? " + mena.contains("Marek"));
		
		mena.remove(1);
		
		
		for(String meno: mena) {
			System.out.print(meno + ", ");
		}
		System.out.println();
		
		mena.set(0, "Dano");
		
		for(String meno: mena) {
			System.out.print(meno + ", ");
		}
		System.out.println();

	}

}
