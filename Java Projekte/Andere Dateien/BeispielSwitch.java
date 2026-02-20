public class BeispielSwitch {

  public static void main(String[] args) {

    int meineZahl;
    meineZahl = 3;

    switch (meineZahl) {

      case 0:
        System.out.println("Null!");
        break;

      case 1:
        System.out.println("Eins!");
        break;

      case 2:
        System.out.print("Zwei oder ");

      case 3:
        System.out.println("Drei!");
        break;

      default:
        System.out.println("Irgendwas, nur nicht Null bis Drei!");
    }

  }

}
