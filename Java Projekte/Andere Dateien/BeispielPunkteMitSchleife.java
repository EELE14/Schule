import static zeichnen.ImperativesZeichnen.*;

public class BeispielPunkteMitSchleife {

  public static void main(String[] args) {

    starteZeichenflaeche();

    int koord;
    koord = 100;

    while (koord < 300) {
      zeichnePunkt(koord, koord);
      koord = koord + 50;
    }

  }

}