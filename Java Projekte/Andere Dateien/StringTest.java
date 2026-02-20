public class StringTest {

  public static void main(String[] args) {

    String ersterNeffe = "Tick";
    String zweiterNeffe = "Trick";
    String dritterNeffe = "Track";

    System.out.println(ersterNeffe);
    System.out.println(zweiterNeffe);
    System.out.println(dritterNeffe);

    System.out.println(ersterNeffe + ", " + zweiterNeffe + ", " + dritterNeffe);

    String alleDrei = ersterNeffe + ", " + zweiterNeffe + ", " + dritterNeffe;
    System.out.println(alleDrei);

    System.out.println("Laenge: " + alleDrei.length());

    String dieLetztenBeiden = alleDrei.substring(6);
    System.out.println(dieLetztenBeiden);

    String derMittlere = alleDrei.substring(6, 11);
    System.out.println(derMittlere);
    System.out.println("***");

    System.out.println("Vergleiche (WICHTIG!):");
    System.out.println(zweiterNeffe);
    System.out.println(derMittlere);
    System.out.println(zweiterNeffe == derMittlere);
    System.out.println(zweiterNeffe.equals(derMittlere));
    System.out.println("***");

    for (int i = 0; i < ersterNeffe.length(); i = i + 1) {
      System.out.println(ersterNeffe.charAt(i));
    }
    System.out.println("***");

    System.out.println(ersterNeffe.compareTo("Sick"));
    System.out.println(ersterNeffe.compareTo("Nick"));
    System.out.println(ersterNeffe.compareTo("Wick"));
    System.out.println(ersterNeffe.compareTo("Tim"));
    System.out.println("***");

    System.out.println(alleDrei.indexOf("Tr"));
    System.out.println(alleDrei.indexOf("Tri"));
    System.out.println(alleDrei.indexOf("Tra"));
    System.out.println(alleDrei.indexOf("Trak"));
    System.out.println("***");

    String eineZahl = "15";
    String nochEineZahl = "21";

    System.out.println(eineZahl);
    System.out.println(eineZahl + nochEineZahl);

    int erste = Integer.parseInt(eineZahl);
    int zweite = Integer.parseInt(nochEineZahl);
    System.out.println(erste + zweite);

    String summe = Integer.toString(erste + zweite);
    System.out.println(eineZahl + " plus " + nochEineZahl + " macht " + summe);
    System.out.println("***");

    String eineDezimalzahl = "15.5";
    String nochEineDezimalzahl = "21.3";

    System.out.println(eineDezimalzahl);
    System.out.println(eineDezimalzahl + nochEineDezimalzahl);

    double ersteDouble = Double.parseDouble(eineDezimalzahl);
    double zweiteDouble = Double.parseDouble(nochEineDezimalzahl);
    System.out.println(ersteDouble + zweiteDouble);

  }

}