package Synchronisierte_Threads;

public class Main {

    public static void main(String[] args){
        Thread t1 = new Thread(new ThreadBeispiel());
        t1.start();
    }
}
