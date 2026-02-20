import zeichnen.Zeichenflaeche;

public class Stadt {

  private Zeichenflaeche meineFlaeche;
  private Stadtobjekt[] meineObjekte;

  public Stadt(int pAnzahl) {
    meineFlaeche = new Zeichenflaeche();
    meineObjekte = new Stadtobjekt[pAnzahl];
  }

  public void setzeObjekt(int pFach, Stadtobjekt pNeues) {
    meineObjekte[pFach] = pNeues;
    meineFlaeche.fuegeHinzu(pNeues);
  }

  public void setzeAufTag() {
    for (int i = 0; i < meineObjekte.length; i = i + 1) {
      meineObjekte[i].setzeAufTag();
    }
    meineFlaeche.repaint();
  }

  public void setzeAufNacht() {
    for (int i = 0; i < meineObjekte.length; i = i + 1) {
      meineObjekte[i].setzeAufNacht();
    }
    meineFlaeche.repaint();
  }

}