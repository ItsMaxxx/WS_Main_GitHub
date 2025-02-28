package Semester_2.Exceptions;

public class ExceptionsMain {
  
  public static final String RED = "\u001B[31m";
  public static final String BLUE = "\u001B[34m";
  public static final String RESET = "\u001B[0m";
  
  public static void main(String[] args) throws MyException {
    //Teil Eins
    /*try {
      int i = Integer.parseInt(args[0]);
      System.out.println("I=" + i);
    }catch (NumberFormatException e) {
      System.out.println(RED + "ERROR " + RESET + " Das war keine Zahl: " + e);
      System.out.println(BLUE + "INFO " + RESET + "Stop being an idiot.");
    }catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(RED + "ERROR " + RESET + "Außerhalb des Arrays: " + e);
      System.out.println(BLUE + "INFO " + RESET + "Stop being an idiot.");
    }*/
    
    //Teil Zwei
    System.out.println(dividieren(7, 3));
    System.out.println(dividieren(7, 0));
  }
  
  public static int dividieren(int x, int y) throws MyException {
    try{
      return x / y;
    }catch(ArithmeticException e){
      //throw new MyException("Division durch 0 ist nicht erlaubt!", x, y);
      System.out.println(RED + "ERROR " + RESET + "Division durch 0 ist nicht erlaubt! {"+x+", "+y+"}");
      e.printStackTrace();
    }finally{
      return 0;
    }
  }
  
  
  
}
