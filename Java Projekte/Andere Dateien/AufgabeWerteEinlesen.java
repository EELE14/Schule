import java.util.Scanner;
import static zeichnen.ImperativesZeichnen.*;

public class AufgabeWerteEinlesen {

  public static void main(String[] args) {

    int xKoord;
    xKoord = 0;

    Scanner meinScanner = new Scanner(System.in);

    starteZeichenflaeche();

    while (xKoord >= 0) {
      xKoord = meinScanner.nextInt();
      zeichnePunkt(xKoord, 100);
    }

    meinScanner.close();

    zeichneRechteck(0, 0, 800, 600, true);

  }
}