import java.util.Random;
import java.util.Scanner;
public class vko4_23_scanner{
	public static void main(String[]args){
		boolean jatkuu=true;
		double toistoja=0;
		double oikein=0;
		while (jatkuu==true){
			Random gen = new  Random();
			int a=gen.nextInt(100)+1;
			int b=gen.nextInt(100)+1;
			System.out.println("Mik‰ on lukujen "+a+" ja "+b+" summa?");
			Scanner scan= new Scanner(System.in);
			int n=scan.nextInt();
			if (n==a+b){
				System.out.println("Oikein");
				oikein++;
			}
			else System.out.println("V‰‰rin");
			System.out.println();
			System.out.println("haluatko jatkaa?(true/false)");
			jatkuu=scan.nextBoolean();
			toistoja++;
		}
		double tulos=oikein/toistoja;
		System.out.println();
		System.out.println("Sait "+tulos*100+"% kysymyksist‰ oikein");
	}
}