public class BeispielMethode {

  public static void main(String[] args) {

    summe(10);
    summe(100);
    summe(1000);

  }

  private static void summe(int pZahl) {
    int ergebnis;
    ergebnis = 0;

    for (int zaehler = 0; zaehler <= pZahl; zaehler = zaehler + 1) {
      ergebnis = ergebnis + zaehler;
    }

    System.out.print("Die Summe der Zahlen von 1 bis ");
    System.out.print(pZahl);
    System.out.print(" lautet: ");
    System.out.println(ergebnis);
  }

}
