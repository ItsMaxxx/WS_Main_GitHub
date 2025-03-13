package Systemanalyse;

public abstract class Konto {

  private static int letzteKontonummer = 0;
  protected int kontonummer;
  protected Currency kontostand;

  public Konto(Currency kontostand){
    this.kontostand = kontostand;
    this.kontonummer = ++letzteKontonummer;
  }

  public Currency zinsenGutschreiben(double zinssatz){
    kontostand.setBetrag(kontostand.getBetrag() * (zinssatz / 100 + 1));
    return kontostand;
  }

  public int getKontonummer() {
    return kontonummer;
  }

  public Currency getKontostand() {
    return kontostand;
  }

  public void setKontostand(Currency kontostand) {
    this.kontostand = kontostand;
  }
}
