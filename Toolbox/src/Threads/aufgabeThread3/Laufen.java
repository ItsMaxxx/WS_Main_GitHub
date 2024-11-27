package aufgabeThread3;

public class Laufen implements Runnable {
    @Override
    public void run(){
        while(true){

            System.out.println("linkes Bein");
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("rechtes Bein");
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }



}
