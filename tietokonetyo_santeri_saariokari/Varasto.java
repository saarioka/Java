/**
 * Luokan avulla mallinnetaan varastoa.
 *
 * @author Santeri Saariokari
 * @version 1.9 2013/4/21
 */
import java.util.*;
public class Varasto
{
   // *********************************************
   //  Tietokent‰t
   // *********************************************

 /**
  * Varaston nimi.
  */
private String nimi;

 /**
  * Varaston osoite.
  */
private String osoite; 

 /**
  * Varaston tuotteet dynaamisena listana.
  */
private LinkedList<VarastonTuote> tuotteet;

 // *********************************************
 //  Konstruktorit
 // *********************************************

 /**
  * Luo varasto-olion, jonka nimi on n ja osoite on o. Luo tyhj‰n tuotelistan.
  */
public Varasto (String n, String o){
	this.nimi = n;
	this.osoite = o;
	this.tuotteet = new LinkedList<VarastonTuote>();
}

  // *********************************************
  // Havainnointimetodit
  // *********************************************

/**
 * Palauttaa varaston osoitteen merkkijonona.
 */
public String getOsoite(){ return this.osoite; }

/**
 * Palauttaa varaston nimen merkkijonona.
 */
public String getNimi() { return this.nimi; }

/**
 * Palauttaa sen VarastonTuote-olion, jonka id on sama kuin parametrin‰ annettu id.
 * AE: id:t‰ vastaava tuote pit‰‰ olla olemassa
 */
public VarastonTuote getTuote(int id){
	for (VarastonTuote x: tuotteet){
		if (x.getId() == id){
			return x;
		}
	}
	return null;
}

/**
 * Palauttaa tuotteen jonka m‰‰r‰ on varastossa suurin.
 * Jos suurilukuisimpia tuotteita on useita, metodi palauttaa listassa ensimm‰isen‰ olevan
 * AE: varasto ei ole tyhj‰
 */
public VarastonTuote getEniten(){
	VarastonTuote eniten=this.tuotteet.getFirst();
	for (VarastonTuote x: tuotteet){
		if (x.getMaara()>eniten.getMaara()){eniten=x;}
	}
	return eniten;
}

/**
 * Tulostaa varasto-olion kaikkien tietokenttien arvot.
 */
public void tulosta(){
	System.out.println("Nimi:     " + this.nimi);
	System.out.println("Sijainti: " + this.osoite);
	System.out.println("Sis‰ltˆ:  ");
	tulostaLinkedList(tuotteet);
}

   // *********************************************
   // Muutosmetodit
   // *********************************************
   
/**
 * Muuttaa varaston osoitteen parametrin‰ annetuksi merkkijonoksi.
 */
public void setOsoite(String o){ this.osoite = o; }

/**
 * Muuttaa varaston nimen parametrin‰ annetuksi merkkijonoksi.
 */
public void setNimi(String n){ this.nimi = n; }

/**
 * Muuttaa varastossa olevan tuotteen hintaa.
 */
public void setTuotteenHinta (int id, double hinta){
		getTuote(id).setHinta(hinta);
}

/**
 * Lis‰‰ varastoon valmiiksi luodun tuotteen.
 */
public void lisaaTuote(VarastonTuote t){ this.tuotteet.add(t); }

/**
 * Poistaa tuotelistasta parametrin‰ annettua id:t‰ vastaavan tuotteen.
 */
public void poistaTuote (int id){
for (VarastonTuote x:tuotteet){
	if (x.getId()==id){
		this.tuotteet.remove(x);
	}
}
}

/**
 * V‰hent‰‰/lis‰‰ varastossa olevan tuotteen m‰‰r‰‰. Positiivinen luku lis‰‰
 * tuotteen m‰‰r‰‰ ja negatiivinen v‰hent‰‰ sit‰.
 * AE: tuotteen m‰‰r‰ksi ei tule negatiivinen luku
 */
public void muutaTuotteenMaaraa (int tunniste, int m){
	getTuote(tunniste).muutaMaaraa(m);
}

   // *********************************************
   // Apumetodit
   // *********************************************
   
/**
 * Tulostaa LinkedList-tyyppisen listan alkiot yksi kerrallaan.
 */
public static void tulostaLinkedList(LinkedList l){
 for (int i=0; i<l.size(); i++){
 	System.out.println(l.get(i));
 }
}

}  //  luokan Varasto loppu