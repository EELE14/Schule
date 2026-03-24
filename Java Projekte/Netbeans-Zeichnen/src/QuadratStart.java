import zeichnen.Rechteck;
import zeichnen.Zeichenflaeche;

public class QuadratStart {
  public static void main(String[] args) {

    Zeichenflaeche meinBild;
    meinBild = new Zeichenflaeche();

    meinBild.fuegeHinzu(new Rechteck(50, 50, 200, 300, true, "blau"));
    meinBild.fuegeHinzu(new Quadrat(50, 400, 100, true, "gelb"));
    meinBild.fuegeHinzu(new Kreis(100, 100, 20, true, "rot"));

  }
}