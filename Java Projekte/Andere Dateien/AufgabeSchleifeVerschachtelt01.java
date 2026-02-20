import static zeichnen.ImperativesZeichnen.*;

public class AufgabeSchleifeVerschachtelt01 {

  public static void main(String[] args) {

    starteZeichenflaeche();

    // Die Variablen werden bereits hier deklariert.
    int xKoord;
    int yKoord;

    yKoord = 50;
    while (yKoord < 400) {

      // Alternativ könnte xKoord auch erst hier deklariert werden.
      xKoord = 50;
      while (xKoord < 700) {

        zeichnePunkt(xKoord, yKoord);
        xKoord = xKoord + 200;
      }

      yKoord = yKoord + 25;
    }

  }

}