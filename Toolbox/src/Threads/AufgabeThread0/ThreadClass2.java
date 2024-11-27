package Threads.AufgabeThread0;

public class ThreadClass2 extends Thread {
    @Override
    public void run() {
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
