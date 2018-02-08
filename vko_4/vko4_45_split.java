import java.util.*;
public class vko4_45_split{
	public static void main(String[]args){
		String mjono= new String("10+25");
		System.out.println(lasku_int_tyyppiseksi(mjono));
	}
	public static int lasku_int_tyyppiseksi(String st){
	/**Palauttaa string-tyyppisen yhteen- tai vähennyslaskun tuloksen int-tyyppisenä
	 *alkuehto: parametrina annetun merkkijonon tulee sisältää yhteen- tai vähennyslasku
	 *ja merkkojono ei saa sisältää välilyöntejä
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