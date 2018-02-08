/*
    Eemeli Lottonen
    H6T8
*/
public class eeme {
    public static void main(String[] args) {
        System.out.println("Hello! I find the length of the shortest substring.");
        System.out.println("Please, enter a string:");
        String merkkijono =  "wqwer werwe ewr wer ewrre werwe";
        int pituus = merkkijono.length();
        int apu1 = 0;
        int apu2 = 0;
        int vastaus = pituus + 1;
        int i2 = 0;

        while ( i2 <= pituus - 1)    {
            //Katsotaan onko väleja ja tallennetaan jos on
            if ( merkkijono.charAt(i2) == ' ' ) {
                System.out.println("apu2 ennen vastausta " + apu2);
                vastaus = i2 - apu2;
                apu1 = i2 + 1;
                apu2 = i2 + 1;
                System.out.println(i2+ "on i2");
            }
            i2++;
            //Jos ollaan sanan lopussa tai siinä ei ole välejä
            if ( i2 == pituus ) {
                vastaus = pituus - apu2;

                System.out.println("Lopussa");
            }
            if ( vastaus != pituus + 1 )
                System.out.println(vastaus);
        }

    }
}