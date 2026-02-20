
public class StadtStart {

  public static void main(String[] args) {

    Stadt meineStadt = new Stadt(3);

    meineStadt.setzeObjekt(0, new Stadthimmel());
    meineStadt.setzeObjekt(1, new Stadtwolke(100, 100));
    meineStadt.setzeObjekt(2, new Stadtwolke(400, 120));

    // Hier kann zwischen Tag und Nacht gewählt werden:
    meineStadt.setzeAufNacht();

  }

}