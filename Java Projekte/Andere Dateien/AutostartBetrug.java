public class AutostartBetrug {

  public static void main(String[] args) {

    Auto erstesAuto;
    erstesAuto = new Auto("VW", 2023, 20000);
    erstesAuto.schreibeInfos();

    erstesAuto.macheProbeFahrt(100);

    erstesAuto.baujahr = 2024;
    erstesAuto.kilometerstand = erstesAuto.kilometerstand - 90;

    erstesAuto.schreibeInfos();

    erstesAuto.kilometerstand = erstesAuto.kilometerstand - 90;
    erstesAuto.schreibeInfos();

  }
}
