package aufgabeThread3;

public class Main {

    public static void main(String[] args){
        Thread t1 = new Thread(new Atmen());
        t1.start();
        Thread t2 = new Thread(new Laufen());
        t2.start();
    }

}
