package Systemanalyse;

public abstract class Konto {
  
  private int kontonummer;
  private Currency kontostand;
  
  public Konto(int kontonummer, Currency kontostand) {
    this.kontonummer = kontonummer;
    this.kontostand = kontostand;
  }
  
  public void zinsenGutschreiben(){
  
  }
  
  
  
}
