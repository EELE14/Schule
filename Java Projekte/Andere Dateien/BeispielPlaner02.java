public class BeispielPlaner02 {
  public static void main(String[] args) {

    int freundeHabenZeit;
    boolean filmSpannend;
    boolean wetterGut;
    boolean ichGeheInsKino;

    freundeHabenZeit = 2;
    filmSpannend = true;
    wetterGut = true;

    ichGeheInsKino = freundeHabenZeit >= 2 && filmSpannend || !wetterGut;

    System.out.println(ichGeheInsKino);

  }

}
