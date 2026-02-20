import zeichnen.*;

public class BeispielErstesObjektorientiertesZeichnen {

  public static void main(String[] args) {

    // Eine Zeichenfläche wird erzeugt:
    Zeichenflaeche meineFlaeche = new Zeichenflaeche();

    // Ein Objekt wird zunächst erzeugt und danach hinzugefügt:
    Rechteck meinRechteck = new Rechteck(50, 50, 200, 300, true, 127, 127, 127);
    meineFlaeche.fuegeHinzu(meinRechteck);

    // Die Objekte werden unmittelbar hinzugefügt:
    meineFlaeche.fuegeHinzu(new Oval(100, 100, 300, 50, false, "braun"));
    meineFlaeche.fuegeHinzu(new Linie(0, 0, 500, 500, "rot"));

    // Das optionale Infofenster wird geöffnet:
    meineFlaeche.zeigeInfofenster();
    
  }

}