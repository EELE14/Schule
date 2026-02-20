import zeichnen.Oval;

public class Stadtwolke extends Stadtobjekt {

  private Oval teil1;
  private Oval teil2;
  private Oval teil3;

  public Stadtwolke(int pXKoord, int pYKoord) {

    super(pXKoord, pYKoord, 300, 150);

    teil1 = new Oval(pXKoord, pYKoord + 20, 100, 100, true, "weiss");
    teil2 = new Oval(pXKoord + 50, pYKoord, 100, 100, true, "weiss");
    teil3 = new Oval(pXKoord + 100, pYKoord + 30, 100, 100, true, "weiss");

  }

  // Nachtansicht:
  void setzeAufNacht() {
    teil1.setzeFarbe("grau");
    teil2.setzeFarbe("grau");
    teil3.setzeFarbe("grau");
  }

  // Tagansicht:
  void setzeAufTag() {
    teil1.setzeFarbe("weiss");
    teil2.setzeFarbe("weiss");
    teil3.setzeFarbe("weiss");
  }

  public Oval getTeil1() {
    return teil1;
  }

  public Oval getTeil2() {
    return teil2;
  }

  public Oval getTeil3() {
    return teil3;
  }

}