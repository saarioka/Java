public class Koemurtoluku 
{ 
public static void main(String[] args) 
 { 
int os1 = 40; 
int nim1 = 80; 
int os2 = -6; 
int nim2 = -9; 
 // Luodaan murtoluvut. 
 Murtoluku eka = new Murtoluku(os1, nim1); 
 Murtoluku toka = new Murtoluku(os2, nim2); 
System.out.println(toka.less(eka));
System.out.println(toka.equals(eka));
 // Tulostetaan murtoluvut ruudulle. 
 System.out.println("Murtoluvut: " + eka + " ja " + toka); 
 // Lasketaan näiden summa ja tulostetaan summa.
 Murtoluku s = eka.add(toka); // Tässä luodaan uusi murtoluku !!! 
 System.out.println("Summa: " + s); 
 System.out.println("Sen nimittäjä  on " + s.getNim());
 } // main 
} //luokan KoeMurtoluku loppu 