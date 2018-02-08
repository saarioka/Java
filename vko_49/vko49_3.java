import java.util.Scanner;
public class vko49_3{
	//alkuehto: n ja m tulee olla luotu
	public static int metodi(int n,int m){
		int a;
		do{
			System.out.println("Anna luku");
			Scanner lukija = new Scanner(System.in); 
			a=lukija.nextInt();
		}while ((n>a)|(m<a));
		return a;
	}
	public static void main(String[]args){
		int k=metodi(1,10);
	}
}

//jos n>m, mikään luku ei kelpaa