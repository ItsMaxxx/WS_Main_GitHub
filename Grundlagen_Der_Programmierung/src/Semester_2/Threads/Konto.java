package Semester_2.Threads;

public class Konto {
  
  public static void main(String[] args) {
  
  }

  private int kontostand = 2000;
  
  public int getKontostand() {
    return kontostand;
  }
  public void setKontostand(int kontostand){
    this.kontostand = kontostand;
  }
  public void add(int toAdd){
    kontostand += toAdd;
  }
  public void subtract(int toSub){
    kontostand -= toSub;
  }
  
  
}
