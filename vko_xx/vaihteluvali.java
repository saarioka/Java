import java.util.Scanner;
public class vaihteluvali{
	
	public static void main(String[]args){
		int[]lista = luelistaScanner();
	}

	public static double aaripaat(double[]v){
			
		double suurin=v[0];
		double pienin=suurin;
		for (int i=1; i<v.length; i++){
    	if (v[i]>suurin) suurin = v[i]; 
		}
		for (int i=1; i<v.length; i++){
    	if (v[i]<pienin) pienin = v[i];
		}
		return suurin-pienin;
	}

	public static double luelistaScanner() { 
  		// luetaan luvut ensin taulukkoon apulista 
  		Scanner näppis = new Scanner(System.in); 
   		int [] apulista = new  int[100]; // varataan tilaa ‘varman päälle’ 
  		int maara = 0;  
 		System.out.println("anna luku"); 
		while (näppis.hasNextInt()) 
 		{ 
  		int luku = näppis.nextInt(); 
 		apulista[maara] = luku; 
		maara++; 
	   	System.out.println("Anna luku (lopuksi jokin kirjain)"); 
 		} //  while 
 		String s = näppis.nextLine();  // luetaan kirjain ja enter pois syötevirrasta!!! 
 		/* Luodaan oikeankokoinen taulukko ja kopioidaan apulistan luvut siihen. 
    	Nyt maaara kertoo kuinka monta lukua tallennettiin apulistaan. */ 
   		int[] v = new  int[maara];  // luodaan int-taulukko, jossa on maara komponenttia 
   		for (int k=0; k<maara; k++)  
   		{ 
    	v[k]=apulista[k];  // kopiointi 
  		} 
   		return  v;
 }
 	
	public static void lajittele(double[]luvut){ 
		
        int i, j, koko = luvut.length; 
        for (i=0; i < koko-1; i++){ 
        	
    		for (j=koko-1; j > i; j--){ 
    			
       			if (luvut[j-1] > luvut[j]){ 
       				
           			double tmp = luvut[j-1]; 
           			luvut[j-1] = luvut[j]; 
          			luvut[j] = tmp; 
        		}
   			}
  		}
    }
    
    public static void tulosta(double[]lista){
    	System.out.println("Luvut ovat:");
    	for (int i=1; i<lista.length; i++){
    	System.out.println(lista[i]);
    	}
    }
    
}