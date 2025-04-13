package Systemanalyse;

import java.util.Date;

public class Main {
  
  public static void main(String[] args) {
    Adresse a = new Adresse("Wirtheimer Str.", 2, "63599", "Biebergemünd Kassel", Land.Deutschland);

    Kunde ku = new Kunde("Maximilian", "Schmelzer", a, new Date(2055, 4, 28));
    ku.setDatumErsteKontoeroeffnung(new Date(2025, 3, 13));

    ku.konten.add(new Girokonto(new Currency(100.0, Waehrung.Euro)));

    ku.konten.add(new Girokonto(new Currency(22.0, Waehrung.JPY)));
    ku.konten.add(new Tagesgeldkonto(new Currency(10.0, Waehrung.Euro)));

    System.out.println("a");

    for(Konto k : ku.konten){
      System.out.println("b");
      System.out.println(k.zinsenGutschreiben(3));
      System.out.println("c");
      if(k instanceof Girokonto){
        System.out.println("d");
        System.out.println(((Girokonto) k).getMaximalerUeberzug());
      }
    }
    
    
    
  }
  
  
}
