public class vko7_1{
	public static void main(String[]args){
		Tili santerin_tili= new Tili("123456789","Santeri");
		Tili jorman_tili= new Tili("987654321","Jorma", 1200000.0);
		Tili x= new Tili("123","Oili",698000.0);
		double s=x.getSaldo();
		double z=1000.0;
		x.talleta(z);
		x.setKorkoprosentti(1);
	}
}