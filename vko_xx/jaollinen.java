import java.util.Scanner;
public class jaollinen {
	public static void main (String[]args) {

		Scanner lukija=new Scanner (System.in);

		System.out.println("Anna luku");
		double n=lukija.nextDouble();
		int m=0;
		while (m<=n) {
			System.out.println(m);
			m=m+3;
		}
	}
}