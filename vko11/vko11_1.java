import java.util.Scanner;
import java.util.*;
public class vko11_1{
	public static void main(String[]args){
		double x=lueDouble("anna desimaaliluku");
		System.out.println("annoit luvun " + x); 
	}
	
	public static double lueDouble(String hopute){ 
		Scanner lukija = new Scanner(System.in);
		boolean onnistui; 
		double luku=0;
	 	System.out.println(hopute); 
		do{
			try{
	 			luku = lukija.nextDouble();
	 			onnistui = true;
			}
	 		catch(InputMismatchException e){
	 			System.out.println("desimaaliluvun lukeminen epäonnistui.yritä uudelleen"); 
 				onnistui = false;
 				lukija.nextLine();
	 		}
	 	} while (!onnistui); 
		return luku; 
	 	}
	 	
	public static double lueDouble(){
		return lueDouble("");
	}
}