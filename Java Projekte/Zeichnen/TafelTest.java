import zeichnen.Zeichenflaeche;


public class TafelTest {
    
    public static void main(String[] args) {
    
    Zeichenflaeche meinBild;
    meinBild = new Zeichenflaeche();
    
    meinBild.fuegeHinzu(new Tafel(200, 200, 500));
    meinBild.zeigeInfofenster();}

}