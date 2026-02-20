import static zeichnen.ImperativesZeichnen.*;

public class AufgabeVerzweigung01 {

  public static void main(String[] args) {

    starteZeichenflaeche();

    int xKoord;
    xKoord = 0;

    while (xKoord < 800) {

      if (xKoord % 200 == 0) {
        zeichneOval(xKoord, 100, 100, 100, false);
      } else {
        zeichneOval(xKoord, 100, 50, 50, false);
      }

      xKoord = xKoord + 100;

    }

  }

}