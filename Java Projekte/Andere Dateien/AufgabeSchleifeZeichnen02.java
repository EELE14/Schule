import static zeichnen.ImperativesZeichnen.*;

public class AufgabeSchleifeZeichnen02 {

  public static void main(String[] args) {

    starteZeichenflaeche();

    int xKoord;
    xKoord = 50;

    int hoehe;
    hoehe = 10;

    while (xKoord < 600) {
      zeichneRechteck(xKoord, 100, 50, hoehe, false);
      xKoord = xKoord + 100;
      hoehe = hoehe * 2;
    }

  }
}