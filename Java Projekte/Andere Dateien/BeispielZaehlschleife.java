import static zeichnen.ImperativesZeichnen.*;

public class BeispielZaehlschleife {

  public static void main(String[] args) {

    starteZeichenflaeche();

    for (int koord = 100; koord < 600; koord = koord + 50) {
      zeichnePunkt(100, koord);
    }

    for (int koord = 100; koord < 600; koord = koord + 50) {
      zeichnePunkt(koord, 100);
    }

  }

}
