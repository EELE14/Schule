import zeichnen.AgierendesObjekt;
import zeichnen.Oval;

public class AgierenderBaum extends Baum implements AgierendesObjekt {

  private Oval apfel;

  public AgierenderBaum(int pX, int pY) {
    super(pX, pY);
    apfel = new Oval(pX+40, pY+40, 10, 10, true, "rot");
  }

  public void agiere() {
    int alt = apfel.getYKoord();
    apfel.setzeYKoord(alt + 10);
  }

  // Getter zum Zeichnen weiterhin wichtig!
  public Oval getApfel(){
    return apfel;
  }

}
