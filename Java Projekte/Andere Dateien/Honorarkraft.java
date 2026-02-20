public class Honorarkraft extends Mitarbeiter{

    private int stunden;

    public Honorarkraft(String pName) {
        super(pName);
        stunden = 0;
    }

    public void stundeGearbeitet(){
        stunden = stunden + 1;
    }

    public int berechneGehalt() {
        return stunden * 50;
    }

    public int getStunden() {
      return stunden;
    }
    
}