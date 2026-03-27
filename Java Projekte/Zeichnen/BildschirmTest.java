import zeichnen.Zeichenflaeche;


public class BildschirmTest {
    
    public static void main(String[] args) {
    
    Zeichenflaeche meinBild;
    meinBild = new Zeichenflaeche();
    
    meinBild.fuegeHinzu(new Bildschirm(200, 200, 600));
    meinBild.zeigeInfofenster();}

}