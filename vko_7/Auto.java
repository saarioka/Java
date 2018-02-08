public class Auto {
		
  	// ********************************** 
  	//  Tietokent‰t:  
  	// **********************************
   
  	/** Auton v‰ri */ 
  	private String v‰ri; 
  	/** Auton merkki */ 
  	private String merkki;
  	/** Auton nopeus */ 
  	private int nopeus;
  	/**Auton suunta(eteenp‰in)*/
  	private boolean suunta;
  	
   	// ***********************************************
   	//  Konstruktori:
   	// ***********************************************
  	
  	/**luo parametrien mukaisen auton, jonka nopeus 0 ja 
	 * automaattivaihteisto on asennossa "eteenp‰in"*/
	public Auto(String vari, String merkkii){
		this.v‰ri=vari; this.merkki=merkkii; this.nopeus=0; this.suunta=true;
	}
	
	// ********************************** 
   	//  Havainnointimetodit:  
   	// **********************************
   	/**palauttaa auton nopeuden*/
	public int mikaNopeus(){ return this.nopeus; }
		
	/**palauttaa auton v‰rin*/
	public String mikaVari() { return this.v‰ri; }
	
	/**palauttaa auton merkin*/
	public String mikaMerkki() { return this.merkki; }
	
	/**palauttaa tiedon siit‰, meneekˆ auto eteenp‰in*/
	public boolean mikaSuunta() { return this.suunta; }
	
	
	// ********************************** 
   	// Olion muuttaminen: muutosmetodit 
   	// **********************************
   	
   	/**asettaa auton nopeudeksi nolla*/
   	public void pysayta() { this.nopeus=0; }
   	
   	/**asettaa automaattivaihteen tilaan îeteenp‰inî (asettaa ensin nopeuden 
	 * nollaksi). Jos eteenp‰invaihde on jo p‰‰ll‰, metodi ei tee mit‰‰n. */
   	public void eteenpainPaalle(){
   	 	if(!suunta){
   	 	this.nopeus=0; this.suunta=true;
   	 	}
   	}
   	
   	/**asettaa peruutusvaihteen p‰‰lle (asettaa ensin nopeuden nollaksi). Jos 
	 * peruutusvaihde on jo p‰‰ll‰, metodi ei tee mit‰‰n.*/
   	public void pakkiPaalle() {
   		if(suunta){
   	 	this.nopeus=0; this.suunta=false;
   	 	}
   	}
   	
   	/**lis‰‰/v‰hent‰‰ nopeutta muuttujan m arvolla
   	 * alkuehto: jos suunta=true, nopeus+m<=200 tai suunta=false, nopeus+m<=50*/
   	public void kaasuta(int m){
   		if (suunta && nopeus+m<=200){
   			nopeus += m;
   		}
   		if (!suunta && nopeus+m<=50){
   			nopeus +=m;
   		}
   		
   	}
   	/**tulostaa auton merkin, v‰rin, nopeuden ja suunnan omille riveille*/
   	public String toString(){ 
    return ("Merkki: " + this.merkki + "\nV‰ri: " + this.v‰ri + 
    "\nNopeus: " + this.nopeus + "\nMeneekˆ eteenp‰in: " + this.suunta);
  	} 
   	
}