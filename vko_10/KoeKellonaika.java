public class KoeKellonaika 
{ 
public static void main(String[] argumentit) 
{ 
 Kellonaika aika1 = new Kellonaika(12,53,51); 
 System.out.println("aika1 on:"); 
 aika1.tulostaKellonaika(); 
 System.out.println("aika1:n minuutit ovat " + aika1.getMinuutit() +"\n\n"); 
 Kellonaika aika2 = new Kellonaika(15,11,18); 
 aika2.setAika (17,12,19); 
 Kellonaika aika3 = aika2.erotus(aika1); // 'aika3=aika2-aika1' 
 System.out.println("aika2 on " + aika2 + " ja aika1 on " + aika1 + 
 " ja niiden erotus on "+ aika3); 
 Kellonaika aika4 = aika3.lisääAika(aika1); // 'aika4=aika3+aika1' 
 System.out.println("aika4 on " + aika4); 
 aika4.lisääAikaMuuttamallaKohdeOliota(aika1); // 'aika4=aika4+aika1' 
 System.out.println("lisataan aika4:aan aika1, jolloin saadaan " + aika4);
  } // main 
} // class 