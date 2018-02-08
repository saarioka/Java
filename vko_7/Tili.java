public class Tili 
{ 
  // ********************************** 
  //  Tietokent‰t:  
  // **********************************
   
  /** Tilin koodi */ 
  private String tilikoodi; 
  /** Tilin korkoprosentti */ 
  private double korkoprosentti = 1.0; 
  /** Tilin omistaja */ 
  private String omistaja; 
  
   /** Tilin saldo*/ 
private double saldo; 
    
   // *********************************************
   //  Alustus olion luonnin yhteydess‰: konstruktorit 
   // *********************************************  
  /** Luo tili, jonka tilikoodi on tk ja omistaja o. */ 
  public Tili(String tk, String o)  
  { 
       this.tilikoodi = tk;  this.omistaja = o;  this.saldo = 0.0; 
  }
   /** Luo tili, jonka tilikoodi on tk, omistaja o ja saldo s. */ 
  public Tili(String tk, String o, double s)  
  { 
       this.tilikoodi = tk;  this.omistaja = o;  this.saldo = s; 
  } 
   // ********************************** 
   //  Havainnointimetodit:  
   // **********************************  
  /** Palauttaa tilin saldon. */ 
  public double getSaldo() { return this.saldo; } 
   /** Palauttaa tilin omistajan */ 
  public String getOmistaja() { return this.omistaja; } 
  /** Palauttaa tilin koodin. */ 
  public String getTilikoodi() { return this.tilikoodi; } 
  /** Palauttaa tilin korkoprosentin. */ 
  public double getKorkoprosentti() { return this.korkoprosentti; } 
   
  /** Palauttaa vuosikoron rahallisen m‰‰r‰n. */ 
  public double koronM‰‰r‰() { return (this.korkoprosentti/100.0)*this.saldo; } 
  /** Palauttaa true, jos tilin saldo positiivinen. Muutoin palautetaan false. */ 
  public boolean onkoPlussalla() { return (this.saldo > 0.009); } 
  /** Palauttaa true, jos tilin saldo = 0. */ 
  public boolean onkoTyhj‰() { return (Math.abs(this.saldo-0.0) < 0.001); } 
  /** Tulostaa omille riveilleen tilin koodin, omistajan, saldon ja korkoprosentin */ 
  public void tulosta()  
  { 
    System.out.println("Tilikoodi: " + this.tilikoodi); 
    System.out.println("Omistaja: " + this.omistaja); 
    System.out.println("Saldo: " + this.saldo); 
    System.out.println("Korkoprosentti: " + this.korkoprosentti); 
  } 
   /** Palauttaa merkkijonon, joka on samanlainen kuin metodin tulosta aikaansaama tulostus */ 
  public String toString()  
  { 
    return ("Tilikoodi: " + this.tilikoodi + "\nOmistaja: " + this.omistaja + 
    "\nSaldo: " + this.saldo + "\nKorkoprosentti: " + this.korkoprosentti); 
  } 
   // ********************************** 
   // Olion muuttaminen: muutosmetodit 
   // **********************************  
  /** Lis‰‰ raham‰‰r‰ tilin saldoon. Alkuehto: raham‰‰r‰ >= 0. */ 
  public void talleta(double raham‰‰r‰)  
  {   
       this.saldo += raham‰‰r‰; 
  } 
  /** Nosta tililt‰ raham‰‰r‰. Alkuehto: raham‰‰r‰ >= 0 ja this.saldo >= raham‰‰r‰*/ 
  public void nosta(double raham‰‰r‰)   
  // T‰st‰ tehd‰‰n luentop‰iv‰ll‰ boolean-arvon palauttava funktio! Miksi? 
  {  
       this.saldo -= raham‰‰r‰; 
  } 
   
  /** Lis‰‰ tilin saldoa vuosikoron verran. */ 
  public void lis‰‰Korko() 
  {   
       this.saldo += this.koronM‰‰r‰(); 
  } 
 /** Muuta tilin uudeksi omistajaksi uusiOmistaja. */ 
 public void setOmistaja(String uusiOmistaja)  
 {  
       this.omistaja = uusiOmistaja; 
  } 
  /** Muuta tilin uudeksi korkoprosentiksi uusiProsentti. */ 
  public void setKorkoprosentti(double uusiProsentti)  
  {  
       this.korkoprosentti = uusiProsentti; 
  } 
} // end class Tili