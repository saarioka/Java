public class vko48_3 {

	public static void tulosta(char x, int y){
		int k=0;
		while (k<y){
			System.out.print(x);
			k++;
		}
	}

	public static void main (String[] args){
		tulosta('y',10);
		System.out.println();
		tulosta('2',15);
	}
}