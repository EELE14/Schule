import static zeichnen.ImperativesZeichnen.*;

public class AufgabeSchleifeZeichen01 {

  public static void main(String[] args) {

    starteZeichenflaeche();

    int xKoord;
    xKoord = 50;

    while (xKoord < 600) {
      zeichneRechteck(xKoord, 100, 50, 200, false);;
      xKoord = xKoord + 100;
    }

  }
}