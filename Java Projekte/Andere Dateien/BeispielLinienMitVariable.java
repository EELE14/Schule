import static zeichnen.ImperativesZeichnen.*;

public class BeispielLinienMitVariable {

  public static void main(String[] args) {

    starteZeichenflaeche();
    
    int laenge;
    laenge = 100;

    zeichneLinie(50, 100, 50, laenge+100);
    zeichneLinie(150, 100, 150, laenge+100);
    zeichneLinie(250, 100, 250, laenge+100);

  }
}
