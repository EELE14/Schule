import static zeichnen.ImperativesZeichnen.*;

public class AufgabeStrings01 {

  public static void main(String[] args) {
    starteZeichenflaeche();

    String farbe;

    int xKoord;

    xKoord = 0;
    while (xKoord < 600) {
      if (xKoord % 200 == 0) {
        farbe = "rot";
      } else {
        farbe = "gruen";
      }
      zeichneRechteck(xKoord, 100, 50, 50, true, farbe);

      xKoord = xKoord + 100;
    }
  }
}