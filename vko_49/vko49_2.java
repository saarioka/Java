public class vko49_2{
	public static void main (String[]args){
		int n=10;
		while (n<=16){
			System.out.println(n);
			n=n+2;
		}
		
		do{
			System.out.println(n);
			n=n+2;
		}while (n<=22);
		
		for (;n<=30;n=n+2)
			System.out.println(n);
	}
}