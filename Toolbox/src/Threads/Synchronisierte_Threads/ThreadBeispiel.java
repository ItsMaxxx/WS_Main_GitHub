package Synchronisierte_Threads;

public class ThreadBeispiel implements Runnable {


    @Override
    public void run(){

        for(int x = 0; x < 5; x++){
            System.out.println(x);
        }

        System.out.println("Ende");

    }


}
