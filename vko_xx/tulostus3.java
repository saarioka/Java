public class tulostus3 {

	public static void main (String []args) {

		double x=Double.parseDouble(args[0]);
		double y=Double.parseDouble(args[1]);
		double z=Double.parseDouble(args[2]);

		double tulo=x*y*z;
		double summa=x+y+z;
		double keskiarvo=(x*y*z)/3;

		System.out.print("\nlukujen tulo on " + tulo);
		System.out.println("\nlukujen summa on " + summa);
		System.out.println("lukujen keskiarvo on " + keskiarvo);

}
}