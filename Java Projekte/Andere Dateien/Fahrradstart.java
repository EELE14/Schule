public class Fahrradstart {

  public static void main(String[] args) {

    Fahrrad erstesFahrrad = new Fahrrad("Puky", "rot",
        new Fahrradreifen("Schwalbe", 20, 3),
        new Fahrradreifen("Schwalbe", 20, 3));

    erstesFahrrad.schreibeInfos();

    Fahrradreifen einReifen = new Fahrradreifen("Continental", 28, 4);
    Fahrradreifen nochEinReifen = new Fahrradreifen("Continental", 28, 4);
    Fahrrad zweitesFahrrad = new Fahrrad("Pegasus", "schwarz", einReifen, nochEinReifen);

    zweitesFahrrad.schreibeInfos();

  }

}
