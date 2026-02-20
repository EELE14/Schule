import java.util.Scanner;
import static zeichnen.ImperativesZeichnen.*;

public class BeispielWerteEinlesen {

  public static void main(String[] args) {

    int breite;
    int hoehe;
    boolean fuellung;

    Scanner meinScanner = new Scanner(System.in);
    breite = meinScanner.nextInt();
    hoehe = meinScanner.nextInt();
    fuellung = meinScanner.nextBoolean();
    meinScanner.close();

    starteZeichenflaeche();

    zeichneRechteck(100, 100, breite, hoehe, fuellung);
    
    System.out.println(breite);
    System.out.println(hoehe);
    System.out.println(fuellung);

  }
}