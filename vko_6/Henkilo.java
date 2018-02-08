public class Henkilo   // lopullinen versio 
{  
 // **************************************************************************************** 
     // Tietokent�t, jotka ovat kaikki ns. esiintym�muuttujia (selitet��n my�hemmin):  
 // **************************************************************************************** 
 /** henkil�n nimi */ 
private String nimi; 
 /** henkil�n osoite */ 
private String osoite;  
/** henkil�n syntym�vuosi */ 
private int syntVuosi;   
//  *********************************************************************************************** 
//  Konstruktori: luo Henkilo-olion, jonka nimi on ni, osoite on os ja syntym�vuosi on sv.  
// ************************************************************************************************ 
public Henkilo(String ni, String os, int sv) 
{ 
   this.nimi = ni;  this.osoite = os; this.syntVuosi = sv; 
 } 
 // **************************************************************************************** 
// Havainnointimetodi kutakin tietokentt�� kohti ja  
// olion sis�ll�n merkkijonona palauttava havainnointimetodi toString:  
 // **************************************************************************************** 
 /** palauttaa nimen */ 
 public String getNimi( ) { return this.nimi; } 
 /** palauttaa osoitteen */ 
 public String getOsoite( ) { return this.osoite; } 
 /** palauttaa syntym�vuoden */ 
 public int getSyntVuosi( ) { return this.syntVuosi; } 
/** palauttaa nimen, osoitteen ja syntym�vuoden per�kk�in (v�liss� yksi v�lily�nti).  
      *   return-lauseessa voidaan j�tt�� sulkeet ( ) pois.  T�t� selitetet��n alla.  
      */ 
public String toString( ) { 
return  (this.nimi + "  " + this.osoite + "  " + this.syntVuosi); 
}
 // **************************************************************************************** 
 //  Muutosmetodit:    
//  setSyntVuosi on mukana, jotta voitaisiin esim. korjata virheellinen syntym�vuosi j�lkeen- 
//  p�in 
 // **************************************************************************************** 
  
/** muuta kohdeolion nimeksi uusiNimi */ 
 public void setNimi(String uusiNimi) { this.nimi = uusiNimi; } 
 /** muuta kohdeolion osoitteeksi uusiOs */
 public void setOsoite(String uusiOs) { this.osoite = uusiOs; } 
/** muuta kohdeolion syntym�vuodeksi uusiVuosi */
 public void setsyntVuosi(int uusiVuosi) { this.syntVuosi = uusiVuosi; } 
}  // end class Henkilo 