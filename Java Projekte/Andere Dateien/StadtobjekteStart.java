import zeichnen.Zeichenflaeche;

public class StadtobjekteStart {
  public static void main(String[] args) {

    Zeichenflaeche meinBild;
    meinBild = new Zeichenflaeche();

    Stadtobjekt[] meineObjekte;

    // Die Länge des Arrays muss nach Bedarf gewählt werden:
    meineObjekte = new Stadtobjekt[1];

    // Hier werden die Objekte erzeugt:
    meineObjekte[0] = new Stadthimmel();

    // Hier kann zwischen Tag und Nacht gewählt werden:
    for (int i = 0; i < meineObjekte.length; i = i + 1) {
      // meineObjekte[i].setzeAufNacht();
      meineObjekte[i].setzeAufTag();
    }

    // Die Objekte werden zum Bild hinzugefügt:
    for (int i = 0; i < meineObjekte.length; i = i + 1) {
      meinBild.fuegeHinzu(meineObjekte[i]);
    }
  }

}