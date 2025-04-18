package Semester_2.Algorithmen.Sortieren;

import Semester_2.Algorithmen.TestBspWerte;

public class SelectionSort {
  
  public static void main(String[] args) {
    TestBspWerte tbw = new TestBspWerte(50, "unsortiert");
    
    tbw.array = selectionSort(tbw.array);
    
    for(int i = 0; i < tbw.array.length; i++){
      System.out.println("Stelle["+i+"] " + "Wert: " + tbw.array[i]);
    }
    
  }
  
  public static int[] selectionSort(int[] array){
    
    
    return array
  }
  


}
