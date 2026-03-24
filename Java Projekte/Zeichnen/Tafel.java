import zeichnen.Rechteck;


public class Tafel {
    private int gesamthoehe;
    private int XKoord;
    private int YKoord;
    private int breite;
    private Rechteck rahmen;
    private Rechteck zeichenbereich;
    private Rechteck ständerL;
    private Rechteck ständerR;

    public Tafel(int pXKoord, int pYKoord, int pGesamthoehe){

        gesamthoehe = pGesamthoehe;
        breite = pGesamthoehe;
        XKoord = pXKoord;
        YKoord = pYKoord;

        ständerL = new Rechteck(XKoord + breite/4/2, YKoord, breite/11, gesamthoehe/5*4, true, "grau");
        ständerR = new Rechteck(XKoord + breite/4 * 3, YKoord, breite/11, gesamthoehe/5*4, true, "grau");
        rahmen = new Rechteck(XKoord, YKoord, breite, gesamthoehe/2, true, 0, 0, 128);
        zeichenbereich = new Rechteck(XKoord + 10, YKoord + 10, breite - 20, gesamthoehe/2 - 20, true, "weiss");
    }
    
    public Rechteck get3Rahmen(){
    return rahmen;
    }
    
    public Rechteck get4Zeichenbereich(){
    return zeichenbereich;
    }
    
    public Rechteck get1StänderL(){
    return ständerL;
    }
    
    public Rechteck get2StänderR(){
    return ständerR;
    }
}