public abstract class Stadtobjekt {

  // Die Attribute sollen das Zeichnen der Objekte der Unterklassen erleichtern:
  protected int xKoord;
  protected int yKoord;
  protected int gesamtbreite;
  protected int gesamthoehe;

  // Konstruktor:
  public Stadtobjekt(int pXKoord, int pYKoord, int pGesamtbreite, int pGesamthoehe) {
    xKoord = pXKoord;
    yKoord = pYKoord;
    gesamtbreite = pGesamtbreite;
    gesamthoehe = pGesamthoehe;
  }

  // abstrakte Methoden:
  abstract void setzeAufNacht();

  abstract void setzeAufTag();

}