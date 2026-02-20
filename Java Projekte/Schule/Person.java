public class Person {

  private String name;
  private int geburtsjahr;

  public Person(String pName, int pGeburtsjahr) {
    name = pName;
    geburtsjahr = pGeburtsjahr;
  }

  public String getName() {
    return name;
  }

  public int getGeburtsjahr() {
    return geburtsjahr;
  }

  public void schreibeInfos() {
    System.out.print("Name: ");
    System.out.println(name);
    System.out.print("Geburtsjahr: ");
    System.out.println(geburtsjahr);
    System.out.print("Alter: ");
    System.out.println(2024 - geburtsjahr);
  }
}
