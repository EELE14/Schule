public class PersonStart {

  public static void main(String[] args) {

    Person erstePerson = new Person("Anton", 2005);
    erstePerson.schreibeInfos();

    Lehrer ersterLehrer = new Lehrer("Bob", 1996, "Deutsch", "Geschichte");
    ersterLehrer.schreibeInfos();

    Schüler ersterSchüler = new Schüler("Lisandro", 2009, true);
    ersterSchüler.schreibeInfos();

  }
  
}
