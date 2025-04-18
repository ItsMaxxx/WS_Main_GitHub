package Semester_2.Algorithmen.Suchen;

import Semester_2.Algorithmen.TestBspWerte;

public class BinaereSuche {
  public final static int NOT_FOUND = -1;
  
  
  public static void main(String[] args) {
    TestBspWerte tbw = new TestBspWerte(50, "sortiert");
    
    for(int i = 0; i < tbw.array.length; i++){
      System.out.println("Stelle["+i+"] " + "Wert: " + tbw.array[i]);
    }
    
    System.out.println("Ergebnis: " + binaereSuche(tbw.array, 25));
    
    System.out.println("Ergebnis: " + binaereSucheRekursiv(tbw.array, 25, 0, tbw.array.length-1));
    
  }
  
  public static int binaereSuche(int[] array, int target) {
    int ersteStelle = 0;
    int letzteStelle = array.length - 1;
    
    while (ersteStelle <= letzteStelle) {
      int mittelstelle = ersteStelle + (letzteStelle - ersteStelle) / 2; // Korrekte Berechnung der Mittelstelle
      
      if (array[mittelstelle] == target) {
        return mittelstelle; // Rückgabe des Index des gefundenen Elements
      } else if (array[mittelstelle] > target) {
        letzteStelle = mittelstelle - 1;
      } else {
        ersteStelle = mittelstelle + 1;
      }
    }
    
    return NOT_FOUND;
  }//nd binaereSuche
  
  public static int binaereSucheRekursiv(int[] array, int target, int ersteStelle, int letzteStelle) {
    
    if(ersteStelle > letzteStelle){
      return NOT_FOUND;
    }
    int mittelstelle = ersteStelle + (letzteStelle - ersteStelle) / 2; // Korrekte Berechnung der Mittelstelle
    
    if (array[mittelstelle] == target) {
      return mittelstelle; // Rückgabe des Index des gefundenen Elements
      } else if (array[mittelstelle] > target) {
      return binaereSucheRekursiv(array, target, ersteStelle, mittelstelle-1);
    } else {
      return binaereSucheRekursiv(array, target, mittelstelle+1, letzteStelle);
    }
  }//end binaereSucheRekursiv
  
  
  
}//end class
