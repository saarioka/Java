public class vko7_4{
	public static void main(String[]args){
		Auto id�n_ihme=new Auto("punainen", "Lada");
		id�n_ihme.kaasuta(100);
		System.out.println("nopeus on "+id�n_ihme.mikaNopeus());
		id�n_ihme.pakkiPaalle();
		id�n_ihme.kaasuta(30);
		System.out.println(id�n_ihme.toString());
	}
}