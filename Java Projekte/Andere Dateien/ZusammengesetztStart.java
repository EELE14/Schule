import zeichnen.Oval;
import zeichnen.Zeichenflaeche;
import zeichnen.ZusammengesetzteForm;

public class ZusammengesetztStart {

  public static void main(String[] args) {

    Zeichenflaeche meinBild;
    meinBild = new Zeichenflaeche();

    ZusammengesetzteForm meineForm;
    meineForm = new ZusammengesetzteForm(2);

    meineForm.getFiguren()[0] = new Oval(300, 300, 200, 200, true, "rot");
    meineForm.getFiguren()[1] = new Oval(350, 350, 100, 100, true, "gelb");

    meinBild.fuegeHinzu(meineForm);

  }

}