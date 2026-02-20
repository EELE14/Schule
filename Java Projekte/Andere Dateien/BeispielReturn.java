public class BeispielReturn {

  public static void main(String[] args) {

    // Das Ergebnis kann sofort ausgegeben werden:
    System.out.println(summe(5));

    int[] meineZahlen;
    meineZahlen = new int[3];

    // Es kann auch für spätere Zwecke gespeichert werden:
    meineZahlen[0] = summe(10);
    meineZahlen[1] = summe(100);
    meineZahlen[2] = summe(1000);

    for (int zaehler = 0; zaehler < meineZahlen.length; zaehler = zaehler + 1) {
      System.out.println(meineZahlen[zaehler]);
    }
  }

  private static int summe(int pZahl) {
    int ergebnis;
    ergebnis = 0;

    for (int zaehler = 0; zaehler <= pZahl; zaehler = zaehler + 1) {
      ergebnis = ergebnis + zaehler;
    }

    return ergebnis;
  }

}