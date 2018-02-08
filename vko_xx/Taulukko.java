import java.util.Scanner; 
	public class Taulukko{
		
	public static void main (String[] args)  
	{ 
   		double [ ] lista = luelistaScannerDouble();
   		tulosta(lista);
  		System.out.println("Ääripäiden väli on "+aaripaat(lista));

 	}
  	
 	public static double[] luelistaScannerDouble() 
 {  
  Scanner näppis = new Scanner(System.in); 
   double [] apulista = new  double[100]; 
   int maara = 0;  
  System.out.println("anna luku"); 
while (näppis.hasNextDouble()) 
  { 
    double luku = näppis.nextDouble(); 
   apulista[maara] = luku; 
   maara++; 
   System.out.println("Anna luku (lopuksi jokin kirjain)"); 
  }
  String s = näppis.nextLine();
   double[] v = new  double[maara];
   for (int k=0; k<maara; k++)  
   { 
    v[k]=apulista[k];
  } 
   return  v;  
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
	
	public static void sort (double[] luvut)  
	{ 
      for (int i = luvut.length; i > 0; i--)  
	{  
         for (int k = 0; k < i-1; k++) 
   	{ 
            if (luvut[k] > luvut[k+1])  
    { 
              double apu = luvut[k];        
              luvut[k] = luvut[k+1]; 
              luvut[k+1] = apu; 
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