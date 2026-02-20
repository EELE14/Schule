public class MitarbeiterStart {

    public static void main(String [] args) {
        Angestellter erster = new Angestellter("Anton", 4);
        System.out.println(erster.berechneGehalt());

        Honorarkraft zweiter = new Honorarkraft("Berta");
        zweiter.stundeGearbeitet();
        zweiter.stundeGearbeitet();
        System.out.println(zweiter.berechneGehalt());

        // Verursacht einen Fehler:
        // Mitarbeiter dritter = new Mitarbeiter("Caesar");
    }
    
}
