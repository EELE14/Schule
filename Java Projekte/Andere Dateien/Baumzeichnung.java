import zeichnen.Oval;
import zeichnen.Rechteck;
import zeichnen.Zeichenflaeche;

public class Baumzeichnung {
  public static void main(String[] args) {

    Zeichenflaeche meinBild;
    meinBild = new Zeichenflaeche();

    meinBild.fuegeHinzu(new Rechteck(0, 0, 800, 600, true, "blau"));
    meinBild.fuegeHinzu(new Oval(50, 50, 100, 100, true, "gelb"));

    meinBild.fuegeHinzu(new Baum(100, 400));
    meinBild.fuegeHinzu(new Baum(300, 400));
    meinBild.fuegeHinzu(new Baum(600, 400));

    meinBild.zeigeInfofenster();

  }

}