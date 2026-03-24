import zeichnen.Zeichenflaeche;

public class HimmelTurmStart {

  public static void main(String[] args) {
    
    Zeichenflaeche meinBild;
    meinBild = new Zeichenflaeche();
    meinBild.fuegeHinzu(new Himmel(100));
    meinBild.fuegeHinzu(new Turm(400, 300, 300, 150));
    meinBild.fuegeHinzu(new Blume(50, 600, 500, 50));
  }
}