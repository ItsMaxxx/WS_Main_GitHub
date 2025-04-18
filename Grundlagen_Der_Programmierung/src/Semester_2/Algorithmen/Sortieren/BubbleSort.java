package Semester_2.Algorithmen.Sortieren;

import Semester_2.Algorithmen.TestBspWerte;

public class BubbleSort {
  
  public static void main(String[] args) {
    TestBspWerte tbw = new TestBspWerte(50, "sortiert");
    
    tbw.array = bubbleSort(tbw.array);
    
    for(Integer i : tbw.array){
      System.out.println(i);
    }
  }
  
  public static int[] bubbleSort(int[] array){
    for(int i = 0; i < array.length - 1; i++){
      for(int j = 0; j < array.length - 1 - i; j++){
        if(array[j] > array[j+1]){
          int temp = array[j];
          array[j] = array[j+1];
          array[j+1] = temp;
        }
      }
    }
    return array;
  }
  
}
