import zeichnen.Timerflaeche;

public class BeispielTimerBaum {

  public static void main(String[] args) {
    Timerflaeche meineFlaeche = new Timerflaeche();

    meineFlaeche.fuegeHinzu(
        new AgierenderBaum(300, 300));

    meineFlaeche.fuegeHinzu(
        new AgierenderBaum(500, 400));

  }

}
