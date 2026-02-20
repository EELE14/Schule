public class Fahrradreifen {

  private String marke;
  private int durchmesser;
  private int breite;

  public Fahrradreifen(String pMarke, int pDurchmesser, int pBreite){
    marke = pMarke;
    durchmesser = pDurchmesser;
    breite = pBreite;
  }

  public void schreibeInfos(){
    System.out.print("Fahrradreifen der Marke ");
    System.out.println(marke);
    System.out.print("Durchmesser: ");
    System.out.println(durchmesser);
    System.out.print("Breite: ");
    System.out.println(breite);
    System.out.println("**********************************");
  }

  public String getMarke() {
    return marke;
  }

  public int getDurchmesser() {
    return durchmesser;
  }

  public int getBreite() {
    return breite;
  }
 
}