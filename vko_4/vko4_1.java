public class vko4_1{
	public static void main(String[]args){
		StringBuilder mjono=new  StringBuilder("raskas ja karsea"); 
		System.out.println(esiintymi�(mjono,'a'));
	}
	public static int esiintymi�(StringBuilder mjono, char c){
    /**palauttaa tiedon siit� kuinka monta kertaa merkki esiintyy merkkijonossa
     *alkuehto:merkkijono ja merkki ovat luotu.
     */
    	int e=0;
    	for (int i=0; i<mjono.length(); i++){ 
    		if (mjono.charAt(i)==c) e++;
    	}
    	return e;
 	}
}
/** String -> StringBuilder:
 *  StringBuilder stB = new StringBuilder(st);
 *
 *	StringBuilder -> String
 *	String st = new  String(stB); 
 */
