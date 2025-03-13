package Systemanalyse;

public class Currency {
  
  private Double betrag;
  private Waehrung waehrung;
  
  public Currency(Double betrag, Waehrung waehrung) {
    this.betrag = betrag;
    this.waehrung = waehrung;
  }
  
  @Override
  public String toString() {
    return "Currency{" +
            "betrag=" + betrag +
            ", waehrung=" + waehrung +
            '}';
  }
  
  public Double getBetrag() {
    return betrag;
  }
  
  public void setBetrag(Double betrag) {
    this.betrag = betrag;
  }
  
  public Waehrung getWaehrung() {
    return waehrung;
  }
  
  public void setWaehrung(Waehrung waehrung) {
    this.waehrung = waehrung;
  }
}
