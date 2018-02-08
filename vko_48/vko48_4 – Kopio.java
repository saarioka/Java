public class vko48_4-kopio{
	public static void main(String[]args){
		while (n>0){
		System.out.println("Anna merkki");
		char x=OmaIO.lueChar();
		System.out.println("kuinka monta?");
		char n=OmaIO.lueChar();
		vko48_3.tulosta(x,n);
		n=n-1;
		}
	}
}