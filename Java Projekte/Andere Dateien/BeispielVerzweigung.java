import static zeichnen.ImperativesZeichnen.*;

public class BeispielVerzweigung {

  public static void main(String[] args) {

    starteZeichenflaeche();

    int xKoord;
    xKoord = 0;

    while (xKoord < 800) {

      if (xKoord % 200 == 0) {
        zeichneRechteck(xKoord, 100, 50, 50, true);
      } else {
        zeichneOval(xKoord, 100, 50, 50, true);
      }

      xKoord = xKoord + 100;

    }

  }

}
