import static zeichnen.ImperativesZeichnen.*;

public class BeispielRechteckBoolean {

  public static void main(String[] args) {

    starteZeichenflaeche();

    zeichneRechteck(100, 100, 50, 200, false);
    zeichneRechteck(200, 100, 150, 400, false);
    zeichneRechteck(400, 50, 50, 50, false);

    zeichneRechteck(400, 200, 50, 100, true);
    zeichneRechteck(500, 200, 150, 300, true);

  }
}
