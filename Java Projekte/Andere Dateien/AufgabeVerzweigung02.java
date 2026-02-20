import static zeichnen.ImperativesZeichnen.*;

public class AufgabeVerzweigung02 {

  public static void main(String[] args) {

    starteZeichenflaeche();

    int xKoord;
    xKoord = 0;

    while (xKoord < 800) {

      if (xKoord % 200 == 0) {

        if (xKoord % 400 == 0) {
          zeichneRechteck(xKoord, 100, 50, 50, true);
        } else {
          zeichneOval(xKoord, 100, 50, 50, true);
        }

      } else {
        zeichneOval(xKoord, 100, 50, 50, false);
      }

      xKoord = xKoord + 100;

    }

  }

}