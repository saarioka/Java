public class Henkilo   // lopullinen versio 
{  
 // **************************************************************************************** 
     // Tietokentät, jotka ovat kaikki ns. esiintymämuuttujia (selitetään myöhemmin):  
 // **************************************************************************************** 
 /** henkilön nimi */ 
private String nimi; 
 /** henkilön osoite */ 
private String osoite;  
/** henkilön syntymävuosi */ 
private int syntVuosi;   
//  *********************************************************************************************** 
//  Konstruktori: luo Henkilo-olion, jonka nimi on ni, osoite on os ja syntymävuosi on sv.  
// ************************************************************************************************ 
public Henkilo(String ni, String os, int sv) 
{ 
   this.nimi = ni;  this.osoite = os; this.syntVuosi = sv; 
 } 
 // **************************************************************************************** 
// Havainnointimetodi kutakin tietokenttää kohti ja  
// olion sisällön merkkijonona palauttava havainnointimetodi toString:  
 // **************************************************************************************** 
 /** palauttaa nimen */ 
 public String getNimi( ) { return this.nimi; } 
 /** palauttaa osoitteen */ 
 public String getOsoite( ) { return this.osoite; } 
 /** palauttaa syntymävuoden */ 
 public int getSyntVuosi( ) { return this.syntVuosi; } 
/** palauttaa nimen, osoitteen ja syntymävuoden peräkkäin (välissä yksi välilyönti).  
      *   return-lauseessa voidaan jättää sulkeet ( ) pois.  Tätä selitetetään alla.  
      */ 
public String toString( ) { 
return  (this.nimi + "  " + this.osoite + "  " + this.syntVuosi); 
}
 // **************************************************************************************** 
 //  Muutosmetodit:    
//  setSyntVuosi on mukana, jotta voitaisiin esim. korjata virheellinen syntymävuosi jälkeen- 
//  päin 
 // **************************************************************************************** 
  
/** muuta kohdeolion nimeksi uusiNimi */ 
 public void setNimi(String uusiNimi) { this.nimi = uusiNimi; } 
 /** muuta kohdeolion osoitteeksi uusiOs */
 public void setOsoite(String uusiOs) { this.osoite = uusiOs; } 
/** muuta kohdeolion syntymävuodeksi uusiVuosi */
 public void setsyntVuosi(int uusiVuosi) { this.syntVuosi = uusiVuosi; } 
}  // end class Henkilo 