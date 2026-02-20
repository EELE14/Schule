public class Auto {

  // Attribute
  String marke;
  int kilometerstand;
  int baujahr;
  int preis;

  // Konstruktor
  Auto(String pMarke, int pBaujahr, int pPreis) {
    marke = pMarke;
    kilometerstand = 0;
    baujahr = pBaujahr;
    preis = pPreis;
  }

  public void anderePreisUm(int pWert) {
    if (preis + pWert > 0) {
      preis = preis + pWert;
    } else {
      System.out.println("Aenderung nicht sinnvoll.");
    }
  }

  public void macheProbeFahrt(int pStrecke) {
    kilometerstand = kilometerstand + pStrecke;
  }

  public void schreibeInfos() {
    System.out.println("Auto der Marke " + marke);
    System.out.println("Kilometerstand: " + kilometerstand);
    System.out.println("Baujahr: " + baujahr);
    System.out.println("Preis: " + preis);
    System.out.println("**********");
  }

}
