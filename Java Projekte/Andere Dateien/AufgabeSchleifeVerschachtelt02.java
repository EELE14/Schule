import static zeichnen.ImperativesZeichnen.*;

public class AufgabeSchleifeVerschachtelt02 {

  public static void main(String[] args) {

    starteZeichenflaeche();

    int xKoord;
    int yKoord;
    boolean fuellung;

    fuellung = false;
    yKoord = 50;
    while (yKoord < 400) {

      xKoord = 50;
      while (xKoord < 700) {

        zeichneRechteck(xKoord, yKoord, 50, 50, fuellung);
        xKoord = xKoord + 100;
        fuellung = !fuellung;
      }

      yKoord = yKoord + 100;
    }

  }

}
