public class Wrapperklassen {
  public static void main(String[] args) {

    // Instanzen von Integer werden erzeugt:
    Integer meineInteger = new Integer(23);
    Integer deineInteger = new Integer("45");

    // Man kann sie einfach ausgeben lassen:
    System.out.println(meineInteger);
    System.out.println(deineInteger);

    // Rechnungen funktionieren wie gewohnt:
    System.out.println(meineInteger + deineInteger);

    // Automtisches Umwandeln in int-Werte:
    int meineInt = meineInteger;
    int deineInt = deineInteger;

    // Automatisches Umwandeln in Integer-Objekte:
    Integer unsereInteger = meineInt + deineInt;

    System.out.println(unsereInteger);

    // Mischen von int und Integer in einer Rechnung:
    System.out.println(meineInt - deineInteger);

    // Aus einem String einen int-Wert machen:
    String neuerString = "45";
    int neueInt = Integer.parseInt(neuerString);
    System.out.println(2 * neueInt);
    // Ausgabe: 90

    // int-Wert als String schreiben:
    String wert = Integer.toString(19);
    System.out.println(wert);
    // Ausgabe: 9

    // int-Wert als Binaerzahl schreiben:
    String binear = Integer.toBinaryString(19);
    System.out.println(binear);
    // Ausgabe: 10011

    // int-Wert als Hexadezimalzahl schreiben:
    String hexa = Integer.toHexString(30);
    System.out.println(hexa);
    // Ausgabe: 1e

    // Klassenkonstanten:
    System.out.println(Integer.MAX_VALUE);
    // Ausgabe: 2147483647

    System.out.println(Integer.MIN_VALUE);
    // Ausgabe: -2147483648
  }

}
