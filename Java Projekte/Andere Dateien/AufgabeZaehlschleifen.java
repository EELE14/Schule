import java.util.Scanner;
import static zeichnen.ImperativesZeichnen.*;

public class AufgabeZaehlschleifen {

  public static void main(String[] args) {

    Scanner meinScanner = new Scanner(System.in);

    int[] hoehen;
    System.out.println("Wähle die Anzahl der Rechtecke: ");
    hoehen = new int[meinScanner.nextInt()];

    int nummer;

    nummer = 0;
    while (nummer < hoehen.length) {
      System.out.println("Wähle eine Höhe: ");
      hoehen[nummer] = meinScanner.nextInt();
      nummer = nummer + 1;
    }

    meinScanner.close();

    starteZeichenflaeche();

    nummer = 0;
    while (nummer < hoehen.length) {
      zeichneRechteck(nummer*100, 100, 100, hoehen[nummer], true);
      nummer = nummer + 1;
    }

  }

}
