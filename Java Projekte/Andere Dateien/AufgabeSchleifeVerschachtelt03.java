import static zeichnen.ImperativesZeichnen.*;

public class AufgabeSchleifeVerschachtelt03 {

  public static void main(String[] args) {

    starteZeichenflaeche();

    int xKoord;
    int yKoord;

    yKoord = 50;
    while (yKoord < 400) {

      xKoord = 50;
      while (xKoord < 700) {

        zeichneRechteck(xKoord, yKoord, xKoord/10, yKoord/10, true);
        xKoord = xKoord + 100;
      }

      yKoord = yKoord + 100;
    }

  }

  
}