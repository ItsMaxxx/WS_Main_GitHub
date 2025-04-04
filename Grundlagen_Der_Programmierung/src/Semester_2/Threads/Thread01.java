package Semester_2.Threads;

public class Thread01 implements Runnable {
  
  public static void main(String[] args) {
    Thread01 thread = new Thread01();
    thread.run();
  }
  
  
  @Override
  public void run() {
    for(int i = 0; i < 15; i++){
      System.out.println(i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
