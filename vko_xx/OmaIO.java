import java.io.*;
public class OmaIO {
  // T‰ss‰ luokassa on metodeja, joiden tarkoitus on helpottaa
  // Javassa tulostamista ruudulle ja lukemista n‰pp‰imistˆlt‰.

  private static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
  private static PrintStream stdout = System.out;

  /*******************************************************/
  /* Pelk‰n rivinvaihdon tulostaminen: tyhj‰Rivi         */
  /*******************************************************/

  public static void tyhj‰Rivi() {
    stdout.println("");   stdout.flush();
  } // tyhj‰Rivi

  /*******************************************************/
  /* Merkkijonon tulostaminen, ei rivinvaihtoa: tulosta  */
  /*******************************************************/

  public static void tulosta(String s) {
    stdout.print(s);   stdout.flush();
  } // tulosta

  /*******************************************************/
  /* Merkkijonon tulostaminen + rivinvaihto: tulostaRivi */
  /*******************************************************/

  public static void tulostaRivi(String s) {
    stdout.println(s);   stdout.flush();
  } // tulostaRivi

  /************************************************/
  /* Merkkijonon lukeminen: lueRivi, lueString    */
  /************************************************/

  public static String lueRivi(String hopute) throws Error {
    tulosta(hopute);
    try { return stdin.readLine(); }
    catch (IOException e) {
      throw new Error("Vastausrivin lukeminen p‰‰tteelt‰ nosti poikkeuksen!? Poikkeus: " + e);
    } // catch
  } // end lueRivi

  public static String lueRivi() throws Error { return lueRivi(""); }

  public static String lueString() throws Error { return lueRivi(); }

  public static String lueString(String hopute) throws Error { return lueRivi(hopute); }

  /************************************************/
  /*      Kokonaisluvun lukeminen: lueInt         */
  /************************************************/

  public static int lueInt(String hopute, String virheilmoitus) throws Error {
    int luku = 0;
    boolean onnistumatta = true;

    while (onnistumatta) {
      onnistumatta = false; // Tehd‰‰n oletus, ett‰ onnistutaan.
      tulosta(hopute);
      try { luku = Integer.parseInt(stdin.readLine().trim()); }
      catch (NumberFormatException e) {
	onnistumatta = true;  // Ei onnistuttu.
	tulostaRivi(virheilmoitus);
      }
      catch (IOException e) {
	throw new Error("Kokonaisluvun (int) lukeminen nosti poikkeuksen!? Poikkeus: " + e);
      }
    } // while
    return luku;
  } // lueInt

  public static int lueInt(String hopute) throws Error
    { return lueInt(hopute, "Kokonaisluvun (int) lukeminen ep‰onnistui.  Yrit‰ uudelleen."); }

  public static int lueInt() throws Error { return lueInt(""); }

  /************************************************/
  /*   Pitk‰n kokonaisluvun lukeminen: lueLong    */
  /************************************************/

  public static long lueLong(String hopute, String virheilmoitus) throws Error {
    long luku = 0;
    boolean onnistumatta = true;

    while (onnistumatta) {
      onnistumatta = false; // Tehd‰‰n oletus, ett‰ onnistutaan.
      tulosta(hopute);
      try { luku = Long.parseLong(stdin.readLine().trim()); }
      catch (NumberFormatException e) {
	onnistumatta = true;  // Ei onnistuttu.
	tulostaRivi(virheilmoitus);
      }
      catch (IOException e) {
	throw new Error("Kokonaisluvun (long) lukeminen nosti poikkeuksen!? Poikkeus: " + e);
      }
    } // while
    return luku;
  } // lueLong

  public static long lueLong(String hopute) throws Error
    { return lueLong(hopute, "Kokonaisluvun (long) lukeminen ep‰onnistui.  Yrit‰ uudelleen."); }

  public static long lueLong() throws Error { return lueLong(""); }

  /************************************************/
  /*      Liukuluvun lukeminen: lueFloat          */
  /************************************************/

  public static float lueFloat(String hopute, String virheilmoitus) throws Error {
    float luku = 0.0f;
    boolean onnistumatta = true;

    while (onnistumatta) {
      onnistumatta = false; // Tehd‰‰n oletus, ett‰ onnistutaan.
      tulosta(hopute);
      // Seuraavassa j‰sent‰minen tehd‰‰n k‰ytt‰en JDK 1.1:n k‰yt‰ntˆ‰
      // JDK 1.2:ssa on Float.parseFloat ...
      // try { luku = Float.parseFloat(stdin.readLine().trim()); }
      try { luku = Float.valueOf(stdin.readLine()).floatValue(); }
      catch (NumberFormatException e) {
	onnistumatta = true;  // Ei onnistuttu.
	tulostaRivi(virheilmoitus);
      }
      catch (IOException e) {
	throw new Error("Liukuluvun (float) lukeminen nosti poikkeuksen!? Poikkeus: " + e);
      }
    } // while
    return luku;
  } // lueFloat

