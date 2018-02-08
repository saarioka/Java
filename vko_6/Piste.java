public class Piste{
	//************************************
	//luokan yksityisen ilmentymämuuttujat
	//************************************
	
	/**koordinaattien muuttujat*/
	private int x,y;
	
	/**koordinaattien vähimmäisarvot*/
	private int minX=0, minY=0;
	
	/**koordinaattien maksimiarvot*/
	private int maxX=640, maxY=480;
	
	//***********************************************
	//Konstruktori: luo Piste-olion, jonka x=x ja y=y
	//***********************************************
	public Piste(int x, int y){
		this.x=x;
		this.y=y;
	}
	//******************************************************************************************
	//Konstruktori: luo Piste-olion,jonka x=x,y=y,minX=ala_X,minY=ala_y,maxX=yla_x ja maxY=yla_y
	//******************************************************************************************
	public Piste(int x, int y, int ala_x, int ala_y, int yla_x, int yla_y){
		this.x=x;
		this.y=y;
		this.minX=ala_x;
		this.minY=ala_y;
		this.maxX=yla_x;
		this.maxY=yla_y;
	}
	//**************
	//Luokan metodit
	//**************
	
	/**muuttaa olion x- ja y-koordinaatteja uusiin annettuihen arvoihin,
	 * mikäli minX, minY, maxX ja maxY eivät sitä rajoita*/
	public void siirra(int siirtoX, int siirtoY){
		if (x+siirtoX>=minX && y+siirtoY>=minY && x+siirtoX<=maxX && y+siirtoY<=maxY){
			this.x += siirtoX;
			this.y += siirtoY;
		}
	}
	/**havoinnointimetodi, joka ilmoittaa x- ja y-koordinaatit
	 * merkkijonotyypisenä suluissa pilkulla erotettuna */
	public String mjonoksi(){
		return "(" + this.x + "," +  this.y + ")";
	}
}
