import zeichnen.AgierendesObjekt;
import zeichnen.Rechteck;

public class AgierendesRechteck extends Rechteck implements AgierendesObjekt {

  public AgierendesRechteck(int pXKoord, int pYKoord, int pBreite, int pHoehe, boolean pGefuellt, String pFarbe) {
    super(pXKoord, pYKoord, pBreite, pHoehe, pGefuellt, pFarbe);
  }

  // neue Methode:
  public void bewegeDichZu(int pXKoord, int pYKoord) {
    xKoord = pXKoord;
    yKoord = pYKoord;
  }

  // MUSS wegen des Interfaces ZWINGEND vorhanden sein:
  public void agiere() {
    if (getFarbe().equals("blau")) {
      setzeFarbe("gruen");
    } else {
      setzeFarbe("blau");
    }
    bewegeDichZu(xKoord + 10, yKoord + 10);
  }

}