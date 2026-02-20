public class Auto {

  // Attribute
  private String marke;
  private int kilometerstand;
  private int baujahr;
  private int preis;
  private double tankvolumen;
  private double aktuelleTankfüllung;
  private double verbrauch;

  // Konstruktor
  Auto(String pMarke, int pBaujahr, int pPreis, double pTankvolumen, double pVerbrauch) {
    marke = pMarke;
    kilometerstand = 0;
    baujahr = pBaujahr;
    preis = pPreis;
    tankvolumen = pTankvolumen;
    verbrauch = pVerbrauch;
  }

  public void anderePreisUm(int pWert) {
    if (preis + pWert > 0) {
      preis = preis + pWert;
    } else {
      System.out.println("Aenderung nicht sinnvoll.");
    }
  }

  public void macheProbeFahrt(int pStrecke) {
    if (kilometerstand + pStrecke < 0) {
      System.out.println("Negativer eintrag.");
    } if (pStrecke * verbrauch > aktuelleTankfüllung) {
      System.out.println("Tankfüllung nicht ausreichend.");
    } else {
      kilometerstand = kilometerstand + pStrecke;
      aktuelleTankfüllung = aktuelleTankfüllung - pStrecke * verbrauch;
      System.err.println("Probefahrt beendet.");
    }
  }

  public void tanke(double pLiter) {
    if (pLiter + aktuelleTankfüllung > tankvolumen ) {
      System.out.println("Kann nicht über tankvolumen tanken.");
    } else {
      aktuelleTankfüllung = aktuelleTankfüllung + pLiter;
      System.err.println("Gefüllt! Tankfüllung: " + aktuelleTankfüllung);
    }
  }

  public void schreibeInfos() {
    System.out.println("Auto der Marke " + marke);
    System.out.println("Kilometerstand: " + kilometerstand);
    System.out.println("Baujahr: " + baujahr);
    System.out.println("Preis: " + preis);
    System.out.println("**********");
  }

  // Getter

  public String getMarke(){
    return marke;
  }

    public int getKilometerstand(){
    return kilometerstand;
  }

    public int getBaujahr(){
    return baujahr;
  }

    public int getPreis(){
    return preis;
  }

    public double getTankvolumen(){
    return tankvolumen;
  }

    public double getTankfüllung(){
    return aktuelleTankfüllung;
  }

    public double getVerbrauch(){
    return verbrauch;
  }
}


