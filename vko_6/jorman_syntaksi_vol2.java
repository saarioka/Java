public class jorman_syntaksi_vol2
{ 
 public static void main (String[] args)  
{
  Henkilo sin� = new Henkilo("Pekka", "Turku", 1980); 
  System.out.println(sin�.getNimi()); 
  Henkilo uusi;
  uusi.setOsoite("Helsinki"); 
  Henkilo toinen = new Henkilo("Jorma", "Turku", 1960); 
  System.out.println(toinen.getSyntVuosi()); 
 }
}