  public static float lueFloat(String hopute) throws Error
    { return lueFloat(hopute, "Liukuluvun (float) lukeminen ep‰onnistui.  Yrit‰ uudelleen."); }

  public static float lueFloat() throws Error { return lueFloat(""); }

  /************************************************/
  /*   Pitk‰n liukuluvun lukeminen: lueDouble     */
  /************************************************/

  public static double lueDouble(String hopute, String virheilmoitus) throws Error {
    double luku = 0.0;
    boolean onnistumatta = true;

    while (onnistumatta) {
      onnistumatta = false; // Tehd‰‰n oletus, ett‰ onnistutaan.
      tulosta(hopute);
      // Seuraavassa j‰sent‰minen tehd‰‰n k‰ytt‰en JDK 1.1:n k‰yt‰ntˆ‰
      // JDK 1.2:ssa on Double.parseDouble ...
      try { luku = Double.valueOf(stdin.readLine().trim()).doubleValue(); }
      catch (NumberFormatException e) {
	onnistumatta = true;  // Ei onnistuttu.
	tulostaRivi(virheilmoitus);
      }
      catch (IOException e) {
	throw new Error("Liukuluvun (double) lukeminen nosti poikkeuksen!? Poikkeus: " + e);
      }
    } // while
    return luku;
  } // lueDouble

  public static double lueDouble(String hopute) throws Error
    { return lueDouble(hopute, "Liukuluvun (double) lukeminen ep‰onnistui.  Yrit‰ uudelleen."); }

  public static double lueDouble() throws Error { return lueDouble(""); }

  /************************************************/
  /*    Yksitt‰isen merkin lukeminen lueChar      */
  /************************************************/

  public static char lueChar(String hopute, String virheilmoitus) throws Error {
    String vastaus = "";
    boolean onnistumatta = true;
    char merkki = ' ';

    while (onnistumatta) {
      onnistumatta = false; // Tehd‰‰n oletus, ett‰ onnistutaan.
      tulosta(hopute);
      try { vastaus = stdin.readLine(); }
      catch (IOException e) {
	throw new Error("Merkin (char) lukeminen nosti poikkeuksen!? Poikkeus: " + e);
      }
      if (vastaus.length() != 1) {
	onnistumatta = true;  // Ei onnistuttu.
	tulostaRivi(virheilmoitus);
      }
      else merkki = vastaus.charAt(0);
    } // while
    return merkki;
  } // lueChar

  public static char lueChar(String hopute) throws Error
    { return lueChar(hopute, "Halutaan lukea tasan yksi merkki!  Yrit‰ uudelleen."); }

  public static char lueChar() throws Error { return lueChar(""); }

  /************************************************/
  /*    Totuusarvoisen vastauksen lukeminen       */
  /*  true:  true, kyll‰, yes, k, y, t            */
  /*  false: false, ei, no, e, n, f               */
  /* Isot ja pienet kirjaimet ovat samanarvoisia. */
  /************************************************/

  public static boolean lueBoolean(String hopute, String virheilmoitus) throws Error {
    String vastaus = "";
    boolean onnistumatta = true;
    boolean b = false;

    while (onnistumatta) {
      onnistumatta = false; // Tehd‰‰n oletus, ett‰ onnistutaan.
      tulosta(hopute);
      try { vastaus = stdin.readLine(); }
      catch (IOException e) {
	throw new Error("Totuusarvon (boolean) lukeminen nosti poikkeuksen!? Poikkeus: " + e);
      }
      if (vastaus.equalsIgnoreCase("kyll‰") ||
	  vastaus.equalsIgnoreCase("yes") ||
	  vastaus.equalsIgnoreCase("true") ||
	  vastaus.equalsIgnoreCase("k") ||
	  vastaus.equalsIgnoreCase("y") ||
	  vastaus.equalsIgnoreCase("t"))
	b = true;
      else if (vastaus.equalsIgnoreCase("ei") ||
	       vastaus.equalsIgnoreCase("no") ||
	       vastaus.equalsIgnoreCase("false") ||
	       vastaus.equalsIgnoreCase("e") ||
	       vastaus.equalsIgnoreCase("f") ||
	       vastaus.equalsIgnoreCase("n"))
	b = false;
      else {
	onnistumatta = true;  // Ei onnistuttu.
	tulostaRivi(virheilmoitus);
      }
    } // while
    return b;
  } // lueBoolean

  public static boolean lueBoolean(String hopute) throws Error
    { return lueBoolean(hopute, "(kyll‰, ei, yes, no, true, false, K, E, F, T, Y tai N)  Yrit‰ uudelleen."); }

  public static boolean lueBoolean() throws Error { return lueBoolean(""); }
} // end class OmaIO
