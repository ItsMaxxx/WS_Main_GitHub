package Semester_2.Algorithmen.Sortieren;

import Semester_2.Algorithmen.TestBspWerte;

public class InsertionSort {
  public final static int NOT_FOUND = -1;
  
  
  public static void main(String[] args) {
    TestBspWerte tbw = new TestBspWerte(50, "unsortiert");
    
    tbw.array = insertionSort(tbw.array);
    
    for(int i = 0; i < tbw.array.length; i++){
      System.out.println("Stelle["+i+"] " + "Wert: " + tbw.array[i]);
    }

  }
  
  public static int[] insertionSort(int[] array){
    for(int i = 1; i < array.length-1; i++){
      int key = array[i];
      int j = i-1;
      while(j >= 0 && array[j] > key){
        array[j+1] = array[j];
        j--;
      }
      array[j+1] = key;
    }
    
    return array;
  }
  
  
  
  
  
}
