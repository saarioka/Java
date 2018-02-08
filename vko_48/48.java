public class 48  
public static void main (String[ ] args)  
{ 
 System.out.println("Anna n "); // ohjelman suoritus alkaa tästä lauseesta 
int n = OmaIO.lueInt(); 
 int ker = kertoma(n); 
 System.out.println(n + "-kertoma on " + ker); 
} // main 
/** Metodi palauttaa n-kertoman arvon.       
 * Alkuehto: n>= 0. 
 */  
public static int kertoma(int n)  
{ 
int k = 1; 
while (n>1)  
{ 
  k = k * n;   
  n --; 
 }  // while 
return k; 
}  // kertoma 
} // class  