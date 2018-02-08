public class Testi  
{ 
 public static void main (String[] args)
{  
  Henkilo sin‰ = new Henkilo(Pekka, Turku);		//lainausmerkit nimen ja paikkakunnan ymp‰rille, syntym‰vuosi pit‰‰ antaa t‰ll‰ rivill‰
  sin‰.syntVuosi = 1980; 						//vuoden m‰‰rittely pit‰‰ olla ylemm‰ll‰ rivill‰
  System.out.println(sin‰.nimi); 				//(sin‰.getnimi())
  Henkilo uusi; 								//
  uusi.setOsoite = "Helsinki"; 					//=-merkki pois, sulkeet "Helsinki" ymp‰rille
  Henkilˆ toinen = new Henkilo(); 				//Henkilo() tarvitsee parametrit, ks. 1. rivi
  System.out.println(toinen.getSyntVuosi()); 	//
 } 
}