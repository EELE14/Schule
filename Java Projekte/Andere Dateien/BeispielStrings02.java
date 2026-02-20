import static zeichnen.ImperativesZeichnen.*;

public class BeispielStrings02 {

  public static void main(String[] args) {
    starteZeichenflaeche();

    String farbe;
    farbe ="rot";

    zeichneLinie(200, 100, 150, 200, farbe);
    zeichneLinie(150, 200, 150, 300, farbe);
    zeichneLinie(150, 300, 250, 200, farbe);
    zeichneLinie(250, 200, 250, 300, farbe);
    zeichneLinie(200, 100, 250, 200, farbe);
    zeichneLinie(150, 200, 250, 200, farbe);
    zeichneLinie(150, 300, 250, 300, farbe);
    zeichneLinie(250, 300, 150, 200, farbe);

  }
}
