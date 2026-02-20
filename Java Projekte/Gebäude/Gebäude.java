package Gebäude;

public class Gebäude {
    private int quadratmeter;
    private int preis;
    private String eigentümer;
    private int räume;
    private int baujahr;
    private double energieverbrauchProJahr;
    private int renovierungsjahr;
    private double versicherungswert;
    private boolean hausmeister;
    private int grundKostenproQM;
    private int neuBaupreisProQM;
    

    Gebäude(int pQuadratmeter, int pPreis, String pEigentümer, int pBaujahr, int pRäume, double pEnergieverbrauchProJahr, int pRenovierungsjahr, double pVersicherungswert, boolean pHausmeister){
        quadratmeter = pQuadratmeter;
        preis = pPreis;
        eigentümer = pEigentümer;
        räume = pRäume;
        baujahr = pBaujahr;
        energieverbrauchProJahr = pEnergieverbrauchProJahr;
        renovierungsjahr = pRenovierungsjahr;
        versicherungswert = pVersicherungswert;
        hausmeister = pHausmeister;
        grundKostenproQM = 3;
        neuBaupreisProQM = 1800;
    }

    public void schreibeInfos(){
    System.out.println("Gebäude Fläche: " + quadratmeter);
    System.out.println("Preis: " + preis);
    System.out.println("Eigentümer: " + eigentümer);
    System.out.println("Räume: " + räume);
    System.out.println("Baujahr: " + baujahr);
    System.out.println("Energieverbrauch pro jahr: " + energieverbrauchProJahr);
    System.out.println("Renovierungsjahr: " + renovierungsjahr);
    System.out.println("Versicherungswert: " + versicherungswert);
    System.out.println("Hat hausmeister: " + hausmeister);
    System.out.println("Grundkosten: " + grundKostenproQM * quadratmeter);
    System.out.println("**********");
    }

    public int getAlter(){
        return 2026 - baujahr;
    }

    public Boolean isSanierungsbedürftig(){
        if (getAlter() > 40){
            return true;
        } 
        return false;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public int quadratmeterPreis(){
        return preis / quadratmeter;
    }

    public int getGrundkosten(){
        return grundKostenproQM * quadratmeter;
    }

    public double getVersicherungspreis(){
        int grundwert = neuBaupreisProQM * quadratmeter;
        double altersabschlagProzenz = getAlter() * 0.005;
        double altersabschlag = altersabschlagProzenz * grundwert;
        return grundwert - altersabschlag;
        }
}
