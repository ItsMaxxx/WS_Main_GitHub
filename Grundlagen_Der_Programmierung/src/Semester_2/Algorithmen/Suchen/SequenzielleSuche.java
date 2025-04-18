package Semester_2.Algorithmen.Suchen;

import Semester_2.Algorithmen.TestBspWerte;

public class SequenzielleSuche {
  public final static int NOT_FOUND = -1;
  
  public static void main(String[] args) {
    TestBspWerte tbw = new TestBspWerte(50, "sortiert");
    
    for(Integer i : tbw.array){
      System.out.println(i);
    }
    
    System.out.println("Ergebnis: " + sequenzielleSuche(tbw.array, 20));
    
  }
  
  public static int sequenzielleSuche(int[] array, int target){
    
    for(int i = 0; i < array.length; i++){
      if(array[i] == target){
        return i; //return Stelle vom Wert
      }
    }
    return NOT_FOUND;
  }
  /*
  Bester Fall:                         1
  Schlechtester Fall:                  n
  Durchschnitt (Erfolgreiche Suche): : n/2
  Durchschnitt (Erfolglose Suche:      n
  
   */
  
  
  
  
  //Etwas effizienter → Array muss aufsteigend sortiert sein!
  public static int sequenzielleSucheInSortedArray(int[] inputArray, int target){
    for(int i = 0; i < inputArray.length; i++){
      if(inputArray[i] == target){
        return i; //return Stelle vom Wert
      }else if (inputArray[i] > target){
        return NOT_FOUND;
      }
    }
    return NOT_FOUND;
  
  }
  
}
