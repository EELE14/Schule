import zeichnen.Rechteck;


public class Tafel {
    private int gesamthoehe;
    private int breite;
    private int XKoord;
    private int YKoord;
    private Rechteck rahmen;
    private Rechteck zeichenbereich;
    private Rechteck ständerL;
    private Rechteck ständerR;

    public Tafel(int pXKoord, int pYKoord, int pGesamthoehe, int pBreite){

        gesamthoehe = pGesamthoehe;
        breite = pBreite;
        XKoord = pXKoord;
        YKoord = pYKoord;


        rahmen = new Rechteck(pXKoord, pYKoord, pBreite, pGesamthoehe, true, 0, 0, 128);
        zeichenbereich = new Rechteck(pXKoord + 10, pYKoord + 10, pBreite - 20, pGesamthoehe - 20, true, "weiss");
        ständerL = new Rechteck(pXKoord + 100, pYKoord + 50, pBreite - 100, pGesamthoehe, true, "grau");
        ständerR = new Rechteck(pXKoord + 100, pYKoord + 50, pBreite - 100, pGesamthoehe, true, "grau");
    }
    
    public Rechteck getRahmen(){
    return rahmen;
    }
    
    public Rechteck getZeichenbereich(){
    return zeichenbereich;
    }
    
    public Rechteck getStänderL(){
    return ständerL;
    }
    
    public Rechteck getStänderR(){
    return ständerR;
    }














}
