package Semester_2.Exceptions;

public class MyException extends Exception {
  
  public int x;
  public int y;
  
  public MyException(String message, int x, int y) {
    super(message);
    this.x = x;
    this.y = y;
  }
  
  
  @Override
  public String toString() {
    return getMessage() +
            " {x=" + x +
            ", y=" + y +
            '}';
  }
}
