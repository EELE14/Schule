import zeichnen.Oval;
import zeichnen.Rechteck;

public class Himmel {

  private Rechteck hintergrund;
  private Oval sonne;

  public Himmel(int pDurchmesser){
    hintergrund = new Rechteck(0, 0, 800, 600, true, "blau");
    sonne = new Oval(50, 50, pDurchmesser, pDurchmesser, true, "gelb");
  }

  // Beachte: "Hintergrund" kommt alphabetisch vor "Sonne".
  public Rechteck getHintergrund() {
    return hintergrund;
  }

  public Oval getSonne() {
    return sonne;
  }

}