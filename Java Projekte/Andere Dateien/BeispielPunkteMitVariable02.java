import static zeichnen.ImperativesZeichnen.*;

public class BeispielPunkteMitVariable02 {

  public static void main(String[] args) {

    starteZeichenflaeche();
    
    int koord;
    koord = 100;

    zeichnePunkt(koord, koord);
    koord = koord + 50;

    zeichnePunkt(koord, koord);
    koord = koord + 50;

    zeichnePunkt(koord, koord);
    koord = koord + 50;

    zeichnePunkt(koord, koord);

  }
}
