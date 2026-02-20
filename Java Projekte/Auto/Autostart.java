public class Autostart {

  public static void main(String[] args) {

    Auto erstesAuto;
    erstesAuto = new Auto("VW", 2023, 20000, 250.0, 3.0);

    Auto zweitesAuto = new Auto("Toyota", 2023, 18000, 100.0, 5.0);

    erstesAuto.schreibeInfos();
    zweitesAuto.schreibeInfos();

    erstesAuto.macheProbeFahrt(200000);
    erstesAuto.anderePreisUm(-500);
    erstesAuto.schreibeInfos();

    zweitesAuto.macheProbeFahrt(200);
    zweitesAuto.anderePreisUm(-1000);
    zweitesAuto.schreibeInfos();

    zweitesAuto.macheProbeFahrt(-100);
    zweitesAuto.anderePreisUm(500);
    zweitesAuto.schreibeInfos();   
    
    
    erstesAuto.tanke(100.00);

  }
}
