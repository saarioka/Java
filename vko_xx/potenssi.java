import java.util.Scanner;
public class potenssi {
	public static void main (String[]args) {
		Scanner lukija=new Scanner (System.in);
		System.out.println("Anna potenssin kanta");
		double x=lukija.nextDouble();
		System.out.println("anna potenssi");
		double n=lukija.nextDouble();
		double tulo=1;
		while (n>0) {
			tulo=tulo*x;
			n=n-1;
		}
		System.out.println("potenssin arvo on "+tulo);
	}
}