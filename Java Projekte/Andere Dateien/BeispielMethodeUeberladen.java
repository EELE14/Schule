import static zeichnen.ImperativesZeichnen.*;

public class BeispielMethodeUeberladen {

  public static void main(String[] args) {

    starteZeichenflaeche();

    zeichneBaum(200, 300);
    zeichneBaum(400, 200);

    zeichneBaum(300, 250, 150);
    zeichneBaum(500, 220, 80);

  }

  private static void zeichneBaum(int pXKoord, int pYKoord) {
    zeichneRechteck(pXKoord+30, pYKoord+80, 40, 100, true, "braun");
    zeichneOval(pXKoord, pYKoord, 100, 100, true, "gruen");
  }

  private static void zeichneBaum(int pXKoord, int pYKoord, int pHoehe) {
    zeichneRechteck(pXKoord+30, pYKoord+80, 40, pHoehe, true, "braun");
    zeichneOval(pXKoord, pYKoord, 100, 100, true, "gruen");
  }

}