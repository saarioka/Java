import java.util.*;
public class vko4_45_split{
	public static void main(String[]args){
		String mjono= new String("10+25");
		System.out.println(lasku_int_tyyppiseksi(mjono));
	}
	public static int lasku_int_tyyppiseksi(String st){
	/**Palauttaa string-tyyppisen yhteen- tai v�hennyslaskun tuloksen int-tyyppisen�
	 *alkuehto: parametrina annetun merkkijonon tulee sis�lt�� yhteen- tai v�hennyslasku
	 *ja merkkojono ei saa sis�lt�� v�lily�ntej�
	 */
	 	boolean yhteenlaskuko;
	 	if (st.contains("+")) yhteenlaskuko=true;
	 	else yhteenlaskuko=false;
		String[]s = st.split("[+-]"); 
		String a=s[0];
		String b=s[1];
		int c =Integer.parseInt(a);
		int d =Integer.parseInt(b);
		if (yhteenlaskuko) return c+d;
		else return c-d;
	}
}