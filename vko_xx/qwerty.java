public class qwerty{
	public static void main(String[]args){
		System.out.println("Anna merkki");
		char x=OmaIO.lueChar();
		System.out.println("kuinka monta?");
		int n=OmaIO.lueInt();
		while (n>0){
		vko48_3.tulosta(x,n);
		System.out.println();
		n=n-1;
		}
	}
}