public abstract class Mitarbeiter {

    private String name;

    public Mitarbeiter(String pName){
        name = pName;
    }

    public abstract int berechneGehalt();

    public String getName() {
      return name;
    }
    
}