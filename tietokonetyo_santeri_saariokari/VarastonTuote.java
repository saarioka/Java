/**
 * Luokan avulla mallinnetaan varastossa olevaa tuotetta.
 *
 * @author Santeri Saariokari
 * @version 1.9 2013/4/21
 */
import java.util.*;
public class VarastonTuote
{
   // **********************************
   //  Tietokent‰t
   // **********************************
   
/**
 * Tuotteen nimi.
 */
private String nimi;

/**
 * Tuotteen id.
 */
private int id;

/**
 * Tuotteen hinta.
 */
private double hinta;

/** 
 * Tuotteen m‰‰r‰ varastossa.
 */
private int maara;

   // **********************************
   //  Konstruktorit
   // **********************************

/**
 * Luo VarastonTuote-olion, jonka nimi on n, id on tunniste, hinta on h ja m‰‰r‰ on m.
 */
public VarastonTuote (String n, int tunniste, double h, int m){
	this.nimi = n;
	this.id = tunniste;
	this.hinta = h;
	this.maara = m;
}

/**
 * Luo VarastonTuote-olion, jonka nimi on n, id on tunniste ja  hinta on h. M‰‰r‰ksi asetetaan 0.
 */
public VarastonTuote (String n, int tunniste, double h){
	this.nimi= n;
	this.id = tunniste;
	this.hinta = h;
	this.maara = 0;
}

   // **********************************
   //  Havainnointimetodit
   // **********************************

/**
 * Palauttaa tuotteen nimen.
 */
public String getNimi(){ return this.nimi; }

/**
 * Palauttaa tuotteen id:n.
 */
public int getId(){ return this.id; }

/**
 * Palauttaa tuotteen hinnan.
 */
public double getHinta(){ return this.hinta; }

/**
 * Palauttaa tuotteen m‰‰r‰n.
 */
public int getMaara(){ return this.maara; }

/**
 * Tulostaa tuotteen nimen, tunnisteen, hinnan ja m‰‰r‰n.
 */
public void tulosta(){
	System.out.println("Nimi:  " + this.nimi);
	System.out.println("ID:    " + this.id);
	System.out.println("Hinta: " + this.hinta);
	System.out.println("M‰‰r‰: " + this.maara);
}

/**
 * Palauttaa tuotteen tiedot merkkijonona.
 */
public String toString(){ return (this.nimi + "/" + this.id + "/" + this.maara + "/" + this.hinta); }

   // **********************************
   // Muutosmetodit
   // **********************************

/**
 * Muuttaa tuotteen nimen paramterin‰ annetuksi merkkijonoksi.
 */
public void setNimi(String n){ this.nimi = n; }

/**
 * Muuttaa tuotteen id:n parametrin‰ annetuksi id:ksi. 
 */
public void setId(int tunniste){ this.id = tunniste; }

/**
 * Muuttaa tuotteen hinnan parametrin‰ annetuksi hinnaksi. 
 */
public void setHinta(double h){ this.hinta = h; }

/**
 * Muuttaa tuotteen m‰‰r‰ksi parametrina annetun arvon.
 */
public void setMaara(int m){ this.maara = m; }

/**
 * V‰hent‰‰/lis‰‰ varastossa olevan tuotteen m‰‰r‰‰. Positiivinen luku lis‰‰
 * tuotteen m‰‰r‰‰ annetun luvun verran ja negatiivinen luku v‰hent‰‰ sit‰.
 * AE: tuotteen m‰‰r‰ksi ei tule negatiivinen luku
 */
public void muutaMaaraa (int lkm){ this.maara += lkm; }

} // luokan Varastontuote loppu