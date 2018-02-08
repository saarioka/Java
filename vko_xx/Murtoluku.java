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
	supista();
	String mjono=" " + this.os + "/" + this.nim + " ";
	return mjono;
}
public boolean less(Murtoluku m){
	if (this.os/this.nim<m.os/m.nim){
		return true;
	}
	else{
		return false;
	}
}

public boolean equals(Murtoluku m){
	if (this.os/this.nim==m.os/m.nim){
		return true;
	}
	else{
		return false;
	}
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
  	Murtoluku uusi=new Murtoluku(this.os*toinen.nim+toinen.os*this.nim,this.nim*toinen.nim);
  	return uusi;
  }

 /**************************************************************************************************** 
 * Muutosmetodit 
 ****************************************************************************************************/ 
 /** Kohdemurtoluvun supistaminen osoittajan ja nimittäjän syt:llä, jos syt on > 1. */ 
private void supista(){
	int t=syt(this.os,this.nim);
	this.os=this.os/t;
	this.nim=this.nim/t;
	if (this.os<1 && this.nim<1){
		this.os=0-this.os;
		this.nim=0-this.nim;
	}
}
 /***************************************************************************************************
 * Apumetodi 
 ***************************************************************************************************/ 
 /** Kahden kokonaisluvun suurin yhteinen tekijä, ks. esim. JTKT-moniste. 
 * Alkuehto: a>0 ja b>0. 
 */ 
private static int syt(int a, int b) {
if ((a<1) && (b<1)) {
	a=0-a;
	b=0-b;
}
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
	
	   } // else 
	 return a;
  } // Syt
} // luokan Murtoluku loppu 