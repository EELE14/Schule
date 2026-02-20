import zeichnen.Rechteck;
import zeichnen.Timerflaeche;

public class BeispielTimerflaeche {

  public static void main(String[] args) {

    Timerflaeche beispielflaeche = new Timerflaeche();

    beispielflaeche.fuegeHinzu(new AgierendesRechteck(100, 100, 200, 300, true, "blau"));
    beispielflaeche.fuegeHinzu(new Rechteck(500, 100, 200, 300, true, "blau"));

    beispielflaeche.zeigeInfofenster();

  }

}