import zeichnen.Dreieck;

public class GleichSchenkligesDreieck extends Dreieck {

    // Attibute
    int StartX;
    int StartY;
    int SchenkelLänge;
    int Hypotenusenlänge;


    public GleichSchenkligesDreieck(int pStartX, int pStartY, int pSchenkelLänge, int pHypotenusenLänge, Boolean pGefuellt, String pFarbe){
        super(pStartX, pStartY, pStartX + pSchenkelLänge, pStartY + SchenkelLänge)
    }
}
