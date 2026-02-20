import java.util.Scanner;

public class BeispielVerzweigungVerschachtelt02 {

  public static void main(String[] args) {

    int note;

    System.out.print("Welche Note (1-6) hast Du geschrieben? ");
    Scanner meinScanner = new Scanner(System.in);
    note = meinScanner.nextInt();
    meinScanner.close();

    if (note == 1) {
      System.out.println("sehr gut");
    } else if (note == 2) {
      System.out.println("gut");
    } else if (note == 3) {
      System.out.println("befriedigend");
    } // Hier fehlt noch was!
  }
}
