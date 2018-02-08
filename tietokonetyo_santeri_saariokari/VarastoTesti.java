public class VarastoTesti{
	/**
	 * Testaa luokkien Varasto ja VarastonTuote toimivuutta.
	 *
 	 * @author Santeri Saariokari
 	 * @version 2.0 2013/4/21
	 */
	public static void main (String[]args){
		testaaTuote();
		testaaVarasto();
	}
	
	public static void testaaVarasto(){
		
		//tuotteita testausta varten
		VarastonTuote vasara = new VarastonTuote("Vasaroita",1,10,20);
		VarastonTuote naula = new VarastonTuote("Nauloja",2,5);
		VarastonTuote meisseli = new VarastonTuote("Ruuvimeisseleitä",3,1,1);
		
		//konstruktori ja lisaatuote
		Varasto matti = new Varasto("Matin varasto","Varastokatu 3");
		matti.lisaaTuote(vasara);
		matti.lisaaTuote(naula);
		matti.lisaaTuote(meisseli);
		
		//havainnointimetodit
		System.out.println(matti.getOsoite());
		System.out.println(matti.getNimi());
		System.out.println(matti.getTuote(1));
		System.out.println(matti.getEniten());
		matti.tulosta();
		
		System.out.println();
		
		//muutosmetodit
		matti.setOsoite("Varastotie 14");
		matti.setNimi("Raimon varasto");
		matti.setTuotteenHinta(1,15);
		matti.poistaTuote(2);
		matti.muutaTuotteenMaaraa(3,20);
		matti.muutaTuotteenMaaraa(1,-10);
		System.out.println(matti.getEniten());
		matti.tulosta();
		
	}
	
	public static void testaaTuote(){
		
		//konstruktorit
		VarastonTuote vasara = new VarastonTuote("Vasaroita",1,10,20);
		VarastonTuote naula = new VarastonTuote("Nauloja",2,5);
		VarastonTuote meisseli = new VarastonTuote("Ruuvimeisseleitä",3,1,11);
		
		//havainnointimetodit
		System.out.println(vasara.getNimi());
		System.out.println(vasara.getId());
		System.out.println(vasara.getMaara());
		System.out.println(vasara.getHinta());
		System.out.println(vasara.toString());
		naula.tulosta();
		
		System.out.println();
		
		//muutosmetodit
		vasara.setNimi("Leka");
		vasara.setId(10);
		vasara.setHinta(15);
		vasara.setMaara(50);
		meisseli.muutaMaaraa(-10);
		naula.muutaMaaraa(10);
		vasara.tulosta();
		naula.tulosta();
		meisseli.tulosta();
		
		System.out.println();
	}
}