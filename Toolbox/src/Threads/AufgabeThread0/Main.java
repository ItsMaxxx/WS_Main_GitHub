package Threads.AufgabeThread0;

public class Main {
    public static void main(String[] args) {
        ThreadClass TC1 = new ThreadClass();
        ThreadClass2 TC2 = new ThreadClass2();
        TC1.start();
        TC2.start();

        Thread TC3 = new Thread(new ThreadRunnable());
        Thread TC4 = new Thread(new ThreadRunnable2());
        TC3.start();
        TC4.start();

    }
}