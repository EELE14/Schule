import zeichnen.Rechteck;

public class Bildschirm {
    private int gesamthoehe;
    private int XKoord;
    private int YKoord;
    private int breite;
    private Rechteck staender;
    private Rechteck rahmen;
    private Rechteck bildschirm;

    public Bildschirm(int pXKoord, int pYKoord, int pGesamthoehe){

        XKoord = pXKoord;
        YKoord = pYKoord;
        gesamthoehe = pGesamthoehe;
        breite = pGesamthoehe;

        rahmen = new Rechteck(XKoord, YKoord, breite, gesamthoehe / 2, true, "grau");
        bildschirm = new Rechteck(XKoord + 10, YKoord + 10, breite - 20, gesamthoehe/ 2 - 20, true, "weiss");
        staender = new Rechteck(XKoord +  breite / 2 - (breite - 20) / 8, YKoord, (breite - 20) / 4, gesamthoehe / 4 * 3, true, "grau");
    }

    public Rechteck get2Rahmen(){
        return rahmen;
    }

    public Rechteck get1Staender(){
        return staender;
    }

    public Rechteck get3Bildschirm(){
        return bildschirm;
    }

}