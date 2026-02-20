public class BeispielArray {

  public static void main(String[] args) {

    // Erschaffen des Arrays:
    int[] meineZahlen;
    meineZahlen = new int[5];

    // Festlegen von Werten:
    meineZahlen[0] = 51;
    meineZahlen[1] = 12;
    meineZahlen[2] = 45;
    meineZahlen[3] = 38;
    meineZahlen[4] = 73;

    // Ausgabe der Werte:
    System.out.println(meineZahlen[0]);
    System.out.println(meineZahlen[1]);
    System.out.println(meineZahlen[2]);
    System.out.println(meineZahlen[3]);
    System.out.println(meineZahlen[4]);

    // Ausgabe mithilfe einer Schleife:
    int nummer;
    nummer = 0;

    while (nummer<meineZahlen.length){
      System.out.println(meineZahlen[nummer]);
      nummer = nummer+1;
    }
  }

}
