package Threads.AufgabeThread0;

public class ThreadRunnable2 implements Runnable {

    @Override
    public void run(){
        int i = 0;
        while(true){
            i++;
            System.out.println(i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
