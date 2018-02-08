import java.util.LinkedList;
import java.util.Scanner;
public class vko5_2_automaattinen_tyypinmuunnos {
	public static void main(String[]args){
		LinkedList<Integer> lista = new LinkedList<Integer>();
  		Scanner näppis = new Scanner(System.in); 
  		System.out.println("Anna luku"); 
    	while (näppis.hasNextInt())
  		{  
     	int luku = näppis.nextInt();
   		lista.add(luku);
   		System.out.println("Anna seuraava luku (lopuksi kirjain)");
  		}
  		näppis.nextLine(); 
		System.out.println(keskiarvo(lista));
		}
	public static double keskiarvo (LinkedList<Integer> L) {
		int summa=0;
		for(int i=0;i<L.size();i++){
			summa=summa+L.get(i);
		}
		double ka=summa/L.size();
		return ka;
	}
}