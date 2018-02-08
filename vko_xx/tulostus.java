public class tulostus {
	
	public static void main (String []args) {
		
		System.out.println("Anna ensimmäinen luku");
		double x=OmaIO.lueDouble();
		
		System.out.println("Anna toinen luku");
		double y=OmaIO.lueDouble();
		
		System.out.println("Anna kolmas luku");
		double z=OmaIO.lueDouble();
		
		double tulo=x*y*z;
		double summa=x+y+z;
		double keskiarvo=(x*y*z)/3;
		
		System.out.print("\nlukujen tulo on " + tulo);
		System.out.println("\nlukujen summa on " + summa);
		System.out.println("lukujen keskiarvo on " + keskiarvo);
		
}
}