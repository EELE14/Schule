public class SchlechtesBeispiel {
  public static void main(String[] args) {

    int ergebnis;

    ergebnis = 0;
    for (int zaehler = 0; zaehler <= 10; zaehler = zaehler + 1) {
      ergebnis = ergebnis + zaehler;
    }
    System.out.print("Die Summe der Zahlen von 1 bis 10 lautet: ");
    System.out.println(ergebnis);

    ergebnis = 0;
    for (int zaehler = 0; zaehler <= 100; zaehler = zaehler + 1) {
      ergebnis = ergebnis + zaehler;
    }
    System.out.print("Die Summe der Zahlen von 1 bis 100 lautet: ");
    System.out.println(ergebnis);

    ergebnis = 0;
    for (int zaehler = 0; zaehler <= 1000; zaehler = zaehler + 1) {
      ergebnis = ergebnis + zaehler;
    }
    System.out.print("Die Summe der Zahlen von 1 bis 1000 lautet: ");
    System.out.println(ergebnis);

  }
}