import java.util.Random;
public class vko5_5{
	public static void main(String[]args){
		System.out.println(satunnainenJono("raskas ja karsea",100));
	}
	public static StringBuilder satunnainenJono(String aakkosto, int pituus){
		StringBuilder sb=new StringBuilder();
		Random gen = new  Random();
		for(int i=0;i<=pituus;i++){
			sb.append(aakkosto.charAt(gen.nextInt(aakkosto.length())));
		}
		return sb;
	}
}