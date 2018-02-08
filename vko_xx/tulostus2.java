import java.util.Scanner;
public class tulostus2 {
	
	public static void main (String []args) {
		
		System.out.println("Anna ensimmäinen luku");
		Scanner lukija = new Scanner(System.in); 
		double x = lukija.nextInt();
		
		System.out.println("Anna toinen luku"); 
		double y = lukija.nextInt();
		
		System.out.println("Anna kolmas luku"); 
		double z = lukija.nextInt();
		
		double tulo=x*y*z;
		double summa=x+y+z;
		double keskiarvo=summa/3;
		
		System.out.print("\nlukujen tulo on " + tulo);
		System.out.println("\nlukujen summa on " + summa);
		System.out.println("lukujen keskiarvo on " + keskiarvo);
		
}
}