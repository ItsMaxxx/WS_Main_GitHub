package aufgabeThread3;

public class Atmen implements Runnable {
    @Override
    public void run(){
        while(true){

            System.out.println("einatmen");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("ausatmen");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }



}
