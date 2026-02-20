import static zeichnen.ImperativesZeichnen.*;

public class AufgabeVerzweigung04 {

  public static void main(String[] args) {

    starteZeichenflaeche();

    int xKoord;
    int yKoord;

    xKoord = 0;
    while (xKoord < 800) {

      yKoord = 0;
      while (yKoord < 600) {

        System.out.println(xKoord);

        if (xKoord % 200 == 0) {
          if (yKoord % 200 == 0) {
            zeichneOval(xKoord, yKoord, 50, 50, true);
          } else {
            zeichneOval(xKoord, yKoord, 50, 50, false);
          }
        } else {
          if (yKoord % 200 == 0) {
            zeichneRechteck(xKoord, yKoord, 50, 50, true);
          } else {
            zeichneRechteck(xKoord, yKoord, 50, 50, false);
          }
        }

        yKoord = yKoord + 100;

      }

      xKoord = xKoord + 100;

    }

  }

}
