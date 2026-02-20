import zeichnen.Rechteck;
import zeichnen.Oval;

public class Baum  {
  private Rechteck stamm;
  private Oval krone;

  public Baum(int pX, int pY) {
    stamm = new Rechteck(pX+25, pY+80, 50, 90, true, "braun");
    krone = new Oval(pX, pY, 100, 100, true, "gruen");
  }

  public Rechteck get01Stamm(){
    return stamm;
  }

  public Oval get02krone(){
    return krone;
  }

}