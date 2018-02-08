public class omaPiste{
	public static void main(String[]args){
		Piste p1= new Piste(3,7);
		System.out.println(p1.mjonoksi());
		String[] s=(p1.mjonoksi()).split(",");
		String st= s[0].substring(1);
		System.out.println("x= " + st);
		p1.siirra(0,3);
		System.out.println(p1.mjonoksi());
		Piste p2;
		p2=new Piste (11,9);
		p1=p2;
		System.out.println(p1.mjonoksi()+ p2.mjonoksi());
	}
}