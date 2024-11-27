package aufgabeThread2;

public class Laufen extends Thread {
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
