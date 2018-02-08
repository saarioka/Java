import  java.util.LinkedList;
import  java.util.Scanner; 
public class vko5_4{ 
	public static void main (String[] args){ 
		LinkedList<Double> lista = luelista(); 
   		System.out.println("Suurin annettu luku on " + suurin(lista)); 
  	}
   /** 
   * Metodi lukee n�ppimist�lt� kokonaislukuja listaan, joka palautetaan.  
   * Kun halutaan lopettaa, annetaan jokin kirjain  
   * (tai mit� tahansa joka ei ole kokonaisluvun esitys). 
   */ 
	public static LinkedList<Double>  luelista()  
 	{ 
  		LinkedList<Double> v = new LinkedList<Double>();
  		Scanner n�ppis = new Scanner(System.in); 
  		System.out.println("Anna luku"); 
    	while (n�ppis.hasNextDouble())  
  		{  
     		double luku = n�ppis.nextDouble(); 
   			v.add(new Double(luku));
   			System.out.println("Anna seuraava luku (lopuksi kirjain)");  
  		}
  		n�ppis.nextLine();
    	return  v;  
  	}
  	/**  
     * Funktio palauttaa listan v suurimman alkion arvon.  
 	 * Alkuehto: lista ei saa olla tyhj�  
     */ 
public static int suurin(LinkedList<Double> v){ 
  	Double obj =  v.get(0); 
    int toistaiseksi_suurin = obj.intValue();
    int apu; 
    for (int i=1; i<v.size(); i++){ 
    	apu = v.get(i).intValue(); 
     	if ( apu> toistaiseksi_suurin){ 
    		toistaiseksi_suurin = apu; 
   		}
  	}
    return  toistaiseksi_suurin; 
  }
}