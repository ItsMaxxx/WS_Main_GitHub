package aufgabeThread5;

public class Main {

   public static void main(String[] args) throws InterruptedException {

       ServerClass s = new ServerClass();
       s.start();

       ClientClass c = new ClientClass();
       c.start();
   }



}
