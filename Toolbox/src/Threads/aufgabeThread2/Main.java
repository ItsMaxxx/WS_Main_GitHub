package aufgabeThread2;

import aufgabeThread1.ThreadClass;

public class Main {

    public static void main(String[] args){

        Atmen a= new Atmen();
        a.start();
        Laufen l = new Laufen();
        l.start();

    }

}
