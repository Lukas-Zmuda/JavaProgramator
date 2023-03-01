
public class Operatory {

	public static void main(String[] args) {
		
		//aritmeticke
		System.out.println(10 + 5);
		System.out.println(10 - 5);
		System.out.println(10 * 5);
		System.out.println((double)10 / 3);
		System.out.println(10 % 3);
		
		System.out.println((10 + 5) * 3);
		
		int a = 12 * 3 % 4;
		System.out.println("a = " + a);

		//relacne
		System.out.println(10 > 5);
		System.out.println(10 >= 5);
		System.out.println(10 < 5);
		System.out.println(10 <= 5);
		System.out.println(10 == 5);
		System.out.println(10 != 5);
		
		//logicke
		
		System.out.println((10 > 5) && (1 != 2));//true
		System.out.println((10 > 5) || (2 > 5));//true
		System.out.println(!(10 > 5) || (2 > 5));//false
	}

}
