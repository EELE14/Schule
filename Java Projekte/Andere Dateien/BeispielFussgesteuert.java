import java.util.Scanner;

public class BeispielFussgesteuert {

  public static void main(String[] args) {

    Scanner meinScanner = new Scanner(System.in);

    int eingabe;

    do {
      System.out.print("Rate meine Zahl: ");
      eingabe = meinScanner.nextInt();
    } while (eingabe != 1701);

    System.out.println("Gefunden!");

    meinScanner.close();

  }

}