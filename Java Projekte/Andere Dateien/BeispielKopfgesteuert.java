import static zeichnen.ImperativesZeichnen.*;

public class BeispielKopfgesteuert {

  public static void main(String[] args) {

    starteZeichenflaeche();

    int koord;

    koord = 100;
    while (koord < 600) {
      zeichnePunkt(100, koord);
      koord = koord + 50;
    }

    koord = 100;
    while (koord < 600) {
      zeichnePunkt(koord, 100);
      koord = koord + 50;
    }

  }

}
