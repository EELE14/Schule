import static zeichnen.ImperativesZeichnen.*;

public class BeispielSchleifeVerschachtelt {

  public static void main(String[] args) {

    starteZeichenflaeche();

    // Die Variablen werden bereits hier deklariert.
    int xKoord;
    int yKoord;

    yKoord = 50;
    while (yKoord < 400) {

      // Alternativ könnte xKoord auch erst hier deklariert werden.
      xKoord = 50;
      while (xKoord < 600){      

      zeichnePunkt(xKoord, yKoord);
      xKoord = xKoord + 100;      
      }

      yKoord = yKoord + 100;
    }

  }

}
