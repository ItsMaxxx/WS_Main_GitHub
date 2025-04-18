package Semester_2;

public class fibonnacci {
  
  public static void main(String[] args) {
    fibo(0, 1);
  }
  
  public static void fibo(int x, int y){
    System.out.print(x + ", ");
    System.out.print(y + ", ");
    int z = 0;
    for(int i=0; z<1000; i++){ //Einfach bis die Reihe über 1000 liegt
      z = x + y;
      x = y;
      y = z;
      System.out.print(z + ", ");
    }
  }

}
