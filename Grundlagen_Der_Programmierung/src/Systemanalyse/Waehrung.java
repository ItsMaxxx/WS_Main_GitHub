package Systemanalyse;

public enum Waehrung {
  
  Euro(1),
  USD(2),
  GBP(3),
  CAD(4),
  CHF(5),
  JPY(6);

  private final int id;

  Waehrung(int id){
    this.id = id;
  }

  public int getId() {
    return id;
  }
  
}
