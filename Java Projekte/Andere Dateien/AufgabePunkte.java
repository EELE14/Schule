import static zeichnen.ImperativesZeichnen.*;

public class AufgabePunkte {

  public static void main(String[] args) {
    starteZeichenflaeche();

    zeichnePunkt(200, 100);

    zeichnePunkt(150, 200);
    zeichnePunkt(150, 300);
    zeichnePunkt(250, 200);
    zeichnePunkt(250, 300);

    zeichneLinie(200, 100, 150, 200);
    zeichneLinie(150, 200, 150, 300);
    zeichneLinie(150, 300, 250, 200);
    zeichneLinie(250, 200, 250, 300);
    zeichneLinie(200, 100, 250, 200);
    zeichneLinie(150, 200, 250, 200);
    zeichneLinie(150, 300, 250, 300);
    zeichneLinie(250, 300, 150, 200);

  }

}