import java.util.Scanner;
import static zeichnen.ImperativesZeichnen.*;

public class BeispielStringEinlesen {

  public static void main(String[] args) {

    Scanner meinScanner = new Scanner(System.in);
    String wunschfarbe;

    System.out.print("Bitte wähle eine Farbe! ");
    wunschfarbe = meinScanner.next();

    starteZeichenflaeche();

    zeichneOval(300, 200, 200, 200, true, wunschfarbe);

    meinScanner.close();

  }

}
