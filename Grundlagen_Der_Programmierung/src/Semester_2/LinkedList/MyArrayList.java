package Semester_2.LinkedList;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayList<T> implements Iterable<T> {
  
  private T[] myArray;
  private int length;
  
  public MyArrayList(T[] newArray) {
    myArray = newArray;
    length = newArray.length;
  }
  
  public static void main(String[] args) {
    Integer[] zahlen = {1, 2, 3, 4, 5, 9};
    
    MyArrayList<Integer> myArray = new MyArrayList<Integer>(zahlen);
    
  }
  
  @Override
  public Iterator<T> iterator() {
    return new Iterator<T>() {
      private int currentIndex = 0;
      
      @Override
      public boolean hasNext() {
        return currentIndex < length;
      }
      
      @Override
      public T next() {
        if (!hasNext()) {
          throw new NoSuchElementException();
        }
        return myArray[currentIndex++];
      }
    };
  }
}
