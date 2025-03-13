package Systemanalyse;

import java.util.Date;

public class Main {
  
  public static void main(String[] args) {
    Adresse a = new Adresse("Wirtheimer Str.", 2, "06359", "Biebergemünd Kassel", Land.Deutschland);
    Currency cu = new Currency(12.5, Waehrung.Euro);
    
    Kunde ku = new Kunde("Maximilian", "Schmelzer", a);
    ku.setDatumErsteKontoeroeffnung(new Date(2025, 3, 13));
    
    System.out.println(ku);
  }
  
  
}
