package Smartphone;

public class Smartphone {

    String marke;
    String modell;
    int preis;
    double batteriestand;
    int batterieverbrauch;
    int speicherplatz;

    Smartphone(String pMarke, String pModell, int pPreis, int pBatteriestand, int pBatterieverbrauch,
            int pSpeicherplatz) {
        marke = pMarke;
        modell = pModell;
        preis = pPreis;
        batteriestand = pBatteriestand;
        batterieverbrauch = pBatterieverbrauch;
        speicherplatz = pSpeicherplatz;
    }

    public void ladeSmartphone(int pMinuten, boolean Schnellladen) {
        batterieÄnderung(pMinuten, Schnellladen, false);
    }

    public void nutzeSmartphone(int pMinuten) {
        batterieÄnderung(pMinuten, false, true);
    }

    public void batterieÄnderung(double pMinuten, boolean schnellLaden, boolean pNutzung) {
        if (pNutzung && pMinuten > 0) {
            batteriestand = pMinuten * batterieverbrauch;
            if (batteriestand < 0) {
                batteriestand = 0;
                System.out.println("Batterie leer!");
            }

        } else {
            double tatsächlicheGeschwindigkeit = 0;
            if (schnellLaden) {
                tatsächlicheGeschwindigkeit = 1.66;
            } else {
                tatsächlicheGeschwindigkeit = 1.0;
            }

            if (pMinuten > 0 && batteriestand < 100) {
                batteriestand = batteriestand + tatsächlicheGeschwindigkeit * pMinuten;
                System.out.println("Batterie geladen (" + batteriestand + "%)");
                if (batteriestand > 100) {
                    batteriestand = 100;
                    System.out.println("Batterie voll geladen!");
                }
            } else {
                System.out.println("Laden nicht möglich.");
            }
        }
    }
}
