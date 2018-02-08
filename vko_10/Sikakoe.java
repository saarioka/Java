public class Sikakoe 
{ 
public static void main(String[] args) 
{ 
 Sika s = new Sika(); 
 System.out.println(s.äännähdys()); 
 System.out.println(s.syö()); 
 PikkuPossu p = new PikkuPossu(); 
 s = p; 
 System.out.println(s.äännähdys()); 
 System.out.println(s.syö()); 
 } // main 
} // class 