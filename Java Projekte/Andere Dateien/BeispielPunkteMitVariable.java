import static zeichnen.ImperativesZeichnen.*;

public class BeispielPunkteMitVariable {

  public static void main(String[] args) {

    starteZeichenflaeche();
    
    int yKoord;
    yKoord = 100;

    zeichnePunkt(100, yKoord);
    zeichnePunkt(200, yKoord);
    zeichnePunkt(300, yKoord);

    zeichnePunkt(100, 100+yKoord);
    zeichnePunkt(200, 100+yKoord);
    zeichnePunkt(300, 100+yKoord);

  }
}