public class Bankkontostart {

  public static void main(String[] args) {
    Bankkonto meinKonto = new Bankkonto("1701", "Bill Gates");
    meinKonto.einzahlen(1000);

    meinKonto.auszahlen("1701", 5000);
    meinKonto.auszahlen("1234", 200);
    meinKonto.auszahlen("1701", 200);

    meinKonto.schreibeInfos();

    // Diese Anweisungen würden Fehler verursachen:
    // meinKonto.kontostand = 100000;
    // System.out.println(meinKonto.pin);
  }
}

