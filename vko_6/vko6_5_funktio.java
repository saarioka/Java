import java.util.LinkedList;
import java.util.Scanner;
public class vko6_5_funktio{
	public static void main(String[]args){
		LinkedList<Double> li=new LinkedList<Double>();
		Scanner n‰ppis = new Scanner(System.in); 
  		System.out.println("Anna luku"); 
    	while (n‰ppis.hasNextDouble())  
  		{  
     		double luku = n‰ppis.nextDouble(); 
   			li.add(new  Double(luku));
   			System.out.println("Anna seuraava luku (lopuksi kirjain)");  
  		}
  		n‰ppis.nextLine();
  		System.out.println("anna lis‰tt‰v‰ luku");
  		Scanner nappis = new Scanner(System.in); 
  		double lis‰tt‰v‰ = nappis.nextDouble();
  		System.out.println(lis‰‰_oikeaan_v‰liin(li,lis‰tt‰v‰));
	}
	public static LinkedList lis‰‰_oikeaan_v‰liin(LinkedList <Double> lista, double luku){
		int i=0;
		do{
			i++;
		} while (lista.get(i)<luku && i<lista.size());
		lista.add(i,luku);
		return lista;
	}

}