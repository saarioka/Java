public class vko7_4{
	public static void main(String[]args){
		Auto idän_ihme=new Auto("punainen", "Lada");
		idän_ihme.kaasuta(100);
		System.out.println("nopeus on "+idän_ihme.mikaNopeus());
		idän_ihme.pakkiPaalle();
		idän_ihme.kaasuta(30);
		System.out.println(idän_ihme.toString());
	}
}