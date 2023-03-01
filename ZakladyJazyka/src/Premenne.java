
public class Premenne {

	public static void main(String[] args) {
		
		//toto je jednoriadkovy komentar
		System.out.println("Prikaz");
		System.out.println("Prikaz2");
		System.out.println("Prikaz3");
		/*
		 * toto je 
		 * viacriadkovy
		 * komentar
		 */
		
		/**
		 * javadoc komentar
		 */
		
		//deklaracia premennej
		int cislo;
		
		//inicializacia premennej
		cislo = 14;
		
		//cele cisla
		int x = 12;
		int y, z;
		
		int aa = 12, bb = 1212;
		
		
		System.out.println("x = " + x);
		
		x = 123456789;
		
		x = cislo;
		
		System.out.println("x = " + x);
		
		byte b = 10;
		
		short sss = b;
		
		System.out.println("sss = " + sss);
		b = (byte)sss;
		
		int hex = 0xff;
		System.out.println("hex = " + hex);
		
		int oct = 031;
		System.out.println("oct = " + oct);
		
		int bin = 0b10000000;
		System.out.println("bin = " + bin);
		
		int cc = 1_100_123;
		
		//desatinne cisla
		double dd = 12.365;
		System.out.println("dd = " + dd);
		
		float ff = 1.25f;
		System.out.println("ff = " + ff);

		int des = (int)1.99;
		System.out.println("des = " + des);
		
		//znaky
		char znak = 'a';
		System.out.println(znak);
		char zavinac = 64;
		System.out.println(zavinac);

		char zz = '\u0123';
		System.out.println(zz);
		
		//log. hodnoty
		boolean slnecno = true;
		System.out.println(slnecno);
		
		//retazce
		String meno = "Lukas";
		System.out.println("meno = " + meno);
	}

}
