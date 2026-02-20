public class BankkontoVergleich {

  public static void main(String[] args) {
    Bankkonto erstesKonto = new Bankkonto("1701", "Bill Gates");
    erstesKonto.einzahlen(2000);

    Bankkonto zweitesKonto = new Bankkonto("2007", "Tim Cook");
    zweitesKonto.einzahlen(1000);

    if (erstesKonto.getKontostand() > zweitesKonto.getKontostand()) {
      System.out.println(erstesKonto.getBesitzer() + " hat mehr Geld!");
    } else {
      if (erstesKonto.getKontostand() < zweitesKonto.getKontostand()) {
        System.out.println(zweitesKonto.getBesitzer() + " hat mehr Geld!");
      } else {
        System.out.println("Beide haben gleich viel Geld!");
      }
    }

    // Würde nicht funktionieren:
    /*
     * if (erstesKonto.kontostand > zweitesKonto.kontostand) {
     *  System.out.println(erstesKonto.besitzer + " hat mehr Geld!");
     * } else {
     *    if (erstesKonto.kontostand < zweitesKonto.kontostand) {
     *      System.out.println(zweitesKonto.besitzer + " hat mehr Geld!");
     *    } else {
     *      System.out.println("Beide haben gleich viel Geld!");
     *    }
     * }
     */

  }

}
