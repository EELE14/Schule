public class Schüler extends Person {

    private Boolean Oberstufe;
    
    public Schüler(String pName, int pGeburtsjahr, Boolean pOberstufe) {
        super(pName, pGeburtsjahr);
        Oberstufe = pOberstufe;
    }

    public boolean isOberstufe(){
        return Oberstufe;
    }

    public void schreibeInfos(){
        super.schreibeInfos();
        System.out.println("Ist oberstufe?");
        System.out.println(Oberstufe);
    }
    
}