import static zeichnen.ImperativesZeichnen.*;

public class BeispielZeichneOval {
  public static void main(String[] args) {
    starteZeichenflaeche();

    zeichneRechteck(100, 100, 50, 200, false);
    zeichneOval(100, 100, 50, 200, true);

    zeichneOval(200, 100, 150, 400, false);

    zeichneRechteck(400, 50, 50, 50, false);
    zeichneOval(400, 50, 50, 50, true);
    
    zeichneOval(400, 200, 50, 100, true);
    zeichneOval(500, 200, 150, 300, true);
  }
}