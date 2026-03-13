import zeichnen.Rechteck;

public class Quadrat extends Rechteck{
  // Diese Unterklasse hat KEINE neuen Attribute.
  
  // Der Konstruktor von Quadrat hat einen Parameter weniger:
  public Quadrat(int pXKoord, int pYKoord, int pBreite, boolean pGefuellt, String pFarbe) {
    super(pXKoord, pYKoord, pBreite, pBreite, pGefuellt, pFarbe);
  }
  
}