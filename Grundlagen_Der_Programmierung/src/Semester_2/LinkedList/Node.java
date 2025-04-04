package Semester_2.LinkedList;

public interface Node<T> {
  
  public abstract T getWert();
  public abstract void setWert(T wert);
  public abstract void setNext(Node<T> next);
  public abstract Node<T> getNext();
  public abstract boolean hasNext();
  public abstract String toString();
  
  
}
