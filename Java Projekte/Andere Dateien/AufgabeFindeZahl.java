import java.util.Scanner;

public class AufgabeFindeZahl {
  public static void main(String[] args) {

        Scanner meinScanner = new Scanner(System.in);

        int eingabe;
        eingabe = 0;

        while (eingabe != 1701){
          System.out.println("Rate meine Zahl: ");
          eingabe = meinScanner.nextInt();
        }

        System.out.println("Gefunden!");

        meinScanner.close();

  }
  
}
