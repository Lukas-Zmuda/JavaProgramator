
public class CyklySPodmienkou {

	public static void main(String[] args) {
		
		
		int a = 1;
		
		while(a < 11) {
			System.out.print(a + ", ");
			a++;
		}
		
		System.out.println("\n-------------");
		a = 111;
		
		do {
			System.out.print(a + ", ");
			a++;
		}while(a < 11);
		
		a = 1;
		
		System.out.println("\n-------------");
		
		while(true) {
			System.out.print(a + ", ");
			a++;
			if(a == 11) {
				break;
			}
			
			if(a == 6) {
				a++;
				continue;
			}
		}
		
		
		System.out.println("\nProgram pokracuje dalej ...");

	}

}
