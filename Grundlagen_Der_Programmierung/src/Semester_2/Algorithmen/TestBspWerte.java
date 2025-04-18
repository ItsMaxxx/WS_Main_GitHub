package Semester_2.Algorithmen;


import static Semester_2.Algorithmen.Sortieren.BubbleSort.bubbleSort;

public class TestBspWerte {
  
  public int[] array = null;
  
  public TestBspWerte(int size, String typ){
    this.array = new int[size];
    
    for (int i = 0; i < array.length - 1; i++) {
      array[i] = (int) (Math.random() * 100);
    }
    
    if(typ.equals("unsortiert")){
      //
    }else if(typ.equals("sortiert")){
      this.array = bubbleSort(array);
    }
    
    
    
    

    
  }

  
}