import java.util.Arrays;

public class BeispielArrayZeiger {
  public static void main(String[] args) {

    int[] erstes = new int[3];
    int[] zweites = new int[3];

    erstes[0] = 2;
    erstes[1] = 4;
    erstes[2] = 6;

    zweites[0] = 2;
    zweites[1] = 4;
    zweites[2] = 6;

    for (int i = 0; i < erstes.length; i = i + 1) {
      System.out.print(erstes[i]+ " ");
    }
    System.out.println();

    for (int i = 0; i < zweites.length; i = i + 1) {
      System.out.print(zweites[i]+ " ");
    }
    System.out.println();

    System.out.println(erstes == zweites);
    System.out.println(Arrays.equals(erstes, zweites));
    System.out.println("***");

    erstes[2] = 8;

    for (int i = 0; i < erstes.length; i = i + 1) {
      System.out.print(erstes[i]+ " ");
    }
    System.out.println();

    for (int i = 0; i < zweites.length; i = i + 1) {
      System.out.print(zweites[i]+ " ");
    }
    System.out.println();

    System.out.println(erstes == zweites);
    System.out.println(Arrays.equals(erstes, zweites));
    System.out.println("***");

    zweites = erstes;

    for (int i = 0; i < erstes.length; i = i + 1) {
      System.out.print(erstes[i]+ " ");
    }
    System.out.println();

    for (int i = 0; i < zweites.length; i = i + 1) {
      System.out.print(zweites[i]+ " ");
    }
    System.out.println();

    System.out.println(erstes == zweites);
    System.out.println(Arrays.equals(erstes, zweites));
    System.out.println("***");

    zweites[1] = 99;

    for (int i = 0; i < erstes.length; i = i + 1) {
      System.out.print(erstes[i]+ " ");
    }
    System.out.println();

    for (int i = 0; i < zweites.length; i = i + 1) {
      System.out.print(zweites[i]+ " ");
    }
    System.out.println();

    System.out.println(erstes == zweites);
    System.out.println(Arrays.equals(erstes, zweites));

  }

}