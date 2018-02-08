	public class Kellonaika 
	{
	
	// **********************************************************
	//                       Tietokent‰t
	// **********************************************************
	
	/** Kellonajan tunnit 0Ö23 */
	private int tunnit;
	
	
	/** Kellonajan minuutit 0Ö59 */
	private int minuutit;
	
	
	/** Kellonajan sekunnit 0Ö59 */
	private int sekunnit;
	
	
	// **********************************************************
	//                       Konstruktorit:
	// **********************************************************
	
	/**  Uuden kellonaikaolion luonti; aika annetaan parametreina. 
	 *  Alkuehto: 0 <= h < 24, 0 <= min < 60 ja 0 <= sek < 60. */
	  public Kellonaika(int h, int min, int sek) {
	  	this.tunnit=h;
	  	this.minuutit=min;
	  	this.sekunnit=sek;
	  }
	 
	/**  Uuden kellonaikaolion 0:0:0 luonti */
	public Kellonaika() {
		this.tunnit=0;
	  	this.minuutit=0;
	  	this.sekunnit=0;
	}
	
	
	// *********************************************************************
	// 			Havainnointimetodit:
	// *********************************************************************
	 
	/** Palauttaa tunnit */
	public int getTunnit() {return this.tunnit;}
	
	
	/** Palauttaa minuutit */
	public int getMinuutit() {return this.minuutit;}
	
	
	/** Palauttaa sekunnit */
	public int getSekunnit() {return this.sekunnit;}
	
	
	/** Kellonajan tulostus niin, ett‰ tunnit, minuutit ja sekunnit tulostuvat omille riveill‰‰n ja 
 	*   rivin  alussa on teksti Tunnit, Minuutit tai Sekunnit. 
	 */
	public void tulostaKellonaika() {
		System.out.println("Tunnit: " + this.tunnit);
		System.out.println("Minuutit " + this.minuutit);
		System.out.println("Sekunnit: " + this.sekunnit);
	}
	
	/** Palauttaa kellonajan String-tyyppisen‰ muodossa tunnit:minuutit:sekunnit; esim. 22:58:1 */
	public String toString() {return this.tunnit + ":" + this.minuutit + ":" + this.sekunnit;}
	// *********************************************************************
	// 		Muutosmetodit:
	// **********************************************************************
	
	/** Kellonajan asetus parametrina annettuun aikaan eli olemassa olevan kellonaikaolion muutos.
	 *   Alkuehto: 0 <= h < 24, 0 <= min < 60 ja 0 <= sek < 60. 
	 */
	public void setAika(int h, int min, int sek) {
		this.tunnit=h;
		this.minuutit=min;
		this.sekunnit=sek;
		}
	 
	/** Kellonajan sekuntien asetus parametrina annettuun m‰‰r‰‰n sek.
	 *   Alkuehto: 0 <= sek < 60. 
	 */
	  public void setSekunnit(int sek) {this.sekunnit=sek;}
	
	/** Kellonajan minuuttien asetus parametrina annettuun m‰‰r‰‰n min.
	 *   Alkuehto: 0 <= min < 60. 
	 */
	  public void setMinuutit(int min) {this.minuutit=min;}
	
	/** Kellonajan tuntien asetus parametrina annettuun m‰‰r‰‰n h.
	 *   Alkuehto: 0 <= h < 24. 
	 */
	  public void setTunnit(int h) {this.tunnit=h;}
	
	
	// *********************************************************************
	// 	Kellonaikojen laskutoimitukset, muunnokset ja vertailut
	// *********************************************************************
	
	/** Muuttaa kohdeolion ajan sekunneiksi ja palauttaa sen */
	public int muunnaSekunneiksi() {return this.tunnit*60*60 + this.minuutit*60 + this.sekunnit;}
	
	/** Palauttaa uuden Kellonaika-olion, joka vastaa parametrin sek arvoa. 
 	*   Luotu olio toteuttaa konstruktorin AE:n. */
	public static Kellonaika muunnaSekunnitKellonajaksi(int seku){
		Kellonaika kel= new Kellonaika();
		int h=0;
		int m=0;
		while (seku>59){
			m++;
			seku-=60;
		}
		while (m>59){
			h++;
			m-=60;
		}
		if (h>23){
			h-=24;
		}
		return kel;
	}
	  
	/**  Parametrina annettu kellonaika lis‰ys lis‰t‰‰n kohdeaikaan. Lis‰ys annetaan Kellonaika- 
	 *    tyyppisen‰ oliona eli kyseess‰ on kellonaikojen yhteenlasku. Tunnit on aina <24 eli tarpeen
	 *    mukaan ívaihdetaan vuorokauttaí
	 */
	public void lis‰‰AikaMuuttamallaKohdeOliota(Kellonaika lis‰ys) {
		if (this.sekunnit+lis‰ys.getSekunnit()>59){
			this.minuutit+=1;
			this.sekunnit=this.sekunnit+lis‰ys.getSekunnit()-60;
		}
		else{
			this.sekunnit+=lis‰ys.getSekunnit();
		}
		
		
		if (this.minuutit+lis‰ys.getMinuutit()>59){
			this.tunnit+=1;
			this.minuutit=this.minuutit+lis‰ys.getMinuutit()-60;
		}
		else{
			this.minuutit+=lis‰ys.getMinuutit();
		}
		
		
		if (this.tunnit+lis‰ys.getTunnit()>23){
			this.tunnit=this.tunnit+lis‰ys.getTunnit()-60;
		}
		else{
			this.tunnit+=lis‰ys.getTunnit();
		}				
	}
	// Ensin lasketaan yhteen sekunnit. Jos tulos ylitt‰‰ 60, niin lis‰t‰‰n
	// minuutteihin ykkˆnen ja sekunneiksi j‰‰ summa-60.
	// Vastaavasti menetell‰‰n minuuttien ja tuntien kohdalla
	
	
	/** Luo uusi Kellonaika-olio, joka on parametrina annetun ja kohdeolion summa, ja palauta se. */ 
	public Kellonaika lis‰‰Aika(Kellonaika lis‰ys) {
		Kellonaika gello=new Kellonaika();
		gello.setSekunnit(this.getSekunnit());
		gello.setMinuutit(this.getMinuutit());
		gello.setTunnit(this.getTunnit());
		gello.lis‰‰AikaMuuttamallaKohdeOliota(lis‰ys);
		return gello;
	}
	//  Metodi lis‰‰Aika on sama kuin edellinen metodi, mutta nyt kohdeolio ei muutu, vaan metodi
	//  palauttaa uuden Kellonaika-olion.
	
	   
	/**  Luo uusi Kelloaika-olio, joka on kohdeolion ja parametrina annetun ajan erotus, ja palauta se. 
	 *   Alkuehto: kohdeaika tulee olla v‰hint‰‰n yht‰ suuri kuin parametrina annettu aika.
	 */
	public Kellonaika erotus(Kellonaika toinen){
		return muunnaSekunnitKellonajaksi(this.muunnaSekunneiksi()-toinen.muunnaSekunneiksi());
	}
	// T‰ss‰ muutetaan ensin kohdeaika ja parametrina annettu aika kumpikin 
	// sekunneiksi, jonka j‰lkeen niiden erotus muunnetaan
	// tunneiksi, minuuteiksi ja sekunneiksi ja lopuksi luodaan vastaava Kellonaika-olio
	
	/** Luo sellainen uusi Kellonaika-olio, joka saadaan kun kohdeolioon lis‰t‰‰n parametrina annettu sekuntim‰‰r‰ sek. */ 
	public Kellonaika lis‰‰Sekunnit(int sek){
		return muunnaSekunnitKellonajaksi(this.muunnaSekunneiksi()+sek);
	}
	
	// ja muita metodeja Ö
	
	} // luokan Kellonaika loppu.
