import zeichnen.Rechteck;

public class Turm {

  private int gesamthoehe;
  private int breite;
  private Rechteck oben;
  private Rechteck mitte;
  private Rechteck unten;

  public Turm(int pXKoord, int pYKoord, int pGesamthoehe, int pBreite) {
    gesamthoehe = pGesamthoehe;
    breite = pBreite;

    oben = new Rechteck(pXKoord, pYKoord, pBreite, pGesamthoehe / 3, true, "rot");
    mitte = new Rechteck(pXKoord, pYKoord + pGesamthoehe / 3, pBreite, pGesamthoehe / 3, true, "orange");
    unten = new Rechteck(pXKoord, pYKoord + 2 * pGesamthoehe / 3, pBreite, pGesamthoehe / 3, true, "gruen");
  }

  public int getGesamthoehe() {
    return gesamthoehe;
  }

  public int getBreite() {
    return breite;
  }

  public Rechteck getOben() {
    return oben;
  }

  public Rechteck getMitte() {
    return mitte;
  }

  public Rechteck getUnten() {
    return unten;
  }
}