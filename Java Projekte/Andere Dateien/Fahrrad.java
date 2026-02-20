public class Fahrrad {

  private String marke;
  private String farbe;
  private Fahrradreifen vorderreifen;
  private Fahrradreifen hinterreifen;

  public Fahrrad(String pMarke, String pFarbe, Fahrradreifen pVorderreifen, Fahrradreifen pHinterreifen) {
    marke = pMarke;
    farbe = pFarbe;
    vorderreifen = pVorderreifen;
    hinterreifen = pHinterreifen;
  }

  public void schreibeInfos() {
    System.out.print("Fahrrad der Marke: ");
    System.out.println(marke);
    System.out.print("Farbe: ");
    System.out.println(farbe);
    System.out.print("Vorderreifen: ");
    vorderreifen.schreibeInfos();
    System.out.print("Hinterreifen: ");
    hinterreifen.schreibeInfos();
  }

  public String getMarke() {
    return marke;
  }

  public String getFarbe() {
    return farbe;
  }

  public Fahrradreifen getVorderreifen() {
    return vorderreifen;
  }

  public Fahrradreifen getHinterreifen() {
    return hinterreifen;
  }

}