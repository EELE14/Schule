public class Angestellter extends Mitarbeiter{

    private int gehaltsstufe;

    public Angestellter(String pName, int pGehaltsstufe) {
        super(pName);
        gehaltsstufe = pGehaltsstufe;
    }

    public int berechneGehalt() {
        return 1000 + 250*gehaltsstufe;
    }

    public int getGehaltsstufe() {
      return gehaltsstufe;
    }
    
}