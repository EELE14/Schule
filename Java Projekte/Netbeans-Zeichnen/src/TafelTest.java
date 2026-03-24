import zeichnen.Zeichenflaeche;


public class TafelTest {
    
    public static void main(String[] args) {
    
    Zeichenflaeche meinBild;
    meinBild = new Zeichenflaeche();
    
    meinBild.fuegeHinzu(new Tafel(300, 300, 200, 300));
    meinBild.zeigeInfofenster();

  }
}
