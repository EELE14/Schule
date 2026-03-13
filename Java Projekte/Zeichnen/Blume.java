import zeichnen.Rechteck;
import zeichnen.Oval;

public class Blume{

    private Rechteck stiel;
    private Oval kopf;
    private int gesamthoehe;
    private int breite;
    private Oval kopfMitte;

    public Blume(int pGesamthoehe, int xKoord, int yKoord, int pBreite){
        breite = pBreite;
        gesamthoehe = pGesamthoehe;

        stiel = new Rechteck(xKoord + 10, yKoord + gesamthoehe, breite / 2, gesamthoehe, true, "gruen");
        kopf = new Oval(xKoord,yKoord, breite, gesamthoehe, true, "rot");
        kopfMitte = new Oval( xKoord + 14, yKoord - 20, pBreite / 3, pGesamthoehe / 3 , true, "gelb");
    }

    public Rechteck get1Stiel(){
        return stiel;
    }

    public Oval get2Kopf(){
        return kopf;
    }

    public Oval get3KopfMitte(){
        return kopfMitte;
    }
}