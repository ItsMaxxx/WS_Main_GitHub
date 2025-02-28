package Semester_2.Caches;

public class Cache {
  private int[] werte;
  
  public static void main(String[] args) {
    Cache cache = new Cache(5);
    cache.add(1, 5);
    System.out.println(cache.get(1));
  }
  
  public Cache(){
    super();
  }
  
  public Cache(int size){
    this();
    werte = new int[size];
    for(int i = 0; i < werte.length; i++){
      werte[i] = -1;
    }
  }
  
  public void add(int pos, int value){
    werte[pos] = value;
  }
  
  public int get(int pos){
    return werte[pos];
  }
  
}
