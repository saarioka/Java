import java.util.StringTokenizer;
public class vko4_45{
	public static void main(String[]args){
		String mjono= new String("10+25");
		System.out.println(lasku_int_tyyppiseksi(mjono));
	}
	public static int lasku_int_tyyppiseksi(String st){
	/**Palauttaa string-tyyppisen yhteen- tai v�hennyslaskun tuloksen int-tyyppisen�
	 *alkuehto: parametrina annetun merkkijonon tulee sis�lt�� yhteen- tai v�hennyslasku
	 *ja merkkojono ei saa sis�lt�� v�lily�ntej�
	 */
		StringTokenizer st1 = new StringTokenizer(st,"+-",true); 
		int a = Integer.parseInt(st1.nextToken());
		char c = st1.nextToken().charAt(0);
		int b = Integer.parseInt(st1.nextToken());
		if (c=='+') return a+b;
		else return a-b;
	}
}