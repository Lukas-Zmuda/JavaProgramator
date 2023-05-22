
public class Retazce {

	public static void main(String[] args) {
		
		String meno = "Lukas";
		String meno2 = "Lukas";
		
		String meno3 = new String("Lukas");
		String meno4 = new String("Lukas");
		  
		String meno5 = "           LuKaS    ";
		System.out.println(meno3);
		
		System.out.println(meno == meno2);
		System.out.println(meno == meno3);
		System.out.println(meno3 == meno4);
		
		System.out.println(meno.equals(meno3));
		
		System.out.println(meno.toLowerCase());
		System.out.println(meno.toUpperCase());
		
		System.out.println(meno);
		
		System.out.println(meno.toLowerCase().equals(meno5.toLowerCase()));
		
		System.out.println(meno.equalsIgnoreCase(meno5));
		
		System.out.println(meno.indexOf('u'));
		
		System.out.println(meno.charAt(0));
		

		System.out.println(meno.substring(2));
		
		System.out.println(meno.substring(1, 4));
		
		System.out.println(meno.startsWith("Lu"));
		
		System.out.println(meno.endsWith("ova"));
		
		System.out.println(meno.length());
		
		System.out.println(meno5.length());
		
		System.out.println(meno5.trim());
	}

}
