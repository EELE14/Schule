public class Bankkonto {

  private String pin;
  private int kontostand;
  private String besitzer;

  public Bankkonto(String pPin, String pBesitzer) {
    pin = pPin;
    besitzer = pBesitzer;
    kontostand = 0;
  }

  public void einzahlen(int pBetrag) {
    if (pBetrag > 0) {
      kontostand = kontostand + pBetrag;
    }
  }

  public void auszahlen(String pPin, int pBetrag){
    if(pPin.equals(pin)){
      if(pBetrag <= kontostand){
        kontostand = kontostand-pBetrag;
      }else{
        System.out.println("Nicht ausreichend Guthaben vorhanden.");
      }
    }else{
      System.out.println("PIN falsch");
    }
  }

  public void schreibeInfos(){
    System.out.println("Konto von "+besitzer);
    System.out.println("Kontostand: "+kontostand);
    System.out.println("********************");
  }

  public int getKontostand() {
    return kontostand;
  }

  public String getBesitzer() {
    return besitzer;
  }
  
}
