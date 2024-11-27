package Threads.AufgabeThread0;


public class ThreadClass extends Thread {
    @Override
    public void run() {
        int i = 0;
        while(true){
            i++;
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
