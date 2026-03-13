import static zeichnen.ImperativesZeichnen.*;

public class BeispielMethodeZeichnen {

  public static void main(String[] args) {

    starteZeichenflaeche();

    zeichneBaum(200, 300);
    zeichneBaum(400, 200);

  }

  private static void zeichneBaum(int xKoord, int yKoord) {
    zeichneRechteck(xKoord + 30, yKoord+80, 40, 100, true, "braun");
    zeichneOval(xKoord, yKoord, 100, 100, true, "gruen");
  }

}
