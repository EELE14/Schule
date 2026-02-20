public class VorlageMethoden {
  
  public static void main(String[] args) {

    summe(10);
    summe(100);
    summe(1000);

    quadrat(5);
    quadrat(9);

    // Weitere Aufrufe folgen hier!

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

  private static void quadrat(int pZahl) {
    // Hier fehlt noch was!
  }

  // Weitere Methoden können hier ergänzt werden!

}
