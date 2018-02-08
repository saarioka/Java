/***************************************************************** 
 * Murtolukujen (eli rationaalilukujen) luokka. Murtoluku on 
 * muotoa osoittaja/nimittäjä missä osoittaja ja nimittäjä ovat 
 * kokonaislukuja, ja nimittäjä > 0. Negatiivisessa murtoluvussa 
 * osoittaja on < 0. Nolla esitetään muodossa 0/1. 
 *****************************************************************/ 
public class Murtoluku
{ 
 /** Murtoluvun osoittaja */ 
 private int os; 
 /** Murtoluvun nimittäjä */ 
private int nim; 
 /*************************************************************************** 
 * Konstruktori 
 ***************************************************************************/ 
 /** Luodaan murtoluku, kun osoittaja ja nimittäjä on annettu, 
 * ja muutetaan esitys standardimuotoon eli nimittäjä b on positiivinen, 
 * jos b on negatiivinen, niin suoritetaan lavennus -1:llä. 
 * Luotu murtoluku on supistetussa muodossa. 
 * Alkuehto: b ei ole nolla. 
 */ 
public Murtoluku(int a, int b) {
	this.os=a; this.nim=b;
}
 /*************************************************************************** 
 * Havainnointimetodit 
 **************************************************************************/ 
 /** Palauttaa murtoluvun osoittajan */ 
 public int getOs(){return this.os;}
 /** Palauttaa murtoluvun nimittäjän */ 
public int getNim() {return this.nim;}
/** Palauttaa kohdemurtoluvun esityksen merkkijonona, esim. 2/3 . Murtoluku on aina 
 * supistetussa muodossa. 
 * Alussa ja lopussa on välilyönnit. 
 */ 
public String toString(){
	String mjono=" " + a + "/" + "b" + " ";
	return mjono;
}
 /************************************************************************************************************** 
 * Murtolukujen väliset laskutoimitukset. Metodit palauttavat aina uuden murtolukuolion ja 
 * kohdemurtoluku ei muutu. 
 **************************************************************************************************************/ 
 /** Murtolukujen yhteenlasku: Funktio add palauttaa kohdemurtoluvun 
 * ja parametrina annetun murtoluvun (toinen) summan uutena murtolukuna, joka 
 * on supistetussa muodossa. 
 * Kohdemurtoluku ei muutu. 
 * Alkuehto: murtoluku toinen tulee olla luotu.
 */ 
public Murtoluku add(Murtoluku toinen){
}
 /**************************************************************************************************** 
 * Muutosmetodit 
 ****************************************************************************************************/ 
 /** Kohdemurtoluvun supistaminen osoittajan ja nimittäjän syt:llä, jos syt on > 1. */ 
private void supista(){
	int t=syt(this.os,this.nim);
	this.os=this.os/t;
	this.nim=this.nim/t;
}
 /***************************************************************************************************
 * Apumetodi 
 ***************************************************************************************************/ 
 /** Kahden kokonaisluvun suurin yhteinen tekijä, ks. esim. JTKT-moniste. 
 * Alkuehto: a>0 ja b>0. 
 */ 
private static int syt(int a, int b) { 
if ((a < 1) || (b < 1)) 
{ 
 	System.out.println("Vain positiiviset luvut kelpaavat"); 
 	} 
	else
 	{ // nyt sekä a että b ovat vähintään 1 
		while (a != b) // a erisuuria kuin b 
		{ 
			if (a > b) 
			{ 
				a = a - b; 
 			} 
			else 
			{ 
 				b = b - a; 
 			} 
 		} // while 
 		return a; 
	 } // else 
  } // Syt
} // luokan Murtoluku loppu 