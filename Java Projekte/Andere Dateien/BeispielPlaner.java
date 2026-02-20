public class BeispielPlaner {
  public static void main(String[] args) {

    boolean freundeHabenZeit;
    boolean filmSpannend;
    boolean wetterGut;
    boolean ichGeheInsKino;
    
    // Hier wird angegeben, welche Voraussetzungen heute gegeben sind:
    freundeHabenZeit = true;
    filmSpannend = true;
    wetterGut = true;

    // Hier wird die Entscheidung berechnet:
    ichGeheInsKino = freundeHabenZeit && filmSpannend && !wetterGut;
    
    System.out.println(ichGeheInsKino);
    
 }
  
}
