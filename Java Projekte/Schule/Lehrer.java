public class Lehrer extends Person {

  // Attribute
  private String erstesFach;
  private String zweitesFach;

  // Konstruktor
  public Lehrer(String pName, int pGeburtsjahr, String pErstesFach, String pZweitesFach) {
    super(pName, pGeburtsjahr);
    erstesFach = pErstesFach;
    zweitesFach = pZweitesFach;
  }

  // get-Methoden
  public String getErstesFach() {
    return erstesFach;
  }

  public String getZweitesFach() {
    return zweitesFach;
  }

  public void schreibeInfos() {
    super.schreibeInfos();
    System.out.print("Erstes Fach: ");
    System.out.println(erstesFach);
    System.out.print("Zweites Fach: ");
    System.out.println(zweitesFach);
  }

}
