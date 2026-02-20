import static zeichnen.ImperativesZeichnen.*;

public class AufgabeSchleifeZeichnen03 {

    public static void main(String[] args) {
  
      starteZeichenflaeche();
  
      int xKoord;
      xKoord = 50;

      boolean fuellung;
      fuellung = false;
  
      while (xKoord < 600) {
        zeichneRechteck(xKoord, 100, 50, 200, fuellung);
        xKoord = xKoord + 100;
        fuellung = !fuellung;
      }
  
    }
  
}