package Semester_2.Caches;

public class SubCache extends Cache{
  
  public static void main(String[] args) {
    SubCache cache = new SubCache(10);
    
  }
  
  public SubCache(){
    super();
  }
  
  public SubCache(int size) {
    super(size);
  }
  
  @Override
  public void add(int pos, int value){
    super.add(pos, value);
  }
  
}
