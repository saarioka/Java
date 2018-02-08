public class vko49_5{
	public static boolean alkuluku(int n)  
		{ 
   		if (n <= 1) return false;
		if (n == 2) return true;
   		int t = 2; 
   		while (t <= n/2)  
  		{
   			if  (n%t == 0) return false; 
  			t++; 
  		}
  		return true; 
 		}
 		
 	public static void main(String[]args){
 		int x=1;
 		while (x!=0)
 			System.out.println("Anna luku");
 			x=OmaIO.lueInt();
 			boolean b=alkuluku(x);
 			if (b=true){
 				System.out.println(x+" ei ole alkuluku");
 			}
 			else{
 				System.out.println(x+" ei ole alkuluku");
 			}
 		
 	}
}