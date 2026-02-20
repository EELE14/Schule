import zeichnen.Oval;
import zeichnen.Rechteck;

public class Stadthimmel extends Stadtobjekt {

  private Rechteck hintergrund;
  private Oval sonne;

  public Stadthimmel() {
    super(0, 0, 800, 600);
    hintergrund = new Rechteck(0, 0, 800, 600, true, "blau");
    sonne = new Oval(1, 100, 100, 100, true, "gelb");
  }

  // Nachtansicht:
  public void setzeAufNacht() {
    hintergrund.setzeFarbe("schwarz");
    sonne.setzeFarbe("weiss");
  }

  // Tagansicht:
  public void setzeAufTag() {
    hintergrund.setzeFarbe("blau");
    sonne.setzeFarbe("gelb");
  }

  public Rechteck get01hintergrund() {
    return hintergrund;
  }

  public Oval getSonne() {
    return sonne;
  }

